package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y45.j f185555c;
    public final m35.c d;
    public final Lazy e;

    public p1(CoroutineScope coroutineScope, h0 commonDataSource, y45.j loanRepaymentsInteractor, m35.c loanAutopayAccountMapper) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(loanRepaymentsInteractor, "loanRepaymentsInteractor");
        Intrinsics.checkNotNullParameter(loanAutopayAccountMapper, "loanAutopayAccountMapper");
        this.f185553a = coroutineScope;
        this.f185554b = commonDataSource;
        this.f185555c = loanRepaymentsInteractor;
        this.d = loanAutopayAccountMapper;
        this.e = yhm.j.b(new k98.a(this, 19));
    }
}
