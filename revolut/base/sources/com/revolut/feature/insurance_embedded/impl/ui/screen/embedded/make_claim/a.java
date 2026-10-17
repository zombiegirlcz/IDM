package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.data.model.d0;
import gu7.g1;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mu7.c;
import oki.h;
import vo8.t;
import vv7.i;
import wli.x;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i {
    public final MakeClaimScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f76130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mu7.a f76131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sv7.a f76132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tr7.a f76133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f76134t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(n stateMapper, MakeClaimScreenContract$InputData inputData, x deeplinkHandler, mu7.a embeddedInsuranceDetailInteractor, sv7.a contactsControllerModelExtension, tr7.a copyToClipboardHelper, c insuranceDetailsLayoutInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(embeddedInsuranceDetailInteractor, "embeddedInsuranceDetailInteractor");
        Intrinsics.checkNotNullParameter(contactsControllerModelExtension, "contactsControllerModelExtension");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(insuranceDetailsLayoutInteractor, "insuranceDetailsLayoutInteractor");
        this.o = inputData;
        this.f76130p = deeplinkHandler;
        this.f76131q = embeddedInsuranceDetailInteractor;
        this.f76132r = contactsControllerModelExtension;
        this.f76133s = copyToClipboardHelper;
        this.f76134t = insuranceDetailsLayoutInteractor;
        this.u = d.b(this, new vv7.h(0), stateMapper, null, false, 12);
        this.v = e.a(this, new t(29));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, c.a(this.f76134t, this.o.f76128a, false, 6), null, null, new vrl.d(this, null, 7), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof d0) {
            ((sv7.c) this.f76132r).Z2((d0) obj2);
        } else if (obj2 instanceof g1) {
            g1 g1Var = (g1) obj2;
            tr7.a.b(this.f76133s, g1Var.f146751b, new TextLocalisedClause(R$string.embedded_insurance_insurance_details_copy_accessibility_label, u.c(g1Var.f146750a), null, 12), 2);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
