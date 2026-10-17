package com.fourthline.vision.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.compose.DocumentScannerComposableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class wg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DocumentScannerConfig f37079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f37080c;
    public final /* synthetic */ Flow d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37081g;

    public /* synthetic */ wg(DocumentScannerConfig documentScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, int i2) {
        this.f37078a = i2;
        this.f37079b = documentScannerConfig;
        this.f37080c = function0;
        this.d = flow;
        this.e = function1;
        this.f = function2;
        this.f37081g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f37078a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return i5.CameraXDocumentScanner$lambda$10(this.f37079b, this.f37080c, this.d, this.e, this.f, this.f37081g, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return j5.LegacyDocumentScanner$lambda$6(this.f37079b, this.f37080c, this.d, this.e, this.f, this.f37081g, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return DocumentScannerComposableKt.DocumentScanner$lambda$0(this.f37079b, this.f37080c, this.d, this.e, this.f, this.f37081g, (Composer) obj2, iIntValue3);
        }
    }
}
