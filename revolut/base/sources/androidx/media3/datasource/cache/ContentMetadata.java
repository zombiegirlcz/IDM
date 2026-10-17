package androidx.media3.datasource.cache;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public interface ContentMetadata {
    static long getContentLength(ContentMetadata contentMetadata) {
        return contentMetadata.get("exo_len", -1L);
    }

    static Uri getRedirectedUri(ContentMetadata contentMetadata) {
        String str = contentMetadata.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    long get(String str, long j2);

    String get(String str, String str2);
}
