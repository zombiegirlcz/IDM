package ibe;

import android.webkit.URLUtil;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import ibd.h;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.e;
import l93.f;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import qua.g;
import qua.p;
import qua.u;
import te0.w;
import tof.i3;
import tof.k3;
import tof.l2;
import tof.l3;
import ufm.d;
import wsg.n;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends abe.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f160160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f160161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f160162c;
    public final ur2.c d;
    public final gte.a e;
    public final hj8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f160163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f160164h;
    public final xae.a i;

    public c(a9e.b commonSubscriptionMapper, f revolutCardInteractor, e dateProvider, ur2.c blockedMerchantsInteractor, gte.a featureToggleInteractor, hj8.a juniorProfileInteractor, n walletInteractor, d recurringPaymentSplitStatusProvider, xae.a recurringSplitContentMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(revolutCardInteractor, "revolutCardInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentSplitStatusProvider, "recurringPaymentSplitStatusProvider");
        Intrinsics.checkNotNullParameter(recurringSplitContentMapper, "recurringSplitContentMapper");
        this.f160160a = commonSubscriptionMapper;
        this.f160161b = revolutCardInteractor;
        this.f160162c = dateProvider;
        this.d = blockedMerchantsInteractor;
        this.e = featureToggleInteractor;
        this.f = juniorProfileInteractor;
        this.f160163g = walletInteractor;
        this.f160164h = recurringPaymentSplitStatusProvider;
        this.i = recurringSplitContentMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    @Override // abe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.z a(java.lang.Object r6) {
        /*
            r5 = this;
            ibe.a r6 = (ibe.a) r6
            java.lang.String r0 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            qua.p r0 = r6.f160156a
            kr2.h r1 = r6.f160158c
            a9e.b r2 = r5.f160160a
            i9e.f r2 = (i9e.f) r2
            java.util.List r0 = r2.H(r0, r1)
            qua.p r1 = r6.f160156a
            l80.e r3 = r5.f160162c
            l80.f r3 = (l80.f) r3
            org.joda.time.DateTime r3 = r3.g()
            boolean r3 = qua.u.i(r1, r3)
            r4 = 0
            if (r3 == 0) goto L3a
            f5j.a r1 = r1.f249329r
            if (r1 == 0) goto L2b
            java.lang.String r1 = r1.f132329a
            goto L2c
        L2b:
            r1 = r4
        L2c:
            if (r1 == 0) goto L3a
            int r1 = r1.length()
            if (r1 != 0) goto L35
            goto L3a
        L35:
            com.revolut.core.ui_kit.views.ActionsView$Item r1 = r2.m()
            goto L3b
        L3a:
            r1 = r4
        L3b:
            xae.a r3 = r5.i
            com.revolut.data.model.Data r6 = r6.f160159g
            com.revolut.core.ui_kit.views.ActionsView$Item r6 = r3.a(r6)
            com.revolut.core.ui_kit.views.ActionsView$Item[] r6 = new com.revolut.core.ui_kit.views.ActionsView.Item[]{r1, r6}
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.util.List r6 = kotlin.collections.d.L(r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = zhm.d0.E0(r0, r6)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L5d
            return r4
        L5d:
            ip0.z r6 = r2.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ibe.c.a(java.lang.Object):ip0.z");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // abe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 1567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ibe.c.b(java.lang.Object):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    @Override // abe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r c(hce.c r12) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ibe.c.c(hce.c):efm.r");
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Image imageI;
        String str;
        l2 l2VarC;
        String str2;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        boolean zI = u.i(pVarC, ((l80.f) this.f160162c).g());
        dj0.d dVarB = zae.c.b(subscriptionContent);
        i9e.f fVar = (i9e.f) this.f160160a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        p subscription = subscriptionContent.f150886a.f150883a;
        String str3 = subscription.f249324l;
        String strL = str3 != null ? m70.a.l(str3) : null;
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        g gVar = subscription.f249332w;
        String[] elements = {strL, (gVar == null || (str2 = gVar.f249293b) == null) ? null : m70.a.l(str2)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        TextClause textClause = new TextClause(d0.k0(listL, " · ", null, null, 0, null, 62), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_header_subscription_subtitle, null, null, 14);
        h type = pVarC.f249314a.f160152c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Image imageJ = i9e.e.f159670c[type.ordinal()] == 1 ? ApmBizum.f61808c.j() : fVar.g(false);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        fVar.getClass();
        thf.c cVar = fVar.f159672b;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        i3.Companion.getClass();
        LayeredImage layeredImageI = ((wjf.e) cVar).i(i3.a.a(), null, null);
        g gVar2 = subscription.f249332w;
        String str4 = gVar2 != null ? gVar2.d : null;
        if (str4 == null) {
            str4 = "";
        }
        if (URLUtil.isValidUrl(str4)) {
            String str5 = gVar2 != null ? gVar2.d : null;
            imageI = new UrlImage(str5 == null ? "" : str5, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(layeredImageI), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
        } else {
            imageI = ((wjf.e) cVar).i((gVar2 == null || (str = gVar2.f249294c) == null || (l2VarC = l3.c(str)) == null) ? i3.a.a() : new k3(l2VarC), null, null);
        }
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, imageI, imageJ, (Serializable) null, 96));
    }
}
