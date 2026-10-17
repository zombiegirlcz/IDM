package f9b;

import ay2.k;
import efm.r;
import efm.w;
import efm.x;
import f2i.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f132899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f132900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f132901c;

    public /* synthetic */ e(f fVar, boolean z, boolean z3) {
        this.f132899a = fVar;
        this.f132900b = z;
        this.f132901c = z3;
    }

    @Override // efm.x
    public final w apply(r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        f fVar = this.f132899a;
        return upstream.onErrorResumeNext(new o(new k(fVar, this.f132900b, this.f132901c, 1), 16)).doOnNext(new o(new d(fVar, 0), 17));
    }
}
