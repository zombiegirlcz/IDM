package er9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f128585b;

    public /* synthetic */ n(x xVar, int i) {
        this.f128584a = i;
        this.f128585b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128584a) {
            case 0:
                x xVar = this.f128585b;
                cr9.v paymentGroup = (cr9.v) obj2;
                Intrinsics.checkNotNullParameter(paymentGroup, "paymentGroup");
                return xVar.e(paymentGroup);
            case 1:
                x xVar2 = this.f128585b;
                PaymentGroup paymentGroup2 = (PaymentGroup) obj2;
                w4l.f fVar = xVar2.f128606q;
                Intrinsics.h(paymentGroup2);
                xVar2.i(fVar, paymentGroup2);
                xVar2.f128605p.d = true;
                return Unit.f186387a;
            case 2:
                x xVar3 = this.f128585b;
                cr9.v paymentGroup3 = (cr9.v) obj2;
                Intrinsics.checkNotNullParameter(paymentGroup3, "paymentGroup");
                return xVar3.e(paymentGroup3);
            case 3:
                x xVar4 = this.f128585b;
                cr9.v paymentGroup4 = (cr9.v) obj2;
                Intrinsics.checkNotNullParameter(paymentGroup4, "paymentGroup");
                return xVar4.e(paymentGroup4);
            default:
                x xVar5 = this.f128585b;
                PaymentGroup paymentGroup5 = (PaymentGroup) obj2;
                w4l.f fVar2 = xVar5.f128606q;
                Intrinsics.h(paymentGroup5);
                xVar5.i(fVar2, paymentGroup5);
                xVar5.f128605p.d = true;
                return Unit.f186387a;
        }
    }
}
