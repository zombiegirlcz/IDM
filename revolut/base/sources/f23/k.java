package f23;

import com.revolut.kompot.bridge.navigation.BridgeDestination;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public h93.l0 u;
    public BridgeDestination v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f131382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131383y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, gim.c cVar) {
        super(cVar);
        this.f131382x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131381w = obj2;
        this.f131383y |= Integer.MIN_VALUE;
        return this.f131382x.h3(null, null, null, this);
    }
}
