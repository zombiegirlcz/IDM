package pi1;

import com.revolut.feature.address.models.Address;
import gi1.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public Address u;
    public o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f236373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.address.common.impl.flow.validation_flow.c f236374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236375y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.address.common.impl.flow.validation_flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f236374x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236373w = obj2;
        this.f236375y |= Integer.MIN_VALUE;
        return this.f236374x.c3(null, null, null, null, null, this);
    }
}
