package xab;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ LoginFragment v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f303835w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LoginFragment loginFragment, gim.c cVar) {
        super(cVar);
        this.v = loginFragment;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f303835w |= Integer.MIN_VALUE;
        return LoginFragment.E(this.v, this);
    }
}
