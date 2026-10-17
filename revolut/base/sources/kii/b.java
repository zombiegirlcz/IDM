package kii;

import akl.s;
import android.app.Activity;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import ie.b0;
import kotlin.jvm.internal.Intrinsics;
import tji.i;
import tji.l;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f184240c;
    public final rp0.d d;
    public ifm.c e;

    public b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f184240c = activity;
        this.d = new rp0.d(activity);
    }

    @Override // tji.i
    public final boolean a(l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return dialogModel instanceof c;
    }

    @Override // tji.i
    public final void b() {
        this.d.a();
    }

    @Override // tji.i
    public final void c() {
        r map = this.d.f256060c.map(new b0(new jli.f(3), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        s sVar = new s(this, 23);
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new a31.a(new bo.c(new BreadcrumbException(), 12), 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(4, sVar), new bo.e(4, a.f184239a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.e = cVarSubscribe;
    }

    @Override // tji.i
    public final void f() {
        ifm.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
    }

    @Override // tji.i
    public final void i(l lVar) {
        c dialogModel = (c) lVar;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        if (this.f184240c.isFinishing()) {
            return;
        }
        this.d.b(new rp0.b(dialogModel.a(), dialogModel.f(), dialogModel.b(), dialogModel.e(), null, dialogModel.c(), dialogModel.d(), dialogModel.g(), null, null));
    }
}
