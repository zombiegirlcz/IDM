package aja;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public FeatureCommand u;
    public FeatureCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f5526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f5527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5528y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f5527x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f5526w = obj2;
        this.f5528y |= Integer.MIN_VALUE;
        return this.f5527x.a(null, null, this);
    }
}
