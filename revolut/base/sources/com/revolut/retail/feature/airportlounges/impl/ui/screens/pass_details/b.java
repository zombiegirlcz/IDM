package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details;

import bxg.t;
import byi.f;
import byi.j;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreenContract$InputData;
import dwi.s;
import fyi.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements f {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f99126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f99127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qvi.d f99128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f99129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f99130t;

    public b(AirportLoungePassDetailsScreenContract$InputData inputData, ang.f userInteractor, n stateMapper, d qrCodeGenerator, s loungePassesInteractor, qvi.d termsAndConditionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(loungePassesInteractor, "loungePassesInteractor");
        Intrinsics.checkNotNullParameter(termsAndConditionsInteractor, "termsAndConditionsInteractor");
        this.o = userInteractor;
        this.f99126p = qrCodeGenerator;
        this.f99127q = loungePassesInteractor;
        this.f99128r = termsAndConditionsInteractor;
        this.f99129s = new vii.b();
        AirportLoungePassDetailsScreenContract$InputData.PreloadedScreenData preloadedScreenData = inputData.f99122a;
        this.f99130t = mra.d.b(this, preloadedScreenData == null ? new byi.d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false) : new byi.d(new Data(null, null, true, 3, null), new Data(preloadedScreenData.f99123a, null, false, 6, null), new Data(preloadedScreenData.f99124b, null, false, 6, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        byi.h hVar = new byi.h(4, this, continuation);
        vii.b bVar = this.f99129s;
        l.a1(this, q.Q(bVar, hVar), null, null, new j(4, this, null), 3);
        l.a1(this, q.Q(bVar, new byi.h(2, this, continuation)), null, null, new j(2, this, null), 3);
        l.a1(this, q.Q(bVar, new byi.h(3, this, continuation)), null, null, new j(3, this, null), 3);
    }

    @Override // yji.l
    public final void P1() {
        H2(this.f99130t, new t(7));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new bv4.h(this, null, 2), new whi.b(6));
    }

    @Override // cli.z
    public final g getState() {
        return this.f99130t;
    }
}
