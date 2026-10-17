package g0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import java.time.Period;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qz9.r;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f139391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tbk.e f139392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iz9.e f139393n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f139394p;

    public g(h dialogMapper, tbk.e planGiftingLifecycleInteractor, iz9.e socialPaymentsInteractor, j60.a bottomExpandableDialog, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(planGiftingLifecycleInteractor, "planGiftingLifecycleInteractor");
        Intrinsics.checkNotNullParameter(socialPaymentsInteractor, "socialPaymentsInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f139391l = dialogMapper;
        this.f139392m = planGiftingLifecycleInteractor;
        this.f139393n = socialPaymentsInteractor;
        this.o = bottomExpandableDialog;
        this.f139394p = idempotencyKeyHolder;
    }

    public static final Object Z2(g gVar, MessageItem messageItem, com.revolut.feature.payments.messaging.data.api.model.c state, gim.i iVar) {
        gVar.getClass();
        MessageType messageType = messageItem.f79535h;
        Intrinsics.i(messageType, "null cannot be cast to non-null type com.revolut.feature.payments.messaging.data.api.model.MessageType.PricingPlanGift");
        MessageType.PricingPlanGift pricingPlanGift = (MessageType.PricingPlanGift) messageType;
        String id10 = pricingPlanGift.f79550b;
        com.revolut.feature.payments.messaging.data.api.model.b planTier = pricingPlanGift.f79551c;
        Period period = pricingPlanGift.d;
        String str = pricingPlanGift.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(state, "state");
        Object objA = nim.a.a(((r) gVar.f139393n).b(MessageItem.a(messageItem, null, new MessageType.PricingPlanGift(id10, planTier, period, str, state), null, 3967)), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // yji.n
    public final void D2() {
        this.f139394p.a("CHAT_PAID_PLAN_GIFT_IDEMPOTENCY_KEY");
    }
}
