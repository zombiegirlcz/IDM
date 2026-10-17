package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;

/* JADX INFO: loaded from: classes23.dex */
public abstract class nb implements e4m.e {
    public static g9 a(bb bbVar, MotionDataCollector motionDataCollector, TimestampProvider timestampProvider, h9 h9Var, la laVar) {
        g9 g9VarProvideMotionDataManager = bbVar.provideMotionDataManager(motionDataCollector, timestampProvider, h9Var, laVar);
        vc.s.k(g9VarProvideMotionDataManager);
        return g9VarProvideMotionDataManager;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
