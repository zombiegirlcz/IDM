package gld;

import android.os.Parcelable;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.feature.slot_manager.impl.navigation.custom_rating.CustomRatingBottomSheetDestination;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.RateUsBundle;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.b1;
import rp0.c1;
import rp0.d1;
import rp0.e1;
import rp0.f1;
import rp0.k1;
import vkm.q0;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends pri.c implements mkd.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f144670h;
    public final tpi.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r3l.a f144671j;
    public final k3l.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sri.m f144672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bld.j f144673m;

    public p0(a0 slotManagerFeedControllerModel, tpi.j progressView, r3l.a shotDialogView, k3l.b statusDialogView, sri.m navigator, bld.j customRatingMediator) {
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModel, "slotManagerFeedControllerModel");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(shotDialogView, "shotDialogView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(customRatingMediator, "customRatingMediator");
        this.f144670h = slotManagerFeedControllerModel;
        this.i = progressView;
        this.f144671j = shotDialogView;
        this.k = statusDialogView;
        this.f144672l = navigator;
        this.f144673m = customRatingMediator;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        mkd.g view = (mkd.g) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        a0 a0Var = this.f144670h;
        vkm.f fVarJ = a0Var.j();
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC = rd0.e.c(fVarJ, gVar);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarC.onErrorResumeNext(new a08.r(20, new h0(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(16, i0.f144652a), new a0d.g(16, function1K), new ea9.c(16, function0J));
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarC2 = rd0.e.c(a0Var.i(), gVar);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarC2.onErrorResumeNext(new a08.r(20, new h0(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a0d.g(16, j0.f144654a), new a0d.g(16, function1K2), new ea9.c(16, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarC3 = rd0.e.c(a0Var.f(), gVar);
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarC3.onErrorResumeNext(new a08.r(20, new h0(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a0d.g(16, k0.f144656a), new a0d.g(16, function1K3), new ea9.c(16, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r rVarC4 = rd0.e.c(a0Var.g(), gVar);
        Function1 function1K4 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarC4.onErrorResumeNext(new a08.r(20, new h0(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new a0d.g(16, l0.f144660a), new a0d.g(16, function1K4), new ea9.c(16, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        skd.j jVar = a0Var.f;
        Continuation continuation = null;
        efm.r rVarC5 = rd0.e.c(vkm.q.H(new ge7.f(a0Var, null, 13), new q0(vkm.q.g(jVar.f263838a), new se4.c(jVar, continuation, 9), 1)), gVar);
        Function1 function1K5 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarC5.onErrorResumeNext(new a08.r(20, new h0(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new a0d.g(16, m0.f144662a), new a0d.g(16, function1K5), new ea9.c(16, function0J5));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        bld.m mVar = (bld.m) this.f144673m;
        AtomicBoolean atomicBoolean = mVar.f16548g;
        z1 z1Var = mVar.f;
        if (atomicBoolean.getAndSet(false)) {
            z1Var.k(bld.m.c());
        }
        efm.r rVarC6 = rd0.e.c(new q0(vkm.q.g(z1Var), new bf5.a(mVar, continuation, 13), 1), gVar);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: gld.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f144643b;

            {
                this.f144643b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                p0 p0Var = this.f144643b;
                switch (i2) {
                    case 0:
                        bld.i event = (bld.i) obj2;
                        Intrinsics.checkNotNullParameter(event, "event");
                        r3l.a aVar2 = p0Var.f144671j;
                        sri.m mVar2 = p0Var.f144672l;
                        ifm.b bVar2 = p0Var.f239031a;
                        if (event instanceof bld.e) {
                            skm.p0 p0Var2 = skm.p0.f264001a;
                            efm.b bVarU = mo3.a.u(o70.a.g(pd.b.n(zkm.o.f323119a, new ge7.f(event, null, 14))), p0Var.i, true);
                            Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                            Function1 function1K6 = p0Var.K();
                            pfm.a aVar3 = new pfm.a(bVarU, new a08.r(20, new h0(new BreadcrumbException(), 6)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                            ofm.h hVarW = aVar3.w(new a0d.g(16, function1K6), new ea9.c(16, n0.f144664a));
                            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                            te0.w.j0(bVar2, hVarW);
                        } else if (event instanceof bld.b) {
                            mVar2.c(gc0.c.f(new KompotOverlayFeatureConfig(((bld.b) event).f16526a, yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
                        } else if (event instanceof bld.h) {
                            mVar2.c(gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) ((bld.h) event).f16538a, false, (Integer) null, 0, 57)));
                            ((bld.m) p0Var.f144673m).f16548g.set(true);
                        } else if (event instanceof bld.f) {
                            bld.f fVar = (bld.f) event;
                            r3l.c cVar = (r3l.c) aVar2;
                            cVar.N(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "tell_us_more", fVar.f16534b, fVar.f16533a, fVar.f16535c, f1.ABOVE_ANCHOR_VIEW, 32));
                        } else if (event instanceof bld.c) {
                            bld.c cVar2 = (bld.c) event;
                            r3l.c cVar3 = (r3l.c) aVar2;
                            cVar3.N(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "rate_us", cVar2.f16528b, cVar2.f16527a, cVar2.f16529c, cVar2.d, 32));
                        } else if (event instanceof bld.g) {
                            pfm.n nVar = new pfm.n(new fag.g(p0Var, event, 6), 1);
                            Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                            pfm.a aVarE = efm.b.A(400L, TimeUnit.MILLISECONDS, hhm.f.f152430b).e(o70.a.d(nVar));
                            Intrinsics.checkNotNullExpressionValue(aVarE, "delaySubscription(...)");
                            Function1 function1K7 = p0Var.K();
                            pfm.a aVar4 = new pfm.a(aVarE, new a08.r(20, new h0(new BreadcrumbException(), 7)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                            ofm.h hVarW2 = aVar4.w(new a0d.g(16, function1K7), new ea9.c(16, o0.f144666a));
                            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                            te0.w.j0(bVar2, hVarW2);
                        } else {
                            if (!(event instanceof bld.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((k3l.d) p0Var.k).O(new StatusViewConfiguration.Error("submission_error", ((bld.d) event).f16530a, null, null, null, null, null, 8188));
                        }
                        return Unit.f186387a;
                    default:
                        bld.j jVar2 = p0Var.f144673m;
                        e1 event2 = (e1) obj2;
                        Intrinsics.checkNotNullParameter(event2, "event");
                        if (event2 instanceof b1) {
                            Parcelable parcelable = ((b1) event2).f256049a.f55719g;
                            if (parcelable instanceof FeedbackBundle) {
                                FeedbackBundle feedbackBundle = (FeedbackBundle) parcelable;
                                bld.m mVar3 = (bld.m) jVar2;
                                mVar3.getClass();
                                Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
                                mVar3.f.k(new bld.b(new CustomRatingBottomSheetDestination(feedbackBundle)));
                            } else if (parcelable instanceof RateUsBundle) {
                                ((bld.m) jVar2).d((RateUsBundle) parcelable);
                            }
                        } else if (!(event2 instanceof c1) && !(event2 instanceof d1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K6 = K();
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = rVarC6.onErrorResumeNext(new a08.r(20, new g0d.m(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new a0d.g(16, function1), new a0d.g(16, function1K6), new ea9.c(16, function0J6));
        te0.w.j0(bVar, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        ihm.f fVar = ((k1) ((r3l.c) this.f144671j).f251317h).d;
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: gld.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f144643b;

            {
                this.f144643b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                p0 p0Var = this.f144643b;
                switch (i22) {
                    case 0:
                        bld.i event = (bld.i) obj2;
                        Intrinsics.checkNotNullParameter(event, "event");
                        r3l.a aVar2 = p0Var.f144671j;
                        sri.m mVar2 = p0Var.f144672l;
                        ifm.b bVar2 = p0Var.f239031a;
                        if (event instanceof bld.e) {
                            skm.p0 p0Var2 = skm.p0.f264001a;
                            efm.b bVarU = mo3.a.u(o70.a.g(pd.b.n(zkm.o.f323119a, new ge7.f(event, null, 14))), p0Var.i, true);
                            Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                            Function1 function1K62 = p0Var.K();
                            pfm.a aVar3 = new pfm.a(bVarU, new a08.r(20, new h0(new BreadcrumbException(), 6)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                            ofm.h hVarW = aVar3.w(new a0d.g(16, function1K62), new ea9.c(16, n0.f144664a));
                            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                            te0.w.j0(bVar2, hVarW);
                        } else if (event instanceof bld.b) {
                            mVar2.c(gc0.c.f(new KompotOverlayFeatureConfig(((bld.b) event).f16526a, yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
                        } else if (event instanceof bld.h) {
                            mVar2.c(gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) ((bld.h) event).f16538a, false, (Integer) null, 0, 57)));
                            ((bld.m) p0Var.f144673m).f16548g.set(true);
                        } else if (event instanceof bld.f) {
                            bld.f fVar2 = (bld.f) event;
                            r3l.c cVar = (r3l.c) aVar2;
                            cVar.N(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "tell_us_more", fVar2.f16534b, fVar2.f16533a, fVar2.f16535c, f1.ABOVE_ANCHOR_VIEW, 32));
                        } else if (event instanceof bld.c) {
                            bld.c cVar2 = (bld.c) event;
                            r3l.c cVar3 = (r3l.c) aVar2;
                            cVar3.N(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "rate_us", cVar2.f16528b, cVar2.f16527a, cVar2.f16529c, cVar2.d, 32));
                        } else if (event instanceof bld.g) {
                            pfm.n nVar = new pfm.n(new fag.g(p0Var, event, 6), 1);
                            Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                            pfm.a aVarE = efm.b.A(400L, TimeUnit.MILLISECONDS, hhm.f.f152430b).e(o70.a.d(nVar));
                            Intrinsics.checkNotNullExpressionValue(aVarE, "delaySubscription(...)");
                            Function1 function1K7 = p0Var.K();
                            pfm.a aVar4 = new pfm.a(aVarE, new a08.r(20, new h0(new BreadcrumbException(), 7)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                            ofm.h hVarW2 = aVar4.w(new a0d.g(16, function1K7), new ea9.c(16, o0.f144666a));
                            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                            te0.w.j0(bVar2, hVarW2);
                        } else {
                            if (!(event instanceof bld.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((k3l.d) p0Var.k).O(new StatusViewConfiguration.Error("submission_error", ((bld.d) event).f16530a, null, null, null, null, null, 8188));
                        }
                        return Unit.f186387a;
                    default:
                        bld.j jVar2 = p0Var.f144673m;
                        e1 event2 = (e1) obj2;
                        Intrinsics.checkNotNullParameter(event2, "event");
                        if (event2 instanceof b1) {
                            Parcelable parcelable = ((b1) event2).f256049a.f55719g;
                            if (parcelable instanceof FeedbackBundle) {
                                FeedbackBundle feedbackBundle = (FeedbackBundle) parcelable;
                                bld.m mVar3 = (bld.m) jVar2;
                                mVar3.getClass();
                                Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
                                mVar3.f.k(new bld.b(new CustomRatingBottomSheetDestination(feedbackBundle)));
                            } else if (parcelable instanceof RateUsBundle) {
                                ((bld.m) jVar2).d((RateUsBundle) parcelable);
                            }
                        } else if (!(event2 instanceof c1) && !(event2 instanceof d1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K7 = K();
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = fVar.onErrorResumeNext(new a08.r(20, new h0(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new a0d.g(16, function12), new a0d.g(16, function1K7), new ea9.c(16, function0J7));
        te0.w.j0(bVar, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
    }

    @Override // pri.b, pri.e
    public final void l() {
        a0 a0Var = this.f144670h;
        skm.e0.n(a0Var.f144622l.f323100a);
        a0Var.f144623m.clear();
        a0Var.f144624n.clear();
        this.f144673m.getClass();
        super.l();
    }
}
