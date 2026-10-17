package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreenContract$InputData;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r10.f;
import vkm.q;
import vvc.s;
import w38.v;
import w4l.i;
import w7b.k;
import w7b.r;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements k {
    public final CobrandedCardsValueReminderScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c6b.b f82628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f82629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w7b.a f82630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f82631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f82632t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public c(CobrandedCardsValueReminderScreenContract$InputData inputData, n stateMapper, c6b.b cobrandedCardsBillingInteractor, f subscribeActionHandler, w7b.a dialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cobrandedCardsBillingInteractor, "cobrandedCardsBillingInteractor");
        Intrinsics.checkNotNullParameter(subscribeActionHandler, "subscribeActionHandler");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.o = inputData;
        this.f82628p = cobrandedCardsBillingInteractor;
        this.f82629q = subscribeActionHandler;
        this.f82630r = dialogMapper;
        this.f82631s = new vii.b(i.f294643c);
        this.f82632t = d.b(this, new w7b.i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = e.a(this, new s(this, 17));
    }

    public static CobrandedCardsDowngradeConfirmationScreen I2(CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation, Function0 function0, Function2 function2) {
        CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen = new CobrandedCardsDowngradeConfirmationScreen(new CobrandedCardsDowngradeConfirmationScreenContract$InputData(cobrandedCardsValueReminderActionConfirmation));
        v block = new v(function0, function2, 13);
        Intrinsics.checkNotNullParameter(block, "block");
        cobrandedCardsDowngradeConfirmationScreen.H = block;
        return cobrandedCardsDowngradeConfirmationScreen;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f82631s, new w2a.q(continuation, this, 7)), null, null, new r(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f82632t;
    }
}
