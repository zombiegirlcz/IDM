package ya4;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public CreditApplicationPluginFlowContract$Configuration u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f311924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f311925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f311924w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f311925x |= Integer.MIN_VALUE;
        return this.f311924w.b(null, this);
    }
}
