package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public int A;
    public AccountWrapper u;
    public StartUpPocket v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x5i.d f203161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f203162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f203163y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203163y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, this, null);
    }
}
