package zr4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.c50;
import ip0.f50;
import ip0.j50;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.e4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 implements cli.n {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f324557g = zhm.v.k(ql4.j.FUTURE_INSTALMENTS, ql4.j.ANTICIPATION, ql4.j.CUSTOM_AMOUNT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalmentDetailsScreenContract$InputData f324558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f324559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yr4.e f324560c;
    public final thf.m d;
    public final gs4.f e;
    public final he2.b f;

    public e0(InstalmentDetailsScreenContract$InputData inputData, whf.n transactionItemsMapper, yr4.a loadingMapper, yr4.e toolbarMapper, thf.m transactionTextResourcesMapper, gs4.f creditCardInstalmentIconMapper, gs4.l instalmentDocumentMapper, he2.b creditCardSectionMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        Intrinsics.checkNotNullParameter(loadingMapper, "loadingMapper");
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentIconMapper, "creditCardInstalmentIconMapper");
        Intrinsics.checkNotNullParameter(instalmentDocumentMapper, "instalmentDocumentMapper");
        Intrinsics.checkNotNullParameter(creditCardSectionMapper, "creditCardSectionMapper");
        this.f324558a = inputData;
        this.f324559b = transactionItemsMapper;
        this.f324560c = toolbarMapper;
        this.d = transactionTextResourcesMapper;
        this.e = creditCardInstalmentIconMapper;
        this.f = creditCardSectionMapper;
    }

    public static CompositeClause a(int i, dj0.d dVar, dj0.d dVar2) {
        MoneyClause[] elements = {sx4.f.b(3, null, null, dVar), dVar.f115082a != dVar2.f115082a ? sx4.f.b(1, new Custom(Integer.valueOf(i), true, null, false, null, Constants.TAG_FC_SPEED_MODE), null, dVar2) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static ProgressStepVerticalV2Delegate.Model b(dj0.d dVar, LocalDate localDate, ql4.m mVar, int i) {
        int i2;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_financing_details_item_remaining_balance, zhm.u.c(sx4.f.b(3, null, null, dVar)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        int i3 = mVar == null ? -1 : d0.f324556b[mVar.ordinal()];
        if (i3 == -1) {
            i2 = R$string.credit_card_statement_financing_details_item_remaining_balance_description;
        } else if (i3 != 1) {
            if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.credit_card_statement_financing_details_item_remaining_balance_description;
        } else {
            i2 = R$string.credit_card_statement_financing_details_item_remaining_balance_forbearance_description;
        }
        return new ProgressStepVerticalV2Delegate.Model("id_instalment_details_remaining_balance", textLocalisedClause, new TextLocalisedClause(i2, zhm.u.c(sx4.g.c(localDate)), null, 12), new f50(j50.NORMAL, c50.LAST, false), false, null, i, 0, 0, null, false, false, 32624);
    }

    public static aim.e d(ql4.q qVar) {
        aim.e eVarB = zhm.u.b();
        ql4.t tVar = qVar.u;
        ArrayList arrayList = qVar.E;
        if (tVar == ql4.t.ACTIVE && !arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (f324557g.contains((ql4.j) it8.next())) {
                    eVarB.add(new ActionsView.Item("id_instalment_details_action_repay", null, false, qVar.F.f247152b.i != null ? e4.EnabledClickable : e4.DisabledNonClickable, null, new TextLocalisedClause(R$string.credit_card_instalment_management_action_repay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32662));
                }
            }
        }
        if (qVar.u == ql4.t.ACTIVE && arrayList.contains(ql4.j.CHANGE_TERM)) {
            eVarB.add(new ActionsView.Item("id_instalment_details_action_update", null, false, e4.EnabledClickable, null, new TextLocalisedClause(R$string.credit_card_instalment_management_action_edit, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32662));
        }
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (w) iii.c.f(domainState.f324568a, new zhf.f(this, 28), new zo2.h(this, 9), new ymk.y(this, 23));
    }
}
