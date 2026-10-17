package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$Mode;
import dpd.k;
import ge3.e;
import gpd.c;
import gpd.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import tof.a3;
import tof.i3;
import ukm.f;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements c {
    public final CategoryManagementListContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f87661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f87662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f87663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f87664s;

    public b(n stateMapper, CategoryManagementListContract$InputData inputData, e transactionCategorisationInteractor, k extension) {
        a3 a3Var;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.o = inputData;
        this.f87661p = transactionCategorisationInteractor;
        this.f87662q = extension;
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f87663r = z1VarB;
        Data data = new Data(null, null, true, 3, null);
        CategoryManagementListContract$Mode categoryManagementListContract$Mode = inputData.f87656b;
        i3 i3Var = null;
        CategoryManagementListContract$Mode.Select select = categoryManagementListContract$Mode instanceof CategoryManagementListContract$Mode.Select ? (CategoryManagementListContract$Mode.Select) categoryManagementListContract$Mode : null;
        if (select != null && (a3Var = select.f87658a) != null) {
            i3Var = a3Var.Q;
        }
        this.f87664s = d.b(this, new gpd.b(data, i3Var), stateMapper, null, false, 12);
    }

    public final void I2(i3 i3Var) {
        if (this.o.f87656b instanceof CategoryManagementListContract$Mode.Select) {
            H2(this.f87664s, new j(i3Var, 0));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f87663r, new g6f.l(continuation, this, 13)), null, new gii.b(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f87664s;
    }
}
