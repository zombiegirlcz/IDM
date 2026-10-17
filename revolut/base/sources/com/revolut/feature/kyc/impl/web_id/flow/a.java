package com.revolut.feature.kyc.impl.web_id.flow;

import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import or4.i;
import ox8.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final WebIdFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y80.a f77889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s70.a f77890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nx8.a f77891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f77892s;

    public a(WebIdFlowContract$InputData inputData, y80.a permissionProvider, s70.a intentProvider, nx8.a uiContentProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(uiContentProvider, "uiContentProvider");
        this.o = inputData;
        this.f77889p = permissionProvider;
        this.f77890q = intentProvider;
        this.f77891r = uiContentProvider;
        i iVar = new i(this, 14);
        this.f77892s = d.a(this, WebIdFlowContract$Step.WebId.f77888a, f0.f322471a, iVar);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yki.a aVar = this.f77892s;
        if (Intrinsics.f(aVar.d(), WebIdFlowContract$Step.PermissionDenied.f77887a)) {
            y80.a aVar2 = this.f77889p;
            if (aVar2.c("android.permission.CAMERA") && aVar2.c("android.permission.RECORD_AUDIO")) {
                h.t2(this, aVar, WebIdFlowContract$Step.WebId.f77888a, false, null, false, 12);
            }
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77892s;
    }
}
