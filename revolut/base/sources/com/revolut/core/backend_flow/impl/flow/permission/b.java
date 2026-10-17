package com.revolut.core.backend_flow.impl.flow.permission;

import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$Step;
import hx7.e;
import ka0.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends h implements ka0.b {

    @NotNull
    public static final c Companion = new c();
    public final w39.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f51240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f51241q;

    public b(FormPermissionFlowContract$InputData inputData, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.o = locationInteractor;
        this.f51240p = e.b(this, FormPermissionFlowContract$State.f51237a);
        this.f51241q = cp5.d.a(this, new FormPermissionFlowContract$Step.RequestPermissions(inputData.f51231a), f0.f322471a, new fb.c(inputData, this, 27));
    }

    @Override // qki.e
    public final d getState() {
        return this.f51240p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f51241q;
    }
}
