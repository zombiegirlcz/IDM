package nd1;

import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n C;
    public int D;
    public dj0.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f214302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TaxRate f214303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CartItem f214304y;
    public CartItem z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.C = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, null, null, null, 0, this);
    }
}
