package qee;

import h93.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public f0 u;
    public l93.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f245132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a f245133x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f245134y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar, gim.c cVar) {
        super(cVar);
        this.f245133x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f245132w = obj2;
        this.f245134y |= Integer.MIN_VALUE;
        return com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a.I2(this.f245133x, null, this);
    }
}
