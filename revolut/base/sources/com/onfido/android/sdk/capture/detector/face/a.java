package com.onfido.android.sdk.capture.detector.face;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;
import fc.g;
import fgm.q;
import gpk.c;
import ix0.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import zb.j;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements q, CameraSource.ShutterCallback, hc.a, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49910c;

    public /* synthetic */ a(Object obj2, int i, Object obj3) {
        this.f49909b = obj2;
        this.f49908a = i;
        this.f49910c = obj3;
    }

    @Override // fgm.q
    public void c(tgm.a aVar) {
        FaceOnDocumentDetectorGoogle.detectWithDegree$lambda$3((DocumentDetectionFrame) this.f49909b, this.f49908a, (FaceOnDocumentDetectorGoogle) this.f49910c, aVar);
    }

    @Override // hc.a
    public Object execute() {
        g gVar = (g) this.f49909b;
        ((c) gVar.d).h((j) this.f49910c, this.f49908a + 1, false);
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        y0.b bVar = (y0.b) this.f49909b;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f49910c;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = insets.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (((Boolean) jo0.g.f176836t.getValue()).booleanValue()) {
            if (bVar != null) {
                bVar.f169323a = insets2.bottom;
            }
            ((RecyclerView) ref$ObjectRef.f186409a).invalidateItemDecorations();
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets2.bottom + this.f49908a);
        }
        Insets insetsOf = Insets.of(insets2.left, insets2.top, insets2.right, 0);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        return new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars, insetsOf).build();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.ShutterCallback
    public void onShutter() {
        ((CameraSource) this.f49909b).lambda$takePicture$0(this.f49908a, (CameraSource.ShutterCallback) this.f49910c);
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f49909b = obj2;
        this.f49910c = obj3;
        this.f49908a = i;
    }
}
