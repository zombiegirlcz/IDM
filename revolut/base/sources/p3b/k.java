package p3b;

import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import d9.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f232723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4l.k f232724b;

    public k(l lVar, w4l.k kVar) {
        this.f232723a = lVar;
        this.f232724b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        final n instrument = (n) obj2;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        final l lVar = this.f232723a;
        kge.d dVar = lVar.f232726q;
        f fVar = lVar.f232727r;
        CfdExposureBreakdownTarget cfdExposureBreakdownTarget = fVar.e;
        String str = fVar.d;
        if (cfdExposureBreakdownTarget instanceof CfdExposureBreakdownTarget.Order) {
            CfdExposureBreakdownTarget.Order order = (CfdExposureBreakdownTarget.Order) cfdExposureBreakdownTarget;
            return nim.a.v(boh.f.e(lVar.f232725p.o(str, instrument.f214596b, this.f232724b), new i(lVar, order, instrument)), new i(order, instrument, lVar));
        }
        if (cfdExposureBreakdownTarget instanceof CfdExposureBreakdownTarget.Position) {
            akg.n nVarU = kge.d.u(dVar, ((CfdExposureBreakdownTarget.Position) cfdExposureBreakdownTarget).f82101a, str);
            final int i = 1;
            return nim.a.v(nVarU, new Function1() { // from class: p3b.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i) {
                        case 0:
                            y49.h it8 = (y49.h) obj3;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            ej0.b bVar = it8.f310851h;
                            if (bVar == null) {
                                bVar = it8.i;
                            }
                            return new d(t0.D(bVar, instrument), it8.f310850g, lVar.f232727r.f232713b);
                        default:
                            y49.b it9 = (y49.b) obj3;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            y49.e eVar = it9.f310833b;
                            ej0.b bVar2 = eVar.f310840g;
                            if (bVar2 == null) {
                                bVar2 = eVar.f310841h;
                            }
                            return new d(t0.D(bVar2, instrument), it9.f310833b.f, lVar.f232727r.f232713b);
                    }
                }
            });
        }
        if (!Intrinsics.f(cfdExposureBreakdownTarget, CfdExposureBreakdownTarget.PositionsGroup.f82102a)) {
            throw new NoWhenBranchMatchedException();
        }
        final int i2 = 0;
        return nim.a.v(kge.d.w(dVar, fVar.f232712a, fVar.d), new Function1() { // from class: p3b.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i2) {
                    case 0:
                        y49.h it8 = (y49.h) obj3;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ej0.b bVar = it8.f310851h;
                        if (bVar == null) {
                            bVar = it8.i;
                        }
                        return new d(t0.D(bVar, instrument), it8.f310850g, lVar.f232727r.f232713b);
                    default:
                        y49.b it9 = (y49.b) obj3;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        y49.e eVar = it9.f310833b;
                        ej0.b bVar2 = eVar.f310840g;
                        if (bVar2 == null) {
                            bVar2 = eVar.f310841h;
                        }
                        return new d(t0.D(bVar2, instrument), it9.f310833b.f, lVar.f232727r.f232713b);
                }
            }
        });
    }
}
