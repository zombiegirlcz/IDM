package d0m;

import a0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f110450a = new Regex(p.a.p("(?<=/)([_%0-9a-zA-Z-]*[0-9][_%0-9a-zA-Z-]*)(?<!", d0.k0(v.k("v[0-9]", "3ds"), "|", null, null, 0, null, 62), ")((?=[/?])|$)"));

    private b() {
    }

    public static String a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        boolean zK = kotlin.text.d0.K(url2, '?');
        Regex regex = f110450a;
        if (!zK) {
            return regex.replace(url2, "[FILTERED]");
        }
        List listM0 = kotlin.text.d0.m0(url2, new char[]{'?'}, 6);
        return d.r(regex.replace((String) listM0.get(0), "[FILTERED]"), d0.k0(kotlin.text.d0.m0((String) listM0.get(1), new char[]{'&'}, 6), "&", "?", null, 0, new a(0), 28));
    }
}
