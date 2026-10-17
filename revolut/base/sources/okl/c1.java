package okl;

import com.revolut.sso.api.models.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UserInfo f226158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g0 f226159x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.revolut.sso.impl.ui.auth.n nVar, UserInfo userInfo, g0 g0Var, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226158w = userInfo;
        this.f226159x = g0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c1(this.v, this.f226158w, this.f226159x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r10 == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okl.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
