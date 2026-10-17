package com.revolut.feature.external_accounts.impl.mandate.create_mandate;

import ch6.j;
import ch6.m;
import ch6.o;
import cli.n;
import cli.y;
import com.revolut.feature.external_accounts.api.navigation.InstitutionData;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.a;
import e7l.g;
import go.g;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import vkm.q;
import xg6.x;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements j {
    public final CreateMandateScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f72442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f72443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bh6.a f72444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bh6.j f72445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oe6.a f72446t;
    public final fk3.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ch6.a f72447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wj0.a f72448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f72449y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public b(n stateMapper, CreateMandateScreenContract$InputData inputData, x mandateInteractor, o defaultLimitCalculator, bh6.a mandateDetailsInteractor, bh6.j uriDestinationProvider, oe6.a externalInstitutionsInteractor, fk3.a configurationInteractor, j60.a bottomDialogExtension, ch6.a createMandateInfoDialogMapper, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(defaultLimitCalculator, "defaultLimitCalculator");
        Intrinsics.checkNotNullParameter(mandateDetailsInteractor, "mandateDetailsInteractor");
        Intrinsics.checkNotNullParameter(uriDestinationProvider, "uriDestinationProvider");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(createMandateInfoDialogMapper, "createMandateInfoDialogMapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f72442p = mandateInteractor;
        this.f72443q = defaultLimitCalculator;
        this.f72444r = mandateDetailsInteractor;
        this.f72445s = uriDestinationProvider;
        this.f72446t = externalInstitutionsInteractor;
        this.u = configurationInteractor;
        this.v = bottomDialogExtension;
        this.f72447w = createMandateInfoDialogMapper;
        this.f72448x = idempotencyKeyHolder;
        this.f72449y = d.b(this, a.C0482a.f72441a, stateMapper, null, false, 12);
        this.z = e.a(this, new c9f.c(this, 17));
    }

    @Override // yji.l
    public final void I1() {
        Flow flowB;
        vkm.d dVarA = this.f72444r.a();
        InstitutionData institutionData = this.o.f72436a;
        if (institutionData instanceof InstitutionData.Institution) {
            flowB = new g(((InstitutionData.Institution) institutionData).f72331a, 2);
        } else {
            if (!(institutionData instanceof InstitutionData.InstitutionId)) {
                throw new NoWhenBranchMatchedException();
            }
            flowB = rd0.e.b(((xg6.j) this.f72446t).c(((InstitutionData.InstitutionId) institutionData).f72332a, w4l.j.f294644c));
        }
        l.a1(this, ta6.a.h(dVarA, flowB, q.P(rd0.e.b(m70.a.g(((ik3.c) this.u).k(g.b.f123407a), null, null, 3)), 1), m.f24136a), null, null, new cbh.g(this, null, 16), 3);
        this.f72448x.a("CREATE_MANDATE_IDEMPOTENCY_TAG");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72449y;
    }
}
