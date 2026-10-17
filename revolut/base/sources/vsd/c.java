package vsd;

import frd.k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import vnl.o;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f291765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f291766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f291767c;
    public final oe6.a d;
    public final y91.b e;

    public c(f type, n walletInteractor, e linkedNetWorthProductsMapper, oe6.a externalInstitutionsInteractor, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(linkedNetWorthProductsMapper, "linkedNetWorthProductsMapper");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f291765a = type;
        this.f291766b = walletInteractor;
        this.f291767c = linkedNetWorthProductsMapper;
        this.d = externalInstitutionsInteractor;
        this.e = accountsProductFeatureChecker;
    }

    @Override // frd.k
    public final Flow b() {
        return k.a(this, new v1(new o(this, null, 4)), new vch.a(this, 26));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(n walletInteractor, e linkedNetWorthProductsMapper, oe6.a externalInstitutionsInteractor, y91.b accountsProductFeatureChecker, int i) {
        this(f.CREDIT, walletInteractor, linkedNetWorthProductsMapper, externalInstitutionsInteractor, accountsProductFeatureChecker);
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                Intrinsics.checkNotNullParameter(linkedNetWorthProductsMapper, "linkedNetWorthProductsMapper");
                Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
                Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
                this(f.DEBIT, walletInteractor, linkedNetWorthProductsMapper, externalInstitutionsInteractor, accountsProductFeatureChecker);
                break;
            default:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                Intrinsics.checkNotNullParameter(linkedNetWorthProductsMapper, "linkedNetWorthProductsMapper");
                Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
                Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
                break;
        }
    }
}
