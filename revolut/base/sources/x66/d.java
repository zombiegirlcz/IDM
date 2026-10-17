package x66;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k18.c f303048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv5.c f303049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g26.b f303050c;
    public final u66.b d;

    public d(k18.c accountsInteractor, xv5.c baseCurrencyInteractor, g26.b assetDetailsInteractor, u66.b assetsRepository) {
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        Intrinsics.checkNotNullParameter(assetsRepository, "assetsRepository");
        this.f303048a = accountsInteractor;
        this.f303049b = baseCurrencyInteractor;
        this.f303050c = assetDetailsInteractor;
        this.d = assetsRepository;
    }
}
