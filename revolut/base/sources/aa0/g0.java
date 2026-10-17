package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MultiSelectionItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 extends c {
    public static SelectionItem d(g0 g0Var, SelectionItem selectionItem, Set set, SelectionItem.CustomAnswer customAnswer, ValidationResult validationResult, int i) {
        Set selected = (i & 1) != 0 ? selectionItem.getF63640g() : set;
        SelectionItem.CustomAnswer f = (i & 2) != 0 ? selectionItem.getF() : customAnswer;
        ValidationResult f63644m = (i & 4) != 0 ? selectionItem.getF63644m() : validationResult;
        if (selectionItem instanceof MultiSelectionItem) {
            MultiSelectionItem multiSelectionItem = (MultiSelectionItem) selectionItem;
            String id10 = multiSelectionItem.f63541a;
            boolean z = multiSelectionItem.f63542b;
            List options = multiSelectionItem.f63543c;
            String str = multiSelectionItem.d;
            SelectionItem.CustomOption customOption = multiSelectionItem.e;
            List groups = multiSelectionItem.f63545h;
            MultiSelectionItem.NoneApplyOption noneApplyOption = multiSelectionItem.i;
            MultiSelectionItem.AllApplyOption allApplyOption = multiSelectionItem.f63546j;
            Boolean bool = multiSelectionItem.k;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(selected, "selected");
            Intrinsics.checkNotNullParameter(groups, "groups");
            return new MultiSelectionItem(id10, z, options, str, customOption, f, selected, groups, noneApplyOption, allApplyOption, bool, f63644m);
        }
        if (!(selectionItem instanceof SingleSelectionItem)) {
            throw new NoWhenBranchMatchedException();
        }
        SingleSelectionItem singleSelectionItem = (SingleSelectionItem) selectionItem;
        String id11 = singleSelectionItem.f63637a;
        boolean z3 = singleSelectionItem.f63638b;
        List options2 = singleSelectionItem.f63639c;
        String str2 = singleSelectionItem.d;
        SelectionItem.CustomOption customOption2 = singleSelectionItem.e;
        List groups2 = singleSelectionItem.f63641h;
        SingleSelectionItem.Style style = singleSelectionItem.i;
        Boolean bool2 = singleSelectionItem.f63642j;
        SingleSelectionItem.AssetStyle assetStyle = singleSelectionItem.k;
        SingleSelectionItem.SeparationStyle separationStyle = singleSelectionItem.f63643l;
        Intrinsics.checkNotNullParameter(id11, "id");
        Intrinsics.checkNotNullParameter(options2, "options");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(groups2, "groups");
        Intrinsics.checkNotNullParameter(style, "style");
        return new SingleSelectionItem(id11, z3, options2, str2, customOption2, f, selected, groups2, style, bool2, assetStyle, separationStyle, f63644m);
    }

    public static Set e(SelectionItem selectionItem, String str) {
        if (!(selectionItem instanceof MultiSelectionItem)) {
            if (selectionItem instanceof SingleSelectionItem) {
                return zhm.y0.b(str);
            }
            throw new NoWhenBranchMatchedException();
        }
        MultiSelectionItem multiSelectionItem = (MultiSelectionItem) selectionItem;
        List list = multiSelectionItem.f63543c;
        MultiSelectionItem.AllApplyOption allApplyOption = multiSelectionItem.f63546j;
        MultiSelectionItem.NoneApplyOption noneApplyOption = multiSelectionItem.i;
        Set set = multiSelectionItem.f63544g;
        String str2 = noneApplyOption != null ? noneApplyOption.f63550a : null;
        String str3 = allApplyOption != null ? allApplyOption.f63548a : null;
        if (Intrinsics.f(str, str2) && !Intrinsics.f(set, zhm.y0.b(str2))) {
            return zhm.y0.b(str2);
        }
        if (Intrinsics.f(str, str3)) {
            if (set.contains(str3)) {
                return zhm.h0.f322473a;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                linkedHashSet.add(((SelectionItem.Option) it8.next()).getF63622a());
            }
            linkedHashSet.add(str3);
            return linkedHashSet;
        }
        aim.o oVar = new aim.o();
        String str4 = noneApplyOption != null ? noneApplyOption.f63550a : null;
        String str5 = allApplyOption != null ? allApplyOption.f63548a : null;
        oVar.addAll(set);
        aim.f fVar = oVar.f5338a;
        if (fVar.containsKey(str)) {
            oVar.remove(str);
        } else {
            oVar.add(str);
        }
        if (str4 != null) {
            oVar.remove(str4);
        }
        if (str5 != null) {
            if (fVar.containsKey(str5)) {
                oVar.remove(str5);
            } else if (list.size() == oVar.size()) {
                oVar.add(str5);
            }
        }
        return zhm.y0.a(oVar);
    }

    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        SelectionItem targetItem = (SelectionItem) inputItem;
        c1 updatedValue = (c1) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (updatedValue instanceof z0) {
            SelectionItem.CustomOption e = targetItem.getE();
            String str = e != null ? e.f63609a : null;
            Set f63640g = (str == null || targetItem.getF63640g().contains(str)) ? targetItem.getF63640g() : e(targetItem, str);
            String str2 = ((z0) updatedValue).f2753a;
            return d(this, targetItem, f63640g, new SelectionItem.CustomAnswer(str2.length() > 0 ? str2 : null, true), null, 4);
        }
        if (!(updatedValue instanceof a1)) {
            if (updatedValue instanceof b1) {
                return d(this, targetItem, null, null, ((b1) updatedValue).f2725a, 3);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str3 = ((a1) updatedValue).f2722a;
        SelectionItem.CustomAnswer customAnswer = null;
        Set setE = e(targetItem, str3);
        SelectionItem.CustomOption e2 = targetItem.getE();
        if (Intrinsics.f(e2 != null ? e2.f63609a : null, str3)) {
            SelectionItem.CustomAnswer f = targetItem.getF();
            if (f == null) {
                f = new SelectionItem.CustomAnswer(null, false);
            }
            customAnswer = new SelectionItem.CustomAnswer(f.f63607a, true);
        } else {
            SelectionItem.CustomAnswer f4 = targetItem.getF();
            if (f4 != null) {
                customAnswer = new SelectionItem.CustomAnswer(f4.f63607a, false);
            }
        }
        return d(this, targetItem, setE, customAnswer, null, 4);
    }
}
