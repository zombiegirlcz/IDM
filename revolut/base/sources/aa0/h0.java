package aa0;

import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.SelectableItem;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class h0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad0.a f2732a;

    public h0(ad0.a actionsMapper) {
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f2732a = actionsMapper;
    }

    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        Set setJ;
        SelectableItem targetItem = (SelectableItem) inputItem;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        SelectionStyle selectionStyleH = targetItem.h();
        if (selectionStyleH instanceof SelectionStyle.SingleSelection) {
            setJ = zhm.y0.b(obj2);
        } else {
            if (!(selectionStyleH instanceof SelectionStyle.MultiSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            Set setP4 = targetItem.p4();
            setJ = setP4.contains(obj2) ? zhm.a1.j(setP4, obj2) : setP4.size() < ((SelectionStyle.MultiSelection) selectionStyleH).f63625a ? zhm.a1.m(setP4, obj2) : setP4;
        }
        return targetItem.D1(setJ);
    }

    @Override // aa0.c
    public final FormScreen c(FormScreen screen, String id10, Object obj2) {
        Object next;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(id10, "id");
        FormScreen formScreenC = super.c(screen, id10, obj2);
        List list = screen.f63468b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof SelectableItem) {
                arrayList.add(obj3);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((SelectableItem) next).getId(), id10)) {
                break;
            }
        }
        SelectableItem selectableItem = (SelectableItem) next;
        return (selectableItem != null ? selectableItem.h() : null) instanceof SelectionStyle.SingleSelection ? (FormScreen) this.f2732a.j(formScreenC, null) : formScreenC;
    }
}
