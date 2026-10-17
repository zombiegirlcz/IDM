package x7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyReason;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public int A;
    public MoveMoneyOrderInfo u;
    public MoveMoneyReason v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f303222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f303223x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f303224y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.z = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f303224y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b3(null, null, this);
    }
}
