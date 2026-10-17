package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ProductIntro;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.R$string;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitPreview;
import com.revolut.tracking.v3.IdContext;
import f01.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.c2;
import mx0.d2;
import mx0.e2;
import mx0.f2;
import mx0.j2;
import mx0.m2;
import mx0.s1;
import oz0.b;
import rok.d;
import rok.g;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f103694a;

    public a(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f103694a = uiKitResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        WaitlistBenefitPreview.Companion companion = WaitlistBenefitPreview.INSTANCE;
        ArrayList arrayList = domainState.f256030a.f103671b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            TagViewData tagViewDataC = null;
            if (!it8.hasNext()) {
                break;
            }
            PricingPlanWaitlistLayout$ProductIntro.Step step = (PricingPlanWaitlistLayout$ProductIntro.Step) it8.next();
            UrlVideo urlVideo = new UrlVideo(step.e, (String) null, false, (b) null, false, (oz0.c) null, 126);
            TextClause textClause = new TextClause(step.f103676c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(step.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            w0 w0VarD = e.d(IdContext.newBuilder(), step.f103674a, AnalyticsContext.INSTANCE);
            PricingPlanWaitlistLayout$ProductIntro.Badge badge = step.f;
            if (badge != null) {
                TagViewData.Companion companion2 = TagViewData.INSTANCE;
                String str = badge.f103672a;
                int iA = this.f103694a.a(d0.e0(badge.f103673b, "icn_"));
                Integer numValueOf = iA != 0 ? Integer.valueOf(iA) : null;
                int i = R$attr.uikit_colorWhite_10;
                int i2 = R$attr.uikit_colorWhite;
                companion2.getClass();
                tagViewDataC = TagViewData.Companion.c(str, i, i2, numValueOf);
            }
            arrayList2.add(new c2(urlVideo, textClause, textClause2, tagViewDataC, new AnalyticsContext(w0VarD)));
        }
        e2 state = new e2(new f2(arrayList2), new TextLocalisedClause(R$string.pricing_plans_waitlist_intro_skip, null, null, 14), Intrinsics.f(domainState.f256030a.f103670a, "FULLSCREEN") ? d2.FULLSCREEN_VIDEO_DARK : d2.NORMAL);
        companion.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        s1 s1Var = m2.Companion;
        WaitlistBenefitPreview.a product = WaitlistBenefitPreview.A;
        m2.Companion.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(state, "state");
        return new g(new j2(product, state));
    }
}
