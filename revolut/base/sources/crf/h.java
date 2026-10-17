package crf;

import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.c {
    public TransferTroubleshooterType u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f108365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f108366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f108367y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f108367y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f108366x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f108367y.d3(null, null, null, this);
    }
}
