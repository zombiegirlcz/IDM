package psc;

import kotlin.jvm.internal.Intrinsics;
import nd.k;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f239470a;

    public b(dsc.a dependenciesProvider, k beneficiaryNameProvider, msc.a legalEntityProvider) {
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(beneficiaryNameProvider, "beneficiaryNameProvider");
        Intrinsics.checkNotNullParameter(legalEntityProvider, "legalEntityProvider");
        this.f239470a = beneficiaryNameProvider;
    }
}
