package cr0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsControllerCompat;
import aw0.y9;
import com.revolut.core.ui_kit.delegates.BaseTextDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import ix0.x0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomExpandableDialogView f108165b;

    public /* synthetic */ d(BottomExpandableDialogView bottomExpandableDialogView, int i) {
        this.f108164a = i;
        this.f108165b = bottomExpandableDialogView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f108164a;
        BottomExpandableDialogView bottomExpandableDialogView = this.f108165b;
        switch (i) {
            case 0:
                WindowInsets insets = (WindowInsets) obj2;
                BottomExpandableDialogView.Companion companion = BottomExpandableDialogView.INSTANCE;
                Intrinsics.checkNotNullParameter(insets, "insets");
                boolean z = bottomExpandableDialogView.k;
                boolean zC = x0.c(insets);
                bottomExpandableDialogView.k = zC;
                if (z != zC) {
                    bottomExpandableDialogView.f55903j = false;
                }
                return Unit.f186387a;
            case 1:
                ty0.a aVar = (ty0.a) obj2;
                BaseTextDelegate baseTextDelegate = bottomExpandableDialogView.D;
                if (baseTextDelegate != null) {
                    Intrinsics.h(aVar);
                    baseTextDelegate.p(aVar);
                }
                bottomExpandableDialogView.S.onNext(aVar);
                return Unit.f186387a;
            default:
                h state = (h) obj2;
                BottomExpandableDialogView.Companion companion2 = BottomExpandableDialogView.INSTANCE;
                Intrinsics.checkNotNullParameter(state, "state");
                boolean z3 = !bottomExpandableDialogView.A.f55884g;
                h hVar = h.HIDDEN;
                boolean z4 = state != hVar;
                if (bottomExpandableDialogView.N != z4) {
                    bottomExpandableDialogView.N = z4;
                    View view = bottomExpandableDialogView.J;
                    if (view != null) {
                        BottomExpandableDialogView.q0(view, z4, z3);
                    }
                }
                boolean z6 = state != hVar;
                if (bottomExpandableDialogView.M != z6) {
                    bottomExpandableDialogView.M = z6;
                    View view2 = bottomExpandableDialogView.K;
                    if (view2 != null) {
                        BottomExpandableDialogView.q0(view2, z6, z3);
                    }
                }
                i iVar = state == h.EXPANDED ? i.LIGHT : i.INITIAL;
                Window window = bottomExpandableDialogView.P;
                if (iVar != bottomExpandableDialogView.f55908q && window != null) {
                    WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
                    if (bottomExpandableDialogView.f55908q == i.INITIAL) {
                        bottomExpandableDialogView.f55907p = Boolean.valueOf(windowInsetsControllerCompat.isAppearanceLightStatusBars());
                    }
                    bottomExpandableDialogView.f55908q = iVar;
                    Boolean bool = bottomExpandableDialogView.f55907p;
                    int i2 = com.revolut.core.ui_kit.internal.dialogs.d.f55926c[iVar.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y9.LIGHT.a(window);
                    } else if (bool != null) {
                        windowInsetsControllerCompat.setAppearanceLightStatusBars(bool.booleanValue());
                    }
                }
                return Unit.f186387a;
        }
    }
}
