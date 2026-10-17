package com.revolut.feature.apm.multibanco.impl.ui.enrollment;

import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s42.f;
import s72.e;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends h implements s72.b {

    @NotNull
    public static final s72.d Companion = new s72.d();
    public final MultibancoExternalEnrollmentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y72.a f62587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l72.c f62588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62589r;

    public d(MultibancoExternalEnrollmentFlowContract$InputData inputData, y72.a searchResultProvider, l72.c multibancoCardInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(searchResultProvider, "searchResultProvider");
        Intrinsics.checkNotNullParameter(multibancoCardInteractor, "multibancoCardInteractor");
        this.o = inputData;
        this.f62587p = searchResultProvider;
        this.f62588q = multibancoCardInteractor;
        f fVar = new f(this, 11);
        this.f62589r = cp5.d.a(this, MultibancoExternalEnrollmentFlowContract$Step.Entry.f62579a, f0.f322471a, fVar);
    }

    public final void I2() {
        l2(new e(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62589r;
    }
}
