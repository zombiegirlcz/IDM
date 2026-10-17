package s06;

import android.net.Uri;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements q06.d, lg0.c {

    @NotNull
    private static final b Companion = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f258846c = zhm.v.k("revolut.me/money-request/", "revolut.me/r/", "pay.revolut.com/money-request/", "pay.revolut.com/r/", "revolut.com/money-request/", "revolut.com/r/", "r.revolut.codes/money-request/", "r.revolut.codes/r/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.f f258847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uli.f f258848b;

    public c(q06.f deeplinkPatternProvider, uli.c deeplinkHostsProvider, uli.f deeplinkSchemeProvider) {
        Intrinsics.checkNotNullParameter(deeplinkPatternProvider, "deeplinkPatternProvider");
        Intrinsics.checkNotNullParameter(deeplinkHostsProvider, "deeplinkHostsProvider");
        Intrinsics.checkNotNullParameter(deeplinkSchemeProvider, "deeplinkSchemeProvider");
        this.f258847a = deeplinkPatternProvider;
        this.f258848b = deeplinkSchemeProvider;
    }

    @Override // lg0.c
    public final lg0.e a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter("support/incident/{id}/notify", "template");
        jf0.c cVarD = d(url2);
        if (cVarD == null) {
            return null;
        }
        return pw5.a.G("support/incident/{id}/notify", cVarD);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s06.c.b(java.lang.String):java.lang.String");
    }

    public final boolean c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Uri uri2 = Uri.parse(b(url2));
        if (uri2 == null) {
            return false;
        }
        this.f258848b.getClass();
        List listC = zhm.u.c("revolut");
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            if (a0.z((String) it8.next(), uri2.getScheme(), true)) {
                return true;
            }
        }
        return false;
    }

    public final jf0.c d(String url2) {
        String strB;
        Uri uri2;
        String strB2;
        Intrinsics.checkNotNullParameter(url2, "url");
        String str = c(url2) ? url2 : null;
        if (str != null && (strB = b(str)) != null && (uri2 = Uri.parse(strB)) != null) {
            Pair pair = Intrinsics.f(uri2.getAuthority(), "action") ? new Pair(uri2, jf0.e.ACTION) : d0.T(zhm.u.c("app"), uri2.getAuthority()) ? new Pair(uri2, jf0.e.NAVIGATION) : null;
            if (pair != null) {
                Uri uri3 = (Uri) pair.f186385a;
                jf0.e eVar = (jf0.e) pair.f186386b;
                String path = uri3.getPath();
                if (path != null && (strB2 = jf0.f.b(path)) != null) {
                    String strA = ((d) this.f258847a).a(strB2);
                    HashMap map = new HashMap();
                    for (Pair pair2 : n14.e.y(uri3, wli.u.URI)) {
                        String str2 = (String) pair2.f186385a;
                        String str3 = (String) pair2.f186386b;
                        if (!map.containsKey(str2)) {
                            map.put(str2, str3);
                        }
                    }
                    String string = uri3.buildUpon().path(strB2).build().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    return new jf0.c(url2, eVar, string, map, strA);
                }
            }
        }
        return null;
    }

    public final String e(String deeplink) {
        jf0.c cVarD;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!c(deeplink)) {
            deeplink = null;
        }
        if (deeplink != null && (cVarD = d(deeplink)) != null) {
            if (!Intrinsics.f(cVarD.a(), "open-banking-create-ideal-profile")) {
                cVarD = null;
            }
            if (cVarD != null) {
                return (String) cVarD.d().get("payloadUri");
            }
        }
        return null;
    }

    public final String f(String str) {
        jf0.c cVarD;
        if (!c(str)) {
            str = null;
        }
        if (str != null && (cVarD = d(str)) != null) {
            if (!Intrinsics.f(cVarD.a(), "transactions")) {
                cVarD = null;
            }
            if (cVarD != null) {
                return cVarD.g();
            }
        }
        return null;
    }
}
