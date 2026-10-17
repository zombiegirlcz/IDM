package com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow;

import al4.n;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vq4.c;
import vq4.f;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements vq4.b {
    public final CreditCardLimitDecreaseFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt4.a f69202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f69203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f69204s;

    public b(CreditCardLimitDecreaseFlowContract$InputData inputData, n creditCardInteractor, vt4.a creditCardBottomSheetMapper, f creditCardLimitDecreaseDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardBottomSheetMapper, "creditCardBottomSheetMapper");
        Intrinsics.checkNotNullParameter(creditCardLimitDecreaseDialogMapper, "creditCardLimitDecreaseDialogMapper");
        this.o = inputData;
        this.f69201p = creditCardInteractor;
        this.f69202q = creditCardBottomSheetMapper;
        this.f69203r = creditCardLimitDecreaseDialogMapper;
        this.f69204s = d.a(this, new vh9.b(this, 15));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69204s;
    }
}
