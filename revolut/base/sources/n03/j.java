package n03;

import com.revolut.core.model.account.AccountId;
import h93.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public f0 u;
    public AccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d f210868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f210869x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d f210870y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d dVar, gim.c cVar) {
        super(cVar);
        this.f210870y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210869x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.J2(this.f210870y, null, this);
    }
}
