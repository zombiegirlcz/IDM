package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public AccountWrapper u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f203146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f203148y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.f203148y = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203147x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f203148y.a(null, 0L, null, null, this);
    }
}
