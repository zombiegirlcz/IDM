package n9h;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import gim.c;
import kge.d;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {
    public com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a u;
    public DepositInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f213647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213648y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, c cVar) {
        super(cVar);
        this.f213647x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213646w = obj2;
        this.f213648y |= Integer.MIN_VALUE;
        return this.f213647x.c(null, null, null, this);
    }
}
