package com.revolut.feature.retail.savings.impl.common.product_info;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C0527a Companion = new C0527a();

    /* JADX INFO: renamed from: com.revolut.feature.retail.savings.impl.common.product_info.a$a, reason: collision with other inner class name */
    public static final class C0527a {
        private C0527a() {
        }
    }

    public static RowDelegate.Model b(Clause clause, TextClause textClause, InterestAndTaxParcel interestAndTaxParcel) {
        RowDelegate.Model model = new RowDelegate.Model("INTEREST_AND_FEES_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_percent, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), clause, null, 0, textClause, null, null, 0, null, interestAndTaxParcel != null, null, false, null, null, null, null, null, null, interestAndTaxParcel, null, 0, 0, 0, 0, 532674520);
        return interestAndTaxParcel != null ? frg.a.b(model) : model;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(com.revolut.feature.shared.savings.models.product.SavingsProductData r32) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.common.product_info.a.a(com.revolut.feature.shared.savings.models.product.SavingsProductData):java.util.List");
    }
}
