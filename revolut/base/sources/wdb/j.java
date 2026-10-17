package wdb;

import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.c {
    public String u;
    public Reservation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f296522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f296523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f296524y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, gim.c cVar) {
        super(cVar);
        this.f296523x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f296522w = obj2;
        this.f296524y |= Integer.MIN_VALUE;
        return n.b(this.f296523x, null, this);
    }
}
