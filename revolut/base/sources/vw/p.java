package vw;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class p {
    public static e a(p pVar, File file) {
        File absoluteFile = file.getAbsoluteFile();
        Intrinsics.checkNotNullExpressionValue(absoluteFile, "getAbsoluteFile(...)");
        Uri previewUri = Uri.fromFile(absoluteFile);
        pVar.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(previewUri, "previewUri");
        return new e(file, previewUri);
    }
}
