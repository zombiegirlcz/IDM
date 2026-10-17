package com.revolut.feature.revolut_shop.ui.flow.ipp_shop;

import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlowContract$InputData;
import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import cp5.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rd0.e;
import rp0.g1;
import rp0.k1;
import yji.l;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements q3c.b {
    public final g1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f84216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f84217q;

    public b(IppShopFlowContract$InputData inputData, g1 shotDialogDisplayer) {
        FlowStep product;
        List listC;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.o = shotDialogDisplayer;
        IppShopFlowContract$InputData.Catalog catalog = IppShopFlowContract$InputData.Catalog.f84207a;
        boolean zEquals = inputData.equals(catalog);
        IppShopFlowContract$Step.Dashboard dashboard = IppShopFlowContract$Step.Dashboard.f84211a;
        if (zEquals) {
            product = dashboard;
        } else {
            if (!(inputData instanceof IppShopFlowContract$InputData.Product)) {
                throw new NoWhenBranchMatchedException();
            }
            product = new IppShopFlowContract$Step.Product(((IppShopFlowContract$InputData.Product) inputData).f84208a);
        }
        if (inputData.equals(catalog)) {
            listC = f0.f322471a;
        } else {
            if (!(inputData instanceof IppShopFlowContract$InputData.Product)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c(new BackStackEntry(dashboard, TransitionAnimation.SLIDE_END_TO_START.f98395a));
        }
        this.f84216p = listC;
        this.f84217q = d.a(this, product, listC, new pu4.d(this, 23));
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, e.b(((k1) this.o).d), null, new a(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84217q;
    }
}
