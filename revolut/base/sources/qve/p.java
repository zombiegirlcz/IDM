package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreenContract$InputData;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoredMethodDetailsScreenContract$InputData f249645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249647c;

    public p(k kVar, StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData) {
        this.f249645a = storedMethodDetailsScreenContract$InputData;
        int i = 17;
        this.f249646b = e4m.b.b(new v1(kVar, this, 1, i));
        this.f249647c = e4m.b.b(new v1(kVar, this, 0, i));
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
