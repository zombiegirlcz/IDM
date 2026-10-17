package nd1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public CatalogueProduct u;
    public TaxRate v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f214296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f214297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f214298y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.f214298y = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f214297x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f214298y.a(null, 0, null, this);
    }
}
