package xq8;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f308133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.add_money.c f308134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f308135y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_transfer.impl.ui.add_money.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f308134x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f308133w = obj2;
        this.f308135y |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_transfer.impl.ui.add_money.c.J2(this.f308134x, null, this);
    }
}
