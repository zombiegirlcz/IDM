package com.revolut.core.ui_kit.views;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FixedTabs f59133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f59134b;

    public k(FixedTabs fixedTabs, Context context) {
        this.f59133a = fixedTabs;
        this.f59134b = context;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab2) {
        TrackableItem trackableItemA;
        int i;
        int i2;
        FixedTabs fixedTabs = this.f59133a;
        CustomTabLayoutView customTabLayoutView = fixedTabs.f58555j;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object tag2 = tab2.getTag();
        py0.d cVar = null;
        FixedTabs.BaseItem baseItem = tag2 instanceof FixedTabs.BaseItem ? (FixedTabs.BaseItem) tag2 : null;
        if (baseItem != null) {
            FixedTabs.Companion companion = FixedTabs.INSTANCE;
            if (fixedTabs.f58554h) {
                ((FixedTabs.BaseItem.Style.Default) baseItem.getF58570c()).getClass();
                i = R$attr.uikit_colorForeground;
            } else {
                i = fixedTabs.f58563t;
            }
            fixedTabs.j0(tab2, i);
            if (fixedTabs.f58554h) {
                ((FixedTabs.BaseItem.Style.Default) baseItem.getF58570c()).getClass();
                i2 = R$attr.uikit_colorSegmentedActive;
            } else {
                i2 = fixedTabs.v;
            }
            customTabLayoutView.setSelectedTabIndicatorColor(kli.a.s(i2, this.f59134b));
        }
        fixedTabs.i = baseItem != null ? baseItem.getF58568a() : null;
        if (customTabLayoutView.isHandlingTouchUp) {
            py0.f fVarN0 = or0.u.k(fixedTabs).n0();
            TabLayout.TabView view = tab2.view;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            if (baseItem != null) {
                trackableItemA = baseItem;
            } else {
                TrackableItem.INSTANCE.getClass();
                trackableItemA = TrackableItem.Companion.a(fixedTabs, null);
            }
            if (baseItem instanceof FixedTabs.IconItem) {
                cVar = new py0.b(((FixedTabs.IconItem) baseItem).f58566b);
            } else if (baseItem instanceof FixedTabs.Item) {
                cVar = new py0.c(((FixedTabs.Item) baseItem).f58569b);
            } else if (baseItem != null) {
                throw new NoWhenBranchMatchedException();
            }
            fVarN0.a(view, trackableItemA, cVar);
        }
        String str = fixedTabs.i;
        if (str != null) {
            fixedTabs.f.onNext(str);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object tag2 = tab2.getTag();
        if ((tag2 instanceof FixedTabs.BaseItem ? (FixedTabs.BaseItem) tag2 : null) != null) {
            FixedTabs fixedTabs = this.f59133a;
            fixedTabs.j0(tab2, fixedTabs.getUnselectedTextColorAttr());
        }
    }
}
