package nbk;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import com.revolut.retail.feature.plan_gifting.api.navigation.PlanGiftingConfig;
import efm.d0;
import elm.f;
import java.util.HashMap;
import kbk.k;
import kbk.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import q06.h;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements hbk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f214088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tbk.b f214089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lbk.a f214090c;

    public c(m navigator, tbk.b planGiftingAvailabilityInteractor, lbk.a planGiftingSenderFlowCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(planGiftingAvailabilityInteractor, "planGiftingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(planGiftingSenderFlowCommandProvider, "planGiftingSenderFlowCommandProvider");
        this.f214088a = navigator;
        this.f214089b = planGiftingAvailabilityInteractor;
        this.f214090c = planGiftingSenderFlowCommandProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "plan-gifting");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String str;
        if (this.f214089b.a()) {
            String strE = cVar.e(2);
            HashMap map = cVar.d;
            m70.a.c(t0.f186434a);
            if (Intrinsics.f(strE, "")) {
                h hVar = new h(new PlanGiftingConfig.SenderDestination(Boolean.parseBoolean((String) map.get("skipPrompts")) ? kbk.a.SKIP : kbk.a.SHOW_IF_NEEDED, l.DEFAULT), null);
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                return hVar;
            }
            if (Intrinsics.f(strE, "receive") && (str = (String) map.get("giftId")) != null) {
                String str2 = (String) map.get("senderRevTag");
                return new h(new PlanGiftingConfig.ReceiverDestination(str, str2 != null ? new PlanGiftingClaimingExitRule.OpenChatWithSender(str2) : PlanGiftingClaimingExitRule.LeaveFlow.f102433a, k.CAN_DECLINE), null);
            }
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.f214089b.a()) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String strE = deeplink.e(2);
        HashMap map = deeplink.d;
        m70.a.c(t0.f186434a);
        if (Intrinsics.f(strE, "")) {
            boolean z3 = Boolean.parseBoolean((String) map.get("skipPrompts"));
            p0 p0Var = p0.f264001a;
            return w.o0(f.f127540b, new mt8.b(this, z3, null, 1));
        }
        if (!Intrinsics.f(strE, "receive")) {
            return d0.m(Boolean.FALSE);
        }
        String str = (String) map.get("giftId");
        String str2 = (String) map.get("senderRevTag");
        if (str == null) {
            return d0.m(Boolean.FALSE);
        }
        this.f214088a.c(new FeatureCommand(new PlanGiftingConfig.Receiver(str, str2 != null ? new PlanGiftingClaimingExitRule.OpenChatWithSender(str2) : PlanGiftingClaimingExitRule.LeaveFlow.f102433a, k.CAN_DECLINE)));
        return d0.m(Boolean.TRUE);
    }
}
