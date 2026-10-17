package yt0;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f316554a;

    public h0(i0 i0Var) {
        this.f316554a = i0Var;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View bottomSheet, float f) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f316554a.s(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f), null);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View bottomSheet, int i) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        i0 i0Var = this.f316554a;
        if (i == 3) {
            i0Var.s(1.0f, null);
            lki.s sVar = i0Var.d;
            if (sVar != null) {
                sVar.invoke();
            }
            i0Var.d = null;
            return;
        }
        if (i != 5) {
            return;
        }
        if (i0Var.f316563c == null) {
            Function0<Unit> onDismiss$ui_kit_components_release = i0Var.f316561a.getOnDismiss$ui_kit_components_release();
            if (onDismiss$ui_kit_components_release != null) {
                onDismiss$ui_kit_components_release.invoke();
                return;
            }
            return;
        }
        i0Var.s(BitmapDescriptorFactory.HUE_RED, null);
        mhd.b bVar = i0Var.f316563c;
        if (bVar != null) {
            bVar.invoke();
        }
        i0Var.f316563c = null;
    }
}
