package fq3;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public DropOutConfig.Action u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f137177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f137178x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.f137177w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f137178x |= Integer.MIN_VALUE;
        return this.f137177w.N(null, this);
    }
}
