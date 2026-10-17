package uld;

import android.webkit.MimeTypeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static a a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url2));
        return (mimeTypeFromExtension == null || !d0.J(mimeTypeFromExtension, "video", false)) ? a.IMAGE : a.VIDEO;
    }
}
