package yxc;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.TransactionStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements z9l.k {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9l.c f317656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jsb.b f317657b;

    public u(z9l.c badgeUiMapper, jsb.b transactionCategoriesResourcesProvider) {
        Intrinsics.checkNotNullParameter(badgeUiMapper, "badgeUiMapper");
        Intrinsics.checkNotNullParameter(transactionCategoriesResourcesProvider, "transactionCategoriesResourcesProvider");
        this.f317656a = badgeUiMapper;
        this.f317657b = transactionCategoriesResourcesProvider;
    }

    public static RowDelegate.Model.c.b b(SectionContent.TransactionCell transactionCell) {
        TextClause textClause = new TextClause(transactionCell.f64192h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = transactionCell.i;
        return new RowDelegate.Model.c.b(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, false, 124);
    }

    public static CompositeClause c(SectionContent.TransactionCell transactionCell) {
        TextClause textClause;
        TransactionStatus transactionStatus = transactionCell.f64191g;
        if (transactionStatus != null) {
            String str = transactionStatus.f64199a;
            Integer num = transactionStatus.f64200b;
            textClause = new TextClause(str, (Style) (num != null ? new Custom(Integer.valueOf(num.intValue()), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124);
        } else {
            textClause = null;
        }
        String str2 = transactionCell.f;
        TextClause[] elements = {textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        CompositeClause compositeClause = new CompositeClause(listL, new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        if (listL.isEmpty()) {
            return null;
        }
        return compositeClause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final RowDelegate.Model.MainImage.Image40 a(SectionContent.TransactionCell transactionCell) {
        RowDelegate.Model.MainImage.Image40 image40;
        String str = transactionCell.f64188a;
        Parcelable urlImage = null;
        if (str == null) {
            image40 = null;
        } else {
            image40 = null;
            urlImage = new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
        }
        if (urlImage == null) {
            zvl.a aVar = transactionCell.f64189b;
            urlImage = aVar != null ? this.f317657b.a(aVar).f325716a : image40;
            if (urlImage == null) {
                Integer num = transactionCell.f64190c;
                if (num != null) {
                    urlImage = LayeredImage.Companion.b(LayeredImage.INSTANCE, num.intValue(), Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 11.0f, null, null, 48);
                } else {
                    urlImage = image40;
                }
            }
        }
        ?? r4 = urlImage;
        if (r4 == 0) {
            return image40;
        }
        aal.a aVar2 = transactionCell.d;
        return new RowDelegate.Model.MainImage.Image40(r4, aVar2 != null ? ((d) this.f317656a).b(aVar2) : image40, null, false, 28);
    }
}
