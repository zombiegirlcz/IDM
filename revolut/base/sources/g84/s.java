package g84;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.c {
    public Action u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i f141275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141276x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar, gim.c cVar) {
        super(cVar);
        this.f141275w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141276x |= Integer.MIN_VALUE;
        return this.f141275w.Q2(null, this);
    }
}
