package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.c {
    public int A;
    public AccountWrapper u;
    public x5i.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public StartUpPocket f203132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f203133x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f203134y;
    public final /* synthetic */ hd.r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(hd.r rVar, gim.c cVar) {
        super(cVar);
        this.z = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203134y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.y(null, null, this, null);
    }
}
