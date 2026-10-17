package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.move_money.api.navigation.Action;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public int A;
    public Action u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f203151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f203152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f203153y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203153y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, this);
    }
}
