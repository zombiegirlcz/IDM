package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedWalletsTabRevampScreenContract$InputData f292028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f292029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292030c;
    public final e4m.e d;

    public m(t tVar, LinkedWalletsTabRevampScreenContract$InputData linkedWalletsTabRevampScreenContract$InputData) {
        this.f292029b = tVar;
        this.f292028a = linkedWalletsTabRevampScreenContract$InputData;
        int i = 12;
        this.f292030c = e4m.b.b(new vn2.l(tVar, this, 1, i));
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
