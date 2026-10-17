package et6;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends gim.c {
    public bd1.a u;
    public CatalogueProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f129361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ zq.a f129362y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.f129362y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129361x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f129362y.j(null, this);
    }
}
