package com.revolut.feature.revolutpay.shared.ui.add_payment_method;

import cli.y;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.a;
import gdc.d;
import gdc.k;
import gdc.m;
import gdc.q;
import gdc.r;
import gdc.u;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q7c.g;
import skm.a2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements m {

    @NotNull
    public static final r Companion = new r();
    public final AddPaymentMethodControllerDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f84710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f84711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f84712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f84714t;
    public final y u;

    public c(AddPaymentMethodControllerDescriptor$InputData inputData, g paymentMethodsInteractor, u expiryDateFormatter, d dialogFactory, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(expiryDateFormatter, "expiryDateFormatter");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f84710p = paymentMethodsInteractor;
        this.f84711q = expiryDateFormatter;
        this.f84712r = dialogFactory;
        this.f84713s = e.a(this, new gcc.c(5));
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.u = mra.d.b(this, new k("", "", "", a.b.f84709a, "", inputData.f84705b, false), stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84713s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
