package com.revolut.feature.kyc_documents_scan.ui.onfido;

import cli.y;
import com.revolut.feature.kyc_documents_scan.ui.onfido.a;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import w72.g;
import yy8.d;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements d {
    public final OnfidoScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d4m.a f77958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d4m.a f77959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sy8.c f77960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d4m.a f77961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d4m.a f77962t;
    public final y u;

    public c(OnfidoScreenContract$InputData inputData, d4m.a onfido, d4m.a onfidoWorkflow, sy8.c onfidoConfigMapper, d4m.a onfidoResultListener, d4m.a onfidoStudioResultListener) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onfido, "onfido");
        Intrinsics.checkNotNullParameter(onfidoWorkflow, "onfidoWorkflow");
        Intrinsics.checkNotNullParameter(onfidoConfigMapper, "onfidoConfigMapper");
        Intrinsics.checkNotNullParameter(onfidoResultListener, "onfidoResultListener");
        Intrinsics.checkNotNullParameter(onfidoStudioResultListener, "onfidoStudioResultListener");
        this.o = inputData;
        this.f77958p = onfido;
        this.f77959q = onfidoWorkflow;
        this.f77960r = onfidoConfigMapper;
        this.f77961s = onfidoResultListener;
        this.f77962t = onfidoStudioResultListener;
        this.u = mra.d.b(this, a.C0514a.f77956a, new g(6), null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
