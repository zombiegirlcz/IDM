package lic;

import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f195455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f195456x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f195455w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f195456x |= Integer.MIN_VALUE;
        return i.Z2(this.f195455w, null, this);
    }
}
