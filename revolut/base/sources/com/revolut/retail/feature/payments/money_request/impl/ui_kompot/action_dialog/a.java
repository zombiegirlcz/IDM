package com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog;

import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.MoneyRequestActionFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import x2g.b;
import x6k.c;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements c {
    public final MoneyRequestActionNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x6k.a f102142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vv9.a f102143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f102144r;

    public a(MoneyRequestActionNavigation$InputData inputData, x6k.a dialogProvider, vv9.a moneyRequestActionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(moneyRequestActionsInteractor, "moneyRequestActionsInteractor");
        this.o = inputData;
        this.f102142p = dialogProvider;
        this.f102143q = moneyRequestActionsInteractor;
        b bVar = new b(this, 8);
        this.f102144r = d.a(this, MoneyRequestActionFlowContract$Step.Dialog.f102141a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102144r;
    }
}
