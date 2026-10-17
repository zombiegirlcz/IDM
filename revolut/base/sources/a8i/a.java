package a8i;

import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public MoveMoneyOrderInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f2254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2255x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f2254w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f2255x |= Integer.MIN_VALUE;
        return this.f2254w.a(null, this);
    }
}
