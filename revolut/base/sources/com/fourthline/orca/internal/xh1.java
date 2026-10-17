package com.fourthline.orca.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xh1 f34998a = new xh1();

    private xh1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return true;
    }

    private final void a(ZipInputStream zipInputStream, String str) throws IOException {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            zi0.c.m(zipInputStream, fileOutputStream, 8192);
            fileOutputStream.close();
        } finally {
        }
    }

    public static /* synthetic */ void a(xh1 xh1Var, File file, File file2, Function1 function1, int i, Object obj2) throws IOException {
        if ((i & 4) != 0) {
            function1 = new nt1(0);
        }
        xh1Var.a(file, file2, function1);
    }

    public final void a(File zipFile, File destDir, Function1 fileFilter) throws IOException {
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        Intrinsics.checkNotNullParameter(destDir, "destDir");
        Intrinsics.checkNotNullParameter(fileFilter, "fileFilter");
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
        try {
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                String name = nextEntry.getName();
                String canonicalPath = new File(destDir, name).getCanonicalPath();
                Intrinsics.h(canonicalPath);
                if (kotlin.text.a0.H(canonicalPath, destDir.getCanonicalPath() + File.separator, false)) {
                    if (nextEntry.isDirectory()) {
                        File file = new File(canonicalPath);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } else {
                        Intrinsics.h(name);
                        if (((Boolean) fileFilter.invoke(name)).booleanValue()) {
                            f34998a.a(zipInputStream, canonicalPath);
                        }
                    }
                    zipInputStream.closeEntry();
                } else {
                    throw new SecurityException("Zip entry is outside of the target dir: " + name);
                }
            }
            Unit unit = Unit.f186387a;
            zipInputStream.close();
        } finally {
        }
    }
}
