package pfa;

import com.revolut.kompot.bridge.navigation.BridgeDestination;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public BridgeDestination u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f235561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f235561w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235562x |= Integer.MIN_VALUE;
        return this.f235561w.a(null, this);
    }
}
