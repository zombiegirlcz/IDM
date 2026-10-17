package mcm;

import com.google.common.base.Preconditions;
import ecm.a1;
import ecm.x0;
import ecm.z0;
import gcm.k4;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f204390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f204391b;

    public j(x0 x0Var, z0 z0Var) {
        this.f204390a = (x0) Preconditions.checkNotNull(x0Var, "delegate");
        this.f204391b = (z0) Preconditions.checkNotNull(z0Var, "healthListener");
    }

    @Override // ecm.x0
    public final ecm.b c() {
        ecm.b bVarC = this.f204390a.c();
        bVarC.getClass();
        ecm.a aVar = a1.d;
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(aVar, bool);
        for (Map.Entry entry : bVarC.f124780a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((ecm.a) entry.getKey(), entry.getValue());
            }
        }
        return new ecm.b(identityHashMap);
    }

    @Override // ecm.x0
    public final void h(z0 z0Var) {
        this.f204390a.h(new k4(this, z0Var, 1));
    }

    @Override // mcm.d
    public final x0 j() {
        return this.f204390a;
    }
}
