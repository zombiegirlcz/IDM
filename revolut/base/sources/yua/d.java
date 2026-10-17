package yua;

import a31.x;
import com.revolut.data.network.models.recurringpayment.BlockUnblockSubscriptionRequest;
import com.revolut.data.network.models.recurringpayment.CardMandateUpdateLabelRequest;
import com.revolut.data.network.services.RecurringPaymentService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316933a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qua.p f316934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f316935c;
    public final /* synthetic */ q d;
    public final /* synthetic */ String e;

    public /* synthetic */ d(qua.p pVar, boolean z, q qVar, String str) {
        this.f316934b = pVar;
        this.f316935c = z;
        this.d = qVar;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316933a) {
            case 0:
                s71.a aVar = this.d.f316963a;
                hbd.a params = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                boolean z = this.f316935c;
                qua.p pVar = this.f316934b;
                String str = this.e;
                if (z) {
                    String manualCardMandateId = pVar.f249314a.f160150a;
                    x xVar = (x) aVar;
                    Intrinsics.checkNotNullParameter(manualCardMandateId, "manualCardMandateId");
                    Intrinsics.checkNotNullParameter(params, "params");
                    RecurringPaymentService recurringPaymentService = xVar.f999a;
                    if (str == null) {
                        str = null;
                    }
                    pfm.a aVarE = recurringPaymentService.blockSubscription(manualCardMandateId, new BlockUnblockSubscriptionRequest(str, null, 2, null)).e(xVar.e(params, new a31.i(manualCardMandateId, true, 0)));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    return w.g0(aVarE);
                }
                String manualCardMandateId2 = pVar.f249314a.f160150a;
                x xVar2 = (x) aVar;
                Intrinsics.checkNotNullParameter(manualCardMandateId2, "manualCardMandateId");
                Intrinsics.checkNotNullParameter(params, "params");
                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                if (str == null) {
                    str = null;
                }
                pfm.a aVarE2 = recurringPaymentService2.unblockSubscription(manualCardMandateId2, new BlockUnblockSubscriptionRequest(str, null, 2, null)).e(xVar2.e(params, new a31.i(manualCardMandateId2, false, 0)));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return w.g0(aVarE2);
            default:
                hbd.a params2 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                qua.p pVar2 = this.f316934b;
                ibd.e eVar = pVar2.f249314a;
                String str2 = pVar2.L;
                ibd.e eVar2 = pVar2.f249314a;
                int i = j.f316946a[eVar.f160152c.ordinal()];
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    throw new IllegalArgumentException("custom subscription label not implemented for " + eVar2.f160152c);
                }
                boolean z3 = this.f316935c;
                q qVar = this.d;
                if (z3) {
                    s71.a aVar2 = qVar.f316963a;
                    String id10 = eVar2.f160150a;
                    x xVar3 = (x) aVar2;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(params2, "params");
                    pfm.h hVar = new pfm.h(w.i0(xVar3.d(xVar3.f999a.deleteCardMandateLabel(id10, str2 != null ? str2 : null, "SUBSCRIPTION_BRAND_BLOCK"), params2, str2)), 4);
                    Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                    return hVar;
                }
                s71.a aVar3 = qVar.f316963a;
                String id11 = eVar2.f160150a;
                String label = this.e;
                if (label == null) {
                    label = "";
                }
                x xVar4 = (x) aVar3;
                Intrinsics.checkNotNullParameter(id11, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(params2, "params");
                pfm.h hVar2 = new pfm.h(w.i0(xVar4.d(xVar4.f999a.updateCardMandateLabel(id11, new CardMandateUpdateLabelRequest(str2 != null ? str2 : null, label), "SUBSCRIPTION_BRAND_BLOCK"), params2, str2)), 4);
                Intrinsics.checkNotNullExpressionValue(hVar2, "ignoreElement(...)");
                return hVar2;
        }
    }

    public /* synthetic */ d(boolean z, q qVar, qua.p pVar, String str) {
        this.f316935c = z;
        this.d = qVar;
        this.f316934b = pVar;
        this.e = str;
    }
}
