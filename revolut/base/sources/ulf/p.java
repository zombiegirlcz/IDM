package ulf;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public int A;
    public dj0.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public StartUpPocket f280987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f280988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f280989y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.z = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280989y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, this);
    }
}
