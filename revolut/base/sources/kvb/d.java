package kvb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExclusiveStoreInputData f190076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f190077b;

    public d(b bVar, ExclusiveStoreInputData exclusiveStoreInputData) {
        this.f190076a = exclusiveStoreInputData;
        this.f190077b = e4m.b.b(new c3(bVar, this, 19));
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
