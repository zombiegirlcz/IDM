package vge;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 implements qfe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f288872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f288873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f288874c;

    public b1(y2 productAccountsInfoInteractor, e2 productAccountRepository, d accountInteractor) {
        Intrinsics.checkNotNullParameter(productAccountsInfoInteractor, "productAccountsInfoInteractor");
        Intrinsics.checkNotNullParameter(productAccountRepository, "productAccountRepository");
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        this.f288872a = productAccountsInfoInteractor;
        this.f288873b = productAccountRepository;
        this.f288874c = accountInteractor;
    }

    @Override // qfe.c
    public final Flow a() {
        return vkm.q.Q(this.f288872a.d, new vdl.c1((Continuation) null, this, 2));
    }

    public final Object b(gim.c cVar) {
        return ((t2) this.f288873b).k(cVar);
    }
}
