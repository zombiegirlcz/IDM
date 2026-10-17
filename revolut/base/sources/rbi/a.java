package rbi;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f253115a = j.b(new r4k.a(23));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f253116b = j.b(new r4k.a(24));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f253117c = j.b(new r4k.a(25));
    public static final Lazy d = j.b(new r4k.a(26));
    public static final Lazy e = j.b(new r4k.a(27));
    public static final Lazy f = j.b(new r4k.a(28));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy f253118g = j.b(new r4k.a(29));

    private a() {
    }

    public static List a(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.X0) ? (List) f253117c.getValue() : Intrinsics.f(bVar, wi0.b.O0) ? (List) f253118g.getValue() : Intrinsics.f(bVar, wi0.b.Y1) ? (List) d.getValue() : Intrinsics.f(bVar, wi0.b.W) ? (List) f253116b.getValue() : Intrinsics.f(bVar, wi0.b.p0) ? (List) f.getValue() : (List) f253115a.getValue();
    }
}
