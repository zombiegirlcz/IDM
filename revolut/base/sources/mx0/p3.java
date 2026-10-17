package mx0;

import com.google.android.material.tabs.TabLayout;
import com.revolut.core.ui_kit.views.CenteredFixedTabsView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p3 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CenteredFixedTabsView f209921a;

    public p3(CenteredFixedTabsView centeredFixedTabsView) {
        this.f209921a = centeredFixedTabsView;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        int i = R$attr.uikit_colorForeground;
        CenteredFixedTabsView.Companion aVar = CenteredFixedTabsView.INSTANCE;
        CenteredFixedTabsView centeredFixedTabsView = this.f209921a;
        centeredFixedTabsView.b(tab2, i);
        Object tag2 = tab2.getTag();
        q3 q3Var = tag2 instanceof q3 ? (q3) tag2 : null;
        centeredFixedTabsView.f58426c = q3Var != null ? q3Var.f209950a : null;
        String str = centeredFixedTabsView.f58426c;
        if (str != null) {
            centeredFixedTabsView.f58424a.onNext(str);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object tag2 = tab2.getTag();
        if ((tag2 instanceof q3 ? (q3) tag2 : null) != null) {
            int i = R$attr.uikit_colorGreyTone50;
            CenteredFixedTabsView.Companion aVar = CenteredFixedTabsView.INSTANCE;
            this.f209921a.b(tab2, i);
        }
    }
}
