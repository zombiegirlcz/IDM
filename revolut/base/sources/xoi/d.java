package xoi;

import android.app.Activity;
import android.content.Context;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nii.t0;
import r10.t;
import sri.m;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements fsi.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gsi.f f307857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f307858b;

    public d(gsi.f coreActivityApi, f retailContainerCoreActivityComponent) {
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        Intrinsics.checkNotNullParameter(retailContainerCoreActivityComponent, "retailContainerCoreActivityComponent");
        this.f307857a = coreActivityApi;
        this.f307858b = retailContainerCoreActivityComponent;
    }

    @Override // fsi.g
    public final yy0.f Q() {
        return this.f307857a.Q();
    }

    @Override // fsi.g
    public final mz0.a V() {
        return this.f307857a.V();
    }

    @Override // fsi.g
    public final c01.d W() {
        return this.f307857a.W();
    }

    @Override // fsi.g
    public final py0.e X() {
        return this.f307857a.X();
    }

    @Override // fsi.g
    public final xy0.a Y() {
        return this.f307857a.Y();
    }

    @Override // fsi.g
    public final h01.b Z() {
        return this.f307857a.Z();
    }

    @Override // fsi.g
    public final jz0.d a0() {
        return this.f307857a.a0();
    }

    @Override // fsi.g
    public final ty0.c b0() {
        return this.f307857a.b0();
    }

    @Override // fsi.g
    public final lz0.g c0() {
        return this.f307857a.c0();
    }

    @Override // fsi.g
    public final i01.b d0() {
        return this.f307857a.d0();
    }

    @Override // fsi.g
    public final Activity getActivity() {
        BaseDelegatesActivity baseDelegatesActivity = this.f307857a.f146537a;
        bq.i.a(baseDelegatesActivity);
        return baseDelegatesActivity;
    }

    @Override // fsi.g
    public final Integer getContainerId() {
        return this.f307857a.f146538b;
    }

    @Override // fsi.g
    public final Context getContext() {
        BaseDelegatesActivity baseDelegatesActivity = this.f307857a.f146537a;
        bq.i.h(baseDelegatesActivity);
        return baseDelegatesActivity;
    }

    @Override // fsi.g
    public final py0.f n0() {
        return this.f307857a.n0();
    }

    @Override // fsi.g
    public final kz0.b o0() {
        return this.f307857a.o0();
    }

    @Override // fsi.g
    public final m p0() {
        return this.f307857a.p0();
    }

    @Override // fsi.g
    public final Set q0() {
        return ((o41.c) this.f307858b).c();
    }

    @Override // fsi.g
    public final f9b.f r0() {
        o41.c cVar = (o41.c) this.f307858b;
        f9b.g gVar = (f9b.g) cVar.d().f141525g.get();
        BaseDelegatesActivity activity = this.f307857a.f146537a;
        kwl.b errorEventHandler = cVar.b();
        Set serverErrorHandlers = cVar.f();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(errorEventHandler, "errorEventHandler");
        Intrinsics.checkNotNullParameter(serverErrorHandlers, "serverErrorHandlers");
        yf.c cVar2 = new yf.c(activity);
        t tVar = new t(activity, gVar.f132906c, new t0(activity));
        return new f9b.f(cVar2, new f9b.i(gVar.f132904a, cVar2, tVar, gVar.f132905b, gVar.d, (tpi.j) u1.i(tpi.j.class, activity.L0().l0()), new jpf.a(gVar.f, serverErrorHandlers, errorEventHandler), gVar.e));
    }

    @Override // fsi.g
    public final msb.a s0() {
        msb.b bVar = (msb.b) ((o41.c) this.f307858b).e().f229309b.get();
        BaseDelegatesActivity activity = this.f307857a.f146537a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new msb.a((tpi.j) u1.i(tpi.j.class, activity.L0().l0()), bVar.f208644a);
    }

    @Override // fsi.g
    public final d01.g t0() {
        return this.f307857a.t0();
    }

    @Override // fsi.g
    public final tri.c u0() {
        return this.f307857a.u0();
    }

    @Override // fsi.g
    public final BaseDelegatesActivity v0() {
        return this.f307857a.f146537a;
    }

    @Override // fsi.g
    public final pri.f w0() {
        return ((o41.c) this.f307858b).a();
    }
}
