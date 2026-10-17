package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;

/* JADX INFO: loaded from: classes23.dex */
public abstract class l4 implements e4m.e {
    public static g9 a(o3 o3Var, MotionDataCollector motionDataCollector, TimestampProvider timestampProvider, h9 h9Var, la laVar) {
        g9 g9VarProvideMotionDataManager = o3Var.provideMotionDataManager(motionDataCollector, timestampProvider, h9Var, laVar);
        vc.s.k(g9VarProvideMotionDataManager);
        return g9VarProvideMotionDataManager;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
