package afa;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends yji.d {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f3986c;
    public final j2 d;
    public final a7b.r e;

    public f(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f3986c = controller;
        this.d = vkm.q.c(Boolean.FALSE);
        this.e = new a7b.r(this, 29);
    }

    @Override // yji.d
    public final void onCreate() {
        com.revolut.kompot.navigable.a aVar = this.f3986c;
        View decorView = aVar.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        or0.u.a(decorView, this.e);
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(aVar.D2());
        boolean z = false;
        if (rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        j2 j2Var = this.d;
        j2Var.getClass();
        j2Var.g(null, boolValueOf);
        ViewUtils.requestApplyInsetsWhenAttached(decorView);
    }

    @Override // yji.d
    public final void onDestroy() {
        View decorView = this.f3986c.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        or0.u.q(decorView, this.e);
    }
}
