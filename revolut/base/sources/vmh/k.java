package vmh;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vge.r;
import vgg.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2b.i f290591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final aoh.a f290592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x8h.m f290593n;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f290594p;

    public k(c input, p2b.i cfdRiskWarningInteractor, aoh.a productProvider, x8h.m etpProductAvailabilityInteractor, p tradeScreenFilterProductComparator) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cfdRiskWarningInteractor, "cfdRiskWarningInteractor");
        Intrinsics.checkNotNullParameter(productProvider, "productProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tradeScreenFilterProductComparator, "tradeScreenFilterProductComparator");
        this.f290591l = cfdRiskWarningInteractor;
        this.f290592m = productProvider;
        this.f290593n = etpProductAvailabilityInteractor;
        this.o = tradeScreenFilterProductComparator;
        this.f290594p = pyd.c.a(this, new g(input.f290583a, 4));
    }

    @Override // yji.n
    public final void D2() {
        akg.n nVarV = nim.a.v(this.f290592m.a(), new vjk.b(25));
        Continuation continuation = null;
        yji.n.j2(this, nim.a.v(nVarV, new vh2.j(this, 18)), null, new j(this, continuation, 0), 3);
        yji.n.j2(this, mo3.a.g(nVarV, null, null, 3), null, new j(this, continuation, 1), 3);
        yji.n.j2(this, mo3.a.g(this.f290593n.b(), null, new a0(27), 1), null, new rf9.h(this, continuation, 16), 3);
    }

    @Override // vmh.d
    public final void Z2(f product) {
        Intrinsics.checkNotNullParameter(product, "product");
        switch (i.f290589a[product.ordinal()]) {
            case 1:
                T2(new r(this, product, null, 26), new yi5.b(27));
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                X2(this.f290594p, new vh2.j(product, 17));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f290594p;
    }
}
