package vch;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x0 f287721w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, Continuation continuation, x0 x0Var) {
        super(2, continuation);
        this.u = i;
        this.f287721w = x0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m0 m0Var = new m0(0, continuation, this.f287721w);
                m0Var.v = obj2;
                return m0Var;
            case 1:
                m0 m0Var2 = new m0(1, continuation, this.f287721w);
                m0Var2.v = obj2;
                return m0Var2;
            case 2:
                m0 m0Var3 = new m0(2, continuation, this.f287721w);
                m0Var3.v = obj2;
                return m0Var3;
            case 3:
                m0 m0Var4 = new m0(3, continuation, this.f287721w);
                m0Var4.v = obj2;
                return m0Var4;
            case 4:
                m0 m0Var5 = new m0(4, continuation, this.f287721w);
                m0Var5.v = obj2;
                return m0Var5;
            case 5:
                m0 m0Var6 = new m0(5, continuation, this.f287721w);
                m0Var6.v = obj2;
                return m0Var6;
            case 6:
                m0 m0Var7 = new m0(6, continuation, this.f287721w);
                m0Var7.v = obj2;
                return m0Var7;
            case 7:
                m0 m0Var8 = new m0(7, continuation, this.f287721w);
                m0Var8.v = obj2;
                return m0Var8;
            default:
                m0 m0Var9 = new m0(8, continuation, this.f287721w);
                m0Var9.v = obj2;
                return m0Var9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((m0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((m0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 26;
        x0 x0Var = this.f287721w;
        switch (i) {
            case 0:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (iVar.d()) {
                    x0Var.x2(new v73.c(iVar, x0Var, 11));
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0Var.x2(new uz7.d(data, 25));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0Var.x2(new uz7.d(data2, 26));
                break;
            case 3:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t1h.h hVar = (t1h.h) pair.f186385a;
                dj0.d availableToWithdraw = ((t1h.g) pair.f186386b).f267354a;
                boolean z = hVar.f267358c;
                dj0.d minAmountToWithdraw = hVar.f267356a;
                if (z && availableToWithdraw.compareTo(minAmountToWithdraw) < 0 && !availableToWithdraw.k()) {
                    j60.a aVar5 = x0Var.f287744r;
                    x0Var.A.getClass();
                    Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
                    Intrinsics.checkNotNullParameter(minAmountToWithdraw, "minAmountToWithdraw");
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_withdraw_notice_dialog_sell_all_positive_button, null, null, 14);
                    a0 a0Var = new a0(new efl.i(availableToWithdraw, efl.h.SELL_ALL));
                    int i3 = R$attr.uikit_dp8;
                    int i5 = R$attr.uikit_dp16;
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LIST_ID_WITHDRAW_ALL_DIALOG_CONFIRM", defaultFilledButton, null, textLocalisedClause, false, null, a0Var, i3, i3, i5, i5, 368);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_withdraw_no_funds_dialog_go_back_button, null, null, 14);
                    int i6 = R$attr.uikit_dp8;
                    int i21 = R$attr.uikit_dp16;
                    List listK = zhm.v.k(model, new LargeActionButtonDelegate.Model("LIST_ID_WITHDRAW_ALL_DIALOG_CANCEL", defaultFilledButton2, null, textLocalisedClause2, false, null, n.f287722a, i6, i6, i21, i21, 368));
                    int i22 = R$attr.uikit_dp16;
                    int i32 = R$attr.uikit_dp0;
                    yp0.b.o(i22, i22, i32, i32, listK);
                    aVar5.x(new rp0.y(listK, new rp0.t(new TextLocalisedClause(R$string.wealth_robo_withdraw_no_funds_dialog_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_withdraw_no_funds_withdraw_all_dialog_description, zhm.v.k(new MoneyClause(availableToWithdraw, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(minAmountToWithdraw, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new rp0.v("LIST_ID_WITHDRAW_ALL_DIALOG_ICON", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), 24), rp0.l.WINDOW, null, null, null, 1016));
                }
                x0Var.y2(((k) x0Var.t2()).f287710c);
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0Var.x2(new uz7.d(data3, 27));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0Var.x2(new uz7.d(data4, 28));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0Var.x2(new uz7.d(data5, 29));
                break;
            case 7:
                Pair pair2 = (Pair) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dj0.d dVar = (dj0.d) pair2.f186385a;
                Data data6 = (Data) pair2.f186386b;
                if (Intrinsics.f(((k) x0Var.t2()).f287710c, dVar)) {
                    x0Var.x2(new s0(data6, 0));
                    if (data6 == null) {
                        x0Var.y2(dVar);
                    } else {
                        iii.c.f(data6, new g0(x0Var, 3), new v48.d(x0Var, 13), new tvh.e(x0Var, dVar, i2));
                    }
                }
                break;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0Var.x2(new s0(data7, 1));
                break;
        }
        return Unit.f186387a;
    }
}
