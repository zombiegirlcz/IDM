package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionDataCollector;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g1 implements e4m.e {
    public static MotionDataCollector a(s0 s0Var, CoroutineContext coroutineContext, la laVar) {
        MotionDataCollector motionDataCollectorProvideMotionDataCollector = s0Var.provideMotionDataCollector(coroutineContext, laVar);
        vc.s.k(motionDataCollectorProvideMotionDataCollector);
        return motionDataCollectorProvideMotionDataCollector;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
