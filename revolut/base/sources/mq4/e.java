package mq4;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.api.models.creditcard.WithdrawalAvailability;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.m;
import rp0.y;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CollateralMoveMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CollateralMoveMoneyScreen collateralMoveMoneyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = collateralMoveMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        CreditCardSecurityDeposit securityDeposit;
        j60.a aVar;
        y yVarA;
        dj0.d dVar;
        dj0.d dVar2;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarD = this.v.d();
        bw0.m mVar = model.e;
        bw0.l lVar = mVar != null ? mVar.f19189b : null;
        x xVar = (x) iVarD;
        xVar.getClass();
        if (lVar == bw0.l.ERROR && (hVar = (h) ((g) ((j2) xVar.f207882w.f22677a).getValue()).f207858b.getContent()) != null && (securityDeposit = hVar.f207860a) != null) {
            xi0.b bVar = securityDeposit.f68756c;
            long j2 = securityDeposit.f68755b;
            j60.a aVar3 = xVar.f207877p;
            k kVar = xVar.f207881t;
            com.revolut.feature.credit.card.api.navigation.a screenMode = xVar.v.f69168c;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(screenMode, "screenMode");
            Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
            int i = l.f207866a[screenMode.ordinal()];
            if (i == 1 || i == 2) {
                aVar = aVar3;
                m.b bVar2 = rp0.m.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_max_money_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_max_money_description, null, null, 14);
                CellDetailsDelegate.Model[] elements = {new CellDetailsDelegate.Model("add_money_error_maximum_amount_deposited_id", new t0((Clause) new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_max_money_amount_deposited, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_max_money_amount_deposited_value, zhm.u.c(sx4.f.b(3, null, null, new dj0.d(j2, bVar))), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("add_money_error_maximum_limit_cell_id", new t0((Clause) new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_max_money_maximum_deposit_limit, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_max_money_maximum_deposit_limit_value, zhm.u.c(sx4.f.b(3, null, null, new dj0.d(securityDeposit.e, bVar))), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                yVarA = dy4.b.a(bVar2, textLocalisedClause, textLocalisedClause2, new mp.p("got_it_button_id", new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_common_bottom_dialog_button, null, null, 14), (Object) null), null, listL, Constants.TAG_PCI_PED_CHECKSUM);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                m.b bVar3 = rp0.m.Companion;
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_title, null, null, 14), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_description, null, null, 14), null, 28);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_bottom_description, null, null, 14);
                t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_amount_deposited, null, null, 14), (Image) null, 0, false, 30);
                int i2 = R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_amount_deposited_value;
                aVar = aVar3;
                long j3 = securityDeposit.d;
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("withdraw_error_maximum_deposited_amount_id", t0Var, new TextLocalisedClause(i2, zhm.u.c(sx4.f.b(3, null, null, new dj0.d(j2, bVar))), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_minimum_deposit, null, null, 14), (Image) null, 0, false, 30);
                int i3 = R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_minimum_deposit_value;
                WithdrawalAvailability withdrawalAvailability = securityDeposit.f68758h;
                if (withdrawalAvailability == null || (dVar = withdrawalAvailability.f68760b) == null) {
                    dVar = new dj0.d(j3, bVar);
                }
                CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("withdraw_dialog_row_id", t0Var2, new TextLocalisedClause(i3, zhm.u.c(sx4.f.b(3, null, null, dVar.l())), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                t0 t0Var3 = new t0((Clause) new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_available, null, null, 14), (Image) null, 0, false, 30);
                int i5 = R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_amount_available_available_value;
                if (withdrawalAvailability == null || (dVar2 = withdrawalAvailability.f68759a) == null) {
                    dVar2 = new dj0.d(j2 - j3, bVar);
                }
                CellDetailsDelegate.Model[] elements2 = {model2, model3, new CellDetailsDelegate.Model("withdraw_dialog_row_id", t0Var3, new TextLocalisedClause(i5, zhm.u.c(sx4.f.b(3, null, null, dVar2)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = kotlin.collections.d.L(elements2);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("got_it_button_id", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_common_bottom_dialog_button, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.r(model4, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
                yVarA = dy4.b.b(bVar3, d0.F0(model4, listL2), tVar, null, null, null, textLocalisedClause3, 508);
            }
            aVar.x(yVarA);
        }
        return Unit.f186387a;
    }
}
