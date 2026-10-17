package dec;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.shared.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f113372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f113373b;

    public q(r pocketInfoMapper, g paymentMethodIconMapper, a cardInfoMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(pocketInfoMapper, "pocketInfoMapper");
        Intrinsics.checkNotNullParameter(paymentMethodIconMapper, "paymentMethodIconMapper");
        Intrinsics.checkNotNullParameter(cardInfoMapper, "cardInfoMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f113372a = pocketInfoMapper;
        this.f113373b = dateProvider;
    }

    public static RowDelegate.Model.MainImage a(Image image, boolean z) {
        if (z) {
            boolean z3 = false;
            return new RowDelegate.Model.MainImage.Image24(image, z3, z3, 6);
        }
        return new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 62);
    }

    public static RowDelegate.Model b(String str, Clause clause, Clause clause2, RowDelegate.Model.MainImage mainImage, boolean z) {
        return new RowDelegate.Model(str, mainImage, clause, null, 0, clause2, null, null, 0, z ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, z, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    public static RowDelegate.Model c(q qVar, PaymentMethod.Pocket pocket, boolean z, o style, boolean z3, int i) {
        TextLocalisedClause textLocalisedClause;
        boolean z4 = (i & 8) != 0 ? true : z3;
        boolean z6 = (i & 16) == 0;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(style, "style");
        Clause clauseD = qVar.f113372a.d(pocket);
        boolean z11 = pocket.e;
        Custom custom = null;
        if (pocket.b() && !z11) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_methods_disabled_method_reason_pro_disabled, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
        } else if (!z11) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_methods_disabled_method_reason_pocket_not_available, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
        } else if (z4 && pocket.f84382l) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_disabled_method_reason_wealth_protection, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
        } else {
            int i2 = R$string.revolut_pay_order_summary_payment_method_balance;
            List listC = zhm.u.c(r.a(pocket.i, pocket.f84379g));
            int i3 = p.f113371a[style.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                custom = new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254);
            }
            textLocalisedClause = new TextLocalisedClause(i2, listC, custom, 8);
        }
        return b("PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID", clauseD, textLocalisedClause, a(r.b(pocket), z6), z);
    }
}
