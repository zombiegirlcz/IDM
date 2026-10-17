package rw4;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.creditcard.WithdrawalAvailability;
import com.revolut.feature.credit.card.impl.widget.collateral.WithdrawalWidgetParcel;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ll4.b0;
import nsh.p;
import rp0.m;
import ru6.r;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends csh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wm.e f257830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ash.g f257831c;
    public final wie.a d;
    public ifm.c e;

    public j(n withdrawalWidgetDialogProvider, wm.e expandableDialogActionDispatcher, ash.g expandableDialogEventProvider, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(withdrawalWidgetDialogProvider, "withdrawalWidgetDialogProvider");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(expandableDialogEventProvider, "expandableDialogEventProvider");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f257830b = expandableDialogActionDispatcher;
        this.f257831c = expandableDialogEventProvider;
        this.d = creditAccountDestinationResolver;
    }

    @Override // csh.f
    public final void i() {
        ifm.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = ((p) this.f257831c).f218900n.d.f121375b.filter(new rpi.d(new r(13), 28)).subscribe(new rpi.d(new rrd.l(this, 15), 29));
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Collateral.class;
    }

    @Override // csh.f
    public final void r() {
        ifm.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        long j2;
        CellDetailsDelegate.Model modelA;
        int i;
        HomeFeedWidgetContext.Collateral widgetContext2 = (HomeFeedWidgetContext.Collateral) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            GoalProgressWidgetDelegate.Model model2 = model instanceof GoalProgressWidgetDelegate.Model ? (GoalProgressWidgetDelegate.Model) model : null;
            Object obj2 = model2 != null ? model2.f55148j : null;
            WithdrawalWidgetParcel parcel = obj2 instanceof WithdrawalWidgetParcel ? (WithdrawalWidgetParcel) obj2 : null;
            if (parcel == null) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            b0 b0Var = parcel.d;
            long j3 = parcel.f69785c;
            WithdrawalAvailability withdrawalAvailability = parcel.f69784b;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            xi0.b bVar = withdrawalAvailability.f68759a.f115083b;
            aim.e eVarB = u.b();
            eVarB.add(n.a("id_deposit_amount", new TextLocalisedClause(R$string.credit_collateral_account_widget_withdrawal_prompt_rows_deposit_amount, null, null, 14), new dj0.d(j3, bVar)));
            int[] iArr = m.f257838a;
            int i2 = iArr[b0Var.ordinal()];
            if (i2 == 1) {
                j2 = j3;
                modelA = n.a("id_reserved", new TextLocalisedClause((parcel.a() || b0Var == b0.PARTIALLY_SECURED) ? R$string.credit_collateral_account_widget_withdrawal_prompt_rows_spent : R$string.credit_collateral_account_widget_withdrawal_prompt_rows_minimum_deposit, null, null, 14), new dj0.d(-(j2 - withdrawalAvailability.f68759a.f115082a), bVar));
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (parcel.a()) {
                    j2 = j3;
                    modelA = n.a("id_reserved", new TextLocalisedClause(R$string.credit_collateral_account_widget_withdrawal_prompt_rows_spent, null, null, 14), new dj0.d(-(j2 - withdrawalAvailability.f68759a.f115082a), bVar));
                } else {
                    j2 = j3;
                    modelA = null;
                }
            }
            n14.e.b(eVarB, modelA);
            eVarB.add(n.a("id_available_to_withdraw", new TextLocalisedClause(R$string.credit_collateral_account_widget_withdrawal_prompt_rows_available_to_withdraw, null, null, 14), withdrawalAvailability.f68759a));
            aim.e eVarA = u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            boolean z3 = false;
            List listC = u.c(new RowDelegate.Model("id_footer", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.credit_collateral_account_widget_withdrawal_prompt_footer, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            m.b bVar2 = rp0.m.Companion;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_collateral_account_widget_withdrawal_prompt_title, null, null, 14);
            int i3 = iArr[b0Var.ordinal()];
            if (i3 == 1) {
                i = parcel.a() ? R$string.credit_collateral_account_widget_withdrawal_prompt_fully_secured_limit_above_subtitle : R$string.credit_collateral_account_widget_withdrawal_prompt_fully_secured_limit_below_subtitle;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = j2 - withdrawalAvailability.f68759a.f115082a > 0 ? R$string.credit_collateral_account_widget_withdrawal_prompt_partially_secured_limit_above_subtitle : R$string.credit_collateral_account_widget_withdrawal_prompt_partially_secured_limit_below_subtitle;
            }
            this.f257830b.D(new wm.c(dy4.b.a(bVar2, textLocalisedClause, new TextLocalisedClause(i, null, null, 14), new mp.p("SECURITY_DEPOSIT_GO_TO_CREDIT", new TextLocalisedClause(R$string.credit_collateral_account_widget_withdrawal_prompt_action_go_to_credit, null, null, 14), parcel.f69783a), null, d0.E0(listC, eVarA), Constants.TAG_PCI_PED_CHECKSUM)));
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
