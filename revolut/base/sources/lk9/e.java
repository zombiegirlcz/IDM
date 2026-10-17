package lk9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.i0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f196311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oj9.f f196312b;

    public e(thf.g transactionsItemMapper, vi9.o payLaterOverLimitTileMapper, oj9.f payLaterCrossSellItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(payLaterOverLimitTileMapper, "payLaterOverLimitTileMapper");
        Intrinsics.checkNotNullParameter(payLaterCrossSellItemMapper, "payLaterCrossSellItemMapper");
        this.f196311a = transactionsItemMapper;
        this.f196312b = payLaterCrossSellItemMapper;
    }

    public static final CellDetailsActionDelegate.Model a(dj0.d dVar) {
        return new CellDetailsActionDelegate.Model("ID_FEE_AMOUNT_CELL", new TextLocalisedClause(R$string.pay_later_repayment_details_fee, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), false, false, null, null, 0, 0, 32736);
    }

    public static final CellDetailsActionDelegate.Model b(i0 i0Var, dj0.d dVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_later_repayment_details_late_interest, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        zh9.h hVar = i0Var.f322286b.f;
        return new CellDetailsActionDelegate.Model("late-interest", textLocalisedClause, 0, resourceImage, moneyClause, false, false, null, hVar != null ? new bi9.c(cp5.c.s(hVar)) : null, 0, 0, 32224);
    }

    public static final CellDetailsDelegate.Model c(dj0.d dVar) {
        return new CellDetailsDelegate.Model("principal-repayment", new TextLocalisedClause(R$string.pay_later_repayment_details_amount, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
