package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;

/* JADX INFO: loaded from: classes22.dex */
public final class q1 extends gim.c {
    public PluginPayload u;
    public CreditApplicationStatusNavigationConfig v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f210660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.navigation.plugins.b f210661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f210662y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.revolut.feature.credit.application.plugins.impl.navigation.plugins.b bVar, gim.c cVar) {
        super(cVar);
        this.f210661x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210660w = obj2;
        this.f210662y |= Integer.MIN_VALUE;
        return this.f210661x.f(null, null, this);
    }
}
