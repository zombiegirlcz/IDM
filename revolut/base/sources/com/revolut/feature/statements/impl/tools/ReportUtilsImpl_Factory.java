package com.revolut.feature.statements.impl.tools;

import android.content.Context;
import e4m.e;
import l80.a;
import qd0.b;
import t70.g;

/* JADX INFO: loaded from: classes7.dex */
public final class ReportUtilsImpl_Factory implements e {
    private final e contextProvider;
    private final e datePrinterProvider;
    private final e languageProvider;
    private final e legacyUserProvider;
    private final e localizationProvider;
    private final e transparentPricingFeatureStateCheckerProvider;

    private ReportUtilsImpl_Factory(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6) {
        this.datePrinterProvider = eVar;
        this.localizationProvider = eVar2;
        this.legacyUserProvider = eVar3;
        this.contextProvider = eVar4;
        this.languageProvider = eVar5;
        this.transparentPricingFeatureStateCheckerProvider = eVar6;
    }

    public static ReportUtilsImpl_Factory create(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6) {
        return new ReportUtilsImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static ReportUtilsImpl newInstance(a aVar, g gVar, ylg.a aVar2, Context context, b bVar, o0i.a aVar3) {
        return new ReportUtilsImpl(aVar, gVar, aVar2, context, bVar, aVar3);
    }

    @Override // phm.a
    public ReportUtilsImpl get() {
        return newInstance((a) this.datePrinterProvider.get(), (g) this.localizationProvider.get(), (ylg.a) this.legacyUserProvider.get(), (Context) this.contextProvider.get(), (b) this.languageProvider.get(), (o0i.a) this.transparentPricingFeatureStateCheckerProvider.get());
    }
}
