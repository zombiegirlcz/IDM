package mic;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import com.revolut.feature.rewards.api.model.rewards.RewardFooter;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterButton;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PerkDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PerkDetailsScreen perkDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = perkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((w8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RewardOutlet rewardOutlet;
        RewardFooterAction rewardFooterAction;
        int i = this.u;
        PerkDetailsScreen perkDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0Var = (g0) perkDetailsScreen.R2();
                cli.y yVar = g0Var.f205665x;
                ggc.l lVar = ((k) ((j2) yVar.f22677a).getValue()).f205667a;
                if (lVar != null && (rewardOutlet = ((k) ((j2) yVar.f22677a).getValue()).d) != null) {
                    String str = lVar.f143640a;
                    co3.a aVar2 = rewardOutlet.f84882c;
                    String str2 = lVar.f143644h.f143672a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    g0Var.C2(new p(new RewardAction.OpenMap(str, aVar2, str2, lVar.f143649p)));
                }
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0Var2 = (g0) perkDetailsScreen.R2();
                RewardAction rewardAction = ((k) ((j2) g0Var2.f205665x.f22677a).getValue()).e;
                if (rewardAction instanceof RewardAction.Footer) {
                    RewardFooter rewardFooter = ((RewardAction.Footer) rewardAction).f84820a;
                    RewardFooterButton rewardFooterButton = rewardFooter.f84852a;
                    if (rewardFooterButton == null || (rewardFooterAction = rewardFooterButton.f84866c) == null) {
                        RewardFooterButton rewardFooterButton2 = rewardFooter.f84853b;
                        if (rewardFooterButton2 != null) {
                            RewardFooterAction rewardFooterAction2 = rewardFooterButton2.f84866c;
                            g0Var2.C2(new o(rewardFooterAction2));
                        }
                    } else {
                        g0Var2.C2(new o(rewardFooterAction2));
                    }
                } else if (rewardAction instanceof RewardAction.ComplexAction) {
                    Parcelable parcelable = ((RewardAction.ComplexAction) rewardAction).f84813a;
                    Intrinsics.i(parcelable, "null cannot be cast to non-null type com.revolut.feature.rewards.api.model.rewards.RewardAction");
                    g0Var2.C2(new p((RewardAction) parcelable));
                } else if (rewardAction != null) {
                    g0Var2.C2(new p(rewardAction));
                }
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0Var3 = (g0) perkDetailsScreen.R2();
                RewardAction rewardAction2 = ((k) ((j2) g0Var3.f205665x.f22677a).getValue()).e;
                if (rewardAction2 instanceof RewardAction.Footer) {
                    RewardFooterButton rewardFooterButton3 = ((RewardAction.Footer) rewardAction2).f84820a.f84853b;
                    if (rewardFooterButton3 != null && (rewardFooterAction = rewardFooterButton3.f84866c) != null) {
                        g0Var3.C2(new o(rewardFooterAction));
                    }
                } else if (rewardAction2 instanceof RewardAction.ComplexAction) {
                    g0Var3.C2(new p(((RewardAction.ComplexAction) rewardAction2).f84814b));
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((g0) perkDetailsScreen.R2()).C2(u.f205680a);
                break;
        }
        return Unit.f186387a;
    }
}
