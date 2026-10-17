package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ll7.k;
import mkk.q;
import mnl.g;
import mp7.j;
import mra.d;
import nii.y0;
import oki.h;
import w4l.i;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements j {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DriverNumberInputScreenContract$InputData f75621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f75622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f75623r;

    public a(n stateMapper, k driverVerificationRepository, DriverNumberInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(driverVerificationRepository, "driverVerificationRepository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = driverVerificationRepository;
        this.f75621p = inputData;
        this.f75622q = d.b(this, new mp7.h(new Data(null, null, true, 3, null), new HashMap(), new HashMap(), new HashMap()), stateMapper, null, false, 12);
        this.f75623r = e.a(this, new g(this, 4));
    }

    public static y0 I2() {
        return vl7.a.a(10, new TextLocalisedClause(R$string.car_insurance_imid_data_upload_error_title, null, null, 14), null, new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14));
    }

    @Override // yji.l
    public final void I1() {
        String applicationId = this.f75621p.f75619a;
        k kVar = this.o;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, kVar.f196641c.b(applicationId, loadingStrategy), null, null, new q(this, null, 8), 3);
    }

    public final void J2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            return;
        }
        h.v2(this.f75623r, new DriverNumberInputScreenContract$ModalStep.CountryPickerStep(str), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f75623r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f75622q;
    }
}
