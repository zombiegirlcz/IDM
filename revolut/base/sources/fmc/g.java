package fmc;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public FeatureCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.robo.impl.navigation.c f136339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f136340x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.robo.impl.navigation.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f136339w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f136340x |= Integer.MIN_VALUE;
        return com.revolut.feature.robo.impl.navigation.c.c(this.f136339w, null, this);
    }
}
