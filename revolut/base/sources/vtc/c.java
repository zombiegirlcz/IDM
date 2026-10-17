package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonLinkedWalletsTabScreenContract$InputData f291955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f291956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f291957c;
    public final e4m.e d;

    public c(t tVar, CommonLinkedWalletsTabScreenContract$InputData commonLinkedWalletsTabScreenContract$InputData) {
        this.f291956b = tVar;
        this.f291955a = commonLinkedWalletsTabScreenContract$InputData;
        int i = 26;
        this.f291957c = e4m.b.b(new v4d.a(this, 1, i));
        this.d = e4m.b.b(new v4d.a(this, 0, i));
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
