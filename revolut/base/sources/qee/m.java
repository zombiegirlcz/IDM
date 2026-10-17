package qee;

import h93.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public f0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a f245130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f245131x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar, gim.c cVar) {
        super(cVar);
        this.f245130w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f245131x |= Integer.MIN_VALUE;
        return this.f245130w.K2(null, this);
    }
}
