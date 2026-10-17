package com.revolut.feature.shops.impl.ui.bid_flow;

import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import vkm.q;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends h implements vid.b {
    public final ShopsBidFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f87141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InputData f87142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f87143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f87144s;

    public c(ShopsBidFlowContract$InputData inputData, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f87141p = productArticleInteractor;
        this.f87142q = new InputData(false, (Integer) null, (Function1) new vid.c(this, 0), 7);
        this.f87143r = e.b(this, new ShopsBidFlowContract$FlowState(0));
        this.f87144s = d8l.d.a(this, new vh9.b(this, 2));
    }

    public final void I2() {
        if (this.o.f87133b == null) {
            h.D2(this.f87144s);
        } else {
            B2();
        }
    }

    @Override // yki.j
    public final void M0() {
        ShopsBidFlowContract$InputData shopsBidFlowContract$InputData = this.o;
        String str = shopsBidFlowContract$InputData.f87133b;
        String str2 = shopsBidFlowContract$InputData.f87132a;
        i iVar = this.f87144s;
        if (str == null) {
            h.w2(iVar, new ShopsBidFlowContract$Step.PlaceBid(str2, null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            h.t2(this, iVar, new ShopsBidFlowContract$Step.ProductArticleAuction(str, str2), true, null, false, 12);
            l.a1(this, q.g(((kka.h) this.f87141p).d), null, null, new a(this, null), 3);
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.f87143r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87144s;
    }
}
