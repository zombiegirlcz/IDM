package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category;

import cli.g;
import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import hx7.e;
import jch.p;
import je1.f;
import je1.l;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nd1.c;
import oki.h;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements je1.h {
    public final CategoryDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f60788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f60789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f60790r;

    public a(l stateMapper, CategoryDetailsScreenContract$InputData inputData, c catalogueInteractor, pd1.a colorMapper) {
        String strA;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        this.o = inputData;
        this.f60788p = catalogueInteractor;
        CatalogueCategory catalogueCategory = inputData.f60786a;
        if (catalogueCategory == null || (strA = catalogueCategory.f60671c) == null) {
            pd1.c.Companion.getClass();
            strA = ((pd1.c) colorMapper).a(((Number) d0.b0(pd1.c.f235037b)).intValue());
        }
        String str = catalogueCategory != null ? catalogueCategory.f60670b : null;
        this.f60789q = d.b(this, new f(str == null ? "" : str, strA, strA), stateMapper, null, false, 12);
        this.f60790r = e.a(this, new p(this, 6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f60790r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f60789q;
    }
}
