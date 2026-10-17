package com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mra.d;
import oki.h;
import w50.g;
import wde.f;
import wj7.i;
import wj7.m;
import wj7.s;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements m {
    public final CFACInsuranceExpenseDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f75082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n60.a f75083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f75084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f75085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f75086t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(s stateMapper, CFACInsuranceExpenseDetailsScreenContract$InputData inputData, e60.a mediaPickerControllerExtension, n60.a keyboardControllerExtension, e dateProvider, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = inputData;
        this.f75082p = mediaPickerControllerExtension;
        this.f75083q = keyboardControllerExtension;
        this.f75084r = dateProvider;
        this.f75085s = amountFormatter;
        this.f75086t = d.b(this, new i(inputData.f75074a, inputData.f75076c, inputData.d, inputData.e, inputData.f, inputData.f75077g, inputData.f75078h, inputData.i, false), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new f(this, 14));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(((e60.s) this.f75082p).f122868g), null, null, new g(this, (Continuation) null, 27), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f75086t;
    }
}
