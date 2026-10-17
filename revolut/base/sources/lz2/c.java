package lz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreenContract$InputData;
import java.util.Set;
import lti.l;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardLimitOverviewScreenContract$InputData f200905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f200906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200907c;

    public c(a aVar, b bVar, CardLimitOverviewScreenContract$InputData cardLimitOverviewScreenContract$InputData) {
        this.f200905a = cardLimitOverviewScreenContract$InputData;
        this.f200906b = e4m.b.b(new l(aVar, this, 1, 28));
        this.f200907c = e4m.b.b(new l(aVar, this, 0, 28));
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
