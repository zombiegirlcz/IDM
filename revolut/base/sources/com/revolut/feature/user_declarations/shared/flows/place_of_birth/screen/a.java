package com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen;

import cli.y;
import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nk7.k;
import oki.h;
import oli.f;
import oog.g;
import oog.i;
import oog.l;
import oog.m;
import pbi.c;
import pbi.e;
import skm.a2;
import wi0.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements i {
    public final PlaceOfBirthScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f94677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f94678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f94679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f94680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f94681t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(m stateMapper, PlaceOfBirthScreenContract$InputData inputData, e countryInteractor, c configurationInteractor, k placeOfBirthCountryPickerInteractor, k placeOfBirthCityPickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(placeOfBirthCountryPickerInteractor, "placeOfBirthCountryPickerInteractor");
        Intrinsics.checkNotNullParameter(placeOfBirthCityPickerInteractor, "placeOfBirthCityPickerInteractor");
        this.o = inputData;
        this.f94677p = countryInteractor;
        this.f94678q = configurationInteractor;
        this.f94679r = placeOfBirthCountryPickerInteractor;
        this.f94680s = placeOfBirthCityPickerInteractor;
        Data dataP = zi0.c.P(inputData.f94673c, false, null, 3);
        String str = inputData.d;
        this.u = d.b(this, new g(dataP, str == null ? "" : str, I2(inputData.f94673c)), stateMapper, null, false, 12);
        this.v = new com.revolut.kompot.navigable.vc.modal.a(this, new oa4.c(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f94673c == null) {
            J2(false);
        }
    }

    public final oog.h I2(b bVar) {
        if (bVar == null) {
            return oog.h.INPUT;
        }
        int i = l.f227110a[this.o.f94674g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return oog.h.INPUT;
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = ((ik3.g) ((ik3.c) this.f94678q.f234685a).f161878a).f161888g.b().f123363b1;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f((b) it8.next(), bVar)) {
                    return oog.h.DROPDOWN;
                }
            }
        }
        return oog.h.INPUT;
    }

    public final void J2(boolean z) {
        a2 a2Var = this.f94681t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f94681t = yji.l.a1(this, rd0.e.b(nim.a.w(this.f94677p.f234686a.k(z), pbi.d.f)), null, null, new f(this, continuation, 13), 3);
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
