package bg0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15044a = System.getProperty("line.separator");

    public final String a(String htmlText) {
        String str;
        Intrinsics.checkNotNullParameter(htmlText, "htmlText");
        return (htmlText.length() == 0 || (str = this.f15044a) == null) ? htmlText : a0.D(m70.a.i(htmlText).toString(), str, " ", false);
    }
}
