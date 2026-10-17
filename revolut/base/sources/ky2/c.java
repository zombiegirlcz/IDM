package ky2;

import e4m.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c implements e {
    public static b63.a a(e63.a factory, w53.b cardScannerNfcManager, ifm.b compositeDisposable) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(cardScannerNfcManager, "scanNfcManager");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(cardScannerNfcManager, "cardScannerNfcManager");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        return new b63.a(cardScannerNfcManager, factory.f122888a);
    }
}
