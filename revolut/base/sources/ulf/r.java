package ulf;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ s C;
    public int D;
    public dj0.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f280991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f280992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dj0.d f280993y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.C = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
