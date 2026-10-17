package dr8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public JuniorBankingProfile u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v6d.a f117107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f117108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a f117109y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a aVar, gim.c cVar) {
        super(cVar);
        this.f117109y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f117108x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a.O2(this.f117109y, null, this);
    }
}
