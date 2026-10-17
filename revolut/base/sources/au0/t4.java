package au0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final class t4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9374c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t4(Object obj2, Function0 function0, int i) {
        this.f9372a = i;
        this.d = obj2;
        this.f9374c = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        switch (this.f9372a) {
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f9373b = true;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f9373b = true;
                break;
            default:
                super.onAnimationCancel(animation);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation, boolean z) {
        switch (this.f9372a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f9373b) {
                    ((FrameLayout) this.f9374c).setVisibility(8);
                    ShopsMapViewScreen shopsMapViewScreen = (ShopsMapViewScreen) this.d;
                    KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                    shopsMapViewScreen.d3().f305863h.setTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                break;
            default:
                super.onAnimationEnd(animation, z);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        int i = this.f9372a;
        Object obj2 = this.f9374c;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function0) obj2).invoke();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f9373b) {
                    ((FrameLayout) obj2).setVisibility(0);
                    ShopsMapViewScreen shopsMapViewScreen = (ShopsMapViewScreen) this.d;
                    KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                    shopsMapViewScreen.d3().f305863h.setTitle(new TextLocalisedClause(R$string.shops_screens_map_in_store_title, null, null, 14));
                }
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }

    public /* synthetic */ t4(boolean z, Object obj2, Object obj3, int i) {
        this.f9372a = i;
        this.f9373b = z;
        this.f9374c = obj2;
        this.d = obj3;
    }

    public t4(Function0 function0, Function1 function1, boolean z) {
        this.f9372a = 0;
        this.f9374c = function0;
        this.d = function1;
        this.f9373b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f9372a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function1) this.d).invoke(Boolean.valueOf(this.f9373b));
                return;
            case 1:
            default:
                super.onAnimationEnd(animation);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f9373b) {
                    return;
                }
                mt0.v vVar = (mt0.v) this.f9374c;
                mt0.t tVar = (mt0.t) this.d;
                View view = vVar.f208734b;
                if (tVar.f208729b) {
                    view.setVisibility(4);
                    return;
                }
                int i = mt0.u.f208732b[vVar.e.ordinal()];
                if (i == 1) {
                    view.setVisibility(4);
                    return;
                } else {
                    if (i == 2) {
                        vVar.f208742p.b(8, "SCROLL_CONTAINER_VISIBILITY_TOKEN");
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f9373b) {
                    return;
                }
                ((ViewGroup) this.d).setVisibility(4);
                ((Function0) this.f9374c).invoke();
                return;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                yt0.o oVar = (yt0.o) this.d;
                if (oVar.f316581m == animation) {
                    oVar.f316581m = null;
                }
                if (this.f9373b) {
                    return;
                }
                ((Function0) this.f9374c).invoke();
                return;
        }
    }
}
