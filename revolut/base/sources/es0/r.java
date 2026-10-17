package es0;

import com.revolut.core.ui_kit.views.DraggableTabsView;

/* JADX INFO: loaded from: classes19.dex */
public interface r {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    static void b(DraggableTabsView draggableTabsView, int i, int i2) {
        boolean z = (i2 & 4) == 0;
        ar0.e eVar = (ar0.e) zhm.d0.e0(i, draggableTabsView.d);
        if (eVar != null) {
            draggableTabsView.o(eVar.f8484a, true, z);
        }
    }

    void setScrollPosition(int i, float f, boolean z, boolean z3);
}
