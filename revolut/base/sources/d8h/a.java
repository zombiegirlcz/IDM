package d8h;

import d8h.b;
import kotlin.Pair;
import pdh.e;
import pdh.f;
import pdh.g;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f112266a = r0.k(new Pair("NONE", g.NONE), new Pair("COMPLETED", g.COMPLETED), new Pair("PENDING", g.PENDING), new Pair("FAILED", g.FAILED), new Pair("OFFBOARDED", g.OFFBOARDED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112267b = r0.k(new Pair("ACTIVE_DAILY", e.PURPOSE_PRESERVE_CAPITAL), new Pair("NEW", e.PURPOSE_LEARNING));

    public static f a(b.C0666b c0666b) {
        return new f(c0666b.getLabel(), c0666b.getValueLabel());
    }
}
