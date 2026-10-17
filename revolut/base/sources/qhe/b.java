package qhe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zfe.b f246603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oqk.b f246604b;

    public b(zfe.b accountsPresentationPrefetcher, oqk.b retailAccountCustomizationInteractor) {
        Intrinsics.checkNotNullParameter(accountsPresentationPrefetcher, "accountsPresentationPrefetcher");
        Intrinsics.checkNotNullParameter(retailAccountCustomizationInteractor, "retailAccountCustomizationInteractor");
        this.f246603a = accountsPresentationPrefetcher;
        this.f246604b = retailAccountCustomizationInteractor;
    }
}
