package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 extends gim.c {
    public x5i.d u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f203143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203144x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f203145y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f203145y = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203144x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f203145y.b(null, null, this);
    }
}
