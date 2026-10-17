package cqi;

import android.os.Bundle;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import rp0.n0;
import rp0.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends fsi.c implements h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BaseDelegatesActivity f108138h;
    public final p0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BaseDelegatesActivity activity) {
        super(a.f108123a);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f108138h = activity;
        this.i = new p0();
    }

    public final r N() {
        r map = this.i.f256148b.p().map(new rof.e(16, new n0(7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r O() {
        return this.i.d();
    }

    public final r Q() {
        return this.i.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(cqi.f r23) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cqi.j.R(cqi.f):void");
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        p0 p0Var = this.i;
        p0Var.getClass();
        BaseDelegatesActivity activity = this.f108138h;
        Intrinsics.checkNotNullParameter(activity, "activity");
        p0Var.f256147a.e(activity);
    }
}
