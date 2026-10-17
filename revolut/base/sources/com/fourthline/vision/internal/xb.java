package com.fourthline.vision.internal;

import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.selfie.SelfieScannerCallback;

/* JADX INFO: loaded from: classes23.dex */
public abstract class xb implements e4m.e {
    public static nc a(bb bbVar, SelfieScannerCallback selfieScannerCallback, qa qaVar, ne neVar, LocationProvider locationProvider) {
        nc ncVarProvideSelfieScannerCallbackProxy = bbVar.provideSelfieScannerCallbackProxy(selfieScannerCallback, qaVar, neVar, locationProvider);
        vc.s.k(ncVarProvideSelfieScannerCallbackProxy);
        return ncVarProvideSelfieScannerCallbackProxy;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
