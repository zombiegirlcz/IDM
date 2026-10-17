package e25;

import a35.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements yfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vie.h f122036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final she.g f122037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f122038c;

    public f(vie.h tabCreditAvailabilityInteractor, she.g productAccountDestinationResolver, n creditProductsMediator) {
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(creditProductsMediator, "creditProductsMediator");
        this.f122036a = tabCreditAvailabilityInteractor;
        this.f122037b = productAccountDestinationResolver;
        this.f122038c = creditProductsMediator;
    }

    @Override // yfe.d
    public final yfe.c a() {
        return new e(this.f122036a, this.f122037b, this.f122038c);
    }
}
