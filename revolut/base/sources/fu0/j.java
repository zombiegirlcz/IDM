package fu0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f138067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f138068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f138069c;
    public final float d;
    public final g e;
    public final g[] f;

    public j(View view, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f138067a = view;
        this.f138068b = i;
        this.f138069c = i2;
        this.d = f;
        g gVar = new g();
        this.e = gVar;
        this.f = new g[]{gVar};
    }

    @Override // fu0.h
    public final void B() {
        View view = this.f138067a;
        int paddingTop = view.getPaddingTop();
        int i = this.f138069c;
        int i2 = paddingTop - i;
        int height = (view.getHeight() - view.getPaddingBottom()) + i;
        float f = this.d;
        g gVar = this.e;
        gVar.f138065c = f;
        gVar.f138066g = true;
        int width = view.getWidth();
        int i3 = this.f138068b;
        gVar.d(i3, i2, width - i3, height);
    }

    @Override // fu0.h
    public final g[] b() {
        return this.f;
    }

    @Override // fu0.h
    public final View getView() {
        return this.f138067a;
    }
}
