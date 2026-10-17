package no;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements uo.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f217854a;

    public v1(y1 y1Var) {
        this.f217854a = y1Var;
    }

    @Override // uo.v
    public final void a(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f217854a.d(screen);
    }

    @Override // uo.v
    public final void b(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        y1 y1Var = this.f217854a;
        ho.i iVar = (ho.i) y1Var.f217878j.get(screen);
        skm.e0.C(y1Var.f217874b.c(), null, null, new w1(y1Var, screen, y1.c(screen), iVar, null), 3);
    }
}
