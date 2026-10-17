package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.c {
    public PaymentGroup u;
    public GroupMemberSettleInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f189388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f189389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f189390y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f189389x = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f189388w = obj2;
        this.f189390y |= Integer.MIN_VALUE;
        return b0.Z2(this.f189389x, null, null, this);
    }
}
