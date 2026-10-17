package mii;

import android.R;
import android.app.Activity;
import android.view.View;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.g1;
import rp0.k1;
import rp0.x0;
import skm.e0;
import skm.p0;
import vkm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends tji.i implements CoroutineScope {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f205851c;
    public final k1 d;

    public d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f205851c = rd0.e.a(p0.f264003c.plus(e0.e()));
        x0 x0Var = g1.Companion;
        View viewFindViewById = activity.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = activity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "getDecorView(...)");
        }
        this.d = x0.a(x0Var, viewFindViewById);
    }

    @Override // tji.i
    public final boolean a(tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return dialogModel instanceof l;
    }

    @Override // tji.i
    public final void b() {
        this.d.c();
    }

    @Override // tji.i
    public final void d() {
        vkm.q.G(new q0(new c(rd0.e.b(this.d.d), 0), new ald.p(this, null, 9), 1), this);
    }

    @Override // tji.i
    public final void e() {
        super.e();
        e0.n(this.f205851c.getF74819h());
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF74819h() {
        return this.f205851c.getF74819h();
    }

    @Override // tji.i
    public final void i(tji.l lVar) {
        l dialogModel = (l) lVar;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.d.d(a.a(dialogModel));
    }
}
