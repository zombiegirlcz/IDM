package iki;

import android.view.View;
import com.revolut.kompot.navigable.root.RootFlow;
import dki.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RootFlow f161983a;

    public f(RootFlow rootFlow) {
        this.f161983a = rootFlow;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        s sVarS2 = this.f161983a.S2();
        Intrinsics.i(sVarS2, "null cannot be cast to non-null type com.revolut.kompot.navigable.root.BaseRootFlowModel<*, *>");
        b bVar = (b) sVarS2;
        bVar.Q2();
        bVar.f161976x = true;
    }
}
