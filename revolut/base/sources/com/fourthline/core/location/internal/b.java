package com.fourthline.core.location.internal;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Size;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.content.NavGraphBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.fourthline.kyc.Profession;
import com.fourthline.kyc.internal.g;
import com.fourthline.orca.internal.b0;
import com.fourthline.orca.internal.bj0;
import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.f0;
import com.fourthline.orca.internal.g0;
import com.fourthline.orca.internal.g50;
import com.fourthline.orca.internal.i5;
import com.fourthline.orca.internal.l2;
import com.fourthline.orca.internal.lo;
import com.fourthline.orca.internal.mh0;
import com.fourthline.orca.internal.p3;
import com.fourthline.orca.internal.pr0;
import com.fourthline.orca.internal.s80;
import com.fourthline.orca.internal.t3;
import com.fourthline.orca.internal.yo;
import com.fourthline.orca.internal.z21;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.internal.d3;
import com.fourthline.vision.internal.i0;
import com.fourthline.vision.internal.i8;
import com.fourthline.vision.internal.l0;
import com.fourthline.vision.internal.rd;
import com.fourthline.vision.internal.u;
import com.fourthline.vision.internal.wf;
import com.fourthline.vision.internal.xf;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26444c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, int i, Object obj3, Object obj4) {
        this.f26442a = i;
        this.f26443b = obj2;
        this.f26444c = obj3;
        this.d = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f26442a) {
            case 0:
                return LocationFetcherImpl.a((FusedLocationProviderClient) this.f26443b, (LocationFetcherImpl) this.f26444c, (SoftReference) this.d, (LocationAvailability) obj2);
            case 1:
                return g0.a((g0) this.f26443b, (b0) this.f26444c, (String) this.d, (f0) obj2);
            case 2:
                return g50.a((Integer) this.f26443b, (Float) this.f26444c, (Float) this.d, (c21) obj2);
            case 3:
                return l2.a((Function1) this.f26443b, (MutableState) this.f26444c, (MutableState) this.d, (TextLayoutResult) obj2);
            case 4:
                return pr0.a((AnnotatedString) this.f26443b, (List) this.f26444c, (Function1) this.d, ((Integer) obj2).intValue());
            case 5:
                return s80.a((mh0) this.f26443b, (bj0) this.f26444c, (MutableState) this.d, (NavGraphBuilder) obj2);
            case 6:
                return t3.a((t3) this.f26443b, (String) this.f26444c, (i5) this.d, (p3) obj2);
            case 7:
                return yo.a((yo) this.f26443b, (DocumentScannerStep) this.f26444c, (DocumentScannerStepWarning) this.d, (lo) obj2);
            case 8:
                return z21.a((Function1) this.f26443b, (SoftwareKeyboardController) this.f26444c, (MutableState) this.d, (KeyboardActionScope) obj2);
            case 9:
                return i0.CameraPreviewContent$lambda$1$0((u) this.f26443b, (LifecycleOwner) this.f26444c, (Function1) this.d, (Context) obj2);
            case 10:
                return com.fourthline.vision.internal.i5.CameraXDocumentScanner$lambda$8$0((DocumentScannerConfig) this.f26443b, (rd) this.f26444c, (d3) this.d, (l0) obj2);
            case 11:
                return i8.configureAndCreateSurface$lambda$1$1((i8) this.f26443b, (Size) this.f26444c, (MediaCodec) this.d, (Throwable) obj2);
            case 12:
                return wf.CameraPreview$lambda$1$0((i8) this.f26443b, (WeakReference) this.f26444c, (xf) this.d, (Context) obj2);
            default:
                return g.a((Profession) this.f26443b, (Profession) this.f26444c, (g) this.d, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
