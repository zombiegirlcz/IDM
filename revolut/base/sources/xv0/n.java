package xv0;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f309158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f309159b;

    public n(Function0 renderViewProvider) {
        Intrinsics.checkNotNullParameter(renderViewProvider, "renderViewProvider");
        this.f309158a = renderViewProvider;
        this.f309159b = g.f309150a;
    }

    @Override // xv0.m
    public final i getItemRenderState() {
        return this.f309159b;
    }

    @Override // xv0.m
    public final View getRenderView() {
        return (View) this.f309158a.invoke();
    }

    @Override // xv0.m
    public final void setItemRenderState(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f309159b = iVar;
    }
}
