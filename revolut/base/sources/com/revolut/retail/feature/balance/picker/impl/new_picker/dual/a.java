package com.revolut.retail.feature.balance.picker.impl.new_picker.dual;

import a41.j1;
import ang.f;
import cli.y;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreenContract$Step;
import efm.r;
import fn2.c;
import gm6.j;
import gzg.a0;
import h2j.i;
import h2j.k;
import h2j.o;
import h2j.u;
import h30.q;
import java.util.concurrent.CopyOnWriteArrayList;
import jyk.g0;
import k1g.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import l1j.e;
import mra.d;
import n1j.e;
import oki.h;
import os2.g;
import r10.w;
import s1j.b;
import smd.s;
import tsk.t;
import vfg.p;
import vkm.j2;
import vkm.t0;
import vkm.z1;
import yji.l;
import zh9.u0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements k {
    public final t A;
    public final g B;
    public final z1 C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final y E;
    public final DualChooserContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f99530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f99531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f99532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f99533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f99534t;
    public final b u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i2j.c f99535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1j.a f99536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s f99537y;
    public final i2j.a z;

    public a(DualChooserContract$InputData inputData, f userInteractor, w currenciesInteractor, q nonExchangeableCurrenciesInteractor, h2j.w stateMapper, e accountsOrderInfoProvider, p hiddenAccountEntryPointItemProvider, b investmentsDisclaimerDescriptorProvider, c proceedButtonStateDelegate, i2j.c mapperExtraConfigDelegate, z1j.a savingsDisclaimersFlowProvider, s countryProfilesDelegate, i2j.a dualChooserCountryProfilesDelegateInputData, t legalEntityContextProvider, g cryptoLockedBalanceBuyDestinationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(currenciesInteractor, "currenciesInteractor");
        Intrinsics.checkNotNullParameter(nonExchangeableCurrenciesInteractor, "nonExchangeableCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountsOrderInfoProvider, "accountsOrderInfoProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountEntryPointItemProvider, "hiddenAccountEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(investmentsDisclaimerDescriptorProvider, "investmentsDisclaimerDescriptorProvider");
        Intrinsics.checkNotNullParameter(proceedButtonStateDelegate, "proceedButtonStateDelegate");
        Intrinsics.checkNotNullParameter(mapperExtraConfigDelegate, "mapperExtraConfigDelegate");
        Intrinsics.checkNotNullParameter(savingsDisclaimersFlowProvider, "savingsDisclaimersFlowProvider");
        Intrinsics.checkNotNullParameter(countryProfilesDelegate, "countryProfilesDelegate");
        Intrinsics.checkNotNullParameter(dualChooserCountryProfilesDelegateInputData, "dualChooserCountryProfilesDelegateInputData");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(cryptoLockedBalanceBuyDestinationProvider, "cryptoLockedBalanceBuyDestinationProvider");
        this.o = inputData;
        this.f99530p = userInteractor;
        this.f99531q = currenciesInteractor;
        this.f99532r = nonExchangeableCurrenciesInteractor;
        this.f99533s = accountsOrderInfoProvider;
        this.f99534t = hiddenAccountEntryPointItemProvider;
        this.u = investmentsDisclaimerDescriptorProvider;
        this.v = proceedButtonStateDelegate;
        this.f99535w = mapperExtraConfigDelegate;
        this.f99536x = savingsDisclaimersFlowProvider;
        this.f99537y = countryProfilesDelegate;
        this.z = dualChooserCountryProfilesDelegateInputData;
        this.A = legalEntityContextProvider;
        this.B = cryptoLockedBalanceBuyDestinationProvider;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(null);
        this.C = z1VarB;
        this.D = hx7.e.a(this, new h1c.c(this, 2));
        this.E = d.b(this, new i(new Data(null, null, true, 3, null), inputData.f99491b, null, null, false, false, r0.g(), null, new j1j.b(false, null, false, CaptureActivity.RESULT_EXIT_USER_FLOW), new Data(null, null, true, 3, null), f0.f322471a, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        r rVarX;
        Flow flowO = this.f99537y.O(this.z);
        DualChooserContract$InputData dualChooserContract$InputData = this.o;
        k1j.d walletScope = dualChooserContract$InputData.f99492c;
        SupportedTargetCurrencies currencies = dualChooserContract$InputData.f99493g;
        w wVar = this.f99531q;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        ufm.i iVar = new ufm.i(te0.w.j(currencies.a()), new g0(new n(26), 20), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        if (currencies instanceof SupportedTargetCurrencies.Unordered) {
            rVarX = new sfm.b(iVar, new g0(new k1.a(wVar, walletScope, 7), 21), 2);
            Intrinsics.checkNotNullExpressionValue(rVarX, "flatMapObservable(...)");
        } else {
            if (!(currencies instanceof SupportedTargetCurrencies.Ordered)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarX = new ufm.i(iVar, new g0(new n(27), 22), 1).x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        }
        akg.n nVarV = nim.a.v(u0.i(flowO, rd0.e.b(rVarX), rd0.e.b(this.f99530p.k(false))), new a0(19));
        h2j.p pVar = new h0() { // from class: h2j.p
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((i) obj2).f148831b;
            }
        };
        y yVar = this.E;
        Continuation continuation = null;
        l.a1(this, yh5.b.e(nVarV, yVar.B(pVar), this.C), null, null, new j1(this, (Continuation) null, 9), 3);
        l.a1(this, this.f99533s.b(dualChooserContract$InputData.f), null, null, new o(this, continuation, 0), 3);
        l.a1(this, new t38.e(yVar.B(new h0() { // from class: h2j.s
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((i) obj2).f148832c;
            }
        }), 24, yVar.B(new h0() { // from class: h2j.t
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((i) obj2).f148831b;
            }
        }), u.f148852a), null, null, new j(this, continuation, 23), 3);
        l.a1(this, vkm.q.Q(new t0(yVar.B(new a0(18)), 1), new g6f.l(continuation, this, 23)), null, null, new o(this, continuation, 2), 3);
        l.a1(this, this.f99534t.g(), null, null, new o(this, continuation, 1), 3);
    }

    public final void I2(RowDelegate.Model model) {
        String str;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        boolean z = obj2 instanceof ra7.a;
        y yVar = this.E;
        if (z) {
            CountryProfile countryProfile = ((i) ((j2) yVar.f22677a).getValue()).f148836l;
            if (countryProfile == null || (str = countryProfile.f92231a) == null) {
                return;
            }
            h.v2(this.D, new DualChooserScreenContract$Step.HiddenAccounts(str), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
            return;
        }
        if (obj2 instanceof j1j.d) {
            H2(yVar, new av8.o(obj2, 24));
            return;
        }
        String string = o0.f186429a.b(a.class).toString();
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.WARNING;
        Object obj3 = model.u;
        rd0.d.b(cVar, string, j6.a.q("Cast to SelectedBalance failed: ", obj3 != null ? obj3.getClass().getSimpleName() : null), null, null, 16);
    }

    public final void J2(j1j.d dVar) {
        C2(dVar != null ? new l1j.f(dVar.f170617a, dVar.f170618b, dVar.f170619c, dVar.d, ((i) ((j2) this.E.f22677a).getValue()).f148831b.f306286a) : e.a.f191551a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
