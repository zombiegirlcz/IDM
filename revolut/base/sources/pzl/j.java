package pzl;

import com.revolut.utils.job.workers.CreditCardDebitToCreditInstalmentPlansWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardDebitToCreditInstalmentPlansWorker f241025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241026x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CreditCardDebitToCreditInstalmentPlansWorker creditCardDebitToCreditInstalmentPlansWorker, Continuation continuation) {
        super(continuation);
        this.f241025w = creditCardDebitToCreditInstalmentPlansWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241026x |= Integer.MIN_VALUE;
        return this.f241025w.doWork(this);
    }
}
