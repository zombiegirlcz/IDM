package l6f;

import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yy0.j;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C1095a Companion = new C1095a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigDecimal f192403a = new BigDecimal("0.01");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PercentageClause.Format.Custom f192404b = new PercentageClause.Format.Custom(2, 4, null, wa.STRIP_ALL_TRAILING_ZEROES, RoundingMode.HALF_EVEN);

    /* JADX INFO: renamed from: l6f.a$a, reason: collision with other inner class name */
    public static final class C1095a {
        private C1095a() {
        }
    }

    public static Clause a(BigDecimal bigDecimal, PercentageClause.Format format, BigDecimal bigDecimal2) {
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            return new PercentageClause(bigDecimal, format, (Style) null, 4);
        }
        List listK = v.k(new TextClause("<", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new PercentageClause(bigDecimal2, format, (Style) null, 4));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static tf b(boolean z) {
        return new tf(new j(new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)));
    }

    public static RowDelegate.Model c(a aVar, String id10, TextLocalisedClause title, BigDecimal allocation) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        return new RowDelegate.Model("ALLOCATION_ITEM_LIST_ID_" + id10, null, title, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(null, a(allocation, f192404b, f192403a), null, false, ISO781611.SMT_TAG), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 532675576);
    }
}
