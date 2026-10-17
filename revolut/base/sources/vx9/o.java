package vx9;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl3.a f292878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx9.f f292879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx9.a f292880c;
    public final ang.f d;

    public o(fl3.a contactsRepository, tx9.f timestampManager, kx9.a recentsDao, ang.f userInteractor, p localContactRecentsSyncInteractor) {
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(timestampManager, "timestampManager");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(localContactRecentsSyncInteractor, "localContactRecentsSyncInteractor");
        this.f292878a = contactsRepository;
        this.f292879b = timestampManager;
        this.f292880c = recentsDao;
        this.d = userInteractor;
    }

    public static String b(zm3.a aVar) {
        if (aVar instanceof zm3.e) {
            return ((zm3.e) aVar).getEmail();
        }
        if (aVar instanceof zm3.f) {
            return ((zm3.f) aVar).getPhone();
        }
        if (aVar instanceof zm3.i) {
            return ((zm3.i) aVar).getCode();
        }
        if (aVar instanceof zm3.j) {
            return ((zm3.j) aVar).getCode();
        }
        if (aVar instanceof zm3.n) {
            return ((zm3.n) aVar).getEmail();
        }
        if (aVar instanceof zm3.o) {
            return ((zm3.o) aVar).getPhone();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // vx9.t
    public final efm.b a(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        pfm.a aVar = new pfm.a(((sl3.k) this.f292878a).c(), new vx5.m(new vrl.n(transactions, this, 14), 21), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
