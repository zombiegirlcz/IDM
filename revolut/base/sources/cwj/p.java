package cwj;

import com.revolut.retail.feature.impl.userauth.shared.UserAuthUseCase;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.c {
    public q89.f u;
    public UserAuthUseCase v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.flow.f f109846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f109847y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.retail.feature.impl.userauth.flow.f fVar, gim.c cVar) {
        super(cVar);
        this.f109846x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f109845w = obj2;
        this.f109847y |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.impl.userauth.flow.f.I2(this.f109846x, null, this);
    }
}
