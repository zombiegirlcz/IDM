package bma;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yme.a f16781b;

    public b(f userInteractor, yme.a taxResidencyInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        this.f16780a = userInteractor;
        this.f16781b = taxResidencyInteractor;
    }
}
