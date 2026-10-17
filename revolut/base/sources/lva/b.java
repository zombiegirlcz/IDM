package lva;

import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public KompotDestination u;
    public FeatureCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f200344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f200345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f200346y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f200345x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f200344w = obj2;
        this.f200346y |= Integer.MIN_VALUE;
        return this.f200345x.j(null, this);
    }
}
