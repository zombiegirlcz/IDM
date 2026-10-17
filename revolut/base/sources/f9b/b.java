package f9b;

import efm.d0;
import efm.h0;
import efm.i0;
import efm.r;
import efm.w;
import efm.x;
import f2i.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements x, i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f132891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f132892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f132893c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ b(f fVar, Function1 function1, boolean z, boolean z3) {
        this.f132891a = fVar;
        this.f132892b = function1;
        this.f132893c = z;
        this.d = z3;
    }

    @Override // efm.x
    public w apply(r tObservable) {
        Intrinsics.checkNotNullParameter(tObservable, "tObservable");
        return tObservable.doOnNext(new o(new c(this.f132893c, this.f132891a, this.f132892b, this.d), 15));
    }

    @Override // efm.i0
    public h0 i(d0 upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        f fVar = this.f132891a;
        return new ufm.f(new ufm.f(upstream, new o(new c(fVar, this.f132892b, this.f132893c, this.d), 22), 1), new o(new d(fVar, 3), 23), 3);
    }

    public /* synthetic */ b(boolean z, f fVar, Function1 function1, boolean z3) {
        this.f132893c = z;
        this.f132891a = fVar;
        this.f132892b = function1;
        this.d = z3;
    }
}
