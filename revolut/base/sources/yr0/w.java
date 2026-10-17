package yr0;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends EdgeTreatment {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f316101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f316102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f316103c;

    public w(View tooltipView, View parentView, boolean z) {
        Intrinsics.checkNotNullParameter(tooltipView, "tooltipView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.f316101a = tooltipView;
        this.f316102b = parentView;
        this.f316103c = z;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void getEdgePath(float f, float f4, float f5, ShapePath shapePath) {
        Intrinsics.checkNotNullParameter(shapePath, "shapePath");
        View view = this.f316101a;
        float fA = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 8.0f) * f5;
        int[] iArr = new int[2];
        View view2 = this.f316102b;
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        view.getLocationOnScreen(iArr);
        float f6 = 2;
        float width = ((view.getWidth() - f) / f6) + iArr[0];
        int width2 = (view2.getWidth() / 2) + i;
        float f32 = this.f316103c ? width2 - width : (f - width2) + width;
        float f35 = fA / f6;
        float f36 = kotlin.ranges.f.f(f32, f35, f - f35);
        shapePath.lineTo(f36 - fA, BitmapDescriptorFactory.HUE_RED);
        shapePath.lineTo(f36, -fA);
        shapePath.lineTo(f36 + fA, BitmapDescriptorFactory.HUE_RED);
        shapePath.lineTo(f, BitmapDescriptorFactory.HUE_RED);
    }
}
