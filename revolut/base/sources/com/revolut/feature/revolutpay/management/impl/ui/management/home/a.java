package com.revolut.feature.revolutpay.management.impl.ui.management.home;

import af3.f;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.management.api.declaration.RevolutPayManagementApi$Toggles$RevolutPaySettingsV2;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import e54.r;
import eac.i;
import eac.k;
import eac.t;
import eac.u;
import eac.w;
import gaf.l;
import gcc.g;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import q7c.s;
import r10.q;
import vii.b;
import vkm.j2;
import x9c.d;
import zi0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements i {
    public final y A;
    public final com.revolut.kompot.navigable.vc.modal.a B;
    public final bcc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f84591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h4g.g f84592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eub.a f84593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final eub.i f84594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f84595t;
    public final q7c.g u;
    public final s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f84596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f84597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ul9.g f84598y;
    public final b z;

    public a(bcc.a promotedMerchantCheckoutExtension, g promotedMerchantsRepository, h4g.g shopsFeatureAvailabilityInteractor, eub.a revPointsAvailabilityInteractor, eub.i revPointsOptInInteractor, d revolutPayArticleParamsProvider, q7c.g paymentMethodsInteractor, s shippingInteractor, q revolutPayManagementInteractor, gte.a featureToggleInteractor, ul9.g biometricPaymentsSettingsInteractor, n mapper) {
        Intrinsics.checkNotNullParameter(promotedMerchantCheckoutExtension, "promotedMerchantCheckoutExtension");
        Intrinsics.checkNotNullParameter(promotedMerchantsRepository, "promotedMerchantsRepository");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revolutPayArticleParamsProvider, "revolutPayArticleParamsProvider");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(shippingInteractor, "shippingInteractor");
        Intrinsics.checkNotNullParameter(revolutPayManagementInteractor, "revolutPayManagementInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(biometricPaymentsSettingsInteractor, "biometricPaymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = promotedMerchantCheckoutExtension;
        this.f84591p = promotedMerchantsRepository;
        this.f84592q = shopsFeatureAvailabilityInteractor;
        this.f84593r = revPointsAvailabilityInteractor;
        this.f84594s = revPointsOptInInteractor;
        this.f84595t = revolutPayArticleParamsProvider;
        this.u = paymentMethodsInteractor;
        this.v = shippingInteractor;
        this.f84596w = revolutPayManagementInteractor;
        this.f84597x = featureToggleInteractor;
        this.f84598y = biometricPaymentsSettingsInteractor;
        this.z = new b();
        RevolutPayManagementApi$Toggles$RevolutPaySettingsV2 revolutPayManagementApi$Toggles$RevolutPaySettingsV2 = RevolutPayManagementApi$Toggles$RevolutPaySettingsV2.f84580c;
        this.A = mra.d.b(this, new eac.h(((jte.d) featureToggleInteractor).c(revolutPayManagementApi$Toggles$RevolutPaySettingsV2) ? new Data(k.f124169a, null, false, 6, null) : new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), ((jte.d) featureToggleInteractor).c(revolutPayManagementApi$Toggles$RevolutPaySettingsV2)), mapper, null, false, 12);
        this.B = e.a(this, new r(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        Flow flowV;
        if (((jte.d) this.f84597x).c(RevolutPayManagementApi$Toggles$RevolutPaySettingsV2.f84580c)) {
            flowV = c.i(k.f124169a);
        } else {
            boolean zE = this.f84592q.e();
            g gVar = this.f84591p;
            gVar.getClass();
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowV = nim.a.v(nim.a.v(gVar.f142404g.a(new gcc.e(zE), loadingStrategy), new l(13)), u.f);
        }
        Continuation continuation = null;
        yji.l.a1(this, flowV, null, null, new w(0, this, null), 3);
        yji.l.a1(this, xam.a.h(new f(this, null), ((nyb.b) this.f84593r).c()), null, null, new w(1, this, null), 3);
        t tVar = new t(1, this, continuation);
        b bVar = this.z;
        yji.l.a1(this, vkm.q.Q(bVar, tVar), null, null, new w(2, this, null), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new t(2, this, continuation)), null, null, new w(3, this, null), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new t(0, this, continuation)), null, null, new w(4, this, null), 3);
    }

    public final void I2() {
        boolean z = ((nl9.g) ((od0.i) c.I(((eac.h) ((j2) this.A.f22677a).getValue()).e)).c()).f217104c;
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.B;
        if (z) {
            h.v2(aVar, RevolutPayManagementHomeControllerContract$Step.PayWithSmileSettings.f84587a, fullscreen_fade);
        } else {
            h.v2(aVar, RevolutPayManagementHomeControllerContract$Step.PayWithSmileEnrollment.f84586a, fullscreen_fade);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.B;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
