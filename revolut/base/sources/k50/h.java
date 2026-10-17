package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private h() {
    }

    public static String a(String originHtml) {
        Intrinsics.checkNotNullParameter(originHtml, "originHtml");
        return kotlin.text.a0.D(originHtml, "<18", "&lt;18", false);
    }

    public static String b(String escapedContent) {
        Intrinsics.checkNotNullParameter(escapedContent, "escapedContent");
        return kotlin.text.a0.D(escapedContent, "&lt;18", "<18", false);
    }
}
