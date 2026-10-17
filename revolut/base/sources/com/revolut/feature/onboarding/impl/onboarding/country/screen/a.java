package com.revolut.feature.onboarding.impl.onboarding.country.screen;

import cli.g;
import cli.y;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreenContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import ik3.c;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import q5g.f0;
import qa9.k;
import qa9.m;
import qa9.s;
import qa9.w;
import t0b.l;
import t89.b;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements m {
    public final CountryResidenceScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f78430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fk3.a f78431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dl0.a f78432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f78433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hb9.a f78434t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(CountryResidenceScreenContract$InputData inputData, qa9.y stateMapper, w countryResidenceScreenModelConfiguration, fk3.a configurationInteractor, dl0.a localeInteractor, l countryResidencyPickerControllerInteractor, hb9.a onboardingCompaniesMapper) {
        b bVar;
        Object next;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(countryResidenceScreenModelConfiguration, "countryResidenceScreenModelConfiguration");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(localeInteractor, "localeInteractor");
        Intrinsics.checkNotNullParameter(countryResidencyPickerControllerInteractor, "countryResidencyPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(onboardingCompaniesMapper, "onboardingCompaniesMapper");
        this.o = inputData;
        this.f78430p = countryResidenceScreenModelConfiguration;
        this.f78431q = configurationInteractor;
        this.f78432r = localeInteractor;
        this.f78433s = countryResidencyPickerControllerInteractor;
        this.f78434t = onboardingCompaniesMapper;
        wi0.a aVar = wi0.b.Companion;
        c cVar = (c) configurationInteractor;
        Iterator it8 = cVar.c().iterator();
        while (true) {
            bVar = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f((String) next, inputData.f78424a.f297794a)) {
                    break;
                }
            }
        }
        String str = (String) next;
        if (str == null) {
            wi0.b.Companion.getClass();
            str = "GB";
        }
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str);
        boolean z = cVar.c().size() == 1;
        t89.a aVar2 = inputData.f78425b;
        boolean z3 = aVar2 == t89.a.CREDIT_TERMS || aVar2 == t89.a.CREDIT_TERMS_NO_CONSENTS;
        int i = s.f244002a[aVar2.ordinal()];
        if (i == 1) {
            bVar = b.PCW;
        } else if (i == 2) {
            bVar = b.OPEN_MARKET;
        }
        t89.c cVar2 = new t89.c(z3, bVar);
        hb9.a aVar3 = this.f78434t;
        List list = inputData.f78426c;
        aVar3.getClass();
        this.u = d.b(this, new k(bVarA, cVar2, false, false, false, false, z, hb9.a.a(list, bVarA)), stateMapper, null, false, 12);
        this.v = e.a(this, new f0(this, 8));
    }

    @Override // yji.l
    public final void I1() {
        int i = 26;
        l2(new q03.m(this, this.o.f78424a, null, i), new yi5.b(i));
    }

    public final void I2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        r89.c cVarD = this.f78430p.d(clickData.f275445a);
        boolean z = cVarD instanceof r89.b;
        y yVar = this.u;
        if (z) {
            h.v2(this.v, new CountryResidenceScreenContract$Modal.ContractualDocumentation(((k) ((j2) yVar.f22677a).getValue()).f243986a), ModalDestination.Style.POPUP.f98311a);
        } else if (cVarD instanceof r89.a) {
            l2(new of6.d(this, ((r89.a) cVarD).f252401a, ((k) ((j2) yVar.f22677a).getValue()).f243986a, (Continuation) null, 29), new yi5.b(26));
        } else {
            if (cVarD != null) {
                throw new NoWhenBranchMatchedException();
            }
            throw new NotImplementedError(j6.a.q("Must handle ", clickData.f275445a));
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
