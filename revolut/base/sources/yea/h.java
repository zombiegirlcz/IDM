package yea;

import com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public ExtendedAccountId u;
    public pf8.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f312841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.ui.add_new.c f312842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f312843y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.pockets.impl.ui.add_new.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f312842x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f312841w = obj2;
        this.f312843y |= Integer.MIN_VALUE;
        return com.revolut.feature.pockets.impl.ui.add_new.c.J2(this.f312842x, this);
    }
}
