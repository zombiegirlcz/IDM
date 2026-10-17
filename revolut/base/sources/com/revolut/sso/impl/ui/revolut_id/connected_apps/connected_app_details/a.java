package com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details;

import akl.o0;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlowContract$Step;
import dpl.b;
import dpl.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final ConnectedAppDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f106719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f106720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f106721r;

    public a(ConnectedAppDetailsFlowContract$InputData inputData, o0 userInfoRepository, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInfoRepository, "userInfoRepository");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.o = inputData;
        this.f106719p = userInfoRepository;
        this.f106720q = shotDialogDisplayer;
        dgj.h hVar = new dgj.h(this, 25);
        this.f106721r = cp5.d.a(this, ConnectedAppDetailsFlowContract$Step.Details.f106717a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106721r;
    }
}
