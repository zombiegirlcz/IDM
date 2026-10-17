package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.MultiSelectionItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import q90.f3;
import q90.g3;
import q90.h3;
import q90.q2;
import q90.r2;
import q90.t2;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f278320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(z0 validationMapper, n0 optionsMapper) {
        super(validationMapper);
        Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
        Intrinsics.checkNotNullParameter(optionsMapper, "optionsMapper");
        this.f278320a = optionsMapper;
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        q2 item = (q2) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        List options = item.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(options, 10));
        Iterator it8 = options.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f278320a.a((h3) it8.next()));
        }
        String searchHint = item.getSearchHint();
        f3 customOption = item.getCustomOption();
        SelectionItem.CustomOption customOptionC = customOption != null ? c(customOption) : null;
        r2 value = item.getValue();
        SelectionItem.CustomAnswer customAnswer = new SelectionItem.CustomAnswer(value != null ? value.getCustomAnswer() : null, false);
        r2 value2 = item.getValue();
        Set selected = value2 != null ? value2.getSelected() : null;
        if (selected == null) {
            selected = zhm.h0.f322473a;
        }
        List groups = item.getGroups();
        if (groups == null) {
            groups = zhm.f0.f322471a;
        }
        List<g3> list = groups;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (g3 group : list) {
            Intrinsics.checkNotNullParameter(group, "group");
            arrayList2.add(new SelectionItem.Group(group.getId(), group.getName(), group.getSelectionOptionIds()));
        }
        t2 noneApplyOption = item.getNoneApplyOption();
        MultiSelectionItem.NoneApplyOption noneApplyOption2 = noneApplyOption != null ? new MultiSelectionItem.NoneApplyOption(noneApplyOption.getId(), noneApplyOption.getTitle()) : null;
        q90.e allApplyOption = item.getAllApplyOption();
        return new MultiSelectionItem(id10, required, arrayList, searchHint, customOptionC, customAnswer, selected, arrayList2, noneApplyOption2, allApplyOption != null ? new MultiSelectionItem.AllApplyOption(allApplyOption.getId(), allApplyOption.getTitle()) : null, item.getRequireAll(), null);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        f3 f3Var;
        r2 r2Var;
        MultiSelectionItem item = (MultiSelectionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63541a;
        boolean z = item.f63542b;
        List list = item.f63543c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f278320a.b((SelectionItem.Option) it8.next()));
        }
        String str2 = item.d;
        SelectionItem.CustomOption option = item.e;
        if (option != null) {
            Intrinsics.checkNotNullParameter(option, "option");
            f3Var = new f3(option.f63609a, option.f63610b);
        } else {
            f3Var = null;
        }
        Set set = item.f63544g;
        if (set.isEmpty()) {
            set = null;
        }
        if (set != null) {
            SelectionItem.CustomAnswer customAnswer = item.f;
            r2Var = new r2(customAnswer != null ? customAnswer.f63607a : null, set);
        } else {
            r2Var = null;
        }
        MultiSelectionItem.NoneApplyOption noneApplyOption = item.i;
        t2 t2Var = noneApplyOption != null ? new t2(noneApplyOption.f63550a, noneApplyOption.f63551b) : null;
        MultiSelectionItem.AllApplyOption allApplyOption = item.f63546j;
        q90.e eVar = allApplyOption != null ? new q90.e(allApplyOption.f63548a, allApplyOption.f63549b) : null;
        Boolean bool = item.k;
        List<SelectionItem.Group> list2 = item.f63545h;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (SelectionItem.Group group : list2) {
            Intrinsics.checkNotNullParameter(group, "group");
            arrayList2.add(new g3(group.f63612a, group.f63613b, group.f63614c));
        }
        return new q2(str, z, arrayList, str2, r2Var, f3Var, t2Var, eVar, bool, arrayList2);
    }
}
