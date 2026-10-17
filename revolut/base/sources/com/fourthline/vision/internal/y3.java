package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerCallback;

/* JADX INFO: loaded from: classes23.dex */
public abstract class y3 implements e4m.e {
    public static h5 a(o3 o3Var, DocumentScannerCallback documentScannerCallback, TimestampProvider timestampProvider, LocationProvider locationProvider, qa qaVar, qa qaVar2, ne neVar) {
        h5 h5VarProvideDocumentScannerCallbackProxy = o3Var.provideDocumentScannerCallbackProxy(documentScannerCallback, timestampProvider, locationProvider, qaVar, qaVar2, neVar);
        vc.s.k(h5VarProvideDocumentScannerCallbackProxy);
        return h5VarProvideDocumentScannerCallbackProxy;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
