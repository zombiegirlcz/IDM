package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product;

import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import dj0.d;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import nd1.c;
import oki.h;
import w80.b;
import y8a.g;
import ye1.i;
import ye1.k;
import ye1.q;
import yji.l;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements k {
    public final ProductDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f60825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f60826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ad1.a f60827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rd1.a f60828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f60829t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(q stateMapper, ProductDetailsScreenContract$InputData inputData, b amountFormatter, c catalogueInteractor, ad1.a amountInteractor, rd1.a actionBottomSheetControllerFactory, pd1.a colorMapper) {
        String strA;
        String str;
        String str2;
        String strD;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(amountInteractor, "amountInteractor");
        Intrinsics.checkNotNullParameter(actionBottomSheetControllerFactory, "actionBottomSheetControllerFactory");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        this.o = inputData;
        this.f60825p = amountFormatter;
        this.f60826q = catalogueInteractor;
        this.f60827r = amountInteractor;
        this.f60828s = actionBottomSheetControllerFactory;
        CatalogueProduct catalogueProduct = inputData.f60817a;
        d dVar = catalogueProduct != null ? catalogueProduct.f : null;
        if (catalogueProduct == null || (strA = catalogueProduct.d) == null) {
            pd1.c.Companion.getClass();
            strA = ((pd1.c) colorMapper).a(((Number) d0.b0(pd1.c.f235037b)).intValue());
        }
        String str3 = strA;
        xi0.b bVar = dVar != null ? dVar.f115083b : null;
        if (dVar == null || (strD = amountFormatter.d(dVar.f115082a, dVar.f115083b.f306286a)) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = strD;
        }
        long j2 = dVar != null ? dVar.f115082a : 0L;
        CatalogueProduct catalogueProduct2 = inputData.f60817a;
        String str4 = catalogueProduct2 != null ? catalogueProduct2.f60684b : null;
        String str5 = str4 == null ? "" : str4;
        if (catalogueProduct2 == null || (str = catalogueProduct2.e) == null) {
            CatalogueCategory catalogueCategory = inputData.f60818b;
            if (catalogueCategory != null) {
                String str6 = catalogueCategory.f60669a;
                str2 = str6;
            } else {
                str2 = null;
            }
        } else {
            str2 = str6;
        }
        od1.b bVar2 = catalogueProduct2 == null ? od1.b.AMOUNT : od1.b.NONE;
        String str7 = catalogueProduct2 != null ? catalogueProduct2.f60687h : null;
        f0 f0Var = f0.f322471a;
        this.f60829t = mra.d.b(this, new i(bVar, str, j2, str5, str3, str3, str2, bVar2, f0Var, f0Var, str7, false), stateMapper, null, false, 12);
        this.u = e.a(this, new g(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new y7i.h(this, continuation, 8), new yi5.b(26));
        c cVar = this.f60826q;
        l.a1(this, rd0.e.b(m70.a.g(u1.d(cVar.a(), cVar.c(false)), null, null, 3)), null, null, new y83.d(this, continuation, 16), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f60829t;
    }
}
