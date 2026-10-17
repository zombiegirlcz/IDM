package mx0;

import android.view.View;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.transition.TransitionManager;
import com.revolut.core.ui_kit.views.Tabs;
import es0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes20.dex */
public final class kc implements ListUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Tabs f209793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f209794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f209795c;

    public kc(Tabs tabs, String str, List list) {
        this.f209793a = tabs;
        this.f209794b = str;
        this.f209795c = list;
    }

    public final void a(int i, int i2) {
        IntRange intRangeO = kotlin.ranges.f.o(0, i2);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(Integer.valueOf(it8.nextInt() + i));
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            int iIntValue = ((Number) it9.next()).intValue();
            com.revolut.core.ui_kit.views.q qVar = (com.revolut.core.ui_kit.views.q) this.f209795c.get(iIntValue);
            Tabs tabs = this.f209793a;
            b0.a aVarK = tabs.getTabLayout$ui_kit_components_release().k(iIntValue);
            if (aVarK == null) {
                throw new IllegalStateException(a0.d.g(iIntValue, tabs.getTabLayout$ui_kit_components_release().getTabCount(), "There is no tab at pos=", ", tabCount="));
            }
            aVarK.f128806a = qVar;
            View view = aVarK.f;
            if (view == null) {
                throw new IllegalStateException("Tab was not initialized");
            }
            Tabs.p(view, qVar);
            tabs.A(qVar.f59614a);
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onChanged(int i, int i2, Object obj2) {
        String str = this.f209794b;
        List list = this.f209795c;
        Tabs tabs = this.f209793a;
        try {
            a(i, i2);
            Tabs.Companion companion = Tabs.INSTANCE;
            tabs.w(str, true, true);
            tabs.f58885h = list;
        } catch (IllegalStateException e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            Tabs.Companion companion2 = Tabs.INSTANCE;
            tabs.s(str, list);
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onInserted(int i, int i2) {
        String str = this.f209794b;
        List list = this.f209795c;
        Tabs tabs = this.f209793a;
        if (i2 != 1 || i < 0 || i >= list.size()) {
            Tabs.Companion companion = Tabs.INSTANCE;
            tabs.s(str, list);
            return;
        }
        com.revolut.core.ui_kit.views.q qVar = (com.revolut.core.ui_kit.views.q) list.get(i);
        Tabs.Companion companion2 = Tabs.INSTANCE;
        TransitionManager.endTransitions(tabs.getTabLayout$ui_kit_components_release());
        tabs.getTabLayout$ui_kit_components_release().b(tabs.m(qVar), i, false);
        tabs.f58885h = list;
        tabs.A(qVar.f59614a);
        tabs.w(str, true, true);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onMoved(int i, int i2) {
        Tabs.Companion companion = Tabs.INSTANCE;
        this.f209793a.s(this.f209794b, this.f209795c);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onRemoved(int i, int i2) {
        String str = this.f209794b;
        Tabs tabs = this.f209793a;
        if (i == 0) {
            Tabs.Companion companion = Tabs.INSTANCE;
            tabs.s(str, this.f209795c);
            return;
        }
        if (i < 0 || i >= tabs.f58885h.size()) {
            return;
        }
        ArrayList arrayListF1 = zhm.d0.f1(tabs.f58885h);
        TransitionManager.beginDelayedTransition(tabs.getTabLayout$ui_kit_components_release(), tabs.getDeleteTransition());
        for (int i3 = 0; i3 < i2; i3++) {
            tabs.getTabLayout$ui_kit_components_release().p(i);
            arrayListF1.remove(i);
        }
        tabs.f58885h = zhm.d0.d1(arrayListF1);
        tabs.i = null;
        tabs.getTabLayout$ui_kit_components_release().r(null, true);
        tabs.w(str, true, true);
    }
}
