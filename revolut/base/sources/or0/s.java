package or0;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f228033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ th9.t f228034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f228035c;

    public s(View view, th9.t tVar, ViewGroup viewGroup) {
        this.f228033a = view;
        this.f228034b = tVar;
        this.f228035c = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (Intrinsics.f(view2, this.f228033a)) {
            this.f228034b.invoke();
            this.f228035c.setOnHierarchyChangeListener(null);
        }
    }
}
