package com.revolut.feature.kyc.impl.idnow.video_ident.screen;

import cli.y;
import com.revolut.feature.kyc.api.KycApi$FeatureToggle;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import fmc.z;
import hx7.e;
import iw8.g;
import iw8.k;
import iw8.m;
import iw8.n;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements k {

    @NotNull
    public static final m Companion = new m();
    public final yx8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nx8.a f77797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final IdnowVideoIdentScreenContract$InputData f77798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f77799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f77800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f77801t;

    public a(yx8.a webKycControllerExtension, nx8.a webViewKycContentProvider, IdnowVideoIdentScreenContract$InputData inputData, gte.a featureToggleInteractor, n stateMapper, z redirectMapper) {
        Intrinsics.checkNotNullParameter(webKycControllerExtension, "webKycControllerExtension");
        Intrinsics.checkNotNullParameter(webViewKycContentProvider, "webViewKycContentProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        this.o = webKycControllerExtension;
        this.f77797p = webViewKycContentProvider;
        this.f77798q = inputData;
        this.f77799r = redirectMapper;
        this.f77800s = d.b(this, new g(false, false, featureToggleInteractor.a(KycApi$FeatureToggle.DisableIdNowVideoConferenceCloseButton.f77459c)), stateMapper, null, false, 12);
        this.f77801t = e.a(this, new in1.a(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.d3(this.f77799r), null, null, new hp4.e(2, this, a.class, "onRedirect", "onRedirect(Ljava/lang/String;)V", 4, 24), 3);
    }

    public final boolean I2() {
        y yVar = this.f77800s;
        if (((g) ((j2) yVar.f22677a).getValue()).f168992b) {
            return false;
        }
        if (!((g) ((j2) yVar.f22677a).getValue()).f168993c) {
            return true;
        }
        h.v2(this.f77801t, IdnowVideoIdentScreenContract$ModalStep.CloseVideoCall.f77796a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return true;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f77801t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f77800s;
    }
}
