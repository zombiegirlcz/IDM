package com.revolut.data.network.models.splitbill;

import com.revolut.data.database.models.splitbill.SplitBillDao;
import com.revolut.data.network.services.SplitBillService;
import e4m.e;
import ne0.j;

/* JADX INFO: loaded from: classes20.dex */
public final class SplitBillRepositoryImpl_Factory implements e {
    private final e forceReloadStrategyFactoryProvider;
    private final e memoryCacheProvider;
    private final e splitBillDaoProvider;
    private final e splitBillServiceProvider;
    private final e splitBillStorageProvider;

    private SplitBillRepositoryImpl_Factory(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        this.splitBillServiceProvider = eVar;
        this.splitBillDaoProvider = eVar2;
        this.memoryCacheProvider = eVar3;
        this.splitBillStorageProvider = eVar4;
        this.forceReloadStrategyFactoryProvider = eVar5;
    }

    public static SplitBillRepositoryImpl_Factory create(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        return new SplitBillRepositoryImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static SplitBillRepositoryImpl newInstance(SplitBillService splitBillService, SplitBillDao splitBillDao, j jVar, ue0.c cVar, ze0.a aVar) {
        return new SplitBillRepositoryImpl(splitBillService, splitBillDao, jVar, cVar, aVar);
    }

    @Override // phm.a
    public SplitBillRepositoryImpl get() {
        return newInstance((SplitBillService) this.splitBillServiceProvider.get(), (SplitBillDao) this.splitBillDaoProvider.get(), (j) this.memoryCacheProvider.get(), (ue0.c) this.splitBillStorageProvider.get(), (ze0.a) this.forceReloadStrategyFactoryProvider.get());
    }
}
