package i23;

import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public int A;
    public CardOrderAccountWrapper u;
    public e93.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f157823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NaviCommand f157824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f157825y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, gim.c cVar) {
        super(cVar);
        this.z = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f157825y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d3(this);
    }
}
