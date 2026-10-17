package pjl;

import com.revolut.sso.api.accounts.RevolutAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 extends gim.i implements Function2 {
    public int A;
    public final /* synthetic */ z0 B;
    public final /* synthetic */ RevolutAccount C;
    public z0 u;
    public RevolutAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f236822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236824y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(RevolutAccount revolutAccount, Continuation continuation, z0 z0Var) {
        super(2, continuation);
        this.B = z0Var;
        this.C = revolutAccount;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l0(this.C, continuation, this.B);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r11.g(r7, r6, null) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.A
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L11
            goto L81
        L11:
            r11 = move-exception
            goto L86
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            int r1 = r10.z
            int r3 = r10.f236824y
            int r5 = r10.f236823x
            java.lang.String r6 = r10.f236822w
            com.revolut.sso.api.accounts.RevolutAccount r7 = r10.v
            pjl.z0 r8 = r10.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L11
            goto L58
        L2c:
            yhm.o.b(r11)
            pjl.z0 r8 = r10.B
            com.revolut.sso.api.accounts.RevolutAccount r7 = r10.C
            java.lang.String r6 = "JUNIOR_ACCOUNT_GRADUATION_DATA"
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L11
            pjl.a r11 = r8.g()     // Catch: java.lang.Throwable -> L11
            r1 = r7
            com.revolut.sso.impl.domain.models.RevolutAccountImpl r1 = (com.revolut.sso.impl.domain.models.RevolutAccountImpl) r1     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.f106159c     // Catch: java.lang.Throwable -> L11
            r10.u = r8     // Catch: java.lang.Throwable -> L11
            r10.v = r7     // Catch: java.lang.Throwable -> L11
            r10.f236822w = r6     // Catch: java.lang.Throwable -> L11
            r5 = 0
            r10.f236823x = r5     // Catch: java.lang.Throwable -> L11
            r10.f236824y = r5     // Catch: java.lang.Throwable -> L11
            r10.z = r5     // Catch: java.lang.Throwable -> L11
            r10.A = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r11 = r11.c(r1)     // Catch: java.lang.Throwable -> L11
            if (r11 != r0) goto L56
            goto L80
        L56:
            r1 = r5
            r3 = r1
        L58:
            java.lang.Object[] r11 = (java.lang.Object[]) r11     // Catch: java.lang.Throwable -> L11
            android.accounts.Account r9 = ksj.b.O(r7)     // Catch: java.lang.Throwable -> L11
            boolean r11 = kotlin.collections.d.I(r11, r9)     // Catch: java.lang.Throwable -> L11
            if (r11 == 0) goto L81
            pjl.a r11 = r8.g()     // Catch: java.lang.Throwable -> L11
            android.accounts.Account r7 = ksj.b.O(r7)     // Catch: java.lang.Throwable -> L11
            r10.u = r4     // Catch: java.lang.Throwable -> L11
            r10.v = r4     // Catch: java.lang.Throwable -> L11
            r10.f236822w = r4     // Catch: java.lang.Throwable -> L11
            r10.f236823x = r5     // Catch: java.lang.Throwable -> L11
            r10.f236824y = r3     // Catch: java.lang.Throwable -> L11
            r10.z = r1     // Catch: java.lang.Throwable -> L11
            r10.A = r2     // Catch: java.lang.Throwable -> L11
            kotlin.Unit r11 = r11.g(r7, r6, r4)     // Catch: java.lang.Throwable -> L11
            if (r11 != r0) goto L81
        L80:
            return r0
        L81:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L11
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L11
            goto L8c
        L86:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L8c:
            java.lang.Throwable r11 = yhm.m.a(r11)
            if (r11 == 0) goto Lae
            boolean r0 = r11 instanceof java.lang.SecurityException
            if (r0 == 0) goto La5
            com.revolut.sso.impl.data.repositories.SsoIsNotSupportedProperlyException r0 = new com.revolut.sso.impl.data.repositories.SsoIsNotSupportedProperlyException
            r0.<init>(r11)
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r0, r11)
            goto Lae
        La5:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r11, r0)
        Lae:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
