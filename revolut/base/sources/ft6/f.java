package ft6;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f137943a = r0.k(new Pair("DARK", k6d.a.DARK), new Pair("LIGHT", k6d.a.LIGHT));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f137944b = r0.k(new Pair("BASIER_CIRCLE", k6d.b.BASIER_CIRCLE), new Pair("BALSAMIQ_SANS", k6d.b.BALSAMIQ_SANS), new Pair("ANUPHAN", k6d.b.ANUPHAN), new Pair("COMFORTAA", k6d.b.COMFORTAA), new Pair("DARUMADROP_ONE", k6d.b.DARUMADROP_ONE), new Pair("IBM_PLEX_MONO", k6d.b.IBM_PLEX_MONO), new Pair("LATO", k6d.b.LATO), new Pair("LOBSTER", k6d.b.LOBSTER), new Pair("MERRIWEATHER", k6d.b.MERRIWEATHER), new Pair("MONTSERRAT", k6d.b.MONTSERRAT), new Pair("NOTO", k6d.b.NOTO), new Pair("PACIFICO", k6d.b.PACIFICO), new Pair("PASSION_ONE", k6d.b.PASSION_ONE), new Pair("PLAYFAIR_DISPLAY", k6d.b.PLAYFAIR_DISPLAY), new Pair("ROBOTO", k6d.b.ROBOTO), new Pair("UNBOUNDED", k6d.b.UNBOUNDED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f137945c = r0.k(new Pair("INVALID", k6d.d.INVALID), new Pair("DEACTIVATED", k6d.d.DEACTIVATED));
    public static final Object d = r0.k(new Pair("PENDING", k6d.e.PENDING), new Pair("ACTIVE", k6d.e.ACTIVE), new Pair("ARCHIVED", k6d.e.ARCHIVED));

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public static final k6d.c a(nt6.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        String url2 = aVar.getUrl();
        k6d.e eVar = (k6d.e) u1.u(aVar.getState(), d);
        String reason = aVar.getReason();
        return new k6d.c(id10, url2, eVar, reason != null ? (k6d.d) u1.u(reason, f137945c) : null);
    }
}
