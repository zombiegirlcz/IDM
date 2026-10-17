package lim;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.FileWalkDirection;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes13.dex */
public class o extends n {
    public static void l(File file, File target) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists() && !target.delete()) {
            throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                zi0.c.m(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean m(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file, "<this>");
        h hVar = new h(n.k(file, FileWalkDirection.BOTTOM_UP));
        while (true) {
            boolean z = true;
            while (hVar.hasNext()) {
                File file2 = (File) hVar.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static String n(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return d0.w0(CoreConstants.DOT, name, "");
    }

    public static String o(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return d0.C0(name, ".", name);
    }

    public static File p(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        File relative2 = new File(relative);
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative2, "relative");
        Intrinsics.checkNotNullParameter(relative2, "<this>");
        String path = relative2.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        if (l.a(path) > 0) {
            return relative2;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() != 0) {
            char c2 = File.separatorChar;
            if (!d0.L(string, c2)) {
                return new File(string + c2 + relative2);
            }
        }
        return new File(string + relative2);
    }

    public static boolean q(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        b bVarB = l.b(file);
        b bVarB2 = l.b(other);
        if (Intrinsics.f(bVarB.a(), bVarB2.a()) && bVarB.c() >= bVarB2.c()) {
            return bVarB.b().subList(0, bVarB2.c()).equals(bVarB2.b());
        }
        return false;
    }
}
