package ael;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements ybl.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.i f3623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3624b;

    public i0(Map productsProviders, ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        this.f3623a = productGroupAvailabilityInteractor;
        this.f3624b = productsProviders;
    }

    public final akg.n a(cfl.p productGroup, String portfolioId) {
        Intrinsics.checkNotNullParameter(productGroup, "productGroup");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return nim.a.v(((h0) this.f3623a).b(productGroup), new a31.m(this, 11, productGroup, portfolioId));
    }
}
