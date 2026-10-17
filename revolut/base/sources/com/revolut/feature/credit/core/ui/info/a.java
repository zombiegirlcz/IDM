package com.revolut.feature.credit.core.ui.info;

import cli.k;
import cli.y;
import com.revolut.feature.credit.core.ui.info.CreditInfoControllerContract$ModalStep;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dx4.b;
import dx4.f;
import fv0.c;
import fy4.g;
import fy4.i;
import fy4.j;
import fy4.l;
import fy4.m;
import fy4.n;
import fy4.o;
import fy4.r;
import fy4.u;
import fy4.v;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements g {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69839p;

    public a(r stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f69839p = e.a(this, new c(15));
    }

    public final void I2(String str) {
        if (a0.y(str, ".pdf", false)) {
            C1(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(str, null, false, true, 30))));
        } else {
            C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(str, null, 0, false, true, true, 65422))));
        }
    }

    public final void J2(o event) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof l) {
            I2(((l) event).f138896a.f275445a);
            return;
        }
        if (event instanceof m) {
            I2(((m) event).f138897a.f275445a);
            return;
        }
        if (event instanceof n) {
            I2(((n) event).f138898a.f275445a);
            return;
        }
        if (event instanceof fy4.h) {
            I2(((fy4.h) event).f138892a.f275445a);
            return;
        }
        if (event instanceof i) {
            C2(u.f138909a);
            return;
        }
        if (event instanceof j) {
            C2(v.f138910a);
            return;
        }
        if (!(event instanceof fy4.k)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = ((fy4.k) event).f138895a;
        if (obj2 instanceof dx4.l) {
            dx4.l lVar = (dx4.l) obj2;
            if (lVar instanceof dx4.h) {
                h.v2(this.f69839p, new CreditInfoControllerContract$ModalStep.InfoPopup(((dx4.h) lVar).f120610a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            }
            if (lVar instanceof dx4.g) {
                e.n(new IllegalStateException(j6.a.q("Fullscreen info popup can't be nested inside an info popup: ", ((dx4.g) lVar).j())));
                return;
            }
            if (lVar instanceof dx4.e) {
                I2(((dx4.e) lVar).f120579a.f120784b);
                return;
            }
            if (lVar instanceof b) {
                I2(((b) lVar).f120550a);
                return;
            }
            if (!(lVar instanceof dx4.i) && !(lVar instanceof dx4.a) && !(lVar instanceof dx4.d) && !(lVar instanceof f) && !(lVar instanceof dx4.k) && !(lVar instanceof dx4.c) && !(lVar instanceof dx4.j)) {
                throw new NoWhenBranchMatchedException();
            }
            e.n(new IllegalStateException(j6.a.q("Unsupported action was called in CreditInfoControllerModel: ", lVar.j())));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69839p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
