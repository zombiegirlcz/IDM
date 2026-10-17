package it4;

import akg.n;
import al4.j;
import al4.p;
import cm4.h;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import com.revolut.tracking.v3.OpenCreditEntryPointContext;
import ft3.d1;
import ft3.j1;
import ft3.q0;
import grl.m2;
import grl.r2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ll4.e;
import ll4.f;
import mx4.u;
import om4.s3;
import wp3.c;
import wp3.d;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements bm4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f168340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f168341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f168342c;
    public final u d;
    public final h e;

    public b(gte.a featureToggleInteractor, p creditCardProductFeatureTogglesInteractor, j creditCardEntryPointDetailsInteractor, u contentImageMapper, h creditCardProductMapper, pm4.b entryPointTagMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        Intrinsics.checkNotNullParameter(creditCardProductMapper, "creditCardProductMapper");
        Intrinsics.checkNotNullParameter(entryPointTagMapper, "entryPointTagMapper");
        this.f168340a = featureToggleInteractor;
        this.f168341b = creditCardProductFeatureTogglesInteractor;
        this.f168342c = creditCardEntryPointDetailsInteractor;
        this.d = contentImageMapper;
        this.e = creditCardProductMapper;
    }

    public static em4.a b() {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_credit_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.p4u_product_credit_card_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.p4u_product_credit_card_description, null, null, 14);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        OpenCreditEntryPointContext.a aVarNewBuilder = OpenCreditEntryPointContext.newBuilder();
        aVarNewBuilder.h(r2.ADD_NEW_PRODUCT_WIDGET);
        aVarNewBuilder.i(m2.CREDIT_CARD);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new em4.a(resourceImage, (CircleBadgeModel) null, textLocalisedClause, textLocalisedClause2, AnalyticsContext.Companion.a(w0VarA), new TextLocalisedClause(R$string.p4u_product_credit_card_cta, null, null, 14), (q0) null, 192);
    }

    public final em4.a a(f fVar) {
        RawImageBadge rawImageBadge;
        Image imageE = ll4.h.e(fVar, R$drawable.uikit_icn_40_revolut_card_placeholder);
        gt3.f fVar2 = fVar.i;
        j1 j1Var = fVar.f196520h;
        Integer numA = ll4.h.a(fVar);
        if (numA != null) {
            int iIntValue = numA.intValue();
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int iD = ll4.h.d(fVar);
            int i = R$attr.uikit_colorPopoverBackground;
            rawImageBadge = new RawImageBadge(companion.d(iIntValue, iD, i, Integer.valueOf(i), 2.0f, 2.0f, Float.valueOf(8.0f)));
        } else {
            rawImageBadge = null;
        }
        TextLocalisedClause textLocalisedClauseF = ll4.h.f(fVar);
        TextLocalisedClause textLocalisedClauseC = ll4.h.c(fVar);
        AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
        CreditApplicationCommonContext creditApplicationCommonContextC = zr3.b.c(r2.CARD_ORDERING, j1Var, fVar2);
        companion2.getClass();
        w0 w0VarA = AnalyticsContext.Companion.a(creditApplicationCommonContextC);
        TextLocalisedClause textLocalisedClauseB = ll4.h.b(fVar);
        List<e> list = fVar.f;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (e eVar : list) {
            arrayList.add(new d(eVar.f196514a, eVar.f196515b, c.PURPLE));
        }
        ArrayList arrayListA = pm4.b.a(arrayList);
        ft3.e eVar2 = q0.Companion;
        d1 d1Var = new d1(j1Var, fVar2, null);
        String str = fVar.f196521j;
        eVar2.getClass();
        return new em4.a(imageE, rawImageBadge, textLocalisedClauseF, textLocalisedClauseC, w0VarA, textLocalisedClauseB, arrayListA, ft3.e.a(d1Var, str));
    }

    public final n c() {
        s3 s3Var = (s3) this.f168341b;
        return s3Var.p() ? nim.a.v(j.b(this.f168342c, ll4.c.PRODUCTS_WIDGET), new isd.a(this, 13)) : nim.a.v(s3Var.v(), new isd.a(this, 14));
    }
}
