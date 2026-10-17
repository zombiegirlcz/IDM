package oul;

import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends gim.c {
    public pak.h u;
    public TargetPriceInputValue v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r0 f229891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f229892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.target_price.b f229893y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.revolut.trading.orders.ui.invest.placement.target_price.b bVar, gim.c cVar) {
        super(cVar);
        this.f229893y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f229892x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.target_price.b.I2(this.f229893y, this);
    }
}
