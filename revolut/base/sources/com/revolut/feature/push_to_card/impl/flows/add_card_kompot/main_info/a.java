package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info;

import akb.s;
import ang.f;
import ap7.k;
import ara.l;
import ara.q;
import bra.c;
import bra.d;
import bra.e;
import bra.g;
import bra.i;
import cli.y;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o7.b;
import oki.h;
import rpi.j;
import vkm.j2;
import vkm.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements q {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f81579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f81580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f81581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f81582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f81583t;
    public final era.i u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n60.a f81584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f81586y;

    public a(i ownerTypeChangeDelegate, e cardNumberChangeDelegate, g nameFieldsChangeDelegate, b nfcScanningDelegate, d cardEligibilityDelegate, f userInteractor, era.i modalScreensDataProvider, j secureKeyboardView, n60.a keyboardControllerExtension, CardOwnerMainInfoScreenContract$InputData inputData, ac4.g stateMapper) {
        Intrinsics.checkNotNullParameter(ownerTypeChangeDelegate, "ownerTypeChangeDelegate");
        Intrinsics.checkNotNullParameter(cardNumberChangeDelegate, "cardNumberChangeDelegate");
        Intrinsics.checkNotNullParameter(nameFieldsChangeDelegate, "nameFieldsChangeDelegate");
        Intrinsics.checkNotNullParameter(nfcScanningDelegate, "nfcScanningDelegate");
        Intrinsics.checkNotNullParameter(cardEligibilityDelegate, "cardEligibilityDelegate");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(modalScreensDataProvider, "modalScreensDataProvider");
        Intrinsics.checkNotNullParameter(secureKeyboardView, "secureKeyboardView");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = ownerTypeChangeDelegate;
        this.f81579p = cardNumberChangeDelegate;
        this.f81580q = nameFieldsChangeDelegate;
        this.f81581r = nfcScanningDelegate;
        this.f81582s = cardEligibilityDelegate;
        this.f81583t = userInteractor;
        this.u = modalScreensDataProvider;
        this.v = secureKeyboardView;
        this.f81584w = keyboardControllerExtension;
        this.f81585x = hx7.e.a(this, new anc.b(this, 10));
        this.f81586y = mra.d.b(this, new ara.i(inputData.f81577a, l.f8607a, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new s(this, null, 12), new yi5.b(26));
        this.v.m(c01.a.HIDE);
    }

    public final CardOwnerInfoState I2() {
        CardOwnerInfoState cardOwnerInfoState = ((ara.i) ((j2) this.f81586y.f22677a).getValue()).f8601a;
        if (cardOwnerInfoState != null) {
            return cardOwnerInfoState;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81585x;
    }

    @Override // yji.l
    public final void P1() {
        this.v.y();
        this.f81584w.R();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow inputData = this.f81586y.B(new aqb.s(22));
        d dVar = this.f81582s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        yji.l.b1(this, vkm.q.H(new c(dVar, null), new t0(inputData, 2)), null, new k(this, null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f81586y;
    }
}
