package com.revolut.feature_retail_user_declarations.employer.screen;

import cli.y;
import hx7.e;
import k3k.k;
import kbi.f;
import kbi.g;
import kbi.i;
import kbi.o;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements g {
    public final EmployerControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jbi.h f97646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f97647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97648r;

    public b(o mapper, EmployerControllerContract$InputData inputData, jbi.h pickerInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pickerInteractor, "pickerInteractor");
        this.o = inputData;
        this.f97646p = pickerInteractor;
        this.f97647q = d.b(this, new f(i.f182603a, "", null, inputData.d), mapper, null, false, 12);
        this.f97648r = e.a(this, new k(this, 17));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f97648r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f97647q;
    }
}
