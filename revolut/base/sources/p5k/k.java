package p5k;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import ip0.ck0;
import kotlin.jvm.internal.Intrinsics;
import mga.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements h {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f233171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f233172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tga.k f233173c;
    public final m5k.b d;
    public final jt0.b e;
    public final f f;

    public k(b feeBreakdownMapper, w transferBreakdownMapper, tga.k upgradeEntryPointItemProvider, m5k.b breakdownDisclaimerProvider, jt0.b paymentFeesAdditionalItemsProvider, f paymentBreakdownFeesTaxesMapper, RateExplanationDialogMapper rateExplanationDialogMapper) {
        Intrinsics.checkNotNullParameter(feeBreakdownMapper, "feeBreakdownMapper");
        Intrinsics.checkNotNullParameter(transferBreakdownMapper, "transferBreakdownMapper");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(breakdownDisclaimerProvider, "breakdownDisclaimerProvider");
        Intrinsics.checkNotNullParameter(paymentFeesAdditionalItemsProvider, "paymentFeesAdditionalItemsProvider");
        Intrinsics.checkNotNullParameter(paymentBreakdownFeesTaxesMapper, "paymentBreakdownFeesTaxesMapper");
        Intrinsics.checkNotNullParameter(rateExplanationDialogMapper, "rateExplanationDialogMapper");
        this.f233171a = feeBreakdownMapper;
        this.f233172b = transferBreakdownMapper;
        this.f233173c = upgradeEntryPointItemProvider;
        this.d = breakdownDisclaimerProvider;
        this.e = paymentFeesAdditionalItemsProvider;
        this.f = paymentBreakdownFeesTaxesMapper;
    }

    public static TextDelegate.Model a(Clause clause) {
        return new TextDelegate.Model("FOOTER_ITEM_ID", clause, false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
    }

    public final rp0.y b(TextLocalisedClause titleClause, TextLocalisedClause descriptionClause, k5k.a aVar) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        LargeActionButtonDelegate.Model model = null;
        rp0.t tVar = new rp0.t(titleClause, null, null, 30);
        TextDelegate.Model modelA = a(descriptionClause);
        if (aVar != null) {
            TextLocalisedClause textLocalisedClause = aVar.f181524a;
            k5k.d dVar = new k5k.d(aVar);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            int i = R$attr.uikit_dp16;
            int i2 = R$attr.uikit_dp24;
            model = new LargeActionButtonDelegate.Model("BREAKDOWN_PREFIX_ACTION_LEARN_MORE", defaultFilledButton, null, textLocalisedClause, false, null, dVar, i2, i2, i, i, 368);
        }
        Object[] elements = {modelA, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new rp0.y(kotlin.collections.d.L(elements), tVar, null, null, null, null, 1020);
    }

    public final efm.r c(d0 d0Var) {
        od0.i iVar = od0.i.f224256b;
        if (d0Var == null) {
            od0.i.Companion.getClass();
            return te0.w.h(iVar);
        }
        efm.r rVarDistinctUntilChanged = m70.a.g(mo3.a.n(zi0.c.J(rd0.e.c(this.f233173c.d(d0Var), kotlin.coroutines.g.f186406a))), null, new p4a.g(10), 1).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        od0.i.Companion.getClass();
        return ue0.e.E(rVarDistinctUntilChanged, iVar);
    }
}
