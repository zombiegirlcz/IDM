package jcc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements mcc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromotedMerchantsDestination.InputData f172763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f172764b;

    public c(e eVar, PromotedMerchantsDestination.InputData inputData) {
        this.f172763a = inputData;
        this.f172764b = e4m.b.b(new b(eVar, this));
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
