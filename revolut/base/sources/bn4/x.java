package bn4;

import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends gim.c {
    public CreditCardDeeplink u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f17102y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f17102y = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17101x = obj2;
        this.z |= Integer.MIN_VALUE;
        return b0.b(this.f17102y, null, false, this);
    }
}
