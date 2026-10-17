package ad0;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.EditableListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.SelectableItem;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements a {
    public static Action a(Action action, Function1 function1) {
        if (!(action instanceof Action.Submit)) {
            return action;
        }
        Action.Submit submit = (Action.Submit) action;
        boolean zBooleanValue = ((Boolean) function1.invoke(action)).booleanValue();
        String id10 = submit.f63229a;
        String title = submit.f63230b;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new Action.Submit(id10, title, zBooleanValue);
    }

    public static ArrayList b(List list, Function1 function1) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((Action) it8.next(), function1));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem] */
    /* JADX WARN: Type inference failed for: r7v12, types: [com.revolut.feature.backend_flow.domain.models.EditableListItem] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.revolut.feature.backend_flow.domain.models.BackendItem] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.revolut.feature.backend_flow.domain.models.SelectableItem] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.revolut.feature.backend_flow.domain.models.SelectableItem] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    @Override // ad0.a
    public final BackendScreen j(BackendScreen screen, Action.Submit submit) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Function1 bVar = submit == null ? new a9h.b(23) : new a7b.r(submit, 18);
        if (screen instanceof BottomPromptScreen) {
            BottomPromptScreen bottomPromptScreen = (BottomPromptScreen) screen;
            List list = bottomPromptScreen.f63330h;
            return BottomPromptScreen.J(bottomPromptScreen, null, list != null ? b(list, bVar) : null, null, 895);
        }
        if (screen instanceof PromptScreen) {
            PromptScreen promptScreen = (PromptScreen) screen;
            List list2 = promptScreen.f63588g;
            return PromptScreen.J(promptScreen, list2 != null ? b(list2, bVar) : null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
        }
        if (!(screen instanceof FormScreen)) {
            return screen;
        }
        FormScreen formScreen = (FormScreen) screen;
        Action action = formScreen.d;
        Action actionA = action != null ? a(action, bVar) : null;
        List list3 = formScreen.e;
        ArrayList arrayListB = list3 != null ? b(list3, bVar) : null;
        List<??> list4 = formScreen.f63468b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        for (?? D1 : list4) {
            if (D1 instanceof xl2.a) {
                xl2.a aVar = (xl2.a) D1;
                if (aVar instanceof EditableListItem) {
                    EditableListItem editableListItem = (EditableListItem) aVar;
                    EditableListItem.EditableOptionsValue editableOptionsValue = editableListItem.f63404h;
                    List list5 = editableListItem.f63402c;
                    ArrayList arrayListB2 = list5 != null ? b(list5, bVar) : null;
                    if (submit != null) {
                        if (editableOptionsValue != null) {
                            ArrayList arrayList2 = editableOptionsValue.f63410a;
                            ArrayList items = new ArrayList(zhm.w.t(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                items.add(EditableListItem.EditableOptionsValue.EditableOptionValue.a((EditableListItem.EditableOptionsValue.EditableOptionValue) it8.next(), false));
                            }
                            Intrinsics.checkNotNullParameter(items, "items");
                            editableOptionsValue = new EditableListItem.EditableOptionsValue(items);
                        } else {
                            editableOptionsValue = null;
                        }
                    }
                    D1 = EditableListItem.d(editableListItem, arrayListB2, editableOptionsValue, 379);
                } else {
                    if (!(aVar instanceof EntitiesSummaryItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EntitiesSummaryItem entitiesSummaryItem = (EntitiesSummaryItem) aVar;
                    List list6 = entitiesSummaryItem.f63428b;
                    D1 = EntitiesSummaryItem.d(entitiesSummaryItem, list6 != null ? b(list6, bVar) : null, null, null, 61);
                }
            } else if (D1 instanceof SelectableItem) {
                D1 = (SelectableItem) D1;
                if (submit != null && (D1.getE() instanceof SelectionStyle.SingleSelection)) {
                    D1 = D1.D1(h0.f322473a);
                }
            }
            arrayList.add(D1);
        }
        return FormScreen.J(formScreen, arrayList, actionA, arrayListB, null, 65509);
    }
}
