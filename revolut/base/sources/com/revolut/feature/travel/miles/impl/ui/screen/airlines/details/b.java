package com.revolut.feature.travel.miles.impl.ui.screen.airlines.details;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.kompot.common.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import nyb.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qgg.c;
import vdl.c1;
import vfg.d;
import vfg.e;
import vge.r;
import vgg.j;
import vgg.o;
import vgg.t;
import vgg.v;
import vgg.w;
import vgg.x;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements t {

    @NotNull
    private static final w Companion = new w();
    public final TravelMilesAirlineDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f94272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f94273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jwb.e f94274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f94275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f94276t;
    public final nne.b u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f94277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94278x;

    public b(n stateMapper, TravelMilesAirlineDetailsScreenContract$InputData inputData, e airlinesInteractor, k revPointsInteractor, jwb.e revPointsGiftcardsInteractor, d accountsInteractor, gte.a featureToggleInteractor, c accountRegistrationErrorDialogFactory, nne.b taxExemptionInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(airlinesInteractor, "airlinesInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(accountRegistrationErrorDialogFactory, "accountRegistrationErrorDialogFactory");
        Intrinsics.checkNotNullParameter(taxExemptionInteractor, "taxExemptionInteractor");
        this.o = inputData;
        this.f94272p = airlinesInteractor;
        this.f94273q = revPointsInteractor;
        this.f94274r = revPointsGiftcardsInteractor;
        this.f94275s = accountsInteractor;
        this.f94276t = accountRegistrationErrorDialogFactory;
        this.u = taxExemptionInteractor;
        this.v = new vii.b();
        this.f94277w = mra.d.b(this, new j(0), stateMapper, null, false, 12);
        this.f94278x = hx7.e.a(this, new v48.d(this, 27));
    }

    public static y0 I2() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Something is not working correctly in TravelMilesAirlineDetailsScreenModel, please check the stacktrace");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(q.Q(this.v, new c1(continuation, this, 4)), h0.f322473a), null, null, new vgg.y(this, continuation, 1), 3);
        l.a1(this, rd0.e.b(this.f94273q.c(false)), null, null, new vgg.y(this, continuation, 2), 3);
    }

    public final void J2() {
        Object content = ((j) ((j2) this.f94277w.f22677a).getValue()).f289161a.getContent();
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        hfg.e eVar = (hfg.e) content;
        TravelMilesProvider travelMilesProvider = eVar.f151827j;
        TravelMilesAccount travelMilesAccount = travelMilesProvider.f;
        Continuation continuation = null;
        if (travelMilesAccount != null) {
            String str = travelMilesAccount.f94082a;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C2(new vgg.q(str, null, eVar.f151822a));
            return;
        }
        TravelMilesAirline travelMilesAirline = new TravelMilesAirline(eVar.f151822a, eVar.f151823b, eVar.f151824c, eVar.d, eVar.e, eVar.f, travelMilesProvider, eVar.f151826h, eVar.k, eVar.f151830n);
        if (x.f289180a[travelMilesProvider.f94108j.ordinal()] != 1) {
            C2(new o(travelMilesAirline));
        } else {
            l2(new r(this, travelMilesAirline, continuation, 4), new v(this, 0));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94278x;
    }

    @Override // cli.z
    public final g getState() {
        return this.f94277w;
    }
}
