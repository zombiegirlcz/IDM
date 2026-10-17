package osa;

import com.revolut.feature.transfer.models.transfer.RecipientTrustState;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public String u;
    public RecipientTrustState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f229292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f229293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f229294y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f229293x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f229292w = obj2;
        this.f229294y |= Integer.MIN_VALUE;
        return this.f229293x.a(null, this);
    }
}
