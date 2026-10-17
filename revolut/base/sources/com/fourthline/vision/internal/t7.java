package com.fourthline.vision.internal;

import com.fourthline.core.internal.AndroidDevicesKt;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class t7 implements d2, CoroutineScope, pd, u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Flow f36939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Flow f36940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f36941c;
    private final float d;
    private final float e;
    private final CoroutineContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f36942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f36943h;
    private Job i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Job f36944j;
    private volatile long k;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36945a;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.t7$a$a, reason: collision with other inner class name */
        public static final class C0337a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t7 f36947a;

            public C0337a(t7 t7Var) {
                this.f36947a = t7Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((float[]) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(float[] fArr, Continuation<? super Unit> continuation) {
                t7 t7Var = this.f36947a;
                if (t7Var.getVector(t7Var.normalise(fArr)) > this.f36947a.e) {
                    this.f36947a.k = System.currentTimeMillis();
                }
                return Unit.f186387a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return t7.this.new a(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36945a;
            if (i == 0) {
                yhm.o.b(obj2);
                String unused = t7.this.f36942g;
                Flow flow = t7.this.f36940b;
                C0337a c0337a = new C0337a(t7.this);
                this.f36945a = 1;
                if (flow.collect(c0337a, this) == aVar) {
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
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36948a;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t7 f36950a;

            public a(t7 t7Var) {
                this.f36950a = t7Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((float[]) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(float[] fArr, Continuation<? super Unit> continuation) {
                if (this.f36950a.getVector(fArr) > this.f36950a.d) {
                    this.f36950a.k = System.currentTimeMillis();
                }
                return Unit.f186387a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return t7.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36948a;
            if (i == 0) {
                yhm.o.b(obj2);
                String unused = t7.this.f36942g;
                Flow flow = t7.this.f36939a;
                a aVar2 = new a(t7.this);
                this.f36948a = 1;
                if (flow.collect(aVar2, this) == aVar) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public t7(@NotNull Flow gyroscopeFlow, @NotNull Flow accelerometerFlow, long j2, float f, float f4, @NotNull CoroutineContext coroutineContext) {
        String simpleName;
        Intrinsics.checkNotNullParameter(gyroscopeFlow, "gyroscopeFlow");
        Intrinsics.checkNotNullParameter(accelerometerFlow, "accelerometerFlow");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f36939a = gyroscopeFlow;
        this.f36940b = accelerometerFlow;
        this.f36941c = j2;
        this.d = f;
        this.e = f4;
        this.f = coroutineContext;
        if (getClass().isAnonymousClass()) {
            simpleName = getClass().getName();
            if (simpleName.length() > 23) {
                simpleName = simpleName.substring(simpleName.length() - 23, simpleName.length());
                Intrinsics.checkNotNullExpressionValue(simpleName, "substring(...)");
            }
        } else {
            simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                simpleName = simpleName.substring(0, 23);
                Intrinsics.checkNotNullExpressionValue(simpleName, "substring(...)");
            }
        }
        this.f36942g = simpleName;
        this.f36943h = 3;
        this.k = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getVector(float[] fArr) {
        return Math.hypot(Math.hypot(getX(fArr), getY(fArr)), getZ(fArr));
    }

    private final float getX(float[] fArr) {
        return fArr[0];
    }

    private final float getY(float[] fArr) {
        return fArr[1];
    }

    private final float getZ(float[] fArr) {
        return fArr[2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float[] normalise(float[] fArr) {
        if (Math.abs(getY(fArr)) > this.f36943h && Math.abs(getZ(fArr)) > this.f36943h) {
            ib.h hVar = hb.a.f150532a;
            Map attributes = zhm.q0.c(new Pair("value", stringify(fArr)));
            Intrinsics.checkNotNullParameter("vision_unusual_accelerometer", "message");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            HashSet hashSet = hb.a.f150534c;
            if (!hashSet.contains("vision_unusual_accelerometer")) {
                hashSet.add("vision_unusual_accelerometer");
                Intrinsics.checkNotNullParameter("vision_unusual_accelerometer", "message");
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                hb.a.d(ib.e.INFO, "vision_unusual_accelerometer", attributes, null);
            }
        }
        if (!AndroidDevicesKt.isRealme8Device()) {
            return fArr;
        }
        float f = 10;
        return new float[]{getX(fArr) / f, getY(fArr) / f, getZ(fArr) / f};
    }

    private final String stringify(float[] fArr) {
        return "[x = " + getX(fArr) + ", y = " + getY(fArr) + ", z = " + getZ(fArr) + "]";
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f;
    }

    @Override // com.fourthline.vision.internal.u7
    public boolean isSteady() {
        return get().booleanValue();
    }

    @Override // com.fourthline.vision.internal.pd
    public void start() {
        Job job2 = this.i;
        if (job2 == null || !job2.d()) {
            this.i = skm.e0.C(this, null, null, new a(null), 3);
        }
        Job job3 = this.f36944j;
        if (job3 == null || !job3.d()) {
            this.f36944j = skm.e0.C(this, null, null, new b(null), 3);
        }
    }

    @Override // com.fourthline.vision.internal.pd
    public void stop() {
        Job job2 = this.i;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.f36944j;
        if (job3 != null) {
            job3.f(null);
        }
    }

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ void subscribe(Function2<? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super.subscribe(function2);
    }

    @Override // com.fourthline.vision.internal.d2
    @NotNull
    public Boolean get() {
        return Boolean.valueOf(System.currentTimeMillis() - this.k > this.f36941c);
    }

    public /* synthetic */ t7(Flow flow, Flow flow2, long j2, float f, float f4, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, flow2, (i & 4) != 0 ? 200L : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? 1.0f : f4, coroutineContext);
    }
}
