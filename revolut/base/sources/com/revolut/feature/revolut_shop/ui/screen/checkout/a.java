package com.revolut.feature.revolut_shop.ui.screen.checkout;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import jul.o;
import kl.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kpj.e;
import mpj.b;
import mra.d;
import o3c.c;
import oki.h;
import vkm.q;
import vvc.s;
import w3c.f;
import w3c.i;
import w3c.p;
import w3c.t;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements i {
    public final b0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dl2.a f84226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f84227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n3c.a f84228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f84229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f84230t;
    public final c u;
    public final f3c.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f84231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.c f84233y;
    public ii.h z;

    public a(b0 accountsRevolutShopInteractor, dl2.a merchantRevolutShopFiscalInteractor, e merchantRevolutShopInteractor, n3c.a shopInteractor, o deliveryAddressInteractor, b revolutShopAddressFlowProvider, c addressValidator, f3c.a revolutShopCapabilityExtension, t stateMapper) {
        Intrinsics.checkNotNullParameter(accountsRevolutShopInteractor, "accountsRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(merchantRevolutShopFiscalInteractor, "merchantRevolutShopFiscalInteractor");
        Intrinsics.checkNotNullParameter(merchantRevolutShopInteractor, "merchantRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(shopInteractor, "shopInteractor");
        Intrinsics.checkNotNullParameter(deliveryAddressInteractor, "deliveryAddressInteractor");
        Intrinsics.checkNotNullParameter(revolutShopAddressFlowProvider, "revolutShopAddressFlowProvider");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        Intrinsics.checkNotNullParameter(revolutShopCapabilityExtension, "revolutShopCapabilityExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = accountsRevolutShopInteractor;
        this.f84226p = merchantRevolutShopFiscalInteractor;
        this.f84227q = merchantRevolutShopInteractor;
        this.f84228r = shopInteractor;
        this.f84229s = deliveryAddressInteractor;
        this.f84230t = revolutShopAddressFlowProvider;
        this.u = addressValidator;
        this.v = revolutShopCapabilityExtension;
        this.f84231w = d.b(this, new w3c.e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 3, null)), stateMapper, null, false, 12);
        this.f84232x = hx7.e.a(this, new s(this, 14));
        this.f84233y = new vii.c();
    }

    @Override // yji.l
    public final void I1() {
        Unit unit = Unit.f186387a;
        vii.c cVar = this.f84233y;
        w4l.i iVar = w4l.i.f294643c;
        Continuation continuation = null;
        l.a1(this, q.Q(cVar.a(unit, iVar), new w3c.o(0, this, continuation)), null, null, new p(0, this, continuation), 3);
        l.a1(this, q.Q(cVar.a(unit, iVar), new w3c.o(1, this, continuation)), null, null, new p(1, this, continuation), 3);
        l.a1(this, q.Q(cVar.a(unit, iVar), new w3c.o(2, this, continuation)), null, null, new p(2, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84232x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        ii.h hVar = this.z;
        if (hVar != null) {
            C2(new f(hVar.f161500a, true));
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f84231w;
    }
}
