package cy8;

import av1.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    Object i(String str);

    c m();

    default String r(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return url2;
    }
}
