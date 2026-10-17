package com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form;

import cli.g;
import cli.y;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import eog.d;
import iog.f;
import iog.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements iog.h {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f94657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94658q;

    public b(PepFormScreenContract$InputData inputData, n stateMapper, i90.b uuidUtils, d relationshipPickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(relationshipPickerInteractor, "relationshipPickerInteractor");
        this.o = relationshipPickerInteractor;
        PersonalDetails personalDetails = inputData.f94651a;
        if (personalDetails == null) {
            String strU = wp5.y.u(uuidUtils, "toString(...)");
            t0 t0Var = t0.f186434a;
            m70.a.c(t0Var);
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            personalDetails = new PersonalDetails(strU, null, "", "", null, null, null);
        }
        this.f94657p = mra.d.b(this, new f(personalDetails), stateMapper, null, false, 12);
        this.f94658q = new com.revolut.kompot.navigable.vc.modal.a(this, new in1.a(this, 2));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94658q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f94657p;
    }
}
