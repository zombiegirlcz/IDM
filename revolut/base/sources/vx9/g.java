package vx9;

import efm.d0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292861a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx9.a f292862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f292863c;
    public final Object d;

    public g(aa6.c donationsInteractor, ga6.a donationsTransferFeatureChecker, kx9.a recentsDao) {
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(donationsTransferFeatureChecker, "donationsTransferFeatureChecker");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        this.f292863c = donationsInteractor;
        this.d = donationsTransferFeatureChecker;
        this.f292862b = recentsDao;
    }

    @Override // vx9.t
    public final efm.b a(List transactions) {
        switch (this.f292861a) {
            case 0:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                pfm.a aVar = new pfm.a(ue0.e.F(prk.o.l(o71.a.c((o71.a) this.f292863c, true, 5), null, null, 3, "firstOrError(...)"), f0.f322471a), new vx5.m(new vrl.n(transactions, this, 13), 6), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 1:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                d0 d0VarA = ((ga6.a) this.d).a();
                vx5.m mVar = new vx5.m(new h(this, transactions, 0), 9);
                d0VarA.getClass();
                pfm.a aVar2 = new pfm.a(d0VarA, mVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 2:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                List<ux9.t> list = transactions;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ux9.t tVar : list) {
                        if ((tVar instanceof ux9.h) || (tVar instanceof ux9.i)) {
                            pfm.a aVar3 = new pfm.a(ue0.e.F(((bu9.a) this.d).f18754a.d(), Boolean.FALSE), new vx5.m(new j(this, transactions), 13), 4);
                            Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                            return aVar3;
                        }
                    }
                }
                pfm.m mVar2 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                return mVar2;
            default:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                pfm.a aVar4 = new pfm.a(te0.w.H0(((sl3.k) ((fl3.a) this.f292863c)).c(), ((yf.c) this.d).j()), new w(new vrl.n(this, transactions, 17), 2), 4);
                Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                return aVar4;
        }
    }

    public g(ap5.b cryptoWithdrawInteractor, bu9.a cryptoWalletsFeatureChecker, kx9.a recentsDao) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(cryptoWalletsFeatureChecker, "cryptoWalletsFeatureChecker");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        this.f292863c = cryptoWithdrawInteractor;
        this.d = cryptoWalletsFeatureChecker;
        this.f292862b = recentsDao;
    }

    public g(o71.a beneficiaryRepository, kx9.a recentsDao, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f292863c = beneficiaryRepository;
        this.f292862b = recentsDao;
        this.d = featureToggleInteractor;
    }

    public g(fl3.a contactsRepository, yf.c virtualContactsRepository, kx9.a recentsDao) {
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(virtualContactsRepository, "virtualContactsRepository");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        this.f292863c = contactsRepository;
        this.d = virtualContactsRepository;
        this.f292862b = recentsDao;
    }
}
