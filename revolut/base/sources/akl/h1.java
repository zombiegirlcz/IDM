package akl;

import com.revolut.sso.api.accounts.RevolutAccount;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 extends gim.c {
    public RevolutAccount A;
    public Collection B;
    public RevolutAccount C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ n1 H;
    public int I;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f6025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f6026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f6027y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.H = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.G = obj2;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, null, this);
    }
}
