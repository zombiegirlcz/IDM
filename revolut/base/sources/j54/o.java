package j54;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.c {
    public DropOutConfig.Action u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c f171533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f171534x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f171533w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f171534x |= Integer.MIN_VALUE;
        return this.f171533w.Z2(null, this);
    }
}
