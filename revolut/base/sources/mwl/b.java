package mwl;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (skm.k0.c(r3, r8) != r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            yhm.o.b(r9)
            goto Lbc
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            yhm.o.b(r9)
            goto La9
        L24:
            yhm.o.b(r9)
            goto L9e
        L29:
            yhm.o.b(r9)
            goto L4d
        L2d:
            yhm.o.b(r9)
            android.app.ActivityManager$RunningAppProcessInfo r9 = new android.app.ActivityManager$RunningAppProcessInfo
            r9.<init>()
            android.app.ActivityManager.getMyMemoryState(r9)
            int r9 = r9.importance
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 <= r1) goto L41
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L41:
            mwl.e r9 = r8.v
            r8.u = r5
            java.lang.Object r9 = mwl.e.b(r9, r8)
            if (r9 != r0) goto L4d
            goto Lbb
        L4d:
            mwl.e r9 = r8.v
            r8.u = r4
            kotlin.coroutines.CoroutineContext r1 = r8.getContext()
            skm.e0.p(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r9.f209550h
            r1.incrementAndGet()
            d4m.a r1 = r9.f
            java.lang.Object r1 = r1.get()
            xjl.n r1 = (xjl.n) r1
            r1.getClass()
            kll.c r4 = new kll.c
            bjl.p0 r6 = r1.f306574a
            akl.i0 r7 = r1.f306575b
            akl.z r1 = r1.f306576c
            r4.<init>(r6, r7, r1)
            kotlin.coroutines.CoroutineContext r1 = r8.getContext()
            skm.e0.p(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r9.f209550h
            r1.incrementAndGet()
            akl.i0 r1 = r4.i
            gkl.v0 r1 = r1.d()
            r4 = 0
            if (r1 == 0) goto L8a
            r1 = r5
            goto L8b
        L8a:
            r1 = r4
        L8b:
            if (r1 != 0) goto L94
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r9.f209551j = r1
            goto L99
        L94:
            r9.f209552l = r5
            r9.c(r4)
        L99:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            if (r9 != r0) goto L9e
            goto Lbb
        L9e:
            mwl.e r9 = r8.v
            r8.u = r3
            java.lang.Object r9 = mwl.e.a(r9, r8)
            if (r9 != r0) goto La9
            goto Lbb
        La9:
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            r9 = 15
            pkm.e r1 = pkm.e.SECONDS
            long r3 = kotlin.time.c.g(r9, r1)
            r8.u = r2
            java.lang.Object r9 = skm.k0.c(r3, r8)
            if (r9 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            mwl.e r9 = r8.v
            r9.f209552l = r5
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mwl.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
