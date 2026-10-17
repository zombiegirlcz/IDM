package pjl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a1 extends gim.i implements Function2 {
    public String u;
    public b1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236792y;
    public final /* synthetic */ b1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, Continuation continuation) {
        super(2, continuation);
        this.z = b1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a1(this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (((akl.e1) r4).g(r5, r8, null, r7) == r0) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f236792y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            pjl.b1 r0 = r7.v
            java.lang.String r0 = (java.lang.String) r0
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L15
            goto L8c
        L15:
            r0 = move-exception
            r8 = r0
            r3 = r8
            goto L80
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            int r1 = r7.f236791x
            int r3 = r7.f236790w
            pjl.b1 r4 = r7.v
            java.lang.String r5 = r7.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L15
            goto L4f
        L2d:
            yhm.o.b(r8)
            pjl.b1 r4 = r7.z
            bjl.p0 r8 = r4.f236795b
            rqk.k r8 = (rqk.k) r8
            java.lang.String r5 = r8.f256593p
            akl.f1 r8 = r4.f236796c     // Catch: java.lang.Throwable -> L15
            r7.u = r5     // Catch: java.lang.Throwable -> L15
            r7.v = r4     // Catch: java.lang.Throwable -> L15
            r1 = 0
            r7.f236790w = r1     // Catch: java.lang.Throwable -> L15
            r7.f236791x = r1     // Catch: java.lang.Throwable -> L15
            r7.f236792y = r3     // Catch: java.lang.Throwable -> L15
            akl.n1 r8 = (akl.n1) r8     // Catch: java.lang.Throwable -> L15
            java.lang.Object r8 = r8.b(r7, r5, r1)     // Catch: java.lang.Throwable -> L15
            if (r8 != r0) goto L4e
            goto L7f
        L4e:
            r3 = r1
        L4f:
            com.revolut.sso.impl.domain.models.SessionToken r8 = (com.revolut.sso.impl.domain.models.SessionToken) r8     // Catch: java.lang.Throwable -> L15
            r6 = 0
            if (r8 == 0) goto L57
            java.lang.String r8 = r8.f106160a     // Catch: java.lang.Throwable -> L15
            goto L58
        L57:
            r8 = r6
        L58:
            if (r8 != 0) goto L6d
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r8 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "No session token available. User info won't update"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L15
            zhm.h0 r0 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a     // Catch: java.lang.Throwable -> L15
            rd0.c r1 = rd0.c.ERROR     // Catch: java.lang.Throwable -> L15
            rd0.d.a(r1, r6, r6, r8, r0)     // Catch: java.lang.Throwable -> L15
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L15
            return r8
        L6d:
            akl.o0 r4 = r4.f236794a     // Catch: java.lang.Throwable -> L15
            r7.u = r6     // Catch: java.lang.Throwable -> L15
            r7.v = r6     // Catch: java.lang.Throwable -> L15
            r7.f236790w = r3     // Catch: java.lang.Throwable -> L15
            r7.f236791x = r1     // Catch: java.lang.Throwable -> L15
            r7.f236792y = r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r8 = akl.o0.a(r4, r5, r8, r7)     // Catch: java.lang.Throwable -> L15
            if (r8 != r0) goto L8c
        L7f:
            return r0
        L80:
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r4 = 0
            r5 = 16
            r1 = 0
            r2 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
        L8c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
