package aa0;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public abstract InputItem a(InputItem inputItem, Object obj2);

    public BackendItem b(BackendItem item, InputItem changedItem) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(changedItem, "changedItem");
        return item;
    }

    public FormScreen c(FormScreen screen, String id10, Object obj2) {
        Object next;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(id10, "id");
        List items = screen.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : items) {
            if (obj3 instanceof InputItem) {
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
            if (Intrinsics.f(((InputItem) next).getId(), id10)) {
                break;
            }
        }
        InputItem inputItem = next instanceof InputItem ? (InputItem) next : null;
        if (inputItem == null) {
            throw new IllegalArgumentException(p.a.p("InputItem with id ", id10, " not found in items list"));
        }
        List<BackendItem> items2 = screen.getItems();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(items2, 10));
        for (BackendItem backendItem : items2) {
            arrayList2.add(Intrinsics.f(backendItem, inputItem) ? a(inputItem, obj2) : b(backendItem, inputItem));
        }
        return FormScreen.J(screen, arrayList2, null, null, null, 65533);
    }
}
