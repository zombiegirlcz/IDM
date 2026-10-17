package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView;
import java.util.ArrayList;
import tw0.b0;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatingBottomBarExpandedView f57071a;

    public h(FloatingBottomBarExpandedView floatingBottomBarExpandedView) {
        this.f57071a = floatingBottomBarExpandedView;
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        FloatingBottomBarExpandedView floatingBottomBarExpandedView = this.f57071a;
        ArrayList<koi.j> arrayListF1 = d0.f1(floatingBottomBarExpandedView.f57025b.f319395l);
        Object objE0 = d0.e0(i, arrayListF1);
        FloatingBottomBarExpandedView.ItemDelegate.Model model = objE0 instanceof FloatingBottomBarExpandedView.ItemDelegate.Model ? (FloatingBottomBarExpandedView.ItemDelegate.Model) objE0 : null;
        if (model == null) {
            return;
        }
        Object objE02 = d0.e0(i2, arrayListF1);
        FloatingBottomBarExpandedView.ItemDelegate.Model model2 = objE02 instanceof FloatingBottomBarExpandedView.ItemDelegate.Model ? (FloatingBottomBarExpandedView.ItemDelegate.Model) objE02 : null;
        if (model2 == null || model.e || model2.e) {
            return;
        }
        arrayListF1.remove(i);
        arrayListF1.add(i2, model);
        ihm.f fVar = floatingBottomBarExpandedView.f57026c;
        ArrayList arrayList = new ArrayList();
        for (koi.j jVar : arrayListF1) {
            FloatingBottomBarExpandedView.ItemDelegate.Model model3 = jVar instanceof FloatingBottomBarExpandedView.ItemDelegate.Model ? (FloatingBottomBarExpandedView.ItemDelegate.Model) jVar : null;
            String str = model3 != null ? model3.f57029a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        fVar.onNext(arrayList);
    }
}
