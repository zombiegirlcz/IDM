package ag;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.CancellationSignal;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.FragmentTransitionSupport;
import androidx.transition.Transition;
import androidx.work.ListenableFutureKt;
import cli.y;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.onfido.android.sdk.capture.detector.mrz.MRZDetectorGoogle;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.validation.DocumentCodeValidator;
import com.orhanobut.dialogplus.OnItemClickListener;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.DraggableWidgetRootFrameLayout;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreen;
import com.youTransactor.uCube.rpc.RPCCommand;
import efm.g0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ms0.o0;
import skm.d0;
import tfm.z0;
import tof.q6;
import tw0.j1;
import tw0.l1;
import tw0.m1;
import vkm.j2;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class p implements Continuation, CancellationSignal.OnCancelListener, SuccessContinuation, fgm.q, OnCompleteListener, hc.a, gc.h, CallbackToFutureAdapter.Resolver, efm.g, ListenerSet.Event, o0, efm.x, efm.u, g0, Consumer, zp0.x, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4718c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(Object obj2, int i, Object obj3, Object obj4) {
        this.f4716a = i;
        this.f4717b = obj2;
        this.f4718c = obj3;
        this.d = obj4;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        RPCCommand rPCCommand = (RPCCommand) this.f4717b;
        Function1 function1 = (Function1) this.f4718c;
        Function1 function12 = (Function1) this.d;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        rPCCommand.execute(new androidx.credentials.playservices.b(rPCCommand, emitter, function1, function12));
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj2) {
        ((MediaSourceEventListener.EventDispatcher) this.f4717b).lambda$upstreamDiscarded$4((MediaSource.MediaPeriodId) this.f4718c, (MediaLoadData) this.d, (MediaSourceEventListener) obj2);
    }

    @Override // efm.x
    public efm.w apply(efm.r observable) {
        oqk.g0 g0Var = (oqk.g0) this.f4717b;
        AccountId accountId = (AccountId) this.f4718c;
        q6[] q6VarArr = (q6[]) this.d;
        Intrinsics.checkNotNullParameter(observable, "observable");
        ifm.b bVar = new ifm.b();
        return te0.w.z(observable, new n68.w(bVar, g0Var, accountId, q6VarArr, 22)).doFinally(new oqk.q(bVar, 1));
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f4716a) {
            case 8:
                return ((DefaultSurfaceProcessor) this.f4717b).lambda$initGlRenderer$10((DynamicRange) this.f4718c, (Map) this.d, completer);
            case 9:
                return ((DualSurfaceProcessor) this.f4717b).lambda$initGlRenderer$6((DynamicRange) this.f4718c, (Map) this.d, completer);
            case 14:
                return ListenableFutureKt.executeAsync$lambda$4((Executor) this.f4717b, (String) this.f4718c, (Function0) this.d, completer);
            default:
                return ListenableFutureKt.launchFuture$lambda$1((CoroutineContext) this.f4717b, (d0) this.f4718c, (Function2) this.d, completer);
        }
    }

    @Override // ms0.o0
    public void b() {
        ViewParent parent;
        BaseDraggableWidgetDelegate baseDraggableWidgetDelegate = (BaseDraggableWidgetDelegate) this.f4717b;
        op0.p viewHolder = (op0.p) this.f4718c;
        BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) this.d;
        DraggableWidgetRootFrameLayout draggableWidgetRootFrameLayout = viewHolder.f227373h;
        or0.u.k(draggableWidgetRootFrameLayout).n0().a(draggableWidgetRootFrameLayout, model, model.getF54970q());
        baseDraggableWidgetDelegate.r(model, new com.revolut.core.ui_kit.delegates.widgets.j(model.getF52269a(), model));
        ViewParent parent2 = viewHolder.f227373h.getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
        l1 l1Var = baseDraggableWidgetDelegate.f54987g;
        if (l1Var != null) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            l1Var.e = viewHolder;
            l1Var.f = j1.LONG_PRESSED;
            RecyclerView recyclerView = l1Var.d;
            if (recyclerView != null && (parent = recyclerView.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            RecyclerView recyclerView2 = l1Var.d;
            if (recyclerView2 != null) {
                recyclerView2.addOnItemTouchListener(l1Var.f274847g);
            }
            RecyclerView.ViewHolder viewHolder2 = l1Var.e;
            if (viewHolder2 != null) {
                m1 m1Var = l1Var.f274844a;
                m1Var.getClass();
                Intrinsics.checkNotNullParameter(viewHolder2, "viewHolder");
                viewHolder2.itemView.performHapticFeedback(0);
                viewHolder2.itemView.setHapticFeedbackEnabled(false);
                m1Var.f274852b.getClass();
                Intrinsics.checkNotNullParameter(viewHolder2, "viewHolder");
                ViewPropertyAnimator viewPropertyAnimatorAnimate = viewHolder2.itemView.animate();
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.setListener(null);
                viewPropertyAnimatorAnimate.setUpdateListener(null);
                viewPropertyAnimatorAnimate.scaleY(1.04f).scaleX(1.04f).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
            }
        }
    }

    @Override // fgm.q
    public void c(tgm.a aVar) {
        MRZDetectorGoogle.detect$lambda$0((DocumentDetectionFrame) this.f4717b, (MRZDetectorGoogle) this.f4718c, (DocumentCodeValidator) this.d, aVar);
    }

    @Override // efm.g
    public efm.f d(efm.b it8) {
        ExchangeResult exchangeResult = (ExchangeResult) this.f4717b;
        m1i.a aVar = (m1i.a) this.f4718c;
        xi0.b bVar = (xi0.b) this.d;
        Intrinsics.checkNotNullParameter(it8, "it");
        return exchangeResult instanceof ExchangeResult.Success ? it8.e(aVar.f201508c.n0(bVar, aVar.d)) : it8;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.x
    public void e(String str, String input, String str2, boolean z) {
        int i = this.f4716a;
        Object obj2 = this.d;
        Object obj3 = this.f4718c;
        Object obj4 = this.f4717b;
        switch (i) {
            case 19:
                PodNomineesPercentageScreen podNomineesPercentageScreen = (PodNomineesPercentageScreen) obj3;
                uek.i parcel = (uek.i) obj2;
                KProperty[] kPropertyArr = PodNomineesPercentageScreen.R;
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(input, "extractedValue");
                Intrinsics.checkNotNullParameter(str2, "<unused var>");
                if (((MaskedTextInputEditText) obj4).hasFocus()) {
                    uek.m mVar = (uek.m) podNomineesPercentageScreen.O.getValue();
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    y yVar = mVar.f279484t;
                    uek.g gVar = ((uek.f) ((j2) yVar.f22677a).getValue()).f279469a;
                    if (gVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mVar.H2(yVar, new sc7.b(mVar, input, parcel, gVar, 8));
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(input, "extractedValue");
                Intrinsics.checkNotNullParameter(str2, "<unused var>");
                ((SplitBillsSummaryScreen) obj4).P.onNext(new wp9.p((wp9.g0) obj3, input, ((MaskedTextInputEditText) obj2).hasFocus()));
                return;
        }
    }

    @Override // hc.a
    public Object execute() {
        ec.b bVar = (ec.b) this.f4717b;
        zb.j jVar = (zb.j) this.f4718c;
        zb.i iVar = (zb.i) this.d;
        gc.j jVar2 = (gc.j) bVar.d;
        jVar2.getClass();
        wb.e eVar = jVar.f320782c;
        String str = iVar.f320774a;
        String str2 = jVar.f320780a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            StringBuilder sb6 = new StringBuilder("Storing event with priority=");
            sb6.append(eVar);
            sb6.append(", name=");
            sb6.append(str);
            sb6.append(" for destination ");
            j6.a.C(sb6, str2, strConcat);
        }
        ((Long) jVar2.g(new bg.a(jVar2, 1, iVar, jVar))).longValue();
        bVar.f124394a.h(jVar, 1, false);
        return null;
    }

    public void f() {
        FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.f4717b, (Transition) this.f4718c, (Runnable) this.d);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        ((AnalyticsListener) obj2).onAudioInputFormatChanged((AnalyticsListener.EventTime) this.f4717b, (Format) this.f4718c, (DecoderReuseEvaluation) this.d);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i;
        pfm.g gVar = (pfm.g) this.f4717b;
        cq.g gVar2 = (cq.g) this.f4718c;
        zp.a aVar = (zp.a) this.d;
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if (exception == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            gVar.onError(exception);
            return;
        }
        oc.a aVar2 = (oc.a) task.getResult();
        int[] iArr = cq.f.f107978a;
        int i2 = iArr[aVar.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        oc.b bVar = gVar2.f107980b;
        aVar2.getClass();
        if (aVar2.a(oc.k.a(i)) == null) {
            gVar.onError(new IllegalStateException("Update type is not allowed: " + aVar));
            return;
        }
        com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, gVar2.f107981c, String.valueOf(((oc.a) task.getResult()).f223995a), Boolean.TRUE);
        gVar2.d.onNext(new zp.g(((oc.a) task.getResult()).f, ((oc.a) task.getResult()).f223998g));
        oc.a aVar3 = (oc.a) task.getResult();
        int i5 = iArr[aVar.ordinal()];
        if (i5 == 1) {
            i3 = 1;
        } else if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        oc.e eVar = (oc.e) bVar;
        eVar.c(aVar3, i3, gVar2.f107979a);
        if (aVar == zp.a.FLEXIBLE) {
            eVar.b(gVar2.e);
        }
        gVar.onComplete();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    @Override // efm.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subscribe(efm.e0 r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4717b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r11.f4718c
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r11.d
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.String r3 = "emitter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            r3 = 0
            if (r0 == 0) goto L4b
            kotlin.jvm.internal.t0 r4 = kotlin.jvm.internal.t0.f186434a
            m70.a.t(r4)
            java.lang.String r4 = " "
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r5 = 6
            java.util.List r0 = kotlin.text.d0.n0(r0, r4, r3, r5)
            if (r0 == 0) goto L4b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r0, r5)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = ngm.n.I(r5)
            r4.add(r5)
            goto L37
        L4b:
            r4 = 0
        L4c:
            if (r4 == 0) goto Lac
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L55
            goto Lac
        L55:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L60:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto La6
            java.lang.Object r5 = r1.next()
            r6 = r12
            ufm.a r6 = (ufm.a) r6
            boolean r7 = r6.isDisposed()
            if (r7 == 0) goto L74
            goto L9a
        L74:
            java.lang.Object r7 = r2.invoke(r5)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L7d
            goto L60
        L7d:
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L84
            goto La2
        L84:
            java.util.Iterator r8 = r4.iterator()
        L88:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La2
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = r6.isDisposed()
            if (r10 == 0) goto L9b
        L9a:
            return
        L9b:
            boolean r9 = kotlin.text.d0.J(r7, r9, r3)
            if (r9 != 0) goto L88
            goto L60
        La2:
            r0.add(r5)
            goto L60
        La6:
            ufm.a r12 = (ufm.a) r12
            r12.b(r0)
            return
        Lac:
            ufm.a r12 = (ufm.a) r12
            r12.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.p.subscribe(efm.e0):void");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        URL url2;
        switch (this.f4716a) {
            case 0:
                s sVar = (s) this.f4717b;
                Task task2 = (Task) this.f4718c;
                Task task3 = (Task) this.d;
                if (!task2.isSuccessful()) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable) task2.getException()));
                }
                if (!task3.isSuccessful()) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable) task3.getException()));
                }
                try {
                    try {
                        url2 = new URL(sVar.c(sVar.f4732n));
                    } catch (IOException e) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", (Throwable) e));
                    }
                    break;
                } catch (MalformedURLException unused) {
                    url2 = null;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
                sVar.i(httpURLConnection, (String) task3.getResult(), ((df.a) task2.getResult()).f113718a);
                return Tasks.forResult(httpURLConnection);
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4717b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f4718c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
        }
    }

    public /* synthetic */ p(u3a.v vVar, String str, List list, Function1 function1) {
        this.f4716a = 17;
        this.f4717b = str;
        this.f4718c = list;
        this.d = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[PHI: r7
      0x0036: PHI (r7v9 cc.d) = (r7v2 cc.d), (r7v3 cc.d), (r7v4 cc.d), (r7v5 cc.d), (r7v6 cc.d), (r7v7 cc.d) binds: [B:9:0x0034, B:12:0x003e, B:15:0x0047, B:18:0x0050, B:21:0x0059, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gc.h, kfm.o, androidx.arch.core.util.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.p.apply(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        String strD;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f4717b;
        String str = (String) this.f4718c;
        com.google.firebase.messaging.v vVar = (com.google.firebase.messaging.v) this.d;
        String str2 = (String) obj2;
        af.j jVarC = FirebaseMessaging.c(firebaseMessaging.f49452b);
        pd.g gVar = firebaseMessaging.f49451a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f235024b)) {
            strD = "";
        } else {
            strD = gVar.d();
        }
        String strC = firebaseMessaging.f49455h.c();
        synchronized (jVarC) {
            String strA = com.google.firebase.messaging.v.a(System.currentTimeMillis(), str2, strC);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = jVarC.f3816a.edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA);
                editorEdit.commit();
            }
        }
        if (vVar == null || !str2.equals(vVar.f49548a)) {
            pd.g gVar2 = firebaseMessaging.f49451a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f235024b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb6 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    j6.a.C(sb6, gVar2.f235024b, "FirebaseMessaging");
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.k(firebaseMessaging.f49452b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
