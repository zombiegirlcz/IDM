package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details;

import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus;
import ei8.i;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.z;
import li8.j;
import li8.o;
import mra.d;
import oki.h;
import rh8.l;
import vgk.g;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements j {
    public final kbb.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f77061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f77062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f77063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vh8.c f77064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f77065t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public c(kbb.c juniorConfigInteractor, f userInteractor, i validator, hj8.a juniorProfileInteractor, vh8.c onboardingConfigurationProvider, l juniorDetailsValidationInteractor, ni8.c stateMapper) {
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(onboardingConfigurationProvider, "onboardingConfigurationProvider");
        Intrinsics.checkNotNullParameter(juniorDetailsValidationInteractor, "juniorDetailsValidationInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = juniorConfigInteractor;
        this.f77061p = userInteractor;
        this.f77062q = validator;
        this.f77063r = juniorProfileInteractor;
        this.f77064s = onboardingConfigurationProvider;
        this.f77065t = juniorDetailsValidationInteractor;
        this.u = d.b(this, new a("", "", "", JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Missing.f77045a, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false), stateMapper, new o(), false, 8);
        this.v = e.a(this, new lcc.c(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        vkm.d dVarB = rd0.e.b(this.o.O(false));
        f fVar = this.f77061p;
        w4l.j jVar = w4l.j.f294644c;
        j23.b bVarD = yh5.b.d(dVarB, nim.a.v(fVar.j(jVar), new z(23)));
        Continuation continuation = null;
        yji.l.a1(this, bVarD, null, null, new li8.l(this, continuation, 2), 3);
        yji.l.a1(this, yh5.b.d(this.u.B(new z(24)), mo3.a.g(hj8.a.e(this.f77063r, w4l.h.f294642c), null, new l9j.j(25), 1)), null, null, new li8.l(this, continuation, 0), 3);
        yji.l.a1(this, q.q(nim.a.v(this.f77064s.f289345a.j(jVar), new g(4))), null, null, new li8.l(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
