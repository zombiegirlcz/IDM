package uye;

import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.common.TopUpTarget;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public StoredMethod u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TopUpTarget f284314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f284315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284316y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.f284316y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284315x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f284316y.M2(null, null, null, this);
    }
}
