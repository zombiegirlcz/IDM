package js0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit.utils.ListItemTarget;
import com.revolut.core.ui_kit.utils.TabIdTarget;
import com.revolut.core.ui_kit.utils.TagKeyTarget;
import com.revolut.core.ui_kit.utils.TagKeyValueTarget;
import com.revolut.core.ui_kit.utils.TagTarget;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.q;
import es0.b0;
import es0.d0;
import ix0.b2;
import ix0.k2;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private d() {
    }

    public static View a(b2 finderTarget, View root) {
        Intrinsics.checkNotNullParameter(finderTarget, "finderTarget");
        Intrinsics.checkNotNullParameter(root, "root");
        if (finderTarget instanceof TabIdTarget) {
            return c(root, ((TabIdTarget) finderTarget).f58290a);
        }
        if (finderTarget instanceof ListIdTarget) {
            return b(root, ((ListIdTarget) finderTarget).f58286a);
        }
        if (finderTarget instanceof TagTarget) {
            return d(root, ((TagTarget) finderTarget).f58294a);
        }
        if (finderTarget instanceof TagKeyTarget) {
            return e(((TagKeyTarget) finderTarget).f58291a, root);
        }
        if (finderTarget instanceof TagKeyValueTarget) {
            TagKeyValueTarget tagKeyValueTarget = (TagKeyValueTarget) finderTarget;
            return f(root, tagKeyValueTarget.f58292a, tagKeyValueTarget.f58293b);
        }
        if (finderTarget instanceof ViewIdTarget) {
            return root.findViewById(((ViewIdTarget) finderTarget).f58295a);
        }
        if (finderTarget instanceof k2) {
            return ((k2) finderTarget).f169254a;
        }
        if (!(finderTarget instanceof ListItemTarget)) {
            throw new NoWhenBranchMatchedException();
        }
        ListItemTarget listItemTarget = (ListItemTarget) finderTarget;
        String str = listItemTarget.f58288b;
        int i = listItemTarget.f58287a;
        int i2 = listItemTarget.f58289c;
        RecyclerView recyclerView = (RecyclerView) root.findViewById(i);
        if (recyclerView == null) {
            return null;
        }
        View viewB = b(recyclerView, str);
        return (i2 == -1 || viewB == null) ? viewB : viewB.findViewById(i2);
    }

    public static View b(View root, String listId) {
        View viewB;
        j jVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(root, "root");
        int i = 0;
        if (root instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) root;
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                    koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
                    if (Intrinsics.f(listId, (bVar == null || (jVar = bVar.e) == null) ? null : jVar.getF55180b())) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (viewB = b(childAt, listId)) != null) {
                        return viewB;
                    }
                }
                i++;
            }
        } else if (root instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) root;
            int childCount2 = viewGroup.getChildCount();
            while (i < childCount2) {
                View childAt2 = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
                View viewB2 = b(childAt2, listId);
                if (viewB2 != null) {
                    return viewB2;
                }
                i++;
            }
        }
        return null;
    }

    public static View c(View view, String id10) {
        d0 d0Var;
        Tabs tabs = view instanceof Tabs ? (Tabs) view : null;
        if (tabs != null) {
            Intrinsics.checkNotNullParameter(id10, "id");
            int tabCount = tabs.getTabLayout$ui_kit_components_release().getTabCount();
            int i = 0;
            while (true) {
                if (i >= tabCount) {
                    d0Var = null;
                    break;
                }
                b0.a aVarK = tabs.getTabLayout$ui_kit_components_release().k(i);
                Object obj2 = aVarK != null ? aVarK.f128806a : null;
                q qVar = obj2 instanceof q ? (q) obj2 : null;
                if (Intrinsics.f(qVar != null ? qVar.f59614a : null, id10)) {
                    d0Var = aVarK.f128810h;
                    break;
                }
                i++;
            }
            if (d0Var != null) {
                return d0Var;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                View viewC = c(childAt, id10);
                if (viewC != null) {
                    return viewC;
                }
            }
        }
        return null;
    }

    public static View d(View view, String str) {
        if (Intrinsics.f(view.getTag(), str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewD = d(childAt, str);
            if (viewD != null) {
                return viewD;
            }
        }
        return null;
    }

    public static View e(int i, View view) {
        if (view.getTag(i) != null) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewE = e(i, childAt);
            if (viewE != null) {
                return viewE;
            }
        }
        return null;
    }

    public static View f(View view, int i, Object obj2) {
        if (Intrinsics.f(view.getTag(i), obj2)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewF = f(childAt, i, obj2);
            if (viewF != null) {
                return viewF;
            }
        }
        return null;
    }
}
