package ow3;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public CreditApplicationPluginFlowContract$Configuration u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f230293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f230294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f230295y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f230294x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f230293w = obj2;
        this.f230295y |= Integer.MIN_VALUE;
        return this.f230294x.a(null, false, this);
    }
}
