package vx9;

import efm.d0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class z implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl3.a f292893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl3.u f292894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx9.f f292895c;
    public final kx9.a d;
    public final hj8.a e;
    public final ang.f f;

    public z(fl3.a contactsRepository, sl3.u remoteContactsRepository, tx9.f timestampManager, kx9.a recentsDao, hj8.a juniorProfileInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(remoteContactsRepository, "remoteContactsRepository");
        Intrinsics.checkNotNullParameter(timestampManager, "timestampManager");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f292893a = contactsRepository;
        this.f292894b = remoteContactsRepository;
        this.f292895c = timestampManager;
        this.d = recentsDao;
        this.e = juniorProfileInteractor;
        this.f = userInteractor;
    }

    public static String b(ux9.t tVar) {
        if (tVar instanceof ux9.o) {
            return ((ux9.o) tVar).c();
        }
        if (tVar instanceof ux9.s) {
            return ((ux9.s) tVar).c();
        }
        if ((tVar instanceof ux9.l) || (tVar instanceof ux9.j) || (tVar instanceof ux9.m) || (tVar instanceof ux9.e) || (tVar instanceof ux9.h) || (tVar instanceof ux9.i) || (tVar instanceof ux9.q) || (tVar instanceof ux9.f) || (tVar instanceof ux9.k) || (tVar instanceof ux9.p) || (tVar instanceof ux9.a) || (tVar instanceof ux9.r) || (tVar instanceof ux9.g)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // vx9.t
    public final efm.b a(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        ufm.n nVarC = ((sl3.k) this.f292893a).c();
        sl3.u uVar = this.f292894b;
        d0 d0VarFirstOrError = uVar.f264132a.g().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        d0 d0VarD = uVar.f264133b.d();
        sl3.r rVar = new sl3.r(new sl3.i(3), 1);
        d0VarD.getClass();
        ufm.i iVar = new ufm.i(d0VarD, rVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.H0(d0VarFirstOrError, iVar), new sl3.r(new sl3.i(5), 11), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        pfm.a aVar = new pfm.a(te0.w.H0(nVarC, te0.w.i0(iVar2)), new vx5.m(new vrl.n(this, transactions, 16), 27), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
