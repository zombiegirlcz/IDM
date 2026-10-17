package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.MerchantPermissionsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MerchantPermissionsScreenContract$InputData f195908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f195909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f195910c = e4m.b.b(new n(this, 1));

    public c0(q0 q0Var, c cVar, MerchantPermissionsScreenContract$InputData merchantPermissionsScreenContract$InputData) {
        this.f195909b = cVar;
        this.f195908a = merchantPermissionsScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f195909b.Q.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f195909b.P.get());
    }
}
