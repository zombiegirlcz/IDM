package xlk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.FeatureTagData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import hha.y;
import java.util.List;
import jgk.z;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f307036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f307037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f307038c;

    public h(z configuration, l groupNamesProvider, e combinedItemResourcesProvider) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(groupNamesProvider, "groupNamesProvider");
        Intrinsics.checkNotNullParameter(combinedItemResourcesProvider, "combinedItemResourcesProvider");
        this.f307036a = configuration;
        this.f307037b = w.y0(new xkf.c(18));
        this.f307038c = w.y0(new xkf.c(19));
    }

    public static pc b(PlanFeatureResource planFeatureResource) {
        FeatureTagData featureTagData = planFeatureResource.f;
        if (featureTagData == null) {
            return null;
        }
        return new pc(a0.d.r(planFeatureResource.f103382b, "_tag"), new TagViewData(featureTagData.f103379a, featureTagData.f103380b, R$attr.uikit_colorGreyTone8, null, R$attr.uikit_colorTransparent, null, 1000), null);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    public final RowDelegate.Model a(String str, Clause clause, Clause clause2, pc pcVar, int i, y yVar) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(g.f307035a[yVar.ordinal()] == 1 ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), dok.b.d(clause, (Custom) this.f307037b.getValue()), null, 0, dok.b.d(clause2, (Custom) this.f307038c.getValue()), null, null, 10, null, false, null, false, null, v.l(pcVar), null, null, null, null, null, null, 0, 0, 0, 0, 536835800);
    }
}
