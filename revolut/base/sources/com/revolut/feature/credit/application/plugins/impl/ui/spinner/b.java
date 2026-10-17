package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import be4.d;
import c84.t;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import e84.e;
import i69.p;
import ii4.b0;
import ii4.d0;
import ii4.e0;
import ii4.g0;
import ii4.o;
import ii4.z;
import java.util.ArrayList;
import ju3.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import skm.a2;
import vkm.v1;
import yji.l;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements b0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SpinnerLazyFlowContract$InputData f68425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f68426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f68427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f68428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f68429t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SpinnerLazyFlowContract$InputData inputData, o spinnerInteractor, d waitingBottomSheetControllerProvider, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(spinnerInteractor, "spinnerInteractor");
        Intrinsics.checkNotNullParameter(waitingBottomSheetControllerProvider, "waitingBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68425p = inputData;
        this.f68426q = spinnerInteractor;
        this.f68427r = waitingBottomSheetControllerProvider;
        this.f68429t = d8l.d.a(this, new p(this, 20));
    }

    public static y0 P2(SpinnerConfiguration.Content.SpinnerContent spinnerContent) {
        return new y0(null, new c0(spinnerContent.f66375a, spinnerContent.f66376b, null, true, null, false, false, null, 1900), false, 5);
    }

    @Override // yki.j
    public final void M0() {
        b bVar;
        SpinnerLazyFlowContract$InputData spinnerLazyFlowContract$InputData = this.f68425p;
        SpinnerConfiguration.Content content = spinnerLazyFlowContract$InputData.f68414a.f66388a;
        if (content instanceof SpinnerConfiguration.Content.Dynamic) {
            SpinnerConfiguration.Content.Dynamic dynamic = (SpinnerConfiguration.Content.Dynamic) content;
            Q2(dynamic.f66374b, dynamic.f66373a);
            bVar = this;
        } else {
            if (!(content instanceof SpinnerConfiguration.Content.Static)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = this;
            l.a1(bVar, X1(P2(((SpinnerConfiguration.Content.Static) content).f66377a)), null, null, null, 7);
        }
        SpinnerConfiguration.Popup popup = spinnerLazyFlowContract$InputData.f68414a;
        SpinnerConfiguration.Mode.Limited limited = popup.f66389b;
        SpinnerConfiguration.Mode.Limited.TerminationCondition terminationCondition = limited.d;
        int i = limited.f66381a;
        long j2 = limited.f66382b;
        long j3 = limited.f66383c;
        g gVar = limited.f;
        WaitingPopupScreenConfig waitingPopupScreenConfig = limited.e;
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = spinnerLazyFlowContract$InputData.f68415b;
        b bVar2 = bVar;
        l.a1(bVar2, rd0.e.d(((z) bVar.f68426q).d(terminationCondition, j3, i, j2, gVar, waitingPopupScreenConfig, new g0(creditApplicationPluginFlowContract$Configuration.f66892b, creditApplicationPluginFlowContract$Configuration.f66894g)), h0.f322473a), null, null, new d0(this, popup, null), 3);
    }

    public final void Q2(long j2, ArrayList arrayList) {
        a2 a2Var = this.f68428s;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f68428s = l.a1(this, new v1(new ii4.d(arrayList, j2, null, 1)), null, null, new e0(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68429t;
    }
}
