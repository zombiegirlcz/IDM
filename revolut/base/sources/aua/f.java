package aua;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.t;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve0.c f9688a;

    public f(ve0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9688a = storage;
    }

    public final ufm.f a() {
        ufm.c cVar = new ufm.c(new b(this, 2), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.f fVar = new ufm.f(w.i0(cVar), new a(new ak7.g("Failed to get NEXT_POSSIBLE_RATE_ACTION_DATE", 17), 6), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        return fVar;
    }

    public final ufm.f b() {
        ufm.c cVar = new ufm.c(new b(this, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.f fVar = new ufm.f(w.i0(cVar), new a(new ak7.g("Failed to get SUCCESS_SCREEN_COUNTER", 17), 3), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        return fVar;
    }

    public final t c(long j2) {
        h hVar = new h(new d(this, j2, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        t tVarM = w.g0(hVar).m(new a(new ak7.g(p.a.m(j2, "Failed to set NEXT_POSSIBLE_RATE_ACTION_DATE="), 17), 4));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        return tVarM;
    }

    public final t d(int i) {
        h hVar = new h(new c(this, i, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        t tVarM = w.g0(hVar).m(new a(new ak7.g(a0.d.n("Failed to set SUCCESS_SCREEN_COUNTER=", i), 17), 2));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        return tVarM;
    }
}
