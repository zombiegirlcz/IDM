package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public abstract class tb implements e4m.e {
    public static ja a(bb bbVar, o8 o8Var, g9 g9Var, nc ncVar, wd wdVar, TimestampProvider timestampProvider, LocationProvider locationProvider, a9 a9Var, be beVar, CoroutineContext coroutineContext) {
        ja jaVarProvideScanner = bbVar.provideScanner(o8Var, g9Var, ncVar, wdVar, timestampProvider, locationProvider, a9Var, beVar, coroutineContext);
        vc.s.k(jaVarProvideScanner);
        return jaVarProvideScanner;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
