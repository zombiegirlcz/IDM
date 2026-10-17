package ku5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters.FiltersScreenContract$InputData;
import java.util.Set;
import jm4.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiltersScreenContract$InputData f189699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f189700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f189701c;

    public i(g gVar, l lVar, FiltersScreenContract$InputData filtersScreenContract$InputData) {
        this.f189699a = filtersScreenContract$InputData;
        int i = 26;
        this.f189700b = e4m.b.b(new o3(this, 1, i));
        this.f189701c = e4m.b.b(new o3(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
