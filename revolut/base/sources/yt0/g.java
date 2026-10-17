package yt0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f316540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f316541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f316542c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ lki.s e;

    public g(View view, h hVar, View view2, ViewGroup viewGroup, lki.s sVar) {
        this.f316540a = view;
        this.f316541b = hVar;
        this.f316542c = view2;
        this.d = viewGroup;
        this.e = sVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.f316540a;
        boolean zIsInLayout = view2.isInLayout();
        lki.s sVar = this.e;
        ViewGroup viewGroup = this.d;
        View view3 = this.f316542c;
        h hVar = this.f316541b;
        if (zIsInLayout) {
            view2.post(new f(hVar, view3, viewGroup, sVar, 1));
        } else {
            hVar.f316561a.setVisibility(0);
            hVar.v(view3, viewGroup, false, sVar);
        }
    }
}
