package j54;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.c {
    public PluginPayload u;
    public com.google.protobuf.w0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f171538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f171539x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c f171540y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f171540y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f171539x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f171540y.c3(null, false, null, this);
    }
}
