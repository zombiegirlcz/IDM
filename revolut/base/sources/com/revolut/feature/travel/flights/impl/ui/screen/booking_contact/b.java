package com.revolut.feature.travel.flights.impl.ui.screen.booking_contact;

import b4g.f;
import cli.n;
import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import rul.e;
import y4g.g;
import y4g.i;
import y4g.j;
import y4g.k;
import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements k {
    public final TravelFlightsBookingContactScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z80.b f93264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f93265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f93266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final phm.a f93267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f93268t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(n stateMapper, TravelFlightsBookingContactScreenContract$InputData inputData, z80.b phoneToolsProvider, e validator, f repository, phm.a countryPickerControllerInteractor) {
        j jVarI2;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(countryPickerControllerInteractor, "countryPickerControllerInteractor");
        this.o = inputData;
        this.f93264p = phoneToolsProvider;
        this.f93265q = validator;
        this.f93266r = repository;
        this.f93267s = countryPickerControllerInteractor;
        String f93259a = inputData.getF93259a();
        PhoneNumber f93260b = inputData.getF93260b();
        fj0.a aVar = fj0.b.Companion;
        String str = f93260b.f93496a;
        String str2 = f93260b.f93497b;
        StringBuilder sb6 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        aVar.getClass();
        Serializable serializableB = fj0.a.b(string);
        m.Companion companion = m.INSTANCE;
        fj0.b bVar = (fj0.b) (serializableB instanceof yhm.n ? null : serializableB);
        if (bVar != null) {
            wi0.b bVarD = phoneToolsProvider.d(bVar.f135518a);
            String strG = phoneToolsProvider.g(str2, bVarD);
            jVarI2 = I2(strG != null ? strG : str2, bVarD);
        } else {
            jVarI2 = null;
        }
        g gVar = new g(f93259a, jVarI2);
        TravelFlightsBookingContactScreenContract$InputData.ForBookingDetails forBookingDetails = inputData instanceof TravelFlightsBookingContactScreenContract$InputData.ForBookingDetails ? (TravelFlightsBookingContactScreenContract$InputData.ForBookingDetails) inputData : null;
        this.f93268t = d.b(this, new i(gVar, gVar, forBookingDetails != null ? forBookingDetails.d : null, false, null), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new xwd.a(this, 21));
    }

    public static PhoneNumber J2(g gVar) {
        j jVar = gVar.f310922b;
        if (jVar != null) {
            return new PhoneNumber(hx7.a.J(jVar.f310929b), jVar.f310930c);
        }
        return null;
    }

    public final j I2(String str, wi0.b bVar) {
        fj0.a aVar = fj0.b.Companion;
        String strJ = this.f93264p.j(bVar);
        aVar.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        m.Companion companion = m.INSTANCE;
        if (serializableB instanceof yhm.n) {
            serializableB = null;
        }
        fj0.b bVar2 = (fj0.b) serializableB;
        if (bVar2 != null) {
            return new j(bVar2.f135518a, str, bVar);
        }
        return null;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93268t;
    }
}
