package n60;

import android.view.View;
import com.google.android.material.internal.ViewUtils;
import kotlin.jvm.internal.Intrinsics;
import n1.y;
import or0.u;
import yji.d;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f212662c;
    public final ihm.b d;
    public Integer e;
    public final y f;

    public b(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f212662c = controller;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.d = bVarE;
        this.f = new y(this, 22);
    }

    @Override // yji.d
    public final void onCreate() {
        View decorView = this.f212662c.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        u.a(decorView, this.f);
        ViewUtils.requestApplyInsetsWhenAttached(decorView);
    }

    @Override // yji.d
    public final void onDestroy() {
        View decorView = this.f212662c.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        u.q(decorView, this.f);
    }
}
