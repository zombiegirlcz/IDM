package bsk;

import com.revolut.retail.core.navigation.FeatureCommand;
import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public l u;
    public FeatureCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18212w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f18213x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18214y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f18213x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f18212w = obj2;
        this.f18214y |= Integer.MIN_VALUE;
        return this.f18213x.e(null, this);
    }
}
