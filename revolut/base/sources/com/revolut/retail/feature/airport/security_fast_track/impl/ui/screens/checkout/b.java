package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout;

import axi.b0;
import bti.f;
import bti.i;
import bw4.s;
import cli.y;
import cnc.t;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.api.AsftApi$Toggles$AsftAny2Any;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import cui.l;
import cui.o;
import cui.u;
import gui.g;
import gui.j;
import hx7.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mti.n;
import nyb.k;
import oki.h;
import vkm.j2;
import vkm.q;
import vkm.z1;
import wli.x;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements o, g {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final AsftCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f98811p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f98812q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f98813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zsi.h f98814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final pti.k f98815t;
    public final j u;
    public final fui.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f98816w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0 f98817x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f98818y;
    public final y z;

    public b(AsftCheckoutScreenContract$InputData inputData, x deeplinkHandler, cli.n stateMapper, k revPointsInteractor, n terminalsInteractor, zsi.h slotPrebookingInteractor, pti.k configRepository, j purchaseExtension, fui.c checkoutRevPayScreenModelExtension, gte.a featureToggleInteractor, b0 selectedUserProfileCountryProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(terminalsInteractor, "terminalsInteractor");
        Intrinsics.checkNotNullParameter(slotPrebookingInteractor, "slotPrebookingInteractor");
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        Intrinsics.checkNotNullParameter(purchaseExtension, "purchaseExtension");
        Intrinsics.checkNotNullParameter(checkoutRevPayScreenModelExtension, "checkoutRevPayScreenModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(selectedUserProfileCountryProvider, "selectedUserProfileCountryProvider");
        this.o = inputData;
        this.f98811p = deeplinkHandler;
        this.f98812q = revPointsInteractor;
        this.f98813r = terminalsInteractor;
        this.f98814s = slotPrebookingInteractor;
        this.f98815t = configRepository;
        this.u = purchaseExtension;
        this.v = checkoutRevPayScreenModelExtension;
        this.f98816w = featureToggleInteractor;
        this.f98817x = selectedUserProfileCountryProvider;
        this.f98818y = new vii.b();
        this.z = d.b(this, new l(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, null), stateMapper, null, false, 12);
        this.A = e.a(this, new t(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        j jVar = this.u;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "delegate");
        jVar.o = this;
        z1 z1Var = jVar.f146959q;
        Continuation continuation = null;
        yji.l.a1(this, z1Var, null, null, new u(this, null), 3);
        this.v.d3(new o7.d(this, 17));
        yji.l.a1(this, q.Q(this.f98818y, new s(continuation, this, 26)), null, null, new ck7.j(this, continuation, 25), 3);
    }

    public final void I2() {
        bti.d dVar;
        bti.h hVar;
        bti.g gVar;
        String str;
        fui.e eVar;
        AsftApi$Toggles$AsftAny2Any asftApi$Toggles$AsftAny2Any = AsftApi$Toggles$AsftAny2Any.f98705c;
        gte.a aVar = this.f98816w;
        if (((jte.d) aVar).c(asftApi$Toggles$AsftAny2Any)) {
            fui.b bVarC3 = this.v.c3();
            if (bVarC3 instanceof fui.a) {
                h.v2(this.A, new AsftCheckoutScreenContract$ModalStep.RevPayPocketSelection(((fui.a) bVarC3).f138215a), ModalDestination.Style.POPUP.f98311a);
                return;
            }
        }
        y yVar = this.z;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        Pair pair = (Pair) ((l) j2Var.getValue()).f109007a.getContent();
        String str2 = null;
        AsftTerminal asftTerminal = pair != null ? (AsftTerminal) pair.f186385a : null;
        boolean zJ = pd.b.j(asftTerminal != null ? Boolean.valueOf(asftTerminal.f) : null);
        AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData = this.o;
        if (!zJ || asftCheckoutScreenContract$InputData.f98805g == null) {
        }
        String str3 = asftCheckoutScreenContract$InputData.f;
        List<AsftTravellerDetailsScreenContract$DomainState$TravellerDetails> list = asftCheckoutScreenContract$InputData.f98806h;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails : list) {
            arrayList.add(new bti.j(asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98904a, asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98905b));
        }
        f fVar = ((l) j2Var2.getValue()).e;
        bti.k kVar = (fVar == null || (dVar = (bti.d) ((l) j2Var2.getValue()).f109009c.getContent()) == null || (gVar = (hVar = dVar.k).f18604c) == null || (str = gVar.f18599a) == null) ? null : new bti.k(str, hVar.f18603b, fVar);
        String str4 = asftCheckoutScreenContract$InputData.f98805g;
        if (((jte.d) aVar).c(AsftApi$Toggles$AsftAny2Any.f98705c) && (eVar = (fui.e) ((l) j2Var2.getValue()).f.getContent()) != null) {
            str2 = eVar.f138217a.f84376a;
        }
        this.u.d3(new i(str3, arrayList, kVar, str4, str2));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // gui.g
    public final int d() {
        return this.o.f98804c - 1;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }

    @Override // gui.g
    public final boolean s0() {
        bti.d dVar = (bti.d) ((l) ((j2) this.z.f22677a).getValue()).f109009c.getContent();
        return dVar != null && dVar.k.f18603b.k();
    }
}
