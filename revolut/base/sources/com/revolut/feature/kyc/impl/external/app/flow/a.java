package com.revolut.feature.kyc.impl.external.app.flow;

import d8l.d;
import iv8.c;
import kotlin.jvm.internal.Intrinsics;
import kv8.b;
import oki.h;
import xx8.e;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final ExternalAppKycProviderFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xx8.a f77655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f77656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f77657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gi0.a f77658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f77659t;
    public final i u;

    public a(ExternalAppKycProviderFlowContract$InputData inputData, xx8.a destinationProvider, e packageChecker, c promptScreenProvider, gi0.a mobileServicesProvider, boolean z) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(packageChecker, "packageChecker");
        Intrinsics.checkNotNullParameter(promptScreenProvider, "promptScreenProvider");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        this.o = inputData;
        this.f77655p = destinationProvider;
        this.f77656q = packageChecker;
        this.f77657r = promptScreenProvider;
        this.f77658s = mobileServicesProvider;
        this.f77659t = z;
        this.u = d.a(this, new kj4.c(this, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    @Override // yki.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.external.app.flow.a.M0():void");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
