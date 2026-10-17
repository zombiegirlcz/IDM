package com.revolut.feature.giro.impl.ui.review;

import cli.g;
import cli.n;
import cli.y;
import e54.r;
import e77.f;
import e77.k;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements e77.h {

    @NotNull
    public static final k Companion = new k();
    public final f61.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2j.a f74559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f74560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74561r;

    public a(n stateMapper, DirectDebitReviewScreenContract$InputData inputData, f61.a giroPaymentAuthorisationInteractor, l2j.a currencyPickerFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(giroPaymentAuthorisationInteractor, "giroPaymentAuthorisationInteractor");
        Intrinsics.checkNotNullParameter(currencyPickerFactory, "currencyPickerFactory");
        this.o = giroPaymentAuthorisationInteractor;
        this.f74559p = currencyPickerFactory;
        this.f74560q = d.b(this, new f(inputData.f74556a, inputData.f74557b, true), stateMapper, null, false, 12);
        this.f74561r = e.a(this, new r(this, 5));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74561r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f74560q;
    }
}
