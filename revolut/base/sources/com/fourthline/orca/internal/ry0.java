package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes23.dex */
public final class ry0 implements DeviceDataCollector, CoroutineScope {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f32864g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f32865h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f32866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MotionDataCollector f32867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StateFlow f32868c;
    private Job d;
    private boolean e;
    private boolean f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32869a;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ry0 f32871a;

            public a(ry0 ry0Var) {
                this.f32871a = ry0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ff ffVar, Continuation continuation) {
                boolean z = ffVar.getEnabled() && ffVar.getMotion().getEnabled();
                ffVar.getEnabled();
                ffVar.getMotion().getEnabled();
                if (z && !this.f32871a.f) {
                    this.f32871a.f32867b.startDataCollection();
                    this.f32871a.f = true;
                } else if (!z && this.f32871a.f) {
                    this.f32871a.f32867b.stop();
                    this.f32871a.f = false;
                }
                return Unit.f186387a;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return ry0.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f32869a;
            if (i == 0) {
                yhm.o.b(obj2);
                StateFlow stateFlow = ry0.this.f32868c;
                a aVar2 = new a(ry0.this);
                this.f32869a = 1;
                if (stateFlow.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            throw new KotlinNothingValueException();
        }
    }

    public ry0(MotionDataCollector delegate, StateFlow configFlow, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(configFlow, "configFlow");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f32866a = coroutineScope;
        this.f32867b = delegate;
        this.f32868c = configFlow;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f32866a.getF74819h();
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = skm.e0.C(this, null, null, new b(null), 3);
    }
}
