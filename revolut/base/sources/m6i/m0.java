package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends gim.c {
    public AccountWrapper u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f203183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f203185y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.f203185y = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203184x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f203185y.c(null, null, this, null);
    }
}
