package com.fourthline.vision.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends r implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f35927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35928c;
    private final CoroutineContext d;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.a$a, reason: collision with other inner class name */
    public static final class C0326a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35929a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f35931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0326a(float[] fArr, Continuation<? super C0326a> continuation) {
            super(2, continuation);
            this.f35931c = fArr;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return a.this.new C0326a(this.f35931c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f35929a;
            if (i == 0) {
                yhm.o.b(obj2);
                a aVar2 = a.this;
                float[] fArr = this.f35931c;
                Intrinsics.h(fArr);
                this.f35929a = 1;
                if (aVar2.emit(fArr, this) == aVar) {
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
            return ((C0326a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public a(@NotNull SensorManager sensorManager, int i, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f35927b = sensorManager;
        this.f35928c = i;
        this.d = coroutineContext;
    }

    @Override // com.fourthline.vision.internal.r, kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.d;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            skm.e0.C(this, null, null, new C0326a(sensorEvent.values, null), 3);
        }
    }

    @Override // com.fourthline.vision.internal.r
    public void onStart() {
        this.f35927b.registerListener(this, this.f35927b.getDefaultSensor(10), this.f35928c);
    }

    @Override // com.fourthline.vision.internal.r
    public void onStop() {
        this.f35927b.unregisterListener(this);
    }

    public /* synthetic */ a(SensorManager sensorManager, int i, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sensorManager, (i2 & 2) != 0 ? 20 : i, coroutineContext);
    }
}
