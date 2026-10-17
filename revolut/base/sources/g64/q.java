package g64;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.c {
    public int A;
    public PluginPayload u;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CreditApplicationPluginFlowContract$Configuration f140857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f140858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f140859y;
    public final /* synthetic */ s z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, gim.c cVar) {
        super(cVar);
        this.z = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f140859y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, false, this);
    }
}
