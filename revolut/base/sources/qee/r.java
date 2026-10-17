package qee;

import h93.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public f0 u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f245140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a f245141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f245142y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar, gim.c cVar) {
        super(cVar);
        this.f245141x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f245140w = obj2;
        this.f245142y |= Integer.MIN_VALUE;
        return com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a.J2(this.f245141x, null, this);
    }
}
