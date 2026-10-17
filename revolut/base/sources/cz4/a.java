package cz4;

import je6.h;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f110156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f110157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f110158c;

    public a(n walletInteractor, oe6.a externalInstitutionsInteractor, h externalInstitutionLogoMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        this.f110156a = walletInteractor;
        this.f110157b = externalInstitutionsInteractor;
        this.f110158c = externalInstitutionLogoMapper;
    }
}
