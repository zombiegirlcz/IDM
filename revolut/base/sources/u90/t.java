package u90;

import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.EditableListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.d1;
import q90.e1;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends c {
    public t(t90.a actionMapper) {
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.revolut.feature.backend_flow.domain.models.BackendFlowIcon] */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        ArrayList arrayList;
        EditableListItem.EditableOptionsValue editableOptionsValue;
        d1 d1Var;
        com.revolut.feature.backend_flow.domain.models.d dVar;
        d1 item = (d1) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        List actions = item.getActions();
        xl2.m mVar = null;
        if (actions != null) {
            List list = actions;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(t90.a.a((q90.a) it8.next()));
            }
        } else {
            arrayList = null;
        }
        String addActionId = item.getAddActionId();
        String title = item.getTitle();
        String emptyListPlaceholder = item.getEmptyListPlaceholder();
        List items = item.getItems();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(items, 10));
        Iterator it9 = items.iterator();
        while (true) {
            boolean zBooleanValue = true;
            if (!it9.hasNext()) {
                break;
            }
            d1.a aVar = (d1.a) it9.next();
            String id11 = aVar.getId();
            q90.o icon = aVar.getIcon();
            ?? A = icon != null ? t90.e.a(icon, mVar) : mVar;
            String title2 = aVar.getTitle();
            String valuePlaceholder = aVar.getValuePlaceholder();
            String subtitle = aVar.getSubtitle();
            String message = aVar.getMessage();
            String style = aVar.getStyle();
            com.revolut.feature.backend_flow.domain.models.d[] dVarArrValues = com.revolut.feature.backend_flow.domain.models.d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d1Var = item;
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i];
                d1Var = item;
                if (kotlin.text.a0.z(dVar.name(), style, true)) {
                    break;
                }
                i++;
                item = d1Var;
            }
            if (dVar == null) {
                dVar = com.revolut.feature.backend_flow.domain.models.d.DEFAULT;
            }
            Boolean required2 = aVar.getRequired();
            boolean zBooleanValue2 = required2 != null ? required2.booleanValue() : false;
            Boolean editingEnabled = aVar.getEditingEnabled();
            if (editingEnabled != null) {
                zBooleanValue = editingEnabled.booleanValue();
            }
            arrayList2.add(new EditableListItem.EditableOption(id11, A, title2, valuePlaceholder, subtitle, message, dVar, zBooleanValue2, zBooleanValue));
            item = d1Var;
            mVar = null;
        }
        d1 d1Var2 = item;
        e1 value = d1Var2.getValue();
        if (value != null) {
            List<e1.a> items2 = value.getItems();
            ArrayList arrayList3 = new ArrayList(zhm.w.t(items2, 10));
            for (e1.a aVar2 : items2) {
                arrayList3.add(new EditableListItem.EditableOptionsValue.EditableOptionValue(aVar2.getId(), aVar2.getValue(), aVar2.getSelected()));
            }
            editableOptionsValue = new EditableListItem.EditableOptionsValue(arrayList3);
        } else {
            editableOptionsValue = null;
        }
        List<d1.b> itemSourceTemplates = d1Var2.getItemSourceTemplates();
        ArrayList arrayList4 = new ArrayList(zhm.w.t(itemSourceTemplates, 10));
        for (d1.b bVar : itemSourceTemplates) {
            String id12 = bVar.getId();
            String sourceParam = bVar.getSourceParam();
            String title3 = bVar.getTitle();
            String style2 = bVar.getStyle();
            String value2 = bVar.getValue();
            String valuePlaceholder2 = bVar.getValuePlaceholder();
            String subtitle2 = bVar.getSubtitle();
            String message2 = bVar.getMessage();
            q90.o icon2 = bVar.getIcon();
            BackendFlowIcon backendFlowIconA = icon2 != null ? t90.e.a(icon2, null) : null;
            Boolean required3 = bVar.getRequired();
            boolean zBooleanValue3 = required3 != null ? required3.booleanValue() : false;
            Boolean editingEnabled2 = bVar.getEditingEnabled();
            arrayList4.add(new EditableListItem.ItemSourceTemplate(id12, sourceParam, title3, style2, value2, valuePlaceholder2, subtitle2, message2, backendFlowIconA, zBooleanValue3, editingEnabled2 != null ? editingEnabled2.booleanValue() : true));
        }
        return new EditableListItem(id10, required, arrayList, addActionId, title, emptyListPlaceholder, arrayList2, editableOptionsValue, arrayList4);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        ArrayList arrayList;
        e1 e1Var;
        EditableListItem item = (EditableListItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63400a;
        boolean z = item.f63401b;
        List list = item.f63402c;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(t90.a.b((Action) it8.next()));
            }
        } else {
            arrayList = null;
        }
        String str2 = item.d;
        String str3 = item.e;
        String str4 = item.f;
        ArrayList<EditableListItem.EditableOption> arrayList2 = item.f63403g;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (EditableListItem.EditableOption editableOption : arrayList2) {
            String str5 = editableOption.f63405a;
            BackendFlowIcon backendFlowIcon = editableOption.f63406b;
            arrayList3.add(new d1.a(str5, backendFlowIcon != null ? t90.e.b(backendFlowIcon) : null, editableOption.f63407c, editableOption.d, editableOption.e, editableOption.f, editableOption.f63408g.name(), Boolean.valueOf(editableOption.f63409h), Boolean.valueOf(editableOption.i)));
            str2 = str2;
        }
        String str6 = str2;
        EditableListItem.EditableOptionsValue editableOptionsValue = item.f63404h;
        if (editableOptionsValue != null) {
            ArrayList<EditableListItem.EditableOptionsValue.EditableOptionValue> arrayList4 = editableOptionsValue.f63410a;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
            for (EditableListItem.EditableOptionsValue.EditableOptionValue editableOptionValue : arrayList4) {
                arrayList5.add(new e1.a(editableOptionValue.f63411a, editableOptionValue.f63412b, editableOptionValue.f63413c));
            }
            e1Var = new e1(arrayList5);
        } else {
            e1Var = null;
        }
        ArrayList arrayList6 = item.i;
        ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            EditableListItem.ItemSourceTemplate itemSourceTemplate = (EditableListItem.ItemSourceTemplate) it9.next();
            String str7 = itemSourceTemplate.f63414a;
            String str8 = itemSourceTemplate.f63415b;
            String str9 = itemSourceTemplate.f63416c;
            String str10 = itemSourceTemplate.d;
            String str11 = itemSourceTemplate.e;
            String str12 = itemSourceTemplate.f;
            Iterator it10 = it9;
            String str13 = itemSourceTemplate.f63417g;
            String str14 = itemSourceTemplate.f63418h;
            BackendFlowIcon backendFlowIcon2 = itemSourceTemplate.i;
            arrayList7.add(new d1.b(str7, str8, str9, str10, str11, str12, str13, str14, backendFlowIcon2 != null ? t90.e.b(backendFlowIcon2) : null, Boolean.valueOf(itemSourceTemplate.f63419j), Boolean.valueOf(itemSourceTemplate.k)));
            it9 = it10;
        }
        return new d1(str, z, arrayList, str6, str3, str4, arrayList3, e1Var, arrayList7);
    }
}
