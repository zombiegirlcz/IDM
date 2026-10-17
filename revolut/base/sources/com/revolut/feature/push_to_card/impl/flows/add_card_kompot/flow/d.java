package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow;

import aii.m;
import aii.n;
import aii.w;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.f;
import zhm.f0;
import zqa.i;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h implements wqa.b {
    public final xqa.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zqa.a f81574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CardOwnerCreationInputData f81575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f81576r;

    public d(xqa.a cardEligibilityValidationDelegate, zqa.a cardOwnerCreationExtension, CardOwnerCreationInputData inputData) {
        Intrinsics.checkNotNullParameter(cardEligibilityValidationDelegate, "cardEligibilityValidationDelegate");
        Intrinsics.checkNotNullParameter(cardOwnerCreationExtension, "cardOwnerCreationExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = cardEligibilityValidationDelegate;
        this.f81574p = cardOwnerCreationExtension;
        this.f81575q = inputData;
        f fVar = new f(this, 26);
        this.f81576r = cp5.d.a(this, CardOwnerCreationFlowContract$Step.CardOwnerMainInfo.f81572a, f0.f322471a, fVar);
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        w wVar = w.f5295a;
        if (z) {
            C2(new dqa.b(((i) event).f324449b));
            return wVar;
        }
        if (!(event instanceof zqa.h)) {
            return super.o2(event);
        }
        h.D2(this.f81576r);
        return wVar;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f81576r;
    }
}
