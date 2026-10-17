package nmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f217239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f217240c;
    public final boolean d;
    public final ResourceImage e;

    public d() {
        this(false, null, false, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f217238a == dVar.f217238a && Intrinsics.f(this.f217239b, dVar.f217239b) && Intrinsics.f(this.f217240c, dVar.f217240c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f217238a) * 31;
        Clause clause = this.f217239b;
        return this.e.hashCode() + j6.a.c(t61.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f217240c), 31, this.d);
    }

    public d(boolean z, HtmlClause htmlClause, boolean z3, int i) {
        z = (i & 1) != 0 ? false : z;
        htmlClause = (i & 2) != 0 ? null : htmlClause;
        TextLocalisedClause rightButtonTitle = new TextLocalisedClause(R$string.savings_onboarding_product_upsell_continue, null, null, 14);
        z3 = (i & 8) != 0 ? false : z3;
        ResourceImage leftButtonImage = new ResourceImage(R$drawable.uikit_icn_24_calculator, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);
        Intrinsics.checkNotNullParameter(rightButtonTitle, "rightButtonTitle");
        Intrinsics.checkNotNullParameter(leftButtonImage, "leftButtonImage");
        this.f217238a = z;
        this.f217239b = htmlClause;
        this.f217240c = rightButtonTitle;
        this.d = z3;
        this.e = leftButtonImage;
    }
}
