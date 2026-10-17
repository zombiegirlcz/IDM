package com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import mra.d;
import oki.h;
import u7k.w;
import ul8.e;
import ul8.g;
import ul8.i;
import z80.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements g {
    public final JuniorAddPhoneNumberScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f77207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final phm.a f77208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f77209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f77210s;

    public a(n stateMapper, JuniorAddPhoneNumberScreenContract$InputData inputData, b phoneToolsProvider, phm.a countryOfBirthPickerControllerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(countryOfBirthPickerControllerInteractor, "countryOfBirthPickerControllerInteractor");
        this.o = inputData;
        this.f77207p = phoneToolsProvider;
        this.f77208q = countryOfBirthPickerControllerInteractor;
        wi0.a aVar = wi0.b.Companion;
        String str = inputData.f77201b;
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str);
        m70.a.c(t0.f186434a);
        String strJ = phoneToolsProvider.j(bVarA);
        strJ = a0.H(strJ, "+", false) ? strJ : "+".concat(strJ);
        this.f77209r = d.b(this, new e("", strJ, bVarA, I2(strJ, "")), stateMapper, new i(), false, 8);
        this.f77210s = hx7.e.a(this, new w(this, 26));
    }

    public final boolean I2(String str, String str2) {
        return this.f77207p.k(str + str2, null);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f77210s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f77209r;
    }
}
