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
public final class y6 extends r implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f37134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37135c;
    private final CoroutineContext d;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37136a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f37138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float[] fArr, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37138c = fArr;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return y6.this.new a(this.f37138c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f37136a;
            if (i == 0) {
                yhm.o.b(obj2);
                y6 y6Var = y6.this;
                float[] fArr = this.f37138c;
                Intrinsics.h(fArr);
                this.f37136a = 1;
                if (y6Var.emit(fArr, this) == aVar) {
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

    public y6(@NotNull SensorManager sensorManager, int i, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f37134b = sensorManager;
        this.f37135c = i;
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
            skm.e0.C(this, null, null, new a(sensorEvent.values, null), 3);
        }
    }

    @Override // com.fourthline.vision.internal.r
    public void onStart() {
        this.f37134b.registerListener(this, this.f37134b.getDefaultSensor(4), this.f37135c);
    }

    @Override // com.fourthline.vision.internal.r
    public void onStop() {
        this.f37134b.unregisterListener(this);
    }

    public /* synthetic */ y6(SensorManager sensorManager, int i, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sensorManager, (i2 & 2) != 0 ? 20 : i, coroutineContext);
    }
}
