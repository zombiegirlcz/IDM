package com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details;

import a2g.q;
import al4.b;
import cli.y;
import efm.r;
import g6e.d;
import ha3.x;
import iug.j;
import j2c.n;
import j43.e;
import j43.g;
import j43.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements e {

    @NotNull
    public static final g Companion = new g();
    public final LinkCardDetailsReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f65277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v43.a f65278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f65279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g1 f65280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f65281t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(i stateMapper, LinkCardDetailsReviewScreenContract$InputData inputData, f cardsInteractor, v43.a dialogProvider, d subaccountInteractor, g1 shotDialogDisplayer, b comboCardInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        this.o = inputData;
        this.f65277p = cardsInteractor;
        this.f65278q = dialogProvider;
        this.f65279r = subaccountInteractor;
        this.f65280s = shotDialogDisplayer;
        this.f65281t = comboCardInteractor;
        this.u = mra.d.b(this, new j43.d(inputData.f65274b, inputData.f65273a, inputData.f65275c, inputData.d, false), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new n(this, 4));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        LinkCardDetailsReviewScreenContract$InputData linkCardDetailsReviewScreenContract$InputData = this.o;
        r rVarStartWith = m70.a.g(((x) this.f65277p).v(linkCardDetailsReviewScreenContract$InputData.f65274b.f150110a), null, new j0g.b(18), 1).startWith(linkCardDetailsReviewScreenContract$InputData.f65274b);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        l.b1(this, rd0.e.b(rVarStartWith), null, new j(this, (Continuation) null, 19), 3);
        l.b1(this, ((om4.f) this.f65281t).b(), null, new q(this, (Continuation) null, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
