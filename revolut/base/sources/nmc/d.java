package nmc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements elc.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f217264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f217265b;

    public d(yoc.g riskProfileNameClauseProvider, i roboTemplateResourceMapper, f01.c uiKitResources, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(riskProfileNameClauseProvider, "riskProfileNameClauseProvider");
        Intrinsics.checkNotNullParameter(roboTemplateResourceMapper, "roboTemplateResourceMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f217264a = uiKitResources;
        this.f217265b = featureToggleInteractor;
    }

    public final GlyphImage a(String str) throws Throwable {
        String strE0 = d0.e0(str, "icn_");
        int iA = this.f217264a.a(strE0);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new GlyphImage(numValueOf.intValue(), null, null, 6);
        }
        hx7.e.n(new IllegalArgumentException(j6.a.s("Unknown iconName = ", str, " (normalized = ", strE0, ")")));
        return null;
    }

    public final Image b(RoboPortfolioInfo roboPortfolioInfo) {
        GlyphImage glyphImageA;
        Intrinsics.checkNotNullParameter(roboPortfolioInfo, "roboPortfolioInfo");
        String str = roboPortfolioInfo.e;
        Template template = roboPortfolioInfo.f95701a;
        Template template2 = roboPortfolioInfo.f95702b;
        if (str != null && (glyphImageA = a(str)) != null) {
            return glyphImageA;
        }
        if (template != null) {
            return f(template);
        }
        Image imageF = template2 != null ? f(template2) : null;
        if (imageF != null) {
            return imageF;
        }
        y.B("RoboPortfolioUiMapperImpl.mapPortfolioIcon: unable to resolve portfolio icon from backendDrivenIconName or template");
        return ((jte.d) this.f217265b).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? new ResourceImage(R$drawable.uikit_icn_16_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D242", null, null, null, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[PHI: r0
      0x001d: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v6 java.lang.String), (r0v7 java.lang.String) binds: [B:3:0x000a, B:8:0x0015, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.TextClause c(com.revolut.feature.wealth.models.robo.RoboPortfolioInfo r10) {
        /*
            r9 = this;
            java.lang.String r0 = "roboPortfolioInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = r10.d
            if (r0 != 0) goto L1d
            com.revolut.feature.wealth.models.robo.Template r0 = r10.f95701a
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.d
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L1d
            com.revolut.feature.wealth.models.robo.Template r10 = r10.f95702b
            if (r10 == 0) goto L1f
            java.lang.String r0 = r10.d
        L1d:
            r2 = r0
            goto L20
        L1f:
            r2 = r1
        L20:
            if (r2 != 0) goto L3b
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "RoboPortfolioUiMapperImpl.mapPortfolioNameClause called for null Template"
            r10.<init>(r0)
            hx7.e.n(r10)
            com.revolut.core.ui_kit.models.TextClause r1 = new com.revolut.core.ui_kit.models.TextClause
            r7 = 0
            r8 = 126(0x7e, float:1.77E-43)
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L3b:
            com.revolut.core.ui_kit.models.TextClause r1 = new com.revolut.core.ui_kit.models.TextClause
            r7 = 0
            r8 = 126(0x7e, float:1.77E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nmc.d.c(com.revolut.feature.wealth.models.robo.RoboPortfolioInfo):com.revolut.core.ui_kit.models.TextClause");
    }

    public final TextLocalisedClause d(RoboPortfolioInfo roboPortfolioInfo, elc.b style) {
        Intrinsics.checkNotNullParameter(roboPortfolioInfo, "roboPortfolioInfo");
        Intrinsics.checkNotNullParameter(style, "style");
        Template template = roboPortfolioInfo.f95701a;
        if (template == null) {
            hx7.e.n(new IllegalArgumentException("RoboPortfolioUiMapperImpl.mapPortfolioRiskClause called for null Template"));
            return new TextLocalisedClause(R$string.wealth_robo_template_screen_title_your_portfolio, null, null, 14);
        }
        TextLocalisedClause textLocalisedClauseA = yoc.g.a(template.f95707b);
        int i = c.f217263a[style.ordinal()];
        if (i == 1) {
            return textLocalisedClauseA;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return TextLocalisedClause.c(textLocalisedClauseA, null, new Custom(style.a(), false, null, false, null, 254), 27);
    }

    public final CompositeClause e(xdh.a riskProfile, elc.b style) {
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        CompositeClause compositeClause = new CompositeClause(v.k(new TextClause(String.valueOf(riskProfile.a()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("5", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("/", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        int i = c.f217263a[style.ordinal()];
        if (i == 1) {
            return compositeClause;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return CompositeClause.a(compositeClause, null, new Custom(style.a(), false, null, false, null, 254), 11);
    }

    public final Image f(Template template) {
        String str;
        GlyphImage glyphImageA;
        Intrinsics.checkNotNullParameter(template, "template");
        String str2 = template.e;
        if (str2 != null && (glyphImageA = a(str2)) != null) {
            return glyphImageA;
        }
        Intrinsics.checkNotNullParameter(template, "template");
        xdh.d dVar = template.f95708c;
        xdh.a aVar = template.f95707b;
        int i = h.f217270b[dVar.ordinal()];
        if (i == 1) {
            int i2 = h.f217269a[aVar.ordinal()];
            if (i2 == 1) {
                str = "3D312";
            } else if (i2 == 2) {
                str = "3D313";
            } else if (i2 == 3) {
                str = "3D314";
            } else if (i2 == 4) {
                str = "3D315";
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "3D316";
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = h.f217269a[aVar.ordinal()];
            if (i3 == 1) {
                str = "3D410";
            } else if (i3 == 2) {
                str = "3D411";
            } else if (i3 == 3) {
                str = "3D407";
            } else if (i3 == 4) {
                str = "3D408";
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "3D409";
            }
        }
        return com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, null, null, null, 30);
    }

    public final TextClause g(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        return new TextClause(template.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
