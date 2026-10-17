package pzl;

import com.revolut.utils.job.workers.WalletsReloadWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ WalletsReloadWorker v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(WalletsReloadWorker walletsReloadWorker, Continuation continuation) {
        super(2, continuation);
        this.v = walletsReloadWorker;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (nim.a.a(r6, r5) == r1) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Exception {
        /*
            r5 = this;
            com.revolut.utils.job.workers.WalletsReloadWorker r0 = r5.v
            osg.b r0 = r0.f107368a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r5.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L14
            goto L46
        L14:
            r6 = move-exception
            goto L4b
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L14
            goto L35
        L22:
            yhm.o.b(r6)
            r6 = r0
            wsg.n r6 = (wsg.n) r6     // Catch: java.lang.Exception -> L14
            pfm.a r6 = r6.m0(r4)     // Catch: java.lang.Exception -> L14
            r5.u = r4     // Catch: java.lang.Exception -> L14
            java.lang.Object r6 = nim.a.a(r6, r5)     // Catch: java.lang.Exception -> L14
            if (r6 != r1) goto L35
            goto L45
        L35:
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Exception -> L14
            wsg.n r0 = (wsg.n) r0     // Catch: java.lang.Exception -> L14
            pfm.a r6 = r0.k0(r6)     // Catch: java.lang.Exception -> L14
            r5.u = r3     // Catch: java.lang.Exception -> L14
            java.lang.Object r6 = nim.a.a(r6, r5)     // Catch: java.lang.Exception -> L14
            if (r6 != r1) goto L46
        L45:
            return r1
        L46:
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.success()     // Catch: java.lang.Exception -> L14
            return r6
        L4b:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L5e
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.retry()
            return r6
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pzl.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
