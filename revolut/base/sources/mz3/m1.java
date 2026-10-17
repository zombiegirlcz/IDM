package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;

/* JADX INFO: loaded from: classes22.dex */
public final class m1 extends gim.c {
    public PluginPayload u;
    public CreditApplicationStatusNavigationConfig v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f210635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.navigation.plugins.a f210636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f210637y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.revolut.feature.credit.application.plugins.impl.navigation.plugins.a aVar, gim.c cVar) {
        super(cVar);
        this.f210636x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210635w = obj2;
        this.f210637y |= Integer.MIN_VALUE;
        return this.f210636x.f(null, null, this);
    }
}
