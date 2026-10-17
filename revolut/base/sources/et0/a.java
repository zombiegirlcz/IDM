package et0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import ix0.d2;
import ix0.f2;
import ix0.i2;
import ix0.j2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f129001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f129002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f129003c;
    public final f2 d;
    public View e;
    public Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f129004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j2 f129005h;
    public final a0.a i;

    public a(Activity activity, View anchorView, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f129001a = anchorView;
        this.f129002b = i;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f129003c = (ViewGroup) decorView;
        this.d = new f2(anchorView, this);
        this.i = new a0.a(this, 26);
    }

    @Override // ix0.d2
    public final void D(boolean z) {
        ViewGroup viewGroup = this.f129003c;
        if (z) {
            viewGroup.addView(this.e);
            j2.Companion.getClass();
            this.f129005h = i2.a(this.f129001a, this.i);
        } else {
            j2 j2Var = this.f129005h;
            if (j2Var != null) {
                j2Var.cancel();
            }
            this.f129005h = null;
            viewGroup.removeView(this.e);
            this.e = null;
        }
    }
}
