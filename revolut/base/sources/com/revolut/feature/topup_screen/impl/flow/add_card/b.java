package com.revolut.feature.topup_screen.impl.flow.add_card;

import cnc.t;
import com.revolut.feature.topup_screen.impl.flow.add_card.AddCardFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements cwe.b {
    public final wj0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p71.a f90598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zte.b f90599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f90600r;

    public b(wj0.a idempotencyKeyHolder, p71.a externalCardsRepository, zte.b cardPaymentsTopUpDialogs) {
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(cardPaymentsTopUpDialogs, "cardPaymentsTopUpDialogs");
        this.o = idempotencyKeyHolder;
        this.f90598p = externalCardsRepository;
        this.f90599q = cardPaymentsTopUpDialogs;
        t tVar = new t(this, 29);
        this.f90600r = d.a(this, AddCardFlowContract$Step.CardDetails.f90593a, f0.f322471a, tVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90600r;
    }
}
