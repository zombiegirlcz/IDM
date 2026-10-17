package sx2;

import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.tracking.v3.IdContext;
import ip0.ek;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx2.e f266338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx2.b f266339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hy2.f f266340c;
    public final jx2.i d;
    public final gte.a e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f266341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f266342h;

    public v0(jx2.e cardDesignDescriptionMapper, jx2.b buttonConfigurationProvider, hy2.f cardDesignInteractor, jx2.i cardDesignTextHintMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cardDesignDescriptionMapper, "cardDesignDescriptionMapper");
        Intrinsics.checkNotNullParameter(buttonConfigurationProvider, "buttonConfigurationProvider");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(cardDesignTextHintMapper, "cardDesignTextHintMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f266338a = cardDesignDescriptionMapper;
        this.f266339b = buttonConfigurationProvider;
        this.f266340c = cardDesignInteractor;
        this.d = cardDesignTextHintMapper;
        this.e = featureToggleInteractor;
        final int i = 0;
        this.f = te0.w.y0(new Function0(this) { // from class: sx2.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f266335b;

            {
                this.f266335b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                    default:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardPriceIncludingDeliveryFee.f65559c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.f266341g = te0.w.y0(new Function0(this) { // from class: sx2.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f266335b;

            {
                this.f266335b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                    default:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardPriceIncludingDeliveryFee.f65559c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i3 = 2;
        this.f266342h = te0.w.y0(new Function0(this) { // from class: sx2.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f266335b;

            {
                this.f266335b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i3) {
                    case 0:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                    default:
                        zC = ((jte.d) this.f266335b.e).c(CardsCoreApi$Toggles.CardPriceIncludingDeliveryFee.f65559c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    public final jx2.o a() {
        ((jx2.c) this.f266339b).getClass();
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return new jx2.o(defaultFilledButton, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, true);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e93.q qVar;
        e93.f fVar;
        TagViewData tagViewData;
        AnalyticsContext analyticsContext;
        e93.f fVar2;
        e93.f fVar3;
        e93.f fVar4;
        e93.f fVar5;
        String strM;
        c0 domainState = (c0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f;
        final int i = 0;
        final int i2 = 0;
        List list = (List) iii.c.f(t1.t(data, domainState.f266272b), new Function1(this) { // from class: sx2.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f266330b;

            {
                this.f266330b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Function0 function0 = (Function0) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(function0, "<unused var>");
                        ((jx2.f) this.f266330b.f266338a).getClass();
                        return zhm.u.c(new ek("description_loading", 0, 0, 0, 0, false, SyslogConstants.LOG_CLOCK, true));
                    default:
                        Intrinsics.checkNotNullParameter(function0, "<unused var>");
                        return this.f266330b.a();
                }
            }
        }, new ss4.a0(12), new Function3(this) { // from class: sx2.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f266332b;

            {
                this.f266332b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:101:0x02c9  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x03b0  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x03bd  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x03c4  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x028f  */
            /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 1516
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sx2.s0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        mxl.j jVar2 = domainState.i;
        final int i3 = 1;
        jx2.o oVar = (jx2.o) iii.c.f(t1.x(domainState.f, domainState.f266273c, domainState.d, domainState.e, domainState.f266272b, domainState.f266274g), new Function1(this) { // from class: sx2.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f266330b;

            {
                this.f266330b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Function0 function0 = (Function0) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(function0, "<unused var>");
                        ((jx2.f) this.f266330b.f266338a).getClass();
                        return zhm.u.c(new ek("description_loading", 0, 0, 0, 0, false, SyslogConstants.LOG_CLOCK, true));
                    default:
                        Intrinsics.checkNotNullParameter(function0, "<unused var>");
                        return this.f266330b.a();
                }
            }
        }, new suf.a(this, 6), new si5.c(this, domainState, 5));
        e7l.f fVar6 = (e7l.f) domainState.e.getContent();
        boolean z = true;
        if (fVar6 != null && (qVar = (e93.q) data.getContent()) != null && (fVar = qVar.f123888b) != null) {
            b93.b bVarC = fVar.c();
            List list2 = fVar6.f123377k0;
            z = true ^ (list2 != null && zhm.d0.T(list2, bVarC));
        }
        boolean z3 = z;
        final int i5 = 1;
        Clause clause = (Clause) iii.c.f(t1.x(domainState.f, domainState.f266273c, domainState.d, domainState.e, domainState.f266275h, domainState.f266274g), new g(6), new ss4.a0(13), new Function3(this) { // from class: sx2.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f266332b;

            {
                this.f266332b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:101:0x02c9  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x03b0  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x03bd  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x03c4  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x028f  */
            /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 1516
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sx2.s0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        e93.q qVar2 = (e93.q) data.getContent();
        q0 q0Var = null;
        TagViewData tagViewData2 = (qVar2 == null || (fVar5 = qVar2.f123888b) == null || (strM = fVar5.m()) == null) ? null : new TagViewData(null, new TextClause(strM, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, R$attr.uikit_colorTransparent, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        e93.q qVar3 = (e93.q) data.getContent();
        if (qVar3 == null || (fVar4 = qVar3.f123888b) == null || !(fVar4 instanceof e93.d) || ((e93.d) fVar4).i == null) {
            tagViewData = null;
        } else {
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cleaning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_choose_header_customisable, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
            int i6 = R$attr.uikit_colorPopoverBackground;
            tagViewData = new TagViewData(resourceImage, textLocalisedClause, new Color.Solid(i6), i6, null, 1000);
        }
        e93.q qVar4 = (e93.q) data.getContent();
        if (qVar4 == null || (fVar3 = qVar4.f123888b) == null) {
            analyticsContext = null;
        } else {
            Intrinsics.checkNotNullParameter(fVar3, "<this>");
            analyticsContext = new AnalyticsContext(kii.e.d(IdContext.newBuilder(), fVar3.c().f13615a, AnalyticsContext.INSTANCE));
        }
        e93.q qVar5 = (e93.q) data.getContent();
        if (qVar5 != null && (fVar2 = qVar5.f123888b) != null && fVar2.t() != null) {
            q0Var = new q0(new TextLocalisedClause(R$string.card_choose_preview, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_play_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        }
        return new m0(list, tagViewData2, jVar2, oVar, clause, z3, tagViewData, analyticsContext, q0Var, domainState.f266278m);
    }
}
