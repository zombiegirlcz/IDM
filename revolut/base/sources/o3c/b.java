package o3c;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public Address u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f221784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f221785x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f221784w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f221785x |= Integer.MIN_VALUE;
        return this.f221784w.a(null, null, this);
    }
}
