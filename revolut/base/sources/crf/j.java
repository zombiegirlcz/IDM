package crf;

import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterType;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.c {
    public TransferTroubleshooterType u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f108370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f108371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f108372y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f108372y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f108371x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f108372y.e3(null, null, null, this);
    }
}
