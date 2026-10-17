package g80;

import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements c {
    public final String a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url2));
    }

    public final String b(String url2, String str) {
        String mimeTypeFromExtension;
        Intrinsics.checkNotNullParameter(url2, "url");
        if (str != null) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNullExpressionValue(singleton, "getSingleton(...)");
            mimeTypeFromExtension = singleton.getMimeTypeFromExtension(str);
        } else {
            mimeTypeFromExtension = null;
        }
        String strGuessFileName = URLUtil.guessFileName(url2, null, mimeTypeFromExtension);
        Intrinsics.checkNotNullExpressionValue(strGuessFileName, "guessFileName(...)");
        return strGuessFileName;
    }
}
