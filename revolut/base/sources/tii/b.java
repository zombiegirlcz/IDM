package tii;

import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import e4m.e;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements qji.a, gji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionsFlowContract$InputData f271531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFlow f271532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f271533c = this;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f271534g;

    public b(PermissionsFlow permissionsFlow, PermissionsFlowContract$InputData permissionsFlowContract$InputData) {
        this.f271531a = permissionsFlowContract$InputData;
        this.f271532b = permissionsFlow;
        int i = 27;
        this.d = e4m.b.b(new sac.a(this, 2, i));
        this.e = e4m.b.b(new sac.a(this, 1, i));
        this.f = e4m.b.b(new sac.a(this, 3, i));
        this.f271534g = e4m.b.b(new sac.a(this, 0, i));
    }

    @Override // gji.b
    public final gji.a b() {
        return new c(this.f271533c);
    }

    @Override // dki.t
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // dki.q
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
