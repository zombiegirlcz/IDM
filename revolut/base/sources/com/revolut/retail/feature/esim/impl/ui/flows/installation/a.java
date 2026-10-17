package com.revolut.retail.feature.esim.impl.ui.flows.installation;

import chj.d;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimProfileInstallationConfirmation;
import com.revolut.retail.feature.esim.impl.ui.flows.installation.EsimInstallationFlowContract$Step;
import fej.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;
import yki.i;
import zfj.b;
import zfj.e;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final EsimInstallationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f100693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ajj.a f100694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f100695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f100696s;

    public a(EsimInstallationFlowContract$InputData inputData, d esimInstallationExtension, ajj.a confirmationControllerProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimInstallationExtension, "esimInstallationExtension");
        Intrinsics.checkNotNullParameter(confirmationControllerProvider, "confirmationControllerProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f100693p = esimInstallationExtension;
        this.f100694q = confirmationControllerProvider;
        this.f100695r = featureToggleInteractor;
        this.f100696s = d8l.d.a(this, new zba.a(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f100693p.Z2(), null, null, new e(this, null), 3);
    }

    public final void I2() {
        EsimInstallationFlowContract$InputData esimInstallationFlowContract$InputData = this.o;
        EsimProfileInstallationConfirmation esimProfileInstallationConfirmation = esimInstallationFlowContract$InputData.f100688a.f100425c;
        if (esimInstallationFlowContract$InputData.f100690c) {
            C2(d.b.f134639a);
            return;
        }
        if (((jte.d) this.f100695r).c(EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c) && esimProfileInstallationConfirmation != null) {
            h.u2(this, this.f100696s, new EsimInstallationFlowContract$Step.Confirmation(esimProfileInstallationConfirmation), null, 6);
            return;
        }
        EsimProfile esimProfile = esimInstallationFlowContract$InputData.f100688a;
        String str = esimProfile.f100423a;
        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
        this.f100693p.b3(str, esimProfileDetails != null ? esimProfileDetails.a() : null);
    }

    @Override // yki.j
    public final void M0() {
        int i = zfj.d.f322014a[this.o.f100689b.ordinal()];
        if (i == 1) {
            h.u2(this, this.f100696s, EsimInstallationFlowContract$Step.Installation.f100692a, null, 6);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            I2();
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100696s;
    }
}
