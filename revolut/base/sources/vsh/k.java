package vsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import java.util.Comparator;
import op0.q;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        BaseDraggableWidgetDelegate.Model model = ((h) obj2).f291797b;
        q d = model != null ? model.getD() : null;
        BaseDraggableWidgetDelegate.Model model2 = ((h) obj3).f291797b;
        return cim.b.b(d, model2 != null ? model2.getD() : null);
    }
}
