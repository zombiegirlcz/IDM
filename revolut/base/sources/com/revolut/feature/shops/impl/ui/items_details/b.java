package com.revolut.feature.shops.impl.ui.items_details;

import cli.n;
import com.revolut.feature.store.core.api.StoreCoreApi$Toggles$StoreDMD2Compliance;
import g2e.n0;
import i69.p;
import ibg.g;
import ijd.d;
import ijd.f;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kye.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import yhm.j;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements d {

    @NotNull
    public static final f Companion = new f();
    public final ShopsItemsDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f87212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f87213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f87214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f87215s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f87216t;
    public final Lazy u;

    public b(ShopsItemsDetailsScreenContract$InputData inputData, n stateMapper, e storeExclusivesInteractor, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeExclusivesInteractor, "storeExclusivesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f87212p = storeExclusivesInteractor;
        this.f87213q = featureToggleInteractor;
        this.f87214r = userInteractor;
        this.f87216t = hx7.e.a(this, new p(this, 22));
        this.u = j.b(new i1d.b(this, stateMapper, 23));
    }

    @Override // yji.l
    public final void I1() {
        String purchaseId;
        if (((jte.d) this.f87213q).c(StoreCoreApi$Toggles$StoreDMD2Compliance.f88626c) && (purchaseId = this.o.f87207h) != null) {
            e eVar = this.f87212p;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            n0 n0Var = (n0) eVar.f190729b;
            n0Var.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            l.a1(this, rd0.e.n(n0Var.f140019h.b(purchaseId, loadingStrategy), h0.f322473a), null, null, new g(this, null, 11), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f87216t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.u.getValue();
    }
}
