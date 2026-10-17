package es0;

import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {
    public static ArrayList a(int i, String selectedId, List tabs, boolean z) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        List<com.revolut.core.ui_kit.views.q> list = tabs;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (com.revolut.core.ui_kit.views.q qVar : list) {
            boolean z3 = qVar.d;
            String str = qVar.f59614a;
            boolean zF = Intrinsics.f(str, selectedId);
            arrayList.add(new ar0.e(str, new ar0.g(!z3 ? R$attr.uikit_colorGreyTone20 : zF ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50, zF ? R$drawable.internal_tabs_selector : R$drawable.internal_tabs_selector_inactive), qVar, z && qVar.d, z3, qVar.e, i));
        }
        return arrayList;
    }
}
