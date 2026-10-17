package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.root.StoreFlowContract$InputData;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreFlowContract$InputData f180527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f180528b;

    public k(j jVar, StoreFlowContract$InputData storeFlowContract$InputData) {
        this.f180527a = storeFlowContract$InputData;
        this.f180528b = e4m.b.b(new c3(jVar, this, 10));
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
