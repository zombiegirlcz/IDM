package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry;

import cli.g;
import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import kotlin.jvm.internal.Intrinsics;
import me1.e;
import mra.d;
import nd1.n;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements e {
    public final EditCatalogueProductEntryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f60796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rd1.a f60797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f60798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f60799s;

    public a(me1.h stateMapper, EditCatalogueProductEntryScreenContract$InputData inputData, n shoppingCartInteractor, rd1.a actionBottomSheetControllerFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(actionBottomSheetControllerFactory, "actionBottomSheetControllerFactory");
        this.o = inputData;
        this.f60796p = shoppingCartInteractor;
        this.f60797q = actionBottomSheetControllerFactory;
        CartItem cartItem = inputData.f60794a;
        this.f60798r = d.b(this, new me1.d(cartItem, cartItem.f60666g), stateMapper, null, false, 12);
        this.f60799s = hx7.e.a(this, new m84.e(this, 10));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f60799s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f60798r;
    }
}
