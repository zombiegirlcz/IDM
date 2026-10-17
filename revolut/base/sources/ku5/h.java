package ku5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiltersByTypeScreenContract$InputData f189696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f189697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f189698c;

    public h(g gVar, l lVar, FiltersByTypeScreenContract$InputData filtersByTypeScreenContract$InputData) {
        this.f189696a = filtersByTypeScreenContract$InputData;
        int i = 7;
        this.f189697b = e4m.b.b(new kr9.m(gVar, this, 1, i));
        this.f189698c = e4m.b.b(new kr9.m(gVar, this, 0, i));
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
