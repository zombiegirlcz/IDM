package com.revolut.sso.impl.ui.phone.enter_phone;

import akl.z;
import cli.n;
import cli.y;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import gkl.o;
import hx7.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mra.d;
import oki.h;
import pol.f;
import pol.g;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements f {
    public final EnterPhoneScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f106671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gnl.a f106672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z80.b f106673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tll.a f106674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final phm.a f106675t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(EnterPhoneScreenContract$InputData inputData, n stateMapper, z configurationRepository, gnl.a countriesProvider, z80.b phoneToolsProvider, tll.a commonDialogsFactory, phm.a pickerControllerInteractor) {
        Pair pair;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(countriesProvider, "countriesProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(commonDialogsFactory, "commonDialogsFactory");
        Intrinsics.checkNotNullParameter(pickerControllerInteractor, "pickerControllerInteractor");
        this.o = inputData;
        this.f106671p = configurationRepository;
        this.f106672q = countriesProvider;
        this.f106673r = phoneToolsProvider;
        this.f106674s = commonDialogsFactory;
        this.f106675t = pickerControllerInteractor;
        EnterPhoneScreenContract$InputData.Mode mode = inputData.f106662a;
        if (Intrinsics.f(mode, EnterPhoneScreenContract$InputData.Mode.Collect.f106663a) || Intrinsics.f(mode, EnterPhoneScreenContract$InputData.Mode.LostAccess.f106668a) || Intrinsics.f(mode, EnterPhoneScreenContract$InputData.Mode.SignUp.f106669a)) {
            pair = new Pair(I2(), "");
        } else {
            if (!(mode instanceof EnterPhoneScreenContract$InputData.Mode.Create)) {
                throw new NoWhenBranchMatchedException();
            }
            EnterPhoneScreenContract$InputData.Mode.Create.PhoneData phoneData = ((EnterPhoneScreenContract$InputData.Mode.Create) mode).f106665b;
            if (phoneData instanceof EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.FullNumber) {
                String str = ((EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.FullNumber) phoneData).f106667a;
                String strConcat = a0.H(str, "+", false) ? str : null;
                strConcat = strConcat == null ? "+".concat(str) : strConcat;
                wi0.b bVarE = phoneToolsProvider.e(strConcat);
                bVarE = bVarE == null ? I2() : bVarE;
                String strG = phoneToolsProvider.g(strConcat, null);
                pair = new Pair(bVarE, strG != null ? strG : "");
            } else if (phoneData instanceof EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.CountryOnly) {
                pair = new Pair(((EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.CountryOnly) phoneData).f106666a, "");
            } else {
                if (phoneData != null) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(I2(), "");
            }
        }
        wi0.b bVar = (wi0.b) pair.f186385a;
        String str2 = (String) pair.f186386b;
        fj0.a aVar = fj0.b.Companion;
        String strJ = phoneToolsProvider.j(bVar);
        aVar.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        o.b(serializableB);
        this.u = d.b(this, new g(new Identifier.Phone(((fj0.b) serializableB).f135518a, str2, bVar)), stateMapper, null, false, 12);
        this.v = e.a(this, new plb.g(this, 10));
    }

    public final wi0.b I2() {
        List<o.b> listA = this.f106671p.a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (o.b bVar : listA) {
            wi0.a aVar = wi0.b.Companion;
            String value = bVar.getValue();
            aVar.getClass();
            arrayList.add(wi0.a.a(value));
        }
        return arrayList.size() == 1 ? (wi0.b) d0.b0(arrayList) : (wi0.b) v13.d.b(arrayList, this.f106672q.a());
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
