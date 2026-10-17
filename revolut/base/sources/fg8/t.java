package fg8;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.c {
    public FeatureCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f134997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f134998x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, gim.c cVar) {
        super(cVar);
        this.f134997w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f134998x |= Integer.MIN_VALUE;
        return this.f134997w.a(null, null, this);
    }
}
