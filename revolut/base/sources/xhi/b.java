package xhi;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.navigable.flow.BaseFlow;
import fsi.g;
import java.util.Collection;
import java.util.Set;
import ljl.q1;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseFlow f306246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final shi.a f306247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f306248c;
    public final e81.a d;
    public final ite.a e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final osb.a f306249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cri.b f306250h;
    public final KompotFlowContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final asi.b f306251j;
    public final q1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f306252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f306253m = e4m.b.b(new vxc.g(this, 0, 26));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f306254n = e4m.b.b(new vxc.g(this, 2, 26));
    public final e4m.e o = e4m.b.b(new vxc.g(this, 1, 26));

    public b(shi.a aVar, g gVar, e81.a aVar2, ite.a aVar3, osb.a aVar4, cri.b bVar, asi.b bVar2, q1 q1Var, BaseFlow baseFlow, Activity activity, KompotFlowContract$Configuration kompotFlowContract$Configuration, KompotLauncherFragment kompotLauncherFragment) {
        this.f306246a = baseFlow;
        this.f306247b = aVar;
        this.f306248c = kompotLauncherFragment;
        this.d = aVar2;
        this.e = aVar3;
        this.f = gVar;
        this.f306249g = aVar4;
        this.f306250h = bVar;
        this.i = kompotFlowContract$Configuration;
        this.f306251j = bVar2;
        this.k = q1Var;
        this.f306252l = activity;
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f306253m.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
