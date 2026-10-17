package com.fourthline.vision.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.internal.rd;
import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rc implements rd, g6, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f36785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f36787c;
    private final SelfieScannerConfig d;
    private final Function1 e;
    private final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x1 f36788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g9 f36789h;
    private final TimestampProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LocationProvider f36790j;
    private final u7 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ad f36791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final le f36792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ba f36793n;
    private rd.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r7 f36794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f36795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Pair f36796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Job f36797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Job f36798t;
    private final MutableState u;
    private long v;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LivenessCheckType.values().length];
            try {
                iArr[LivenessCheckType.HEAD_TURN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivenessCheckType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[r7.values().length];
            try {
                iArr2[r7.f36756a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[r7.f36757b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r7.f36758c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[r7.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36801c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f36802g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f36803h;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            b bVar = rc.this.new b(continuation);
            bVar.f36803h = obj2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x017f  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 475
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.rc.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36805b;
        final /* synthetic */ fa d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fa faVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = faVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return rc.this.new c(this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            rc rcVar;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36805b;
            try {
                if (i == 0) {
                    yhm.o.b(obj2);
                    rc rcVar2 = rc.this;
                    u uVar = rcVar2.f;
                    this.f36804a = rcVar2;
                    this.f36805b = 1;
                    Object objTakePicture = uVar.takePicture(this);
                    if (objTakePicture == aVar) {
                        return aVar;
                    }
                    rcVar = rcVar2;
                    obj2 = objTakePicture;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rcVar = (rc) this.f36804a;
                    yhm.o.b(obj2);
                }
                rcVar.f36796r = new Pair(obj2, this.d);
                rc.this.startRecording();
                if (rc.this.isRandomnessLivenessEnabled()) {
                    rc.this.proceedToRandomnessLiveness();
                } else {
                    rc.this.proceedNextStep();
                }
            } catch (Exception e) {
                rc.this.fail(SelfieScannerError.UNKNOWN, e);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36807a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return rc.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36807a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36807a = 1;
                if (skm.k0.b(60000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            rc.this.onTimeout();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36809a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return rc.this.new e(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36809a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36809a = 1;
                if (skm.k0.b(30000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            rc.this.onTimeout();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class f extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36811a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return rc.this.new f(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36811a;
            if (i == 0) {
                yhm.o.b(obj2);
                x1 x1Var = rc.this.f36788g;
                x8 x8Var = new x8(rc.this.i.getCurrentTimestamp());
                this.f36811a = 1;
                if (x1Var.consume(x8Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class g extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36813a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return rc.this.new g(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36813a;
            if (i == 0) {
                yhm.o.b(obj2);
                g9 g9Var = rc.this.f36789h;
                this.f36813a = 1;
                if (g9Var.cancel(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class h extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36815a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return rc.this.new h(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36815a;
            if (i == 0) {
                yhm.o.b(obj2);
                x1 x1Var = rc.this.f36788g;
                y8 y8Var = new y8(rc.this.i.getCurrentTimestamp());
                this.f36815a = 1;
                if (x1Var.consume(y8Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public rc(@NotNull Function0<od> screenSize, @NotNull Function0<Rect> detectionArea, @NotNull SelfieScannerConfig config, @NotNull Function1<? super SelfieScannerEvent, Unit> callback, @NotNull u cameraEngine, @NotNull x1 metaDataConsumer, @NotNull g9 motionDataManager, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull u7 isSteadyProvider, @NotNull ad analytics, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(metaDataConsumer, "metaDataConsumer");
        Intrinsics.checkNotNullParameter(motionDataManager, "motionDataManager");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(isSteadyProvider, "isSteadyProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36785a = coroutineScope;
        this.f36786b = screenSize;
        this.f36787c = detectionArea;
        this.d = config;
        this.e = callback;
        this.f = cameraEngine;
        this.f36788g = metaDataConsumer;
        this.f36789h = motionDataManager;
        this.i = timestampProvider;
        this.f36790j = locationProvider;
        this.k = isSteadyProvider;
        this.f36791l = analytics;
        this.f36792m = new le(cameraEngine, config.getRecordingType(), this, new jh(this, 1), new ih(this, 3));
        this.f36793n = new ba(new jh(this, 2));
        this.o = rd.a.d.f36820a;
        this.f36794p = r7.f36756a;
        this.f36795q = zhm.f0.f322471a;
        this.u = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        start();
        isSteadyProvider.start();
        this.v = System.currentTimeMillis();
    }

    private final boolean areEyesOpen(mh.a aVar) {
        Float fC = aVar.c();
        Float fB = aVar.b();
        return fC != null && fB != null && fC.floatValue() >= 0.6f && fB.floatValue() >= 0.6f;
    }

    private final void cancelTimeouts() {
        Job job2 = this.f36797s;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.f36798t;
        if (job3 != null) {
            job3.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(SelfieScannerError selfieScannerError, Throwable th10) {
        rd.a state = getState();
        if (!(state instanceof rd.a.d) && !(state instanceof rd.a.C0336a)) {
            if (!(state instanceof rd.a.b) && !(state instanceof rd.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            setState(rd.a.c.f36819a);
            cancelTimeouts();
            this.e.invoke(new SelfieScannerEvent.OnFail(selfieScannerError));
            this.f36791l.onFail(this.f36794p.toPublicStep(), selfieScannerError, th10);
        }
    }

    public static /* synthetic */ void fail$default(rc rcVar, SelfieScannerError selfieScannerError, Throwable th10, int i, Object obj2) {
        if ((i & 2) != 0) {
            th10 = null;
        }
        rcVar.fail(selfieScannerError, th10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRandomnessLivenessEnabled() {
        return this.d.getInternalConfig().getRandomnessLiveness() != null;
    }

    private final void onAllStepsCompleted() {
        cancelTimeouts();
        this.k.stop();
        setState(rd.a.b.f36818a);
        skm.e0.C(this, null, null, new b(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFacesDetection$lambda$0(rc rcVar, HeadMetadata it8) {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        Intrinsics.checkNotNullParameter(it8, "it");
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = rcVar.d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved(it8));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFacesDetection$lambda$1(rc rcVar, int i) {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = rcVar.d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(i));
        }
        rcVar.resetStepTimeout();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFacesDetection$lambda$2(rc rcVar, int i) {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = rcVar.d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess(i));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFacesDetection$lambda$3(rc rcVar) {
        rcVar.onAllStepsCompleted();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeout() {
        fail$default(this, SelfieScannerError.TIMEOUT, null, 2, null);
        Job job2 = this.f36797s;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.f36798t;
        if (job3 != null) {
            job3.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedNextStep() {
        int iIndexOf = this.f36795q.indexOf(this.f36794p);
        if (iIndexOf >= this.f36795q.size() - 1) {
            onAllStepsCompleted();
            return;
        }
        this.f36794p = (r7) this.f36795q.get(iIndexOf + 1);
        setState(rd.a.C0336a.f36817a);
        resetStepTimeout();
        this.e.invoke(new SelfieScannerEvent.OnStepUpdate(this.f36794p.toPublicStep()));
        this.f36791l.onStepUpdate(this.f36794p.toPublicStep());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedToRandomnessLiveness() {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback2;
        resetStepTimeout();
        this.f36793n.start();
        ba baVar = this.f36793n;
        baVar.start();
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = this.d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback2 = randomnessLiveness.getCallback()) != null) {
            callback2.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate(baVar.getSteps().size()));
        }
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness2 = this.d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness2 != null && (callback = randomnessLiveness2.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(((Number) zhm.d0.b0(baVar.getSteps())).intValue()));
        }
        this.f36794p = r7.d;
        setState(rd.a.C0336a.f36817a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List randomnessLivenessSteps$lambda$0(rc rcVar) {
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = rcVar.d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null) {
            return randomnessLiveness.getSessionRandomnessLivenessSteps();
        }
        return null;
    }

    private final void resetScannerTimeout() {
        Job job2 = this.f36797s;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36797s = skm.e0.C(this, null, null, new d(null), 3);
    }

    private final void resetStepTimeout() {
        Job job2 = this.f36798t;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36798t = skm.e0.C(this, null, null, new e(null), 3);
    }

    private final void resetSteps() {
        List listE0;
        cancelTimeouts();
        r7 r7Var = r7.f36756a;
        this.f36794p = r7Var;
        int i = a.$EnumSwitchMapping$0[this.d.getLivenessCheckType().ordinal()];
        if (i == 1) {
            List listK = zhm.v.k(r7.f36757b, r7.f36758c);
            long jCurrentTimeMillis = System.currentTimeMillis();
            listE0 = zhm.d0.E0(zhm.v.q(listK, new tim.d((int) jCurrentTimeMillis, (int) (jCurrentTimeMillis >> 32))), zhm.u.c(r7Var));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listE0 = zhm.u.c(r7Var);
        }
        this.f36795q = listE0;
    }

    private void setRecognizedBounds(fa faVar) {
        this.u.setValue(faVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startRecording() {
        skm.e0.C(this, null, null, new f(null), 3);
        this.f36792m.startRecording(me.f36580c, VideoDuration.DEFAULT.INSTANCE.getDuration());
        this.f36789h.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit videoRecorderManager$lambda$0(rc rcVar) throws Throwable {
        skm.e0.E(kotlin.coroutines.g.f186406a, rcVar.new h(null));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit videoRecorderManager$lambda$1(rc rcVar, me meVar) {
        Intrinsics.checkNotNullParameter(meVar, "<unused var>");
        fail$default(rcVar, SelfieScannerError.RECORDING_FAILED, null, 2, null);
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36785a.getF74819h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.vision.internal.rd
    public fa getRecognizedBounds() {
        return (fa) this.u.getValue();
    }

    @Override // com.fourthline.vision.internal.rd
    @NotNull
    public rd.a getState() {
        return this.o;
    }

    @Override // com.fourthline.vision.internal.rd
    public void moveToNextStep() {
        proceedNextStep();
    }

    @Override // com.fourthline.vision.internal.g6
    public void onFacesDetection(@NotNull List<? extends mh.a> faces) {
        Intrinsics.checkNotNullParameter(faces, "faces");
        rd.a state = getState();
        if (!(state instanceof rd.a.C0336a)) {
            if (!(state instanceof rd.a.d) && !(state instanceof rd.a.b) && !(state instanceof rd.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        faces.size();
        if (faces.size() > 1) {
            fail$default(this, SelfieScannerError.MULTIPLE_FACES_DETECTED, null, 2, null);
            return;
        }
        if (faces.isEmpty()) {
            if (this.f36794p == r7.f36756a) {
                this.e.invoke(new SelfieScannerEvent.OnWarnings(zhm.u.c(SelfieScannerWarning.FACE_NOT_DETECTED)));
                return;
            } else {
                if (System.currentTimeMillis() - this.v > 200) {
                    fail$default(this, SelfieScannerError.FACE_DISAPPEARED, null, 2, null);
                    return;
                }
                return;
            }
        }
        mh.a aVar = faces.get(0);
        Function1<fa, fa> boundingBoxToScreen = this.f.getCoordinates().getBoundingBoxToScreen();
        android.graphics.Rect rect = aVar.f205333a;
        float f4 = aVar.f205336g;
        Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
        fa faVar = (fa) boundingBoxToScreen.invoke(ga.toRectangle(rect));
        setRecognizedBounds(faVar);
        this.v = System.currentTimeMillis();
        int i = a.$EnumSwitchMapping$1[this.f36794p.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (f4 > 20.0f) {
                    proceedNextStep();
                    return;
                }
                return;
            } else if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f36793n.process(aVar, new ih(this, 0), new ih(this, 1), new ih(this, 2), new jh(this, 0));
                return;
            } else {
                if (f4 < -20.0f) {
                    proceedNextStep();
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!this.k.isSteady()) {
            arrayList.add(SelfieScannerWarning.DEVICE_NOT_STEADY);
        }
        if (f4 > 6.0f) {
            arrayList.add(SelfieScannerWarning.FACE_YAW_TOO_BIG);
        }
        if (!RectHelper_androidKt.toAndroidRect((Rect) this.f36787c.invoke()).contains(ga.toRect(faVar))) {
            arrayList.add(SelfieScannerWarning.FACE_NOT_IN_FRAME);
        }
        if (!arrayList.isEmpty()) {
            this.e.invoke(new SelfieScannerEvent.OnWarnings(arrayList));
            return;
        }
        cancelTimeouts();
        setState(rd.a.d.f36820a);
        skm.e0.C(this, null, null, new c(faVar, null), 3);
    }

    @Override // com.fourthline.vision.internal.g6
    public void onModelsMissing() {
        fail$default(this, SelfieScannerError.RECOGNITION_MODELS_NOT_DOWNLOADED, null, 2, null);
    }

    @Override // com.fourthline.vision.internal.rd
    public void resetCurrentStep() {
    }

    @Override // com.fourthline.vision.internal.rd
    public void restart() {
        this.f36791l.onReset();
        this.f36793n.reset();
        setState(rd.a.d.f36820a);
        cancelTimeouts();
        start();
    }

    public void setState(@NotNull rd.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.o = aVar;
    }

    @Override // com.fourthline.vision.internal.rd
    public void start() {
        resetScannerTimeout();
        resetSteps();
        setState(rd.a.C0336a.f36817a);
        this.f36791l.onStart();
        this.e.invoke(new SelfieScannerEvent.OnStepUpdate(this.f36794p.toPublicStep()));
        this.f36791l.onStepUpdate(this.f36794p.toPublicStep());
        resetStepTimeout();
    }

    @Override // com.fourthline.vision.internal.rd
    public void stop() {
        skm.e0.C(this, null, null, new g(null), 3);
        if (getState() instanceof rd.a.C0336a) {
            fail$default(this, SelfieScannerError.SCANNER_INTERRUPTED, null, 2, null);
        }
    }

    @Override // com.fourthline.vision.internal.rd
    public void takeSnapshot() {
    }
}
