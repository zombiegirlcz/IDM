package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ht3.l0;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mra.d;
import oki.h;
import pyd.c;
import r6f.i;
import r74.j;
import r74.k;
import r74.l;
import r74.q;
import vkm.j2;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements l {
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f67335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f67336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67337r;

    public b(q interactor, x deeplinkHandler, n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f67335p = deeplinkHandler;
        this.f67336q = d.b(this, new j(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f67337r = e.a(this, new i(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        yji.l.a1(this, c.m(this.o.a()), null, null, new r5e.e(this, null, 6), 3);
    }

    public final void J2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        C1(a0.y(str, ".pdf", false) ? new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(str, null, false, true, 30))) : new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(str, null, R$drawable.uikit_icn_24_cross, false, true, true, 65434))));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67337r;
    }

    public final void K2() {
        l0 l0Var = (l0) ((j) ((j2) this.f67336q.f22677a).getValue()).f251990a.getContent();
        ht3.c cVarW = l0Var != null ? l0Var.W() : null;
        if (cVarW == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C2(new k(ht3.d.PRIMARY_BUTTON, cVarW.f155257b));
    }

    public final void L2() {
        l0 l0Var = (l0) ((j) ((j2) this.f67336q.f22677a).getValue()).f251990a.getContent();
        ht3.c cVarT = l0Var != null ? l0Var.T() : null;
        if (cVarT == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C2(new k(ht3.d.SECONDARY_BUTTON, cVarT.f155257b));
    }

    @Override // cli.z
    public final g getState() {
        return this.f67336q;
    }
}
