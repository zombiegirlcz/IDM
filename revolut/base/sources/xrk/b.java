package xrk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f308357b;

    public /* synthetic */ b(h hVar, int i) {
        this.f308356a = i;
        this.f308357b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f308356a) {
            case 0:
                String ref2 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                return ((ael.k) this.f308357b.f308364c).e(ref2).x();
            case 1:
                String str = (String) obj2;
                k kVar = (k) this.f308357b.f308363b;
                te0.e value = kVar.f308371c.getValue(kVar, k.i[1]);
                Intrinsics.h(str);
                value.set(str);
                return Unit.f186387a;
            case 2:
                String ref3 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref3, "ref");
                return ((ael.k) this.f308357b.f308364c).e(ref3);
            case 3:
                fha.a pricingPlan = (fha.a) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                this.f308357b.f308366h.onNext(pricingPlan);
                return Unit.f186387a;
            default:
                n instrument = (n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return rd0.e.c(this.f308357b.e.a(instrument, w4l.i.f294643c), kotlin.coroutines.g.f186406a);
        }
    }
}
