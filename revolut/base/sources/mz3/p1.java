package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;

/* JADX INFO: loaded from: classes22.dex */
public final class p1 extends gim.c {
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.navigation.plugins.b A;
    public int B;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PluginPayload.Companion f210652y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.revolut.feature.credit.application.plugins.impl.navigation.plugins.b bVar, gim.c cVar) {
        super(cVar);
        this.A = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, null, null, null, null, this);
    }
}
