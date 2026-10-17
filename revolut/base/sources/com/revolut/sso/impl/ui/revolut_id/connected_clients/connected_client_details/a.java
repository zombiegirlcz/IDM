package com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details;

import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import kpl.c;
import kpl.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements c {

    @NotNull
    public static final e Companion = new e();
    public final ConnectedClientDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f106730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f106731q;

    public a(ConnectedClientDetailsFlowContract$InputData inputData, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.o = inputData;
        this.f106730p = shotDialogDisplayer;
        kj4.c cVar = new kj4.c(this, 12);
        this.f106731q = d.a(this, ConnectedClientDetailsFlowContract$Step.Details.f106728a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f106731q;
    }
}
