package com.revolut.feature.statements.impl.tools;

import e4m.e;
import ylg.b;
import yme.a;
import zxd.c;

/* JADX INFO: loaded from: classes7.dex */
public final class StatementsFeatureCheckerImpl_Factory implements e {
    private final e featureToggleInteractorProvider;
    private final e productCatalogueInteractorProvider;
    private final e statementsInteractorProvider;
    private final e taxResidencyInteractorProvider;
    private final e userInteractorProvider;

    private StatementsFeatureCheckerImpl_Factory(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        this.statementsInteractorProvider = eVar;
        this.userInteractorProvider = eVar2;
        this.taxResidencyInteractorProvider = eVar3;
        this.featureToggleInteractorProvider = eVar4;
        this.productCatalogueInteractorProvider = eVar5;
    }

    public static StatementsFeatureCheckerImpl_Factory create(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        return new StatementsFeatureCheckerImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static StatementsFeatureCheckerImpl newInstance(c cVar, b bVar, a aVar, gte.a aVar2, bla.b bVar2) {
        return new StatementsFeatureCheckerImpl(cVar, bVar, aVar, aVar2, bVar2);
    }

    @Override // phm.a
    public StatementsFeatureCheckerImpl get() {
        return newInstance((c) this.statementsInteractorProvider.get(), (b) this.userInteractorProvider.get(), (a) this.taxResidencyInteractorProvider.get(), (gte.a) this.featureToggleInteractorProvider.get(), (bla.b) this.productCatalogueInteractorProvider.get());
    }
}
