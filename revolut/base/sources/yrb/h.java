package yrb;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f316215b;

    public /* synthetic */ h(s sVar, int i) {
        this.f316214a = i;
        this.f316215b = sVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316214a) {
            case 0:
                t2h.b it8 = (t2h.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                t2h.g gVar = it8.f267564a;
                if (gVar instanceof t2h.f) {
                    this.f316215b.p3(((t2h.f) gVar).f267571b);
                }
                return Unit.f186387a;
            case 1:
                urb.a it9 = (urb.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                s sVar = this.f316215b;
                csb.a aVar = sVar.v;
                k4l.p pVar = it9.f282263a;
                aVar.getClass();
                sVar.L2(csb.a.a(pVar));
                return Unit.f186387a;
            case 2:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    s sVar2 = this.f316215b;
                    ((te0.t) sVar2.f316240w.getValue()).set(Boolean.TRUE);
                    sVar2.o3();
                }
                return Unit.f186387a;
            default:
                x xVar = (x) obj2;
                this.f316215b.o.a("advanced-charts-order-idempotency-tag");
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return x.a(xVar, null, null, null, ZERO, null, new w(0, xVar.f.f316250b), false, null, null, null, null, null, null, null, null, 32727);
        }
    }
}
