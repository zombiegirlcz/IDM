package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomContract$Mode;
import dpd.k;
import epd.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import ukm.f;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements c {
    public final CategoryManagementCustomContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f87652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f87653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f87654r;

    public b(n stateMapper, CategoryManagementCustomContract$InputData inputData, k extension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.o = inputData;
        this.f87652p = extension;
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f87653q = z1VarB;
        Data data = new Data(null, null, true, 3, null);
        CategoryManagementCustomContract$Mode categoryManagementCustomContract$Mode = inputData.f87644c;
        CategoryManagementCustomContract$Mode.Edit edit = categoryManagementCustomContract$Mode instanceof CategoryManagementCustomContract$Mode.Edit ? (CategoryManagementCustomContract$Mode.Edit) categoryManagementCustomContract$Mode : null;
        this.f87654r = d.b(this, new epd.b(data, edit != null ? new epd.f(edit.f87647b, edit.d, edit.f87648c) : null, categoryManagementCustomContract$Mode instanceof CategoryManagementCustomContract$Mode.Edit), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f87653q, new dz6.n(continuation, this, 16)), null, new enb.f(this, continuation, 11), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f87654r;
    }
}
