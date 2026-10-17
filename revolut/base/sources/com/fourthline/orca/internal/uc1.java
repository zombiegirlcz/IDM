package com.fourthline.orca.internal;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class uc1 {
    public static final byte[] a(URI uri2) {
        Intrinsics.checkNotNullParameter(uri2, "<this>");
        File file = new File(uri2.getPath());
        try {
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                fileInputStream.close();
                return bArr;
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
            file.toString();
            return null;
        }
    }

    public static final boolean a(URI uri2, byte[] content) {
        Intrinsics.checkNotNullParameter(uri2, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        File file = new File(uri2.getPath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(content);
                Unit unit = Unit.f186387a;
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
            file.toString();
            return false;
        }
    }

    public static final boolean a(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "<this>");
        String path = uri2.getPath();
        if (path != null) {
            File file = new File(path);
            if (file.exists() && file.length() != 0) {
                return false;
            }
        }
        return true;
    }
}
