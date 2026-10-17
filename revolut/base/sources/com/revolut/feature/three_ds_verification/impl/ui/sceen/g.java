package com.revolut.feature.three_ds_verification.impl.ui.sceen;

import cli.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ia3.r;
import ise.q0;
import ise.r0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f90440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f90441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m93.d f90442c;
    public final xte.a d;
    public final gte.a e;
    public final Object f;

    public g(r cardsContentMapper, thf.c transactionCategoryResourcesMapper, m93.d cardThumbnailImageProvider, xte.a topUpMethodsItemsMapper, l4i.a amountConverter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(topUpMethodsItemsMapper, "topUpMethodsItemsMapper");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f90440a = cardsContentMapper;
        this.f90441b = transactionCategoryResourcesMapper;
        this.f90442c = cardThumbnailImageProvider;
        this.d = topUpMethodsItemsMapper;
        this.e = featureToggleInteractor;
        this.f = w.y0(new ie7.a(this, 28));
    }

    public static ResourceImage d() {
        return new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final TextLocalisedClause b(ThreeDSTransaction threeDSTransaction, String str) {
        int i = r0.f168235b[threeDSTransaction.f60542n.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(a() ? R$string.transaction_threeds_redesign_confirm_title : R.string.transaction_threeds_confirm_title, null, null, 14);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (str != null) {
            return new TextLocalisedClause(a() ? R$string.transaction_threeds_redesign_confirm_youth_title_format : R$string.transaction_threeds_confirm_youth_title_format, u.c(str), null, 12);
        }
        return new TextLocalisedClause(a() ? R$string.transaction_threeds_redesign_confirm_youth_title : R$string.transaction_threeds_confirm_youth_title, null, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r39) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.three_ds_verification.impl.ui.sceen.g.c(cli.j):cli.o");
    }
}
