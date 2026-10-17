package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gu7.a4;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mu7.c;
import oki.h;
import oli.f;
import osk.m;
import ov7.j;
import ov7.l;
import wli.x;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements l {
    public final CoverageDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f76108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f76109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f76110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76111s;

    public b(n stateMapper, CoverageDetailsScreenContract$InputData inputData, x deeplinkHandler, c insuranceDetailsLayoutInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(insuranceDetailsLayoutInteractor, "insuranceDetailsLayoutInteractor");
        this.o = inputData;
        this.f76108p = deeplinkHandler;
        this.f76109q = insuranceDetailsLayoutInteractor;
        this.f76110r = d.b(this, new j(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        this.f76111s = e.a(this, new oq3.e(21));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(c.a(this.f76109q, this.o.f76104a, false, 6), new oqk.c(this, 21)), null, null, new f(this, null, 24), 3);
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj2 instanceof BottomSheet) {
            h.v2(this.f76111s, new CoverageDetailsScreenContract$ModalStep.CoverageDetails((BottomSheet) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj2 instanceof a4) {
            n2(new m(this, ((a4) obj2).f146714b, null, 3), new whi.b(6));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76111s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f76110r;
    }
}
