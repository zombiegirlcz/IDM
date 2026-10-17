package com.revolut.feature.retail.savings.impl.ui.product_migration.flow;

import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mpb.c;
import oki.h;
import til.m;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements c {
    public final ProductMigrationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f83385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f83386q;

    public a(ProductMigrationFlowContract$InputData inputData, m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.o = inputData;
        this.f83385p = workflowFlowProvider;
        g gVar = new g(this, 5);
        this.f83386q = d.a(this, ProductMigrationFlowContract$Step.Migration.f83384a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f83386q;
    }
}
