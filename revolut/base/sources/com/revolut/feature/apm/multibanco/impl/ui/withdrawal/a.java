package com.revolut.feature.apm.multibanco.impl.ui.withdrawal;

import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.MultibancoWithdrawalFlowContract$Step;
import cp5.d;
import j3c.y;
import j72.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import t82.c;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final MultibancoWithdrawalInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j72.a f62632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f62633q;

    public a(MultibancoWithdrawalInputData inputData, j72.a errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = inputData;
        this.f62632p = errorHandlerExtension;
        suf.a aVar = new suf.a(this, 24);
        this.f62633q = d.a(this, MultibancoWithdrawalFlowContract$Step.Amount.f62630a, f0.f322471a, aVar);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((b) this.f62632p).b3(throwable, new y(12))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62633q;
    }
}
