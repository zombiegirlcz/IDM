package n8a;

import com.revolut.feature.pix.impl.data.network.PixTransactionsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixTransactionsService f213307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o71.a f213308b;

    public d0(PixTransactionsService pixTransactionsService, o71.a beneficiaryRepository) {
        Intrinsics.checkNotNullParameter(pixTransactionsService, "pixTransactionsService");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        this.f213307a = pixTransactionsService;
        this.f213308b = beneficiaryRepository;
    }
}
