package com.revolut.feature.tax_residency.impl.v2.ui.tin_input;

import cli.g;
import cli.y;
import hx7.e;
import jpe.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import skm.a2;
import yjh.b0;
import ype.n;
import zzl.b;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements ype.h {
    public final TinInputScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f90316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f90317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f90318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f90319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f90320t;

    public a(TinInputScreenContract$InputData inputData, d taxResidencyInteractor, b regexMatcher, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f90316p = taxResidencyInteractor;
        this.f90317q = regexMatcher;
        String str = inputData.f90310g;
        this.f90318r = mra.d.b(this, new ype.d(str, str, false, false, null), stateMapper, null, false, 12);
        this.f90320t = e.a(this, new b0(28));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f90320t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f90318r;
    }
}
