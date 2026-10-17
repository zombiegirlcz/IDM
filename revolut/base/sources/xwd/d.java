package xwd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.model.StakingInterestRate;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import vkm.j2;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ UnstakeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(UnstakeController unstakeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = unstakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UnstakeController unstakeController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.staking.impl.unstake.v2.a) unstakeController.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.staking.impl.unstake.v2.a aVar3 = (com.revolut.feature.staking.impl.unstake.v2.a) unstakeController.R2();
                aVar3.f88169y.onNext(((l) ((j2) aVar3.z.f22677a).getValue()).e);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.staking.impl.unstake.v2.a aVar5 = (com.revolut.feature.staking.impl.unstake.v2.a) unstakeController.R2();
                StakingPocket stakingPocket = aVar5.o;
                dj0.d dVarH = pyd.c.H(stakingPocket.f88083c, pyd.c.M(((l) ((j2) aVar5.z.f22677a).getValue()).d.f309353b));
                StakingProduct stakingProduct = stakingPocket.f88082b;
                StakingInterestRate interestRate = stakingProduct.a(dVarH);
                boolean zF = Intrinsics.f(interestRate, stakingProduct.a(stakingPocket.f88083c));
                Continuation continuation = null;
                if (zF) {
                    aVar5.n2(new xb4.e(aVar5, continuation, 15), new whi.b(6));
                } else {
                    j60.a aVar6 = aVar5.f88167w;
                    wwd.b bVar = aVar5.f88168x;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(interestRate, "interestRate");
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONTINUE_LARGE_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.staking_unstake_tier_drop_notification_continue, null, null, 14), false, null, null, bud.a.f18767a, null, 744);
                    yp0.b.r(model, 0, 0, 0, 0, 15);
                    LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("EDIT_ORDER_LARGE_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.staking_unstake_tier_drop_notification_cancel, null, null, 14), false, null, null, bud.b.f18768a, null, 744);
                    yp0.b.r(model2, 0, 0, 0, 0, 15);
                    aVar6.x(new y(v.k(model, model2), new t(new TextLocalisedClause(R$string.staking_unstake_tier_drop_notification_title, u.c(((wud.b) bVar.f300645a).c(interestRate, true, null)), null, 12), new TextLocalisedClause(R$string.staking_unstake_tier_drop_notification_subtitle, null, null, 14), new rp0.v("EXPANDABLE_DIALOG_IMAGE_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), 24), rp0.l.WINDOW, null, null, null, 1016));
                }
                break;
        }
        return Unit.f186387a;
    }
}
