package o80;

import android.webkit.MimeTypeMap;
import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lim.o;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private c() {
    }

    public static final void a(File directory) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(directory, "directory");
        if (directory.exists() && (fileArrListFiles = directory.listFiles()) != null) {
            int length = fileArrListFiles.length;
            for (int i = 0; i < length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    File file = fileArrListFiles[i];
                    Intrinsics.checkNotNullExpressionValue(file, "get(...)");
                    a(file);
                } else {
                    fileArrListFiles[i].delete();
                }
            }
        }
        directory.delete();
    }

    public static final String b(File f) {
        Intrinsics.checkNotNullParameter(f, "f");
        String name = f.getName();
        Intrinsics.h(name);
        int iX = d0.X(name, CoreConstants.DOT, 0, 6);
        if (iX <= 0 || iX >= name.length() - 1) {
            return "";
        }
        String strSubstring = name.substring(iX + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Locale locale = Locale.ROOT;
        return p.a.r(locale, "ROOT", strSubstring, locale, "toLowerCase(...)");
    }

    public static final List c(File directory, String str) {
        List listV0;
        Intrinsics.checkNotNullParameter(directory, "directory");
        File[] fileArrListFiles = directory.listFiles();
        if (str == null || str.length() == 0 || fileArrListFiles == null || fileArrListFiles.length == 0) {
            return (fileArrListFiles == null || (listV0 = d.v0(fileArrListFiles)) == null) ? f0.f322471a : listV0;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!d0.J(name, str, false)) {
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static final String d(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String strN = o.n(file);
        return Intrinsics.f(strN, "m4a") ? "audio/mp4" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(strN);
    }

    public static final byte[] e(File file) throws IOException {
        FileInputStream fileInputStream;
        Intrinsics.checkNotNullParameter(file, "file");
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fileInputStream = new FileInputStream(file);
        } finally {
        }
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    Unit unit = Unit.f186387a;
                    fileInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } finally {
            }
        }
    }
}
