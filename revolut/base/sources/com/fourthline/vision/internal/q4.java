package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public abstract class q4 implements e4m.e {
    public static ja a(o3 o3Var, o8 o8Var, g9 g9Var, h5 h5Var, wd wdVar, TimestampProvider timestampProvider, LocationProvider locationProvider, a9 a9Var, be beVar, CoroutineContext coroutineContext) {
        ja jaVarProvideScanner$fourthline_vision_release = o3Var.provideScanner$fourthline_vision_release(o8Var, g9Var, h5Var, wdVar, timestampProvider, locationProvider, a9Var, beVar, coroutineContext);
        vc.s.k(jaVarProvideScanner$fourthline_vision_release);
        return jaVarProvideScanner$fourthline_vision_release;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
