package a31;

import com.revolut.data.network.models.recurringpayment.ActivateManualCardMandateRequest;
import com.revolut.data.network.models.recurringpayment.ActivateSubscriptionRequest;
import com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapperKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f959c;
    public final /* synthetic */ hbd.a d;

    public /* synthetic */ d(x xVar, hbd.a aVar, String str, int i) {
        this.f957a = i;
        this.f958b = xVar;
        this.d = aVar;
        this.f959c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f957a) {
            case 0:
                o9l.r recurringPayment = (o9l.r) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                ufm.i iVar = new ufm.i(te0.w.j(RecurringPaymentDtoMapperKt.m3756toDomainE67O_EE(recurringPayment, this.f959c)), new e(new h(this.f958b, this.d, 1), 14), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 1:
                Intrinsics.checkNotNullParameter((o9l.r) obj2, "it");
                return m70.a.g(this.f958b.b(this.f959c, this.d), null, null, 3).firstOrError();
            case 2:
                ActivateSubscriptionRequest it8 = (ActivateSubscriptionRequest) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                x xVar = this.f958b;
                return xVar.d(xVar.f999a.activateSubscription(it8, "SUBSCRIPTION_BRAND_BLOCK"), this.d, this.f959c);
            case 3:
                Intrinsics.checkNotNullParameter((o9l.r) obj2, "it");
                return m70.a.g(this.f958b.b(this.f959c, this.d), null, null, 3).firstOrError();
            default:
                ActivateManualCardMandateRequest it9 = (ActivateManualCardMandateRequest) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                x xVar2 = this.f958b;
                return xVar2.d(xVar2.f999a.postManualCardMandateActivation(it9, "SUBSCRIPTION_BRAND_BLOCK"), this.d, this.f959c);
        }
    }

    public /* synthetic */ d(x xVar, String str, hbd.a aVar, int i) {
        this.f957a = i;
        this.f958b = xVar;
        this.f959c = str;
        this.d = aVar;
    }
}
