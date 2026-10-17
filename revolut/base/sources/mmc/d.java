package mmc;

import com.revolut.feature.robo.impl.ui.flow.spare_change.MigratePortfolioSpareChangeFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import oki.h;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements g {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xvh.c f207192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qmc.h f207193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f207194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f207195s;

    public d(b input, xvh.c autoInvestInteractor, qmc.h portfolioInfoProvider, c migratePortfolioSpareChangeFlowDialogMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(migratePortfolioSpareChangeFlowDialogMapper, "migratePortfolioSpareChangeFlowDialogMapper");
        this.o = input;
        this.f207192p = autoInvestInteractor;
        this.f207193q = portfolioInfoProvider;
        this.f207194r = migratePortfolioSpareChangeFlowDialogMapper;
        e eVar = new e(this, 27);
        this.f207195s = cp5.d.a(this, MigratePortfolioSpareChangeFlowContract$Step.f85124a, f0.f322471a, eVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f207195s;
    }
}
