package pzl;

import com.revolut.utils.job.workers.ProductAccountMigrationWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.i implements Function2 {
    public aim.e u;
    public aim.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f241042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ProductAccountMigrationWorker f241043y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ProductAccountMigrationWorker productAccountMigrationWorker, Continuation continuation) {
        super(2, continuation);
        this.f241043y = productAccountMigrationWorker;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.f241043y, continuation);
        tVar.f241042x = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (skm.e0.h(r2, r10) == r1) goto L32;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f241042x
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.f241041w
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.utils.job.workers.ProductAccountMigrationWorker r6 = r10.f241043y
            if (r2 == 0) goto L28
            if (r2 == r5) goto L20
            if (r2 != r4) goto L18
            yhm.o.b(r11)
            goto Lab
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            aim.e r2 = r10.v
            aim.e r5 = r10.u
            yhm.o.b(r11)
            goto L4a
        L28:
            yhm.o.b(r11)
            int r11 = r6.getRunAttemptCount()
            if (r11 <= r3) goto L36
            androidx.work.ListenableWorker$Result r11 = androidx.work.ListenableWorker.Result.failure()
            return r11
        L36:
            aim.e r2 = zhm.u.b()
            r10.f241042x = r0
            r10.u = r2
            r10.v = r2
            r10.f241041w = r5
            java.lang.Object r11 = com.revolut.utils.job.workers.ProductAccountMigrationWorker.a(r6, r10)
            if (r11 != r1) goto L49
            goto Laa
        L49:
            r5 = r2
        L4a:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L53
            androidx.work.ListenableWorker$Result r11 = androidx.work.ListenableWorker.Result.retry()
            return r11
        L53:
            java.util.Collection r11 = (java.util.Collection) r11
            r2.addAll(r11)
            aim.e r11 = zhm.u.a(r5)
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L67
            androidx.work.ListenableWorker$Result r11 = androidx.work.ListenableWorker.Result.success()
            return r11
        L67:
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r11, r5)
            r2.<init>(r5)
            r5 = 0
            java.util.ListIterator r11 = r11.listIterator(r5)
        L77:
            r5 = r11
            aim.b r5 = (aim.b) r5
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L9c
            java.lang.Object r5 = r5.next()
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r7 = r5.f186385a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.f186386b
            java.lang.String r5 = (java.lang.String) r5
            pzl.s r9 = new pzl.s
            r9.<init>(r6, r7, r5, r8)
            skm.h0 r5 = skm.e0.g(r0, r8, r8, r9, r3)
            r2.add(r5)
            goto L77
        L9c:
            r10.f241042x = r8
            r10.u = r8
            r10.v = r8
            r10.f241041w = r4
            java.lang.Object r11 = skm.e0.h(r2, r10)
            if (r11 != r1) goto Lab
        Laa:
            return r1
        Lab:
            androidx.work.ListenableWorker$Result r11 = androidx.work.ListenableWorker.Result.success()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pzl.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
