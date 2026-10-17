package pjl;

import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.impl.domain.models.RevolutAccountImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 extends gim.i implements Function2 {
    public int A;
    public int B;
    public final /* synthetic */ z0 C;
    public final /* synthetic */ RevolutAccountImpl D;
    public final /* synthetic */ String E;
    public z0 u;
    public RevolutAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f236853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f236854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236855y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z0 z0Var, RevolutAccountImpl revolutAccountImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.C = z0Var;
        this.D = revolutAccountImpl;
        this.E = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u0(this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (pjl.z0.d(r10, r13, r8, r7, r12) == r0) goto L36;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
