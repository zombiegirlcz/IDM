package com.revolut.feature.check_topup.impl.ui_kompot.flow;

import com.revolut.feature.check_topup.impl.ui_kompot.flow.CheckTopUpFlowContract$Step;
import d8l.d;
import dg3.b;
import dg3.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y80.a f65771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f65772q;

    public a(c inputData, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = inputData;
        this.f65771p = permissionProvider;
        this.f65772q = d.a(this, new cwj.h(this, 27));
    }

    @Override // yki.j
    public final void M0() {
        h.u2(this, this.f65772q, this.f65771p.c("android.permission.CAMERA") ? CheckTopUpFlowContract$Step.Scan.f65770a : CheckTopUpFlowContract$Step.Permissions.f65768a, null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f65772q;
    }
}
