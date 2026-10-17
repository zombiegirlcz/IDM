package pjl;

import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes13.dex */
public final class m0 extends gim.i implements Function2 {
    public int A;
    public int B;
    public int C;
    public final /* synthetic */ z0 D;
    public z0 u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f236827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236829y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(z0 z0Var, Continuation continuation) {
        super(2, continuation);
        this.D = z0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m0(this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r14 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:19:0x0077). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.C
            pjl.z0 r2 = r13.D
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 == r4) goto L2c
            if (r1 != r3) goto L24
            int r1 = r13.B
            int r2 = r13.A
            int r5 = r13.z
            int r6 = r13.f236829y
            int r7 = r13.f236828x
            java.lang.Object[] r8 = r13.f236827w
            java.util.Collection r9 = r13.v
            java.util.Collection r9 = (java.util.Collection) r9
            pjl.z0 r10 = r13.u
            yhm.o.b(r14)
            goto L77
        L24:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2c:
            yhm.o.b(r14)
            goto L42
        L30:
            yhm.o.b(r14)
            pjl.a r14 = r2.g()
            r13.C = r4
            java.lang.String r1 = "com.revolut.sso"
            java.lang.Object r14 = r14.c(r1)
            if (r14 != r0) goto L42
            goto L73
        L42:
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r5 = r14.length
            r6 = 0
            r8 = r14
            r9 = r1
            r14 = r2
            r1 = r5
            r2 = r6
            r5 = r2
            r7 = r5
        L52:
            if (r2 >= r1) goto L81
            r10 = r8[r2]
            android.accounts.Account r10 = (android.accounts.Account) r10
            r13.u = r14
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            r13.v = r11
            r13.f236827w = r8
            r13.f236828x = r7
            r13.f236829y = r6
            r13.z = r5
            r13.A = r2
            r13.B = r1
            r13.C = r3
            java.lang.Object r10 = pjl.z0.b(r14, r10, r13)
            if (r10 != r0) goto L74
        L73:
            return r0
        L74:
            r12 = r10
            r10 = r14
            r14 = r12
        L77:
            com.revolut.sso.api.accounts.RevolutAccount r14 = (com.revolut.sso.api.accounts.RevolutAccount) r14
            if (r14 == 0) goto L7e
            r9.add(r14)
        L7e:
            int r2 = r2 + r4
            r14 = r10
            goto L52
        L81:
            java.util.List r9 = (java.util.List) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
