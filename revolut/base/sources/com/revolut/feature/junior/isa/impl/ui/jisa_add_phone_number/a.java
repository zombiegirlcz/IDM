package com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number;

import cli.g;
import cli.y;
import eli.j;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import la8.e;
import la8.f;
import la8.i;
import mra.d;
import oki.h;
import x98.c;
import yhm.o;
import z80.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements f {
    public final JuniorIsaAddPhoneNumberScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f76771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final phm.a f76772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f76773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f76774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f76775t;
    public final wi0.b u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f76776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76777x;

    public a(i stateMapper, JuniorIsaAddPhoneNumberScreenContract$InputData inputData, b phoneToolsProvider, phm.a countryPickerControllerInteractor, hj8.a juniorProfileInteractor, j twoFaErrorHandler, c twoFaCodeResolverFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(countryPickerControllerInteractor, "countryPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(twoFaCodeResolverFactory, "twoFaCodeResolverFactory");
        this.o = inputData;
        this.f76771p = phoneToolsProvider;
        this.f76772q = countryPickerControllerInteractor;
        this.f76773r = juniorProfileInteractor;
        this.f76774s = twoFaErrorHandler;
        this.f76775t = twoFaCodeResolverFactory;
        wi0.a aVar = wi0.b.Companion;
        String str = inputData.f76768b;
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str);
        this.u = bVarA;
        String str2 = inputData.d;
        String strG = str2 != null ? phoneToolsProvider.g(str2, bVarA) : null;
        strG = strG == null ? "" : strG;
        this.v = strG;
        fj0.a aVar2 = fj0.b.Companion;
        String strJ = phoneToolsProvider.j(bVarA);
        aVar2.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        o.b(serializableB);
        this.f76776w = d.b(this, new e(((fj0.b) serializableB).f135518a, strG, bVarA, false), stateMapper, null, false, 12);
        this.f76777x = hx7.e.a(this, new v(this, 23));
    }

    public final boolean I2(String str, wi0.b bVar) {
        if (Intrinsics.f(str, this.v) && Intrinsics.f(bVar, this.u)) {
            return false;
        }
        return this.f76771p.k(str, bVar.f297794a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76777x;
    }

    @Override // cli.z
    public final g getState() {
        return this.f76776w;
    }
}
