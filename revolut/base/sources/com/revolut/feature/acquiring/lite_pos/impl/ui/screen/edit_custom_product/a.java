package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product;

import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import dj0.d;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import nd1.n;
import oa4.c;
import oe1.g;
import oki.h;
import w80.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements oe1.h {
    public final EditCustomProductScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f60804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f60805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rd1.a f60806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f60807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f60808t;

    public a(o stateMapper, EditCustomProductScreenContract$InputData inputData, b amountFormatter, n shoppingCartInteractor, rd1.a actionBottomSheetControllerFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(actionBottomSheetControllerFactory, "actionBottomSheetControllerFactory");
        this.o = inputData;
        this.f60804p = amountFormatter;
        this.f60805q = shoppingCartInteractor;
        this.f60806r = actionBottomSheetControllerFactory;
        CartItem cartItem = inputData.f60800a;
        d dVar = cartItem.d;
        xi0.b bVar = dVar.f115083b;
        String strD = amountFormatter.d(dVar.f115082a, bVar.f306286a);
        long j2 = cartItem.d.f115082a;
        String str = cartItem.e;
        this.f60807s = mra.d.b(this, new g(bVar, strD, j2, str == null ? "" : str, cartItem.f, cartItem.f60666g, od1.b.NONE), stateMapper, null, false, 12);
        this.f60808t = e.a(this, new c(this, 15));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f60808t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f60807s;
    }
}
