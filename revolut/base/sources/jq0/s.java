package jq0;

import android.view.View;
import ix0.a2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements View.OnLayoutChangeListener, a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f177397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f177398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f177399c;
    public final /* synthetic */ Function0 d;

    public s(View view, t tVar, long j2, Function0 function0) {
        this.f177397a = view;
        this.f177398b = tVar;
        this.f177399c = j2;
        this.d = function0;
    }

    @Override // ix0.a2
    public final void cancel() {
        this.f177397a.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        t tVar = this.f177398b;
        if (tVar.f177400a.getVisibility() != 0) {
            tVar.f177400a.setVisibility(0);
            tVar.f = tVar.f177400a.getHeight();
            tVar.d();
        }
        tVar.c(kotlin.ranges.f.i(tVar.b() ? 0L : (long) ((this.f177399c * tVar.f) / tVar.f177400a.getHeight()), 0L, this.f177399c), this.d, true);
    }
}
