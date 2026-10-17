package akl;

import jkl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class m1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r2 f6055x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, String str, r2 r2Var, Continuation continuation) {
        super(2, continuation);
        this.v = n1Var;
        this.f6054w = str;
        this.f6055x = r2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m1(this.v, this.f6054w, this.f6055x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r3.h(r7, r1, r6) == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            jkl.r2 r2 = r6.f6055x
            akl.n1 r3 = r6.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r7)
            goto L4a
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L34
        L20:
            yhm.o.b(r7)
            akl.o0 r7 = r3.d
            java.lang.String r1 = r2.getSessionToken()
            r6.u = r5
            java.lang.String r5 = r6.f6054w
            java.lang.Object r7 = akl.o0.a(r7, r5, r1, r6)
            if (r7 != r0) goto L34
            goto L49
        L34:
            com.revolut.sso.api.models.UserInfo r7 = (com.revolut.sso.api.models.UserInfo) r7
            if (r7 == 0) goto L4d
            com.revolut.sso.impl.domain.models.SessionToken r1 = new com.revolut.sso.impl.domain.models.SessionToken
            java.lang.String r2 = r2.getSessionToken()
            r1.<init>(r2)
            r6.u = r4
            java.lang.Object r7 = r3.h(r7, r1, r6)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L4d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r0 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "Couldn't get user info"
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
