package kl;

import androidx.lifecycle.ViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.exception.InvalidCertificateException;
import com.onfido.android.sdk.capture.ui.camera.exception.TokenExpiredException;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.workflow.internal.workflow.WorkflowHttpExceptionMapper;
import com.onfido.hosted.web.module.model.HostedWebModuleFailed;
import com.onfido.workflow.OnfidoWorkflow;
import com.onfido.workflow.WorkflowConfig;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class c2 extends ViewModel {

    @NotNull
    public static final f0 Companion = new f0();
    public final CompositeDisposable A;
    public final Lazy B;
    public final PublishSubject C;
    public final PublishSubject D;
    public final BehaviorSubject E;
    public final Observable F;
    public final Observable G;
    public String H;
    public final sl.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SchedulersProvider f185150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Navigator f185151m;
    public final nl.c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nl.g0 f185152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ol.l f185153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ol.p f185154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nl.u f185155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nl.g1 f185156t;
    public final nl.e1 u;
    public final nl.v0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FlowTracker f185157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WorkflowHttpExceptionMapper f185158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hl.a f185159y;
    public final WorkflowConfig z;

    public c2(sl.j workflowPoller, SchedulersProvider schedulersProvider, Navigator navigator, nl.e backstackEventsProcessor, nl.c0 faceTaskProcessor, nl.g0 motionTaskProcessor, ol.l biometricTokenRetrievalFlowProcessor, ol.p biometricTokenStorageFlowProcessor, nl.u documentTaskProcessor, nl.g1 retryTaskProcessor, nl.e1 poaTaskProcessor, nl.v0 hostedWebModuleFlowProcessor, FlowTracker flowTracker, WorkflowHttpExceptionMapper workflowHttpExceptionMapper, hl.a workflowTaskDataSource, WorkflowConfig workflowConfig) {
        Intrinsics.checkNotNullParameter(workflowPoller, "workflowPoller");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(backstackEventsProcessor, "backstackEventsProcessor");
        Intrinsics.checkNotNullParameter(faceTaskProcessor, "faceTaskProcessor");
        Intrinsics.checkNotNullParameter(motionTaskProcessor, "motionTaskProcessor");
        Intrinsics.checkNotNullParameter(biometricTokenRetrievalFlowProcessor, "biometricTokenRetrievalFlowProcessor");
        Intrinsics.checkNotNullParameter(biometricTokenStorageFlowProcessor, "biometricTokenStorageFlowProcessor");
        Intrinsics.checkNotNullParameter(documentTaskProcessor, "documentTaskProcessor");
        Intrinsics.checkNotNullParameter(retryTaskProcessor, "retryTaskProcessor");
        Intrinsics.checkNotNullParameter(poaTaskProcessor, "poaTaskProcessor");
        Intrinsics.checkNotNullParameter(hostedWebModuleFlowProcessor, "hostedWebModuleFlowProcessor");
        Intrinsics.checkNotNullParameter(flowTracker, "flowTracker");
        Intrinsics.checkNotNullParameter(workflowHttpExceptionMapper, "workflowHttpExceptionMapper");
        Intrinsics.checkNotNullParameter(workflowTaskDataSource, "workflowTaskDataSource");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        this.k = workflowPoller;
        this.f185150l = schedulersProvider;
        this.f185151m = navigator;
        this.o = faceTaskProcessor;
        this.f185152p = motionTaskProcessor;
        this.f185153q = biometricTokenRetrievalFlowProcessor;
        this.f185154r = biometricTokenStorageFlowProcessor;
        this.f185155s = documentTaskProcessor;
        this.f185156t = retryTaskProcessor;
        this.u = poaTaskProcessor;
        this.v = hostedWebModuleFlowProcessor;
        this.f185157w = flowTracker;
        this.f185158x = workflowHttpExceptionMapper;
        this.f185159y = workflowTaskDataSource;
        this.z = workflowConfig;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.A = compositeDisposable;
        this.B = yhm.j.b(new g0(this, 0));
        PublishSubject publishSubjectN = ch.qos.logback.core.util.a.n("create(...)");
        this.C = publishSubjectN;
        PublishSubject publishSubjectN2 = ch.qos.logback.core.util.a.n("create(...)");
        this.D = publishSubjectN2;
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(new ml.p(false, false, false));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.E = behaviorSubjectD;
        Observable observableHide = behaviorSubjectD.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.F = observableHide;
        Observable observableHide2 = publishSubjectN2.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide2, "hide(...)");
        this.G = observableHide2;
        Disposable disposableSubscribe = c().distinctUntilChanged().switchMap(new q(this, 4)).compose(new kce.c(this, 28)).share().subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new j0(this, 2), new k0(this, 3));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
        Observable uiEvents = publishSubjectN.hide();
        Intrinsics.checkNotNullExpressionValue(uiEvents, "hide(...)");
        g0 onEmptyBackStack = new g0(this, 1);
        backstackEventsProcessor.getClass();
        Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
        Intrinsics.checkNotNullParameter(onEmptyBackStack, "onEmptyBackStack");
        Observable observablePublish = uiEvents.publish(new jid.z(backstackEventsProcessor, onEmptyBackStack, 15));
        Intrinsics.checkNotNullExpressionValue(observablePublish, "publish(...)");
        Disposable disposableSubscribe2 = observablePublish.subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new t1(behaviorSubjectD, 0), u1.f185242a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe2);
        BehaviorSubject behaviorSubjectC = c();
        p pVar = p.f185207g;
        Observable observableCast = behaviorSubjectC.filter(pVar).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        p pVar2 = p.f185208h;
        Observable map = observableCast.map(pVar2);
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Disposable disposableSubscribe3 = map.subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new k0(this, 2), v1.f185245a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe3);
        Observable observableCast2 = publishSubjectN.filter(q1.f185230h).cast(ml.o0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
        Disposable disposableSubscribe4 = observableCast2.take(1L).subscribe(new h0(this, 3));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe4, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe4);
        BehaviorSubject behaviorSubjectC2 = c();
        p pVar3 = p.e;
        Observable observableCast3 = behaviorSubjectC2.filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast3, "cast(...)");
        p pVar4 = p.f;
        Observable map2 = observableCast3.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableCast4 = map2.filter(p.k).cast(sl.n.class);
        Intrinsics.checkNotNullExpressionValue(observableCast4, "cast(...)");
        Observable observableDistinctUntilChanged = observableCast4.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        int i = 0;
        Disposable disposableSubscribe5 = observableDistinctUntilChanged.switchMap(new m0(this, i)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new n0(this, i), o0.f185203a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe5, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe5);
        Observable observableCast5 = c().filter(pVar).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast5, "cast(...)");
        Observable map3 = observableCast5.map(pVar2);
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Disposable disposableSubscribe6 = map3.filter(q1.f185228c).distinctUntilChanged().switchMap(new h0(this, 2)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new q(this, 3), s1.f185237a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe6, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe6);
        Observable observableCast6 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast6, "cast(...)");
        Observable map4 = observableCast6.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableCast7 = map4.filter(p.D).cast(sl.o.class);
        Intrinsics.checkNotNullExpressionValue(observableCast7, "cast(...)");
        Observable observableDistinctUntilChanged2 = observableCast7.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Disposable disposableSubscribe7 = observableDistinctUntilChanged2.switchMap(new q(this, 2)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new j0(this, 1), o1.f185204a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe7, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe7);
        Observable observableCast8 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast8, "cast(...)");
        Observable map5 = observableCast8.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableCast9 = map5.filter(p.i).cast(sl.k.class);
        Intrinsics.checkNotNullExpressionValue(observableCast9, "cast(...)");
        Observable observableDistinctUntilChanged3 = observableCast9.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        Disposable disposableSubscribe8 = observableDistinctUntilChanged3.switchMap(new h0(this, 0)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new q(this, 1), new i0(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe8, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe8);
        Observable observableCast10 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast10, "cast(...)");
        Observable map6 = observableCast10.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        Observable observableCast11 = map6.filter(p.f185209j).cast(sl.l.class);
        Intrinsics.checkNotNullExpressionValue(observableCast11, "cast(...)");
        Observable observableDistinctUntilChanged4 = observableCast11.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        int i2 = 0;
        Disposable disposableSubscribe9 = observableDistinctUntilChanged4.switchMap(new j0(this, i2)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new k0(this, i2), new l0(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe9, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe9);
        Observable observableCast12 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast12, "cast(...)");
        Observable map7 = observableCast12.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        Observable observableCast13 = map7.filter(p.E).cast(sl.s.class);
        Intrinsics.checkNotNullExpressionValue(observableCast13, "cast(...)");
        Observable observableDistinctUntilChanged5 = observableCast13.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        int i3 = 1;
        Disposable disposableSubscribe10 = observableDistinctUntilChanged5.switchMap(new k0(this, i3)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new m0(this, i3), p1.f185222a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe10, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe10);
        Observable observableCast14 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast14, "cast(...)");
        Observable map8 = observableCast14.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map8, "map(...)");
        Observable observableCast15 = map8.filter(q1.f185229g).cast(sl.m.class);
        Intrinsics.checkNotNullExpressionValue(observableCast15, "cast(...)");
        Observable observableDistinctUntilChanged6 = observableCast15.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        int i5 = 2;
        Disposable disposableSubscribe11 = observableDistinctUntilChanged6.switchMap(new m0(this, i5)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new n0(this, i5), new b2(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe11, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe11);
        Observable observableCast16 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast16, "cast(...)");
        Observable map9 = observableCast16.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map9, "map(...)");
        Observable observableCast17 = map9.filter(q1.f185227b).cast(sl.v.class);
        Intrinsics.checkNotNullExpressionValue(observableCast17, "cast(...)");
        Observable observableDistinctUntilChanged7 = observableCast17.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        final int i6 = 1;
        Disposable disposableSubscribe12 = observableDistinctUntilChanged7.switchMap(new n0(this, 1)).subscribeOn(schedulersProvider.getComputation()).observeOn(schedulersProvider.getUi()).subscribe(new igm.g(this) { // from class: kl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c2 f185226b;

            {
                this.f185226b = this;
            }

            @Override // igm.g
            public final void accept(Object obj2) {
                OnfidoWorkflow.WorkflowException workflowUnknownCameraException;
                switch (i6) {
                    case 0:
                        tl.f p0 = (tl.f) obj2;
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        c2 c2Var = this.f185226b;
                        c2Var.getClass();
                        if (p0 instanceof tl.c) {
                            workflowUnknownCameraException = new OnfidoWorkflow.WorkflowException.WorkflowInvalidSSLCertificateException(((tl.c) p0).f271981a);
                        } else if (Intrinsics.f(p0, tl.d.f271982a)) {
                            workflowUnknownCameraException = new OnfidoWorkflow.WorkflowException.WorkflowTokenExpiredException("token expired");
                        } else {
                            if (!(p0 instanceof tl.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String message = ((tl.e) p0).f271983a.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            workflowUnknownCameraException = new OnfidoWorkflow.WorkflowException.WorkflowUnknownCameraException(message);
                        }
                        c2Var.d(workflowUnknownCameraException);
                        return;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f185226b.c().onNext(ml.c.f206517a);
                        return;
                }
            }
        }, r1.f185234a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe12, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe12);
        Observable observableCast18 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast18, "cast(...)");
        Observable map10 = observableCast18.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map10, "map(...)");
        Observable observableCast19 = map10.filter(p.f185218w).cast(sl.r.class);
        Intrinsics.checkNotNullExpressionValue(observableCast19, "cast(...)");
        Observable observableDistinctUntilChanged8 = observableCast19.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        Disposable disposableSubscribe13 = observableDistinctUntilChanged8.take(1L).subscribe(new e1(this), f1.f185180a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe13, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe13);
        Observable observableCast20 = c().filter(pVar3).cast(ml.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast20, "cast(...)");
        Observable map11 = observableCast20.map(pVar4);
        Intrinsics.checkNotNullExpressionValue(map11, "map(...)");
        Observable observableCast21 = map11.filter(q1.d).cast(sl.w.class);
        Intrinsics.checkNotNullExpressionValue(observableCast21, "cast(...)");
        Observable observableDistinctUntilChanged9 = observableCast21.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        Disposable disposableSubscribe14 = observableDistinctUntilChanged9.subscribe(new w1(this), x1.f185250a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe14, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe14);
        Observable observableCast22 = publishSubjectN.filter(p.f185219x).cast(ml.q.class);
        Intrinsics.checkNotNullExpressionValue(observableCast22, "cast(...)");
        Observable map12 = observableCast22.map(new g2e.t(g1.f));
        Intrinsics.checkNotNullExpressionValue(map12, "map(...)");
        Observable observableCast23 = map12.filter(p.f185220y).cast(tl.a.class);
        Intrinsics.checkNotNullExpressionValue(observableCast23, "cast(...)");
        Disposable disposableSubscribe15 = observableCast23.subscribe(new h1(this), i1.f185186a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe15, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe15);
        Observable observableCast24 = publishSubjectN.filter(p.z).cast(ml.q.class);
        Intrinsics.checkNotNullExpressionValue(observableCast24, "cast(...)");
        Observable map13 = observableCast24.map(new g2e.t(j1.f));
        Intrinsics.checkNotNullExpressionValue(map13, "map(...)");
        Observable observableCast25 = map13.filter(p.A).cast(tl.g.class);
        Intrinsics.checkNotNullExpressionValue(observableCast25, "cast(...)");
        Disposable disposableSubscribe16 = observableCast25.subscribe(new h0(this, 1), k1.f185191a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe16, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe16);
        Observable observableCast26 = publishSubjectN.filter(p.f185210l).cast(ml.q.class);
        Intrinsics.checkNotNullExpressionValue(observableCast26, "cast(...)");
        Observable map14 = observableCast26.map(new g2e.t(p0.f));
        Intrinsics.checkNotNullExpressionValue(map14, "map(...)");
        Observable observableCast27 = map14.filter(p.f185211m).cast(tl.f.class);
        Intrinsics.checkNotNullExpressionValue(observableCast27, "cast(...)");
        final int i21 = 0;
        Disposable disposableSubscribe17 = observableCast27.subscribe(new igm.g(this) { // from class: kl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c2 f185226b;

            {
                this.f185226b = this;
            }

            @Override // igm.g
            public final void accept(Object obj2) {
                OnfidoWorkflow.WorkflowException workflowUnknownCameraException;
                switch (i21) {
                    case 0:
                        tl.f p0 = (tl.f) obj2;
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        c2 c2Var = this.f185226b;
                        c2Var.getClass();
                        if (p0 instanceof tl.c) {
                            workflowUnknownCameraException = new OnfidoWorkflow.WorkflowException.WorkflowInvalidSSLCertificateException(((tl.c) p0).f271981a);
                        } else if (Intrinsics.f(p0, tl.d.f271982a)) {
                            workflowUnknownCameraException = new OnfidoWorkflow.WorkflowException.WorkflowTokenExpiredException("token expired");
                        } else {
                            if (!(p0 instanceof tl.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String message = ((tl.e) p0).f271983a.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            workflowUnknownCameraException = new OnfidoWorkflow.WorkflowException.WorkflowUnknownCameraException(message);
                        }
                        c2Var.d(workflowUnknownCameraException);
                        return;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f185226b.c().onNext(ml.c.f206517a);
                        return;
                }
            }
        }, r0.f185233a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe17, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe17);
        Observable observableCast28 = publishSubjectN.filter(p.f185212n).cast(ml.n0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast28, "cast(...)");
        Observable observableCast29 = observableCast28.filter(p.o).cast(ml.y.class);
        Intrinsics.checkNotNullExpressionValue(observableCast29, "cast(...)");
        Observable map15 = observableCast29.map(s0.f185236a);
        Intrinsics.checkNotNullExpressionValue(map15, "map(...)");
        Observable observableCast30 = map15.filter(p.f185213p).cast(DocumentCaptureScreen.DocumentCaptureResult.Error.class);
        Intrinsics.checkNotNullExpressionValue(observableCast30, "cast(...)");
        Disposable disposableSubscribe18 = observableCast30.map(new t0(this)).subscribe(new igm.g() { // from class: kl.u0
            @Override // igm.g
            public final void accept(Object obj2) {
                OnfidoWorkflow.WorkflowException p0 = (OnfidoWorkflow.WorkflowException) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.f185241a.d(p0);
            }
        }, v0.f185244a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe18, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe18);
        Observable observableCast31 = publishSubjectN.filter(p.f185217t).cast(ml.n0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast31, "cast(...)");
        Observable observableCast32 = observableCast31.filter(p.u).cast(ml.b0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast32, "cast(...)");
        Observable map16 = observableCast32.map(a1.f185140a);
        Intrinsics.checkNotNullExpressionValue(map16, "map(...)");
        Observable observableCast33 = map16.filter(p.v).cast(SelfieCaptureScreen.SelfieCaptureResult.Error.class);
        Intrinsics.checkNotNullExpressionValue(observableCast33, "cast(...)");
        Disposable disposableSubscribe19 = observableCast33.map(new b1(this)).subscribe(new igm.g() { // from class: kl.c1
            @Override // igm.g
            public final void accept(Object obj2) {
                OnfidoWorkflow.WorkflowException p0 = (OnfidoWorkflow.WorkflowException) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.f185149a.d(p0);
            }
        }, d1.f185161a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe19, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe19);
        Observable observableCast34 = publishSubjectN.filter(p.f185214q).cast(ml.n0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast34, "cast(...)");
        Observable observableCast35 = observableCast34.filter(p.f185215r).cast(ml.z.class);
        Intrinsics.checkNotNullExpressionValue(observableCast35, "cast(...)");
        Observable map17 = observableCast35.map(w0.f185247a);
        Intrinsics.checkNotNullExpressionValue(map17, "map(...)");
        Observable observableCast36 = map17.filter(p.f185216s).cast(LivenessCaptureScreen.LivenessCaptureResult.Error.class);
        Intrinsics.checkNotNullExpressionValue(observableCast36, "cast(...)");
        Disposable disposableSubscribe20 = observableCast36.map(new x0(this)).subscribe(new igm.g() { // from class: kl.y0
            @Override // igm.g
            public final void accept(Object obj2) {
                OnfidoWorkflow.WorkflowException p0 = (OnfidoWorkflow.WorkflowException) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.f185252a.d(p0);
            }
        }, z0.f185256a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe20, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe20);
        Observable observableCast37 = publishSubjectN.filter(p.B).cast(ml.e0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast37, "cast(...)");
        Observable map18 = observableCast37.map(new g2e.t(l1.f));
        Intrinsics.checkNotNullExpressionValue(map18, "map(...)");
        Observable observableCast38 = map18.filter(p.C).cast(MotionHostFragment.AvcHostResult.Error.class);
        Intrinsics.checkNotNullExpressionValue(observableCast38, "cast(...)");
        Disposable disposableSubscribe21 = observableCast38.subscribe(new m1(this), n1.f185202a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe21, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe21);
        Observable observableCast39 = publishSubjectN.filter(q1.e).cast(ml.d0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast39, "cast(...)");
        Observable map19 = observableCast39.map(new g2e.t(y1.f));
        Intrinsics.checkNotNullExpressionValue(map19, "map(...)");
        Observable observableCast40 = map19.filter(q1.f).cast(HostedWebModuleFailed.class);
        Intrinsics.checkNotNullExpressionValue(observableCast40, "cast(...)");
        Disposable disposableSubscribe22 = observableCast40.subscribe(new z1(this), a2.f185141a);
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe22, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe22);
    }

    public static final OnfidoWorkflow.WorkflowException a(c2 c2Var, Exception exc2) {
        if (Intrinsics.f(exc2, TokenExpiredException.INSTANCE)) {
            return new OnfidoWorkflow.WorkflowException.WorkflowTokenExpiredException("token expired");
        }
        if (exc2 instanceof InvalidCertificateException) {
            return new OnfidoWorkflow.WorkflowException.WorkflowInvalidSSLCertificateException(((InvalidCertificateException) exc2).getMessage());
        }
        if (!(exc2 instanceof UnknownCameraException)) {
            String localizedMessage = exc2.getLocalizedMessage();
            return new OnfidoWorkflow.WorkflowException.WorkflowUnknownException(localizedMessage != null ? localizedMessage : "", exc2);
        }
        Throwable cause = exc2.getCause();
        String message = cause != null ? cause.getMessage() : null;
        return new OnfidoWorkflow.WorkflowException.WorkflowUnknownCameraException(message != null ? message : "");
    }

    public static String e(ml.e eVar) {
        return Intrinsics.f(eVar, ml.a.f206513a) ? "waiting_screen" : eVar instanceof ml.b ? ((ml.b) eVar).f206515a.a() : Intrinsics.f(eVar, ml.c.f206517a) ? "no_running_task" : Intrinsics.f(eVar, ml.d.f206519a) ? "non_interactive_task" : "";
    }

    public final void b(ml.q0 uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        this.C.onNext(uiEvent);
    }

    public final BehaviorSubject c() {
        return (BehaviorSubject) this.B.getValue();
    }

    public final void d(OnfidoWorkflow.WorkflowException workflowException) {
        this.D.onNext(new ml.i(workflowException));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.A.dispose();
        super.onCleared();
    }
}
