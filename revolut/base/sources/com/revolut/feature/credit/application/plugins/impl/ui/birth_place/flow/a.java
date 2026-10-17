package com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$Step;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import qki.d;
import v54.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BirthPlaceRootFlowContract$InputData f67172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hw3.a f67173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final phm.a f67174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final phm.a f67175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f67176t;
    public final yki.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BirthPlaceRootFlowContract$InputData inputData, hw3.a birthPlaceInteractor, phm.a countryPickerInteractor, phm.a cityPickerInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(birthPlaceInteractor, "birthPlaceInteractor");
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        Intrinsics.checkNotNullParameter(cityPickerInteractor, "cityPickerInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67172p = inputData;
        this.f67173q = birthPlaceInteractor;
        this.f67174r = countryPickerInteractor;
        this.f67175s = cityPickerInteractor;
        wi0.b bVar = inputData.f67164a.f;
        BirthCity.INSTANCE.getClass();
        this.f67176t = hx7.e.b(this, new BirthPlaceRootFlowContract$State(bVar, BirthCity.f66300c));
        v48.d dVar = new v48.d(this, 2);
        this.u = cp5.d.a(this, BirthPlaceRootFlowContract$Step.ChooseCountry.f67168a, f0.f322471a, dVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f67176t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
