package bd4;

import av3.f;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import gim.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends c {
    public CreditApplicationPluginFlowContract$Configuration u;
    public f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f14525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f14526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14527y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f14526x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f14525w = obj2;
        this.f14527y |= Integer.MIN_VALUE;
        return this.f14526x.a(null, null, this);
    }
}
