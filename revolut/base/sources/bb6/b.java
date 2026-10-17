package bb6;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import ix0.u1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14171b;

    public /* synthetic */ b(View view, int i) {
        this.f14170a = i;
        this.f14171b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14170a;
        View view = this.f14171b;
        switch (i) {
            case 0:
                Object systemService = view.getContext().getSystemService("input_method");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(view, 1);
                break;
            case 1:
                view.requestLayout();
                break;
            case 2:
                ViewUtils.requestFocusAndShowKeyboard(view, false);
                break;
            case 3:
                AccelerateInterpolator accelerateInterpolator = u1.f169315a;
                view.setVisibility(0);
                break;
            case 4:
                AccelerateInterpolator accelerateInterpolator2 = u1.f169315a;
                view.setVisibility(8);
                break;
            case 5:
                kli.c.f(view);
                break;
            case 6:
                view.setVisibility(8);
                break;
            case 7:
                view.setVisibility(8);
                break;
            default:
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                view.setVisibility(0);
                break;
        }
    }
}
