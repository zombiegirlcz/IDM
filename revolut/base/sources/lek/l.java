package lek;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public Address u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f194584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194585x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f194584w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f194585x |= Integer.MIN_VALUE;
        return this.f194584w.j(null, this);
    }
}
