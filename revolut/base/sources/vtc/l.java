package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedWalletsScreenContract$InputData f292009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f292010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292011c;
    public final e4m.e d;

    public l(t tVar, LinkedWalletsScreenContract$InputData linkedWalletsScreenContract$InputData) {
        this.f292010b = tVar;
        this.f292009a = linkedWalletsScreenContract$InputData;
        int i = 11;
        this.f292011c = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.d = e4m.b.b(new vn2.l(tVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
