package com.revolut.feature.revolut_shop.ui.screen.deliveryaddress;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import d4c.e;
import d4c.g;
import jul.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mpj.b;
import mra.d;
import o3c.c;
import oki.h;
import vkm.j2;
import w4l.j;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f84236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f84237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f84238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84239s;

    public a(DeliveryAddressScreenContract$InputData inputData, o deliveryAddressInteractor, b revolutShopAddressFlowProvider, c addressValidator, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deliveryAddressInteractor, "deliveryAddressInteractor");
        Intrinsics.checkNotNullParameter(revolutShopAddressFlowProvider, "revolutShopAddressFlowProvider");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = deliveryAddressInteractor;
        this.f84236p = revolutShopAddressFlowProvider;
        this.f84237q = addressValidator;
        this.f84238r = d.b(this, new e(new Data(null, null, true, 3, null), inputData.f84234a), stateMapper, null, false, 12);
        this.f84239s = hx7.e.a(this, new cwj.h(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.l(j.f294644c, ((e) ((j2) this.f84238r.f22677a).getValue()).f111273b), null, null, new cvi.j(this, (Continuation) null, 16), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84239s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f84238r;
    }
}
