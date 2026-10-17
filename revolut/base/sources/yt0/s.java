package yt0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f316592a;

    public s(v vVar) {
        this.f316592a = vVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onSlide(View bottomSheet, float f) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f316592a.r(f);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void onStateChanged(View bottomSheet, int i) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        v vVar = this.f316592a;
        if (i == 3) {
            lki.s sVar = vVar.d;
            if (sVar != null) {
                vVar.d = null;
                sVar.invoke();
            }
            vVar.r(1.0f);
            return;
        }
        if (i != 5) {
            return;
        }
        vVar.r(-1.0f);
        mhd.b bVar = vVar.f316596c;
        if (bVar != null) {
            bVar.invoke();
            vVar.f316596c = null;
        } else {
            Function0<Unit> onDismiss$ui_kit_components_release = vVar.f316594a.getOnDismiss$ui_kit_components_release();
            if (onDismiss$ui_kit_components_release != null) {
                onDismiss$ui_kit_components_release.invoke();
            }
        }
    }
}
