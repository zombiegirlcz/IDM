package nw3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public PluginPayload u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f219756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f219757x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f219756w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f219757x |= Integer.MIN_VALUE;
        return this.f219756w.b(null, this);
    }
}
