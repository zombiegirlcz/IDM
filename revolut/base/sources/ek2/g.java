package ek2;

import android.view.View;
import aw0.d0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetController;
import com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.AtmListScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;
import tx0.o2;
import uk2.v;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f126941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewController f126942c;

    public /* synthetic */ g(ViewController viewController, View view, int i) {
        this.f126940a = i;
        this.f126942c = viewController;
        this.f126941b = view;
    }

    public final void a(float f) {
        switch (this.f126940a) {
            case 0:
                AtmDetailsBottomSheetController atmDetailsBottomSheetController = (AtmDetailsBottomSheetController) this.f126942c;
                atmDetailsBottomSheetController.S = f;
                atmDetailsBottomSheetController.f3(f);
                Float f4 = atmDetailsBottomSheetController.T;
                if (f4 != null) {
                    float fFloatValue = f4.floatValue();
                    if (fFloatValue > BitmapDescriptorFactory.HUE_RED && fFloatValue < 1.0f) {
                        int iC = rim.d.c(270 * kotlin.ranges.f.f((f - fFloatValue) / (1.0f - fFloatValue), BitmapDescriptorFactory.HUE_RED, 1.0f)) + 830;
                        if (iC != atmDetailsBottomSheetController.U) {
                            atmDetailsBottomSheetController.U = iC;
                            atmDetailsBottomSheetController.d3().e.setHeightMode(new o2(new d0(1000, iC)));
                        }
                    }
                }
                a aVarE3 = atmDetailsBottomSheetController.e3();
                int[] iArr = atmDetailsBottomSheetController.R;
                int i = atmDetailsBottomSheetController.V;
                View view = this.f126941b;
                int iB = tk2.q.b(view, iArr, i);
                Object parent = view.getParent();
                Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
                int height = ((View) parent).getHeight();
                tk2.p pVar = ((com.revolut.feature.atm.impl.ui.redesign.details.a) aVarE3).f63170x;
                Integer numValueOf = Integer.valueOf(iB);
                Integer numValueOf2 = Integer.valueOf(height);
                j2 j2Var = pVar.f271852m;
                j2Var.getClass();
                j2Var.g(null, numValueOf);
                j2 j2Var2 = pVar.f271853n;
                j2Var2.getClass();
                j2Var2.g(null, numValueOf2);
                break;
            default:
                AtmListScreen atmListScreen = (AtmListScreen) this.f126942c;
                atmListScreen.O = f;
                atmListScreen.f3(f);
                v vVarE3 = atmListScreen.e3();
                int[] iArr2 = atmListScreen.N;
                int i2 = atmListScreen.Q;
                View view2 = this.f126941b;
                int iB2 = tk2.q.b(view2, iArr2, i2);
                Object parent2 = view2.getParent();
                Intrinsics.i(parent2, "null cannot be cast to non-null type android.view.View");
                vVarE3.I2(new uk2.e(iB2, ((View) parent2).getHeight()));
                break;
        }
    }
}
