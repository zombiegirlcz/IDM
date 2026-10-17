package com.revolut.feature.card_management.impl.ui.kompot.replace.expectations;

import cli.g;
import cli.n;
import cli.y;
import hx7.e;
import kj4.c;
import kotlin.jvm.internal.Intrinsics;
import l03.b;
import mra.d;
import oki.h;
import z6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements l03.a {
    public final CardReplaceExpectationsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f64882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f64883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f64884r;

    public a(n stateMapper, CardReplaceExpectationsContract$InputData inputData, s revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.o = inputData;
        this.f64882p = revolutCardsInteractor;
        this.f64883q = d.b(this, new b(inputData.f64878a), stateMapper, null, false, 12);
        this.f64884r = e.a(this, new c(this, 27));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f64884r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f64883q;
    }
}
