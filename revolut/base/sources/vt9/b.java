package vt9;

import com.revolut.feature.transfer.core.models.FundingSource;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public FundingSource u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f291933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291934x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f291933w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291934x |= Integer.MIN_VALUE;
        return this.f291933w.Z2(null, null, this);
    }
}
