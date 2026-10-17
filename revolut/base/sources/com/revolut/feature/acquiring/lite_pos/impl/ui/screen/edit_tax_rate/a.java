package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate;

import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import hf1.g;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import mra.d;
import nd1.c;
import oki.h;
import q5g.f0;
import qe1.e;
import qe1.f;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements f {
    public final EditTaxRateScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f60811p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rd1.a f60812q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f60813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f60814s;

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    public a(o stateMapper, g taxRateFormatter, EditTaxRateScreenContract$InputData inputData, c catalogueInteractor, rd1.a actionBottomSheetControllerFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(taxRateFormatter, "taxRateFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(actionBottomSheetControllerFactory, "actionBottomSheetControllerFactory");
        this.o = inputData;
        this.f60811p = catalogueInteractor;
        this.f60812q = actionBottomSheetControllerFactory;
        TaxRate taxRate = inputData.f60809a;
        String str = taxRate.f60696c;
        String str2 = ((DecimalFormat) taxRateFormatter.f151741a.getValue()).format(taxRate.e);
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.f60813r = d.b(this, new e(str, str2), stateMapper, null, false, 12);
        this.f60814s = hx7.e.a(this, new f0(this, 15));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f60814s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f60813r;
    }
}
