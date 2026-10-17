package mq4;

import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import rp0.m;
import rp0.y;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CollateralMoveMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CollateralMoveMoneyScreen collateralMoveMoneyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = collateralMoveMoneyScreen;
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
        switch (this.u) {
            case 0:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CreditCardSecurityDeposit securityDeposit;
        TextLocalisedClause textLocalisedClause;
        List listL;
        y yVarA;
        int i = this.u;
        Continuation continuation = null;
        CollateralMoveMoneyScreen collateralMoveMoneyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) collateralMoveMoneyScreen.d();
                xVar.getClass();
                xVar.n2(new mci.e(xVar, continuation, 17), new whi.b(6));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar2 = (x) collateralMoveMoneyScreen.d();
                h hVar = (h) ((g) ((j2) xVar2.f207882w.f22677a).getValue()).f207858b.getContent();
                if (hVar != null && (securityDeposit = hVar.f207860a) != null) {
                    j60.a aVar3 = xVar2.f207877p;
                    k kVar = xVar2.f207881t;
                    com.revolut.feature.credit.card.api.navigation.a screenMode = xVar2.v.f69168c;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(screenMode, "screenMode");
                    Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
                    int i2 = l.f207866a[screenMode.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        m.b bVar = rp0.m.Companion;
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_title, null, null, 14);
                        boolean z = securityDeposit.f68757g;
                        long j2 = securityDeposit.d;
                        xi0.b bVar2 = securityDeposit.f68756c;
                        if (z) {
                            textLocalisedClause = textLocalisedClause2;
                            listL = zhm.v.k(new RowDelegate.Model("add_money_hold_deposit_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_salary, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_hold_deposit_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_hold_deposit_description_eu, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("add_money_spending_limit_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_deposit_amount_title_eu, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_deposit_amount_description_eu, zhm.v.k(sx4.f.b(3, null, null, new dj0.d(60000L, bVar2)), sx4.f.b(3, null, null, new dj0.d(j2, bVar2))), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("add_money_adjust_deposit_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_draw_parallel_channel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_adjust_deposit_title_eu, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_adjust_deposit_description_eu, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                            yp0.b.k(listL, 0, 0, 0, 0, 31);
                        } else {
                            textLocalisedClause = textLocalisedClause2;
                            RowDelegate.Model[] elements = {new RowDelegate.Model("add_money_hold_deposit_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_salary, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_hold_deposit_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_hold_deposit_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("add_money_amount_deposit_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_doxgety, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_deposit_amount_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_deposit_amount_description, zhm.u.c(sx4.f.b(3, null, null, new dj0.d(j2, bVar2))), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("add_money_adjust_deposit_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_draw_parallel_channel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_adjust_deposit_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_bottom_dialog_secured_deposit_adjust_deposit_description, zhm.u.c(sx4.f.b(3, null, null, new dj0.d(securityDeposit.e, bVar2))), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            listL = kotlin.collections.d.L(elements);
                            yp0.b.k(listL, 0, 0, 0, 0, 31);
                        }
                        yVarA = dy4.b.a(bVar, textLocalisedClause, null, new mp.p("got_it_button_id", new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_common_bottom_dialog_button, null, null, 14), (Object) null), null, listL, Constants.TAG_EMV_L1_CHECKSUM);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m.b bVar3 = rp0.m.Companion;
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_affected_credit_title, null, null, 14);
                        int i3 = R$string.credit_security_deposit_collateral_move_money_withdraw_bottom_dialog_affected_credit_description;
                        m70.a.c(t0.f186434a);
                        PlainTextDelegate.Model model = new PlainTextDelegate.Model("withdraw_dialog_affected_deposit_id", (Clause) null, (Clause) new TextLocalisedClause(i3, zhm.u.c(""), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                        List listC = zhm.u.c(model);
                        yp0.b.k(listC, 0, 0, 0, 0, 31);
                        yVarA = dy4.b.a(bVar3, textLocalisedClause3, null, new mp.p("got_it_button_id", new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_common_bottom_dialog_button, null, null, 14), (Object) null), null, listC, Constants.TAG_EMV_L1_CHECKSUM);
                    }
                    aVar3.x(yVarA);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar3 = (x) collateralMoveMoneyScreen.d();
                if (xVar3.v.f69168c == com.revolut.feature.credit.card.api.navigation.a.INITIAL_DEPOSIT) {
                    xVar3.C2(zl4.c.f323180a);
                } else {
                    xVar3.B2();
                }
                return Unit.f186387a;
        }
    }
}
