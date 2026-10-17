package q56;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.c {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wk5.a f242318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f242319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a f242320y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar, gim.c cVar) {
        super(cVar);
        this.f242320y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f242319x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a.I2(this.f242320y, null, null, this);
    }
}
