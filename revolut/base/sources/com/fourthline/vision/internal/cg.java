package com.fourthline.vision.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class cg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieScannerConfig f36081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f36082c;
    public final /* synthetic */ Flow d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f36083g;

    public /* synthetic */ cg(SelfieScannerConfig selfieScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, int i2) {
        this.f36080a = i2;
        this.f36081b = selfieScannerConfig;
        this.f36082c = function0;
        this.d = flow;
        this.e = function1;
        this.f = function2;
        this.f36083g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f36080a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return a8.LegacySelfieScanner$lambda$5(this.f36081b, this.f36082c, this.d, this.e, this.f, this.f36083g, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return oc.CameraXSelfieScanner$lambda$7(this.f36081b, this.f36082c, this.d, this.e, this.f, this.f36083g, (Composer) obj2, iIntValue2);
        }
    }
}
