package okl;

import com.revolut.sso.impl.domain.models.AuthAction;

/* JADX INFO: loaded from: classes12.dex */
public final class m1 extends gim.c {
    public AuthAction u;
    public jkl.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n1 f226216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226217y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.f226216x = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226215w = obj2;
        this.f226217y |= Integer.MIN_VALUE;
        return this.f226216x.b(null, null, this);
    }
}
