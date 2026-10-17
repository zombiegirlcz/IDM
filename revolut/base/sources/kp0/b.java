package kp0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Messenger;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.core.CameraProvider;
import androidx.camera.extensions.ExtensionsManager;
import androidx.compose.foundation.text.TextRangeScopeMeasurePolicy;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.work.RxWorker;
import androidx.work.WorkerKt;
import com.onfido.android.sdk.capture.biometricToken.BiometricTokenRetrievalService;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.ui.login.pin.LoginActivity;
import com.trustdockekyc.core.backend.domain.model.AppError;
import com.youTransactor.uCube.AbstractTask;
import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.api.UCubeLibRpcSendListener;
import com.youTransactor.uCube.rpc.RPCCommand;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Charsets;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.serialization.json.Json;
import mx0.r3;
import mx0.s3;
import pej.f;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements et0.b0, od0.f, r3, CallbackToFutureAdapter.Resolver, TextRangeScopeMeasurePolicy, ActivityResultCallback, ITaskCancelListener, ListenerSet.Event, ObservableTransformer, yil.a, ITaskMonitor, fgm.j, efm.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f187969c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f187967a = i;
        this.f187968b = obj2;
        this.f187969c = obj3;
    }

    @Override // mx0.r3
    public void a(int i, int i2) {
        ChatInputLayoutView chatInputLayoutView = (ChatInputLayoutView) this.f187968b;
        s3 s3Var = (s3) this.f187969c;
        if (chatInputLayoutView.f58434l == i2 && chatInputLayoutView.f58435m == i) {
            return;
        }
        chatInputLayoutView.f58434l = i2;
        chatInputLayoutView.f58435m = i;
        s3Var.invoke();
    }

    @Override // od0.f
    public void accept(Object obj2) {
        LoginActivity.g1((LoginActivity) this.f187968b, (sab.b) this.f187969c, (nwl.l) obj2);
    }

    @Override // efm.x
    public efm.w apply(efm.r observable) {
        r38.l lVar = (r38.l) this.f187968b;
        AccountId.Joint joint = (AccountId.Joint) this.f187969c;
        Intrinsics.checkNotNullParameter(observable, "observable");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        lfm.e eVar = lfm.e.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(eVar, "disposed(...)");
        ref$ObjectRef.f186409a = eVar;
        return observable.doOnSubscribe(new r25.c(16, new qz9.o(ref$ObjectRef, 4, lVar, joint))).doFinally(new r38.c(ref$ObjectRef, 0));
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f187967a) {
            case 3:
                return CoroutineAdaptersKt.asListenableFuture$lambda$0((Job) this.f187968b, this.f187969c, completer);
            case 20:
                return ExtensionsManager.Companion.getInstanceAsync$lambda$0$1((Context) this.f187968b, (CameraProvider) this.f187969c, completer);
            case 26:
                return ((RxWorker) this.f187968b).lambda$convert$0((efm.d0) this.f187969c, completer);
            default:
                return WorkerKt.future$lambda$2((Executor) this.f187968b, (Function0) this.f187969c, completer);
        }
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public ObservableSource b(Observable uiEvents) {
        Observable observableJust;
        Observable observableJust2;
        switch (this.f187967a) {
            case 17:
                nl.c0 this$0 = (nl.c0) this.f187968b;
                sl.p task = (sl.p) this.f187969c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(task, "$task");
                Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
                this$0.getClass();
                if (task.f264059c) {
                    ogm.e eVar = new ogm.e(new nl.v(this$0, 2), 2);
                    Observable observableCast = uiEvents.filter(nl.b.f216885s).cast(ml.c0.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
                    observableJust = eVar.d(observableCast).map(nl.b.f216886t);
                    Intrinsics.h(observableJust);
                } else {
                    observableJust = Observable.just(Unit.f186387a);
                    Intrinsics.h(observableJust);
                }
                return observableJust.switchMap(new kbb.c(this$0, 9, uiEvents, task)).switchMap(new jt0.b(this$0, 11, task, uiEvents));
            default:
                nl.q0 this$02 = (nl.q0) this.f187968b;
                sl.q workflowTask = (sl.q) this.f187969c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(workflowTask, "$workflowTask");
                Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
                this$02.getClass();
                if (workflowTask.f264062c) {
                    ogm.e eVar2 = new ogm.e(new nl.h0(this$02, 1), 2);
                    Observable observableCast2 = uiEvents.filter(nl.b.E).cast(ml.a0.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
                    observableJust2 = eVar2.d(observableCast2).map(nl.p0.f216934b);
                    Intrinsics.h(observableJust2);
                } else {
                    observableJust2 = Observable.just(Unit.f186387a);
                    Intrinsics.h(observableJust2);
                }
                return observableJust2.switchMap(new kbb.c(this$02, 10, uiEvents, workflowTask)).switchMap(new jt0.b(this$02, 12, uiEvents, workflowTask));
        }
    }

    public void c(pej.f fVar) {
        ProducerScope producerScope = (ProducerScope) this.f187968b;
        qej.e eVar = (qej.e) this.f187969c;
        com.bumptech.glide.c.E(producerScope, fVar);
        eVar.getClass();
        if ((fVar instanceof f.a) || (fVar instanceof pej.g)) {
            return;
        }
        if (!(fVar instanceof pej.e) && !(fVar instanceof pej.h) && !(fVar instanceof pej.d)) {
            throw new NoWhenBranchMatchedException();
        }
        producerScope.close(null);
    }

    @Override // fgm.j
    public void f(sgm.c1 emitter) throws IOException {
        switch (this.f187967a) {
            case 24:
                ol.c this$0 = (ol.c) this.f187968b;
                String customerUserHash = (String) this.f187969c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(customerUserHash, "$customerUserHash");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this$0.f226264c = new ol.b(this$0, customerUserHash, new Messenger(new ht0.c(emitter, Looper.getMainLooper())));
                Context context = this$0.f226262a;
                Intent intent = new Intent(context, (Class<?>) BiometricTokenRetrievalService.class);
                ol.b bVar = this$0.f226264c;
                if (bVar != null) {
                    context.bindService(intent, bVar, 1);
                    return;
                } else {
                    Intrinsics.r("tokenRetrievalServiceConnection");
                    throw null;
                }
            default:
                ol.e this$02 = (ol.e) this.f187968b;
                String customerUserHash2 = (String) this.f187969c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(customerUserHash2, "$customerUserHash");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                File file = new File(this$02.f226265a.getFilesDir(), "ebt_storage.json");
                if (file.exists()) {
                    Json json = this$02.f226266b;
                    String str = (String) ((Map) json.b(jh.d.v(json.f187949b, kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class)))), lim.m.f(file, Charsets.UTF_8))).get(customerUserHash2);
                    if (str != null) {
                        emitter.onNext(str);
                    } else {
                        emitter.b(new NoSuchElementException("No biometric token found for the given user hash in internal storage"));
                    }
                } else {
                    emitter.b(new FileNotFoundException("Internal biometric token storage file not found"));
                }
                emitter.onComplete();
                return;
        }
    }

    @Override // yil.a
    public String generate() {
        switch (this.f187967a) {
            case 19:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f187968b;
                com.revolut.feature.wealth_protection.sso.impl.ui.a aVar = (com.revolut.feature.wealth_protection.sso.impl.ui.a) this.f187969c;
                String strB = aVar.u.b();
                ref$ObjectRef.f186409a = strB;
                xjl.i iVar = aVar.u;
                if (strB != null) {
                    return iVar.a(strB);
                }
                Intrinsics.r("codeVerifier");
                throw null;
            case 20:
            case 21:
            default:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f187968b;
                com.revolut.feature.onboarding.impl.qes_terms.h hVar = (com.revolut.feature.onboarding.impl.qes_terms.h) this.f187969c;
                String strB2 = hVar.v.b();
                ref$ObjectRef2.f186409a = strB2;
                xjl.i iVar2 = hVar.v;
                if (strB2 != null) {
                    return iVar2.a(strB2);
                }
                Intrinsics.r("codeVerifier");
                throw null;
            case 22:
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.f187968b;
                o8c.j jVar = (o8c.j) this.f187969c;
                String strB3 = jVar.o.b();
                ref$ObjectRef3.f186409a = strB3;
                xjl.i iVar3 = jVar.o;
                if (strB3 != null) {
                    return iVar3.a(strB3);
                }
                Intrinsics.r("codeVerifier");
                throw null;
        }
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        UCubeAPI.a((UCubeLibRpcSendListener) this.f187968b, (RPCCommand) this.f187969c, taskEvent, objArr);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        switch (this.f187967a) {
            case 7:
                ((AnalyticsListener) obj2).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.f187968b, (PlaybackParameters) this.f187969c);
                break;
            case 8:
                ((AnalyticsListener) obj2).onMetadata((AnalyticsListener.EventTime) this.f187968b, (Metadata) this.f187969c);
                break;
            case 9:
                ((AnalyticsListener) obj2).onCues((AnalyticsListener.EventTime) this.f187968b, (List<Cue>) this.f187969c);
                break;
            case 10:
                ((AnalyticsListener) obj2).onCues((AnalyticsListener.EventTime) this.f187968b, (CueGroup) this.f187969c);
                break;
            case 11:
                ((AnalyticsListener) obj2).onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.f187968b, (TrackSelectionParameters) this.f187969c);
                break;
            case 12:
                ((AnalyticsListener) obj2).onMediaMetadataChanged((AnalyticsListener.EventTime) this.f187968b, (MediaMetadata) this.f187969c);
                break;
            case 13:
                ((AnalyticsListener) obj2).onDeviceInfoChanged((AnalyticsListener.EventTime) this.f187968b, (DeviceInfo) this.f187969c);
                break;
            case 14:
                ((AnalyticsListener) obj2).onUpstreamDiscarded((AnalyticsListener.EventTime) this.f187968b, (MediaLoadData) this.f187969c);
                break;
            case 15:
                DefaultAnalyticsCollector.lambda$onDrmKeysLoaded$65((AnalyticsListener.EventTime) this.f187968b, (KeyRequestInfo) this.f187969c, (AnalyticsListener) obj2);
                break;
            default:
                ((AnalyticsListener) obj2).onAudioAttributesChanged((AnalyticsListener.EventTime) this.f187968b, (AudioAttributes) this.f187969c);
                break;
        }
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) {
        AppError canceled;
        Object serializableExtra;
        n2m.i this$0 = (n2m.i) this.f187968b;
        ComponentActivity activity = (ComponentActivity) this.f187969c;
        ActivityResult result = (ActivityResult) obj2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(result, "result");
        String message = "registerForActivityResult: resCode=" + result.getResultCode() + ", data=" + result.getData();
        Intrinsics.checkNotNullParameter(message, "message");
        u1m.f0 f0Var = u1m.f0.VERBOSE;
        Intent data = result.getData();
        if (data != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = data.getSerializableExtra("error", AppError.class);
            } else {
                Object serializableExtra2 = data.getSerializableExtra("error");
                if (!(serializableExtra2 instanceof AppError)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (AppError) serializableExtra2;
            }
            canceled = (AppError) serializableExtra;
        } else {
            canceled = null;
        }
        if (canceled == null && result.getResultCode() == 0) {
            canceled = new AppError.Canceled(null);
        }
        eki.f fVar = this$0.f211602a;
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        fVar.invoke(applicationContext, canceled, data);
    }

    @Override // com.youTransactor.uCube.ITaskCancelListener
    public void onCancelFinish(boolean z) {
        ((AbstractTask) this.f187968b).a((ITaskCancelListener) this.f187969c, z);
    }
}
