package com.fourthline.vision.internal;

import android.hardware.SensorManager;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class fd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36204c;

    private fd(ed edVar, e4m.e eVar, e4m.e eVar2) {
        this.f36202a = edVar;
        this.f36203b = eVar;
        this.f36204c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a get() {
        return a(this.f36202a, (CoroutineContext) this.f36203b.get(), (SensorManager) this.f36204c.get());
    }

    public static fd a(ed edVar, e4m.e eVar, e4m.e eVar2) {
        return new fd(edVar, eVar, eVar2);
    }

    public static a a(ed edVar, CoroutineContext coroutineContext, SensorManager sensorManager) {
        a aVarProvideAccelerometerFlow = edVar.provideAccelerometerFlow(coroutineContext, sensorManager);
        vc.s.k(aVarProvideAccelerometerFlow);
        return aVarProvideAccelerometerFlow;
    }
}
