package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.nfc.NfcAdapter;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.Lifecycle;
import androidx.view.ComponentActivity;
import com.fourthline.orca.internal.ab0;
import com.fourthline.orca.internal.gb1;
import com.fourthline.orca.internal.hi0;
import com.fourthline.orca.internal.jf0;
import com.fourthline.orca.internal.m21;
import com.fourthline.orca.internal.sq;
import com.fourthline.orca.internal.tr0;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class jn1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29976c;

    public /* synthetic */ jn1(Object obj2, Object obj3, int i) {
        this.f29974a = i;
        this.f29975b = obj2;
        this.f29976c = obj3;
    }

    private final Object a(Object obj2) {
        return jf0.a((ExoPlayer) this.f29975b, (jf0.g) this.f29976c, (DisposableEffectScope) obj2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f29974a) {
            case 0:
                return hi0.d.a.C0209a.a((Animatable) this.f29975b, (CoroutineScope) this.f29976c, (PointerInputChange) obj2);
            case 1:
                return a(obj2);
            case 2:
                return jh0.a((ih0) this.f29975b, (Function1) this.f29976c, (DisposableEffectScope) obj2);
            case 3:
                return m21.g.a((m21) this.f29975b, (SelfieScannerResult) this.f29976c, (c21) obj2);
            case 4:
                return a30.a((MutableState) this.f29975b, (MutableState) this.f29976c, (LayoutCoordinates) obj2);
            case 5:
                return ax0.a((String) this.f29975b, (ax0) this.f29976c, (rw0) obj2);
            case 6:
                return d91.a((za1) this.f29975b, (d91) this.f29976c, (v81) obj2);
            case 7:
                return dp.a((dp) this.f29975b, (DocumentScannerStepResult) this.f29976c, (lo) obj2);
            case 8:
                return ds0.a((Function1) this.f29975b, (tr0.a.InterfaceC0287a.C0288a) this.f29976c, ((Integer) obj2).intValue());
            case 9:
                return eo0.a((bo0) this.f29975b, (Function1) this.f29976c, (Bitmap) obj2);
            case 10:
                return gb.a((gb) this.f29975b, (fd) this.f29976c, (wb) obj2);
            case 11:
                return im.a((String) this.f29975b, (im) this.f29976c, (fm) obj2);
            case 12:
                return je0.a((ComponentActivity) this.f29975b, (NfcAdapter) this.f29976c, (Lifecycle.Event) obj2);
            case 13:
                return kr0.a((SolidColor) this.f29975b, (Rect) this.f29976c, (DrawScope) obj2);
            case 14:
                return m21.a((m21) this.f29975b, (SelfieScannerWarning) this.f29976c, (c21) obj2);
            case 15:
                return mb1.a((gb1.b) this.f29975b, (String) this.f29976c, (SemanticsPropertyReceiver) obj2);
            case 16:
                return mg0.a((State) this.f29975b, (State) this.f29976c, (DisposableEffectScope) obj2);
            case 17:
                return nb1.a(this.f29975b, (nb1) this.f29976c, (gb1) obj2);
            case 18:
                return rr.a((rr) this.f29975b, (fr) this.f29976c, (kr) obj2);
            case 19:
                return si0.a((ScrollState) this.f29975b, (wz0) this.f29976c, (ContentDrawScope) obj2);
            case 20:
                return t3.a((t3) this.f29975b, (q3) this.f29976c, (p3) obj2);
            case 21:
                return v40.a((String) this.f29975b, (ab0.a) this.f29976c, (kem.s) obj2);
            case 22:
                return v40.a((String) this.f29975b, (ab0.c) this.f29976c, (kem.s) obj2);
            case 23:
                return wv0.a((String) this.f29975b, (List) this.f29976c, (sv0) obj2);
            case 24:
                return xc0.a((String) this.f29975b, (xc0) this.f29976c, (vc0) obj2);
            case 25:
                return y2.a((k20) this.f29975b, (y2) this.f29976c, (s2) obj2);
            default:
                return yq.a((sq.a) this.f29975b, (String) this.f29976c, (SemanticsPropertyReceiver) obj2);
        }
    }
}
