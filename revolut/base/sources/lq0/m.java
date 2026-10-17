package lq0;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.RevTransitionUtils;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import ms0.k5;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f199170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f199171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f199172c = true;

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = this.f199170a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f199170a = arrayList;
        }
        arrayList.add(view);
    }

    public final void b(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (h(holder.f199180a)) {
            c(holder);
        }
    }

    public abstract void c(r rVar);

    public final void d(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (h(holder.f199180a)) {
            e(holder);
        }
    }

    public abstract void e(r rVar);

    public final b f(r rVar, r rVar2) {
        r rVar3 = rVar == null ? rVar2 : rVar;
        if (rVar3 == null || !h(rVar3.f199180a)) {
            return null;
        }
        return g(rVar, rVar2);
    }

    public abstract b g(r rVar, r rVar2);

    public final boolean h(View view) {
        ArrayList arrayList = this.f199170a;
        return ((arrayList == null || arrayList.isEmpty()) && this.f199172c) || (arrayList != null && arrayList.contains(view));
    }

    public final void i(ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        j(root);
        ArrayList arrayList = this.f199171b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                et0.u uVar = (et0.u) arrayList.get(i);
                switch (uVar.f129117a) {
                    case 0:
                        RevTransitionUtils.INSTANCE.suppressLayout((ViewGroup) ((Ref$ObjectRef) uVar.f129118b).f186409a, false);
                        break;
                    default:
                        KeyEvent.Callback itemView = ((zr0.e) uVar.f129118b).f324527a.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        k5 k5Var = itemView instanceof k5 ? (k5) itemView : null;
                        if (k5Var != null) {
                            ((UIKitFrameLayout) k5Var).b(false);
                        }
                        break;
                }
            }
        }
    }

    public void j(ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
    }

    public final void k(ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        l(root);
        ArrayList arrayList = this.f199171b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                et0.u uVar = (et0.u) arrayList.get(i);
                switch (uVar.f129117a) {
                    case 0:
                        RevTransitionUtils.INSTANCE.suppressLayout((ViewGroup) ((Ref$ObjectRef) uVar.f129118b).f186409a, true);
                        break;
                    default:
                        KeyEvent.Callback itemView = ((zr0.e) uVar.f129118b).f324527a.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        k5 k5Var = itemView instanceof k5 ? (k5) itemView : null;
                        if (k5Var != null) {
                            ((UIKitFrameLayout) k5Var).b(true);
                        }
                        break;
                }
            }
        }
    }

    public void l(ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
    }
}
