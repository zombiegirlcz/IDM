package wq4;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cm4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep4.a f299405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f299406b;

    public a(ep4.a creditCardImageProvider) {
        Intrinsics.checkNotNullParameter(creditCardImageProvider, "creditCardImageProvider");
        this.f299405a = creditCardImageProvider;
        this.f299406b = R$attr.uikit_colorRed;
    }

    public final ProgressStyle a(cl4.g ccLimit) {
        Intrinsics.checkNotNullParameter(ccLimit, "ccLimit");
        ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
        int iMax = Math.max(ccLimit.d, 1);
        int i = ccLimit.f24936a ? this.f299406b : R$attr.uikit_colorTeal;
        int i2 = R$attr.uikit_colorSegmentedBackground;
        companion.getClass();
        return ProgressStyle.Companion.b(iMax, i, i2);
    }

    public final TextLocalisedClause b() {
        return new TextLocalisedClause(R$string.credit_card_common_product_name, null, null, 14);
    }
}
