package kq5;

import aim.f;
import aim.k;
import aw0.o9;
import bw0.m;
import cli.y;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import gim.i;
import h93.l0;
import hye.g;
import hye.h;
import hye.j;
import hye.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import ks9.f0;
import ks9.s;
import kye.b0;
import kye.e0;
import kye.k3;
import kye.o0;
import kye.q;
import kye.r;
import kye.u;
import kye.w;
import l2d.n;
import rp0.t;
import vkm.j2;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f188330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f188331x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f188330w = obj2;
        this.f188331x = obj3;
    }

    private final Object b(Object obj2) {
        Object objC3;
        Object next;
        Object next2;
        dj0.d dVarM;
        dj0.d dVar;
        String str;
        m mVar = (m) this.f188331x;
        k3 k3Var = (k3) this.f188330w;
        y yVar = k3Var.f190763d0;
        gye.d dVar2 = k3Var.u;
        j60.a aVar = k3Var.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            ote.a aVar3 = k3Var.f190770x;
            this.v = 1;
            objC3 = aVar3.c3(mVar);
            if (objC3 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objC3 = obj2;
        }
        if (((Boolean) objC3).booleanValue()) {
            return Unit.f186387a;
        }
        Object obj3 = mVar != null ? mVar.e : null;
        if (obj3 instanceof eb3.a) {
            qb3.a aVar4 = k3Var.B;
            int i2 = o0.f190806c[((eb3.a) obj3).ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    k3Var.P2();
                    aVar.x(aVar4.a());
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fb3.d dVar3 = ((kye.m) ((j2) yVar.f22677a).getValue()).f190784q;
                    if (dVar3 != null && (str = dVar3.f133439c) != null) {
                        rp0.y yVarB = aVar4.b(str);
                        k3Var.P2();
                        aVar.x(yVarB);
                    }
                }
            }
        } else if (obj3 instanceof g) {
            g gVar = (g) obj3;
            if (gVar instanceof g.a) {
                k3Var.P2();
                ((gye.e) dVar2).getClass();
                t tVar = new t(new TextLocalisedClause(R$string.topup_dialog_card_surcharge_fee_title, null, null, 14), new TextLocalisedClause(R$string.topup_dialog_card_surcharge_fee_description, null, null, 14), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BUTTON_ID_CARD_FEE_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, b.C0559b.f90729a, null, 744);
                int i3 = R$attr.uikit_dp16;
                yp0.b.r(model, 0, R$attr.uikit_dp24, i3, i3, 1);
                aVar.x(new rp0.y(u.c(model), tVar, null, null, null, null, 1020));
            } else if (gVar instanceof h) {
                e71.a crossProfileFee = ((h) obj3).f156862a;
                k3Var.P2();
                ((gye.e) dVar2).getClass();
                Intrinsics.checkNotNullParameter(crossProfileFee, "crossProfileFee");
                t tVar2 = new t(new TextClause(crossProfileFee.f123016a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(crossProfileFee.f123017b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28);
                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("BUTTON_ID_CARD_FEE_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
                int i5 = R$attr.uikit_dp16;
                yp0.b.r(model2, 0, 0, i5, i5, 3);
                LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("BUTTON_ID_CARD_FEE_SWITCH_PROFILE", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.topup_card_details_cross_profile_restricted_switch_profile, null, null, 14), false, null, null, null, null, 1000);
                int i6 = R$attr.uikit_dp16;
                yp0.b.r(model3, 0, R$attr.uikit_dp24, i6, i6, 1);
                aVar.x(new rp0.y(v.k(model2, model3), tVar2, null, null, null, null, 1020));
            } else if (gVar instanceof l) {
                String str2 = ((kye.m) ((j2) yVar.f22677a).getValue()).f190775b;
                aue.a aVar5 = ((l) obj3).f156867a;
                dj0.d dVar4 = aVar5.f9805c;
                dj0.d dVar5 = aVar5.f9804b;
                xi0.b.Companion.getClass();
                k3Var.C2(new b0(dVar4, dVar5, xi0.a.a(str2)));
            } else if (gVar instanceof hye.i) {
                hye.i iVar = (hye.i) obj3;
                f breakdown = iVar.f156863a;
                dj0.d fullFee = iVar.f156864b;
                k3Var.P2();
                k3Var.S.getClass();
                Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                Intrinsics.checkNotNullParameter(fullFee, "fullFee");
                lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R$string.india_core_topup_charges_details_title, null, null, 14), null, null, null, false, 30);
                aim.e eVarB = u.b();
                for (Map.Entry entry : (k) breakdown.entrySet()) {
                    eVarB.add(d0.J((CharSequence) entry.getKey(), "igst", true) ? new CellDetailsDelegate.Model("INDIA_IGST_ITEM", new TextLocalisedClause(R$string.india_core_topup_charges_details_consumption_igst, null, null, 14), new MoneyClause((dj0.d) entry.getValue(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : d0.J((CharSequence) entry.getKey(), "sgst", true) ? new CellDetailsDelegate.Model("INDIA_SGST_ITEM", new TextLocalisedClause(R$string.india_core_topup_charges_details_consumption_sgst, null, null, 14), new MoneyClause((dj0.d) entry.getValue(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : d0.J((CharSequence) entry.getKey(), "cgst", true) ? new CellDetailsDelegate.Model("INDIA_CGST_ITEM", new TextLocalisedClause(R$string.india_core_topup_charges_details_consumption_cgst, null, null, 14), new MoneyClause((dj0.d) entry.getValue(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : new CellDetailsDelegate.Model("INDIA_DEFAULT_ITEM", new TextLocalisedClause(R$string.india_core_topup_charges_details_topup_default, null, null, 14), new MoneyClause((dj0.d) entry.getValue(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
                }
                eVarB.add(new CellDetailsDelegate.Model("INDIA_FULL_FEE_ITEM", new TextLocalisedClause(R$string.india_core_topup_charges_details_total_fees_and_taxes, null, null, 14), new MoneyClause(fullFee, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
                aim.e eVarA = u.a(eVarB);
                int i21 = R$attr.uikit_dp16;
                yp0.b.k(eVarA, i21, i21, 0, 0, 28);
                k3Var.C2(new kye.v(new sye.e(aVar6, eVarA)));
            } else if (gVar instanceof hye.e) {
                qte.c cVar = ((hye.e) obj3).f156858a;
                k3Var.P2();
                k3Var.C2(new q(cVar));
            } else if (gVar instanceof j) {
                List limits = ((j) obj3).f156865a;
                k3Var.P2();
                ((gye.e) dVar2).getClass();
                Intrinsics.checkNotNullParameter(limits, "limits");
                List list = limits;
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (((ue6.a) next).d != null) {
                        break;
                    }
                }
                ue6.a aVar7 = (ue6.a) next;
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (((ue6.a) next2).d == null) {
                        break;
                    }
                }
                ue6.a aVar8 = (ue6.a) next2;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.india_core_topup_limits_prompt_title, null, null, 14);
                if (aVar7 == null || (dVarM = aVar7.f279305c) == null) {
                    dVarM = pyd.c.M(aVar8 != null ? aVar8.f279305c : null);
                }
                t tVar3 = new t(textLocalisedClause, new TextLocalisedClause(R.string.india_core_topup_limits_prompt_subtitle, u.c(new MoneyClause(dVarM, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, 28);
                aim.e eVarB2 = u.b();
                if (aVar7 != null) {
                    eVarB2.add(new CellDetailsDelegate.Model("INDIA_LIMIT_ITEM", new TextLocalisedClause(R.string.india_core_topup_limits_wallet_balance_title, null, null, 14), new TextLocalisedClause(R.string.india_core_topup_limits_wallet_balance_placeholder, v.k(new MoneyClause(pyd.c.M(aVar7.d), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(pyd.c.M(aVar7.f279305c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
                }
                if (aVar8 != null && (dVar = aVar8.f279305c) != null) {
                    eVarB2.add(new CellDetailsDelegate.Model("INDIA_LIMIT_ITEM", new TextLocalisedClause(R.string.india_core_topup_limits_single_topup_title, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
                }
                aim.e eVarA2 = u.a(eVarB2);
                int i22 = R$attr.uikit_dp16;
                yp0.b.k(eVarA2, i22, i22, 0, 0, 28);
                aVar.x(new rp0.y(eVarA2, tVar3, null, null, null, null, 1020));
            } else if (gVar instanceof hye.d) {
                hye.d dVar6 = (hye.d) obj3;
                k3Var.C2(new w(dVar6.f156856a, dVar6.f156857b));
            } else if (gVar instanceof hye.k) {
                k3Var.C2(new e0(((hye.k) obj3).f156866a));
            } else if (gVar instanceof hye.f) {
                k3Var.C2(new r(((hye.f) obj3).f156859a));
            } else {
                if (!(gVar instanceof g.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                k3Var.P2();
                k3Var.C2(u.c.f190844a);
            }
        } else if (obj3 instanceof e1f.a) {
            e1f.b limits2 = (e1f.b) obj3;
            ((gye.e) dVar2).getClass();
            Intrinsics.checkNotNullParameter(limits2, "limits");
            if (!(limits2 instanceof e1f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            e1f.a aVar9 = (e1f.a) limits2;
            t tVar4 = new t(new TextLocalisedClause(R$string.topup_amount_direct_debit_limits_title, null, null, 14), null, null, 30);
            List listK = v.k(new CellDetailsDelegate.Model("ITEM_EXTERNAL_POCKET_LIMITS_DEPOSIT_LIMIT", new TextLocalisedClause(R$string.topup_amount_direct_debit_limits_deposit_limit_cell_title, null, null, 14), new MoneyClause(aVar9.f121980b, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 13), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("ITEM_EXTERNAL_POCKET_LIMITS_DEPOSITED", new TextLocalisedClause(R$string.topup_amount_direct_debit_limits_deposited_cell_title, null, null, 14), new MoneyClause(aVar9.f121979a, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 13), new Click(30, (Integer) null, (Object) null, "ITEM_EXTERNAL_POCKET_LIMITS_CLICK_INFO", false), null, 8), 0, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, 0, 31224), new CellDetailsDelegate.Model("ITEM_EXTERNAL_POCKET_LIMITS_REMAINING", new TextLocalisedClause(R$string.topup_amount_direct_debit_limits_total_remaining_cell_title, null, null, 14), new MoneyClause(pyd.c.H(aVar9.f121980b, aVar9.f121979a), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 13), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            aVar.x(new rp0.y(listK, tVar4, null, null, null, null, 1020));
        } else if (obj3 instanceof bue.a) {
            bue.a topupWalletLimits = (bue.a) obj3;
            k3Var.P2();
            ((gye.e) dVar2).getClass();
            Intrinsics.checkNotNullParameter(topupWalletLimits, "topupWalletLimits");
            WalletLimit.CounterLimit counterLimit = topupWalletLimits.f18769a;
            CellDetailsDelegate.Model model4 = counterLimit != null ? new CellDetailsDelegate.Model(counterLimit.f94844a.a(), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_annual_limit_title, null, null, 14), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_annual_limit_value, v.k(new MoneyClause(counterLimit.f94846c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(counterLimit.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
            WalletLimit.CounterLimit counterLimit2 = topupWalletLimits.f18770b;
            CellDetailsDelegate.Model model5 = counterLimit2 != null ? new CellDetailsDelegate.Model(counterLimit2.f94844a.a(), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_balance_limit_title, null, null, 14), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_balance_limit_value, v.k(new MoneyClause(counterLimit2.f94846c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(counterLimit2.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
            WalletLimit.CounterLimit counterLimit3 = topupWalletLimits.f18771c;
            CellDetailsDelegate.Model model6 = counterLimit3 != null ? new CellDetailsDelegate.Model(counterLimit3.f94844a.a(), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_daily_limit_title, null, null, 14), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_daily_limit_value, v.k(new MoneyClause(counterLimit3.f94846c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(counterLimit3.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
            WalletLimit.TransactionLimit transactionLimit = topupWalletLimits.d;
            CellDetailsDelegate.Model[] elements = {model4, model5, model6, transactionLimit != null ? new CellDetailsDelegate.Model(transactionLimit.f94847a.a(), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_add_money_amount_limit_title, null, null, 14), new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_add_money_amount_limit_value, zhm.u.c(new MoneyClause(transactionLimit.f94848b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            aVar.x(new rp0.y(listL, new t(new TextLocalisedClause(R$string.topup_bottom_sheet_mcy_details_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((e) this.f188330w, (CryptoAddress) this.f188331x, continuation, 0);
            case 1:
                return new d((vpd.i) this.f188330w, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e) this.f188331x, continuation, 1);
            case 2:
                return new d((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e) this.f188330w, (aii.m) this.f188331x, continuation, 2);
            case 3:
                return new d((kqh.u) this.f188330w, (zel.f) this.f188331x, continuation, 3);
            case 4:
                return new d((ks9.a) this.f188330w, (du9.a) this.f188331x, continuation, 4);
            case 5:
                return new d((ks9.l) this.f188330w, (PaymentGroup) this.f188331x, continuation, 5);
            case 6:
                return new d((eu9.e) this.f188330w, (s) this.f188331x, continuation, 6);
            case 7:
                return new d((s) this.f188330w, (cu9.b) this.f188331x, continuation, 7);
            case 8:
                return new d((f0) this.f188330w, (PaymentGroup) this.f188331x, continuation, 8);
            case 9:
                return new d((f0) this.f188330w, (oq9.o) this.f188331x, continuation, 9);
            case 10:
                return new d((com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.a) this.f188330w, (bp9.f) this.f188331x, continuation, 10);
            case 11:
                return new d((ktk.f) this.f188330w, (String) this.f188331x, continuation, 11);
            case 12:
                return new d((ku7.e) this.f188330w, (jf0.c) this.f188331x, continuation, 12);
            case 13:
                d dVar = new d((ConsentPromptPreconditionScreen) this.f188331x, continuation, 13);
                dVar.f188330w = obj2;
                return dVar;
            case 14:
                return new d((kv7.i) this.f188330w, (h93.f0) this.f188331x, continuation, 14);
            case 15:
                return new d((kv7.i) this.f188330w, (f9i.c) this.f188331x, continuation, 15);
            case 16:
                return new d((kx4.a) this.f188330w, (String) this.f188331x, continuation, 16);
            case 17:
                return new d((kxj.h) this.f188331x, continuation, 17);
            case 18:
                return new d((AtomicBoolean) this.f188330w, (Function1) this.f188331x, continuation, 18);
            case 19:
                return new d((k3) this.f188330w, (m) this.f188331x, continuation, 19);
            case 20:
                return new d((k3) this.f188330w, (String) this.f188331x, continuation, 20);
            case 21:
                return new d((kz1.g) this.f188330w, (jf0.c) this.f188331x, continuation, 21);
            case 22:
                return new d((kzb.h) this.f188330w, (String) this.f188331x, continuation, 22);
            case 23:
                return new d((l0g.e) this.f188330w, (nyf.b) this.f188331x, continuation, 23);
            case 24:
                return new d((l13.l) this.f188330w, (l0) this.f188331x, continuation, 24);
            case 25:
                return new d((l1b.c) this.f188330w, (jf0.c) this.f188331x, continuation, 25);
            case 26:
                return new d((n) this.f188330w, (Set) this.f188331x, continuation, 26);
            case 27:
                d dVar2 = new d((c1g.v) this.f188331x, continuation, 27);
                dVar2.f188330w = obj2;
                return dVar2;
            case 28:
                return new d((l2k.g) this.f188330w, (String) this.f188331x, continuation, 28);
            default:
                d dVar3 = new d((l30.e) this.f188331x, continuation, 29);
                dVar3.f188330w = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((kug.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:520:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v12 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq5.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f188331x = obj2;
    }
}
