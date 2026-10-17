package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerConfig;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class do1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27835a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f27836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f27837c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ie1 e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27839h;

    public /* synthetic */ do1(ff0 ff0Var, NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig, NfcScannerCallback nfcScannerCallback, Flow flow, Function1 function1, int i) {
        this.e = ff0Var;
        this.f = nfcScannerConfig;
        this.f27838g = extraNfcScannerConfig;
        this.f27839h = nfcScannerCallback;
        this.f27836b = flow;
        this.f27837c = function1;
        this.d = i;
    }

    private final Object a(Object obj2, Object obj3) {
        int iIntValue = ((Integer) obj3).intValue();
        return jf0.a((ff0) this.e, (NfcScannerConfig) this.f, (ExtraNfcScannerConfig) this.f27838g, (NfcScannerCallback) this.f27839h, this.f27836b, this.f27837c, this.d, (Composer) obj2, iIntValue);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f27835a) {
            case 0:
                return a(obj2, obj3);
            default:
                int iIntValue = ((Integer) obj3).intValue();
                return xo.a((lo) this.e, this.f27836b, (DocumentScannerConfig) this.f, (Flow) this.f27838g, this.f27837c, (Function1) this.f27839h, this.d, (Composer) obj2, iIntValue);
        }
    }

    public /* synthetic */ do1(lo loVar, Flow flow, DocumentScannerConfig documentScannerConfig, Flow flow2, Function1 function1, Function1 function12, int i) {
        this.e = loVar;
        this.f27836b = flow;
        this.f = documentScannerConfig;
        this.f27838g = flow2;
        this.f27837c = function1;
        this.f27839h = function12;
        this.d = i;
    }
}
