package com.revolut.sso.impl.ui.manual_review;

import b90.e;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import oki.h;
import okl.n1;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements mnl.b {
    public final ManualReviewFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.a f106582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f106583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n1 f106584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nnl.a f106585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gu2.e f106586t;
    public final kye.e u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f106587w;

    public b(ManualReviewFlowContract$InputData inputData, s70.a intentProvider, e notificationsStatusProvider, n1 authenticationInteractor, nnl.a manualReviewDialogsFactory, gu2.e captchaViewControllerExtension, kye.e appCloseHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(notificationsStatusProvider, "notificationsStatusProvider");
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        Intrinsics.checkNotNullParameter(manualReviewDialogsFactory, "manualReviewDialogsFactory");
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(appCloseHandler, "appCloseHandler");
        this.o = inputData;
        this.f106582p = intentProvider;
        this.f106583q = notificationsStatusProvider;
        this.f106584r = authenticationInteractor;
        this.f106585s = manualReviewDialogsFactory;
        this.f106586t = captchaViewControllerExtension;
        this.u = appCloseHandler;
        g gVar = new g(this, 0);
        this.f106587w = d.a(this, ManualReviewFlowContract$Step.ReviewAwaiting.f106575a, f0.f322471a, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.manual_review.b r26, com.revolut.sso.impl.domain.models.AuthAction r27, java.lang.String r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.manual_review.b.I2(com.revolut.sso.impl.ui.manual_review.b, com.revolut.sso.impl.domain.models.AuthAction, java.lang.String, gim.c):java.lang.Object");
    }

    public final void J2() {
        boolean zAreNotificationsEnabled = this.f106583q.f13523a.areNotificationsEnabled();
        if (this.v ^ zAreNotificationsEnabled) {
            this.v = zAreNotificationsEnabled;
            yki.a aVar = this.f106587w;
            FlowStep flowStepD = aVar.d();
            ManualReviewFlowContract$Step.ReviewAwaiting reviewAwaiting = ManualReviewFlowContract$Step.ReviewAwaiting.f106575a;
            if (Intrinsics.f(flowStepD, reviewAwaiting)) {
                h.t2(this, aVar, reviewAwaiting, false, TransitionAnimation.NONE.f98393a, false, 8);
            }
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        J2();
        n2(new a(this, null), new whi.b(6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106587w;
    }
}
