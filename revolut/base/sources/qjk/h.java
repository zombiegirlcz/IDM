package qjk;

import aw0.o9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetConfig;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ojk.g0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import q87.z;
import qg7.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f246905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dnk.l f246906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dok.e f246907c;

    public h(g0 itemsMapper, dnk.l iconMapper, dok.e backgroundMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        this.f246905a = itemsMapper;
        this.f246906b = iconMapper;
        this.f246907c = backgroundMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 0;
        lw0.a aVar = (lw0.a) iii.c.f(domainState.f246896a, new v(21), new qjj.g(1), new Function3(this) { // from class: qjk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f246904b;

            {
                this.f246904b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i) {
                    case 0:
                        PricingPlanBottomSheetConfig content = (PricingPlanBottomSheetConfig) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content, "content");
                        PricingPlanBottomSheetConfig.Header header = content.f102814b;
                        TextClause textClause = new TextClause(header.f102818a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str = header.f102819b;
                        lw0.b bVar = null;
                        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                        PricingPlanBottomSheetConfig.Header.Icon icon = header.f102820c;
                        if (icon != null) {
                            String str2 = icon.f102821a;
                            String str3 = icon.f102822b;
                            if (str2 != null) {
                                bVar = new lw0.b(new UrlImage(str2, null, null, null, 0L, null, null, Integer.valueOf(R$attr.uikit_colorTransparent), null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507646), null);
                            } else if (str3 != null) {
                                bVar = new lw0.b(new GlyphImage(this.f246904b.f246906b.c(str3).f59995a, null, null, 6), null);
                            }
                        }
                        return new lw0.a(textClause, textClause2, bVar, null, false, 24);
                    default:
                        PricingPlanBottomSheetConfig content2 = (PricingPlanBottomSheetConfig) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        PricingPlanBottomSheetConfig.Background background = content2.d;
                        if (background != null) {
                            return this.f246904b.f246907c.a(background.f102817b);
                        }
                        return null;
                }
            }
        });
        Data data = domainState.f246896a;
        final int i2 = 1;
        return new d(aVar, (AnimatedBackgroundType) iii.c.f(data, new v(22), new qjj.g(2), new Function3(this) { // from class: qjk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f246904b;

            {
                this.f246904b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i2) {
                    case 0:
                        PricingPlanBottomSheetConfig content = (PricingPlanBottomSheetConfig) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content, "content");
                        PricingPlanBottomSheetConfig.Header header = content.f102814b;
                        TextClause textClause = new TextClause(header.f102818a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str = header.f102819b;
                        lw0.b bVar = null;
                        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                        PricingPlanBottomSheetConfig.Header.Icon icon = header.f102820c;
                        if (icon != null) {
                            String str2 = icon.f102821a;
                            String str3 = icon.f102822b;
                            if (str2 != null) {
                                bVar = new lw0.b(new UrlImage(str2, null, null, null, 0L, null, null, Integer.valueOf(R$attr.uikit_colorTransparent), null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507646), null);
                            } else if (str3 != null) {
                                bVar = new lw0.b(new GlyphImage(this.f246904b.f246906b.c(str3).f59995a, null, null, 6), null);
                            }
                        }
                        return new lw0.a(textClause, textClause2, bVar, null, false, 24);
                    default:
                        PricingPlanBottomSheetConfig content2 = (PricingPlanBottomSheetConfig) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        PricingPlanBottomSheetConfig.Background background = content2.d;
                        if (background != null) {
                            return this.f246904b.f246907c.a(background.f102817b);
                        }
                        return null;
                }
            }
        }), (List) iii.c.f(data, new v(this, 23), new qjj.g(this, 3), new z(this, domainState, 9)));
    }
}
