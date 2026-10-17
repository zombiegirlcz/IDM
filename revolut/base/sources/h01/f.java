package h01;

import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f148173a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f148174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f148175c;

    static {
        c cVar = c.NON_HIDDEN;
        f148174b = cVar;
        r rVarJust = r.just(cVar);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        f148175c = rVarJust;
    }

    private f() {
    }

    @Override // h01.g
    public final c a() {
        return f148174b;
    }

    @Override // h01.b
    public final void b() {
    }

    @Override // h01.g
    public final r c() {
        return f148175c;
    }

    @Override // h01.b
    public final void d(a state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
