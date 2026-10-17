package nid;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.c {
    public FeatureCommand u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f215670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f215671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f215672y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f215671x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f215670w = obj2;
        this.f215672y |= Integer.MIN_VALUE;
        return this.f215671x.a(null, false, this);
    }
}
