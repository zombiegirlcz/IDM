package bn4;

import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import com.revolut.kompot.bridge.navigation.BridgeDestination;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 extends gim.c {
    public CreditCardDeeplink u;
    public BridgeDestination v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f17056y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f17056y = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17055x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f17056y.e(null, this);
    }
}
