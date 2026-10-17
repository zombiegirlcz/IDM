package cf4;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public int A;
    public Action u;
    public Long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f23544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fu3.a f23545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f23546y;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23546y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.Q2(null, null, null, null, this);
    }
}
