package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public CommodityOrderEditScreenContract$ModalStep.SelectOrderType u;
    public h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l6j.a f99857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f99858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f99859y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f99859y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f99858x = obj2;
        this.z |= Integer.MIN_VALUE;
        return g.N2(this.f99859y, null, null, this);
    }
}
