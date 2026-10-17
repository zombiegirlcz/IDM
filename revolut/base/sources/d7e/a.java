package d7e;

import com.revolut.feature.subaccount.api.models.Subaccount;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public Subaccount.Group u;
    public Subaccount.Group v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f111935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f111936y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f111935x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111934w = obj2;
        this.f111936y |= Integer.MIN_VALUE;
        return this.f111935x.a(null, this);
    }
}
