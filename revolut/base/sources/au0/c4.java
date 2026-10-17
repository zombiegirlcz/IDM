package au0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import com.revolut.recyclerkit.UIKitRecyclerView;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c4 implements View.OnLayoutChangeListener, ix0.a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9161c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c4(View view, Object obj2, View view2, Object obj3, int i) {
        this.f9159a = i;
        this.f9160b = view;
        this.f9161c = obj2;
        this.d = view2;
        this.e = obj3;
    }

    @Override // ix0.a2
    public final void cancel() {
        switch (this.f9159a) {
            case 0:
                ((ViewGroup) this.f9161c).removeOnLayoutChangeListener(this);
                break;
            case 1:
                ((View) this.f9160b).removeOnLayoutChangeListener(this);
                break;
            case 2:
                ((ActionsView) this.f9161c).removeOnLayoutChangeListener(this);
                break;
            case 3:
                ((View) this.f9160b).removeOnLayoutChangeListener(this);
                break;
            default:
                ((View) this.f9160b).removeOnLayoutChangeListener(this);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) throws Throwable {
        int i33 = this.f9159a;
        Object obj2 = this.f9160b;
        Object obj3 = this.f9161c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i33) {
            case 0:
                Rect rect = (Rect) ((twg.c) obj4).f275018b;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                View view2 = (View) obj2;
                ViewGroup targetParent = (ViewGroup) obj5;
                Object obj6 = or0.u.f228038a;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                Intrinsics.checkNotNullParameter(targetParent, "targetParent");
                for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == targetParent) {
                        rect.set(0, 0, 0, 0);
                        targetParent.offsetDescendantRectToMyCoords(view2, rect);
                    }
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ((ControllerContainerSliderLayout) obj3).v = null;
                SliderLayout.g((ControllerContainerSliderLayout) obj5, (dy0.o) obj4);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                ActionsView actionsView = (ActionsView) obj5;
                actionsView.B = null;
                UIKitRecyclerView uIKitRecyclerView = actionsView.f58305p;
                int childCount = uIKitRecyclerView.getChildCount();
                for (int i43 = 0; i43 < childCount; i43++) {
                    RecyclerView.ViewHolder childViewHolder = uIKitRecyclerView.getChildViewHolder(uIKitRecyclerView.getChildAt(i43));
                    if (childViewHolder instanceof koi.b) {
                        koi.b bVar = (koi.b) childViewHolder;
                        if (bVar instanceof jr0.i) {
                            Set set = (Set) obj2;
                            koi.j jVar = bVar.e;
                            if (zhm.d0.T(set, jVar != null ? jVar.getF55139b() : null)) {
                                ((kotlin.jvm.internal.q) obj4).invoke(((jr0.i) bVar).getGlowHighlightManager());
                            } else {
                                ((jr0.i) bVar).Q();
                            }
                        }
                    }
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                up0.d0 d0Var = (up0.d0) obj3;
                d0Var.f281695l = null;
                up0.d0.a(d0Var, (up0.j0) obj5, (View) obj4);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                yr0.u uVar = (yr0.u) obj3;
                uVar.d((View) obj5, (aw0.b0) obj4);
                uVar.update(uVar.b(), uVar.getHeight());
                break;
        }
    }

    public c4(ViewGroup viewGroup, View view, ViewGroup viewGroup2, twg.c cVar) {
        this.f9159a = 0;
        this.f9161c = viewGroup;
        this.f9160b = view;
        this.d = viewGroup2;
        this.e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c4(ActionsView actionsView, ActionsView actionsView2, Set set, Function1 function1) {
        this.f9159a = 2;
        this.f9161c = actionsView;
        this.d = actionsView2;
        this.f9160b = set;
        this.e = (kotlin.jvm.internal.q) function1;
    }
}
