package com.fourthline.vision.internal;

import android.hardware.SensorManager;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class hd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36333c;

    private hd(ed edVar, e4m.e eVar, e4m.e eVar2) {
        this.f36331a = edVar;
        this.f36332b = eVar;
        this.f36333c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y6 get() {
        return a(this.f36331a, (CoroutineContext) this.f36332b.get(), (SensorManager) this.f36333c.get());
    }

    public static hd a(ed edVar, e4m.e eVar, e4m.e eVar2) {
        return new hd(edVar, eVar, eVar2);
    }

    public static y6 a(ed edVar, CoroutineContext coroutineContext, SensorManager sensorManager) {
        y6 y6VarProvideGyroscopeFlow = edVar.provideGyroscopeFlow(coroutineContext, sensorManager);
        vc.s.k(y6VarProvideGyroscopeFlow);
        return y6VarProvideGyroscopeFlow;
    }
}
