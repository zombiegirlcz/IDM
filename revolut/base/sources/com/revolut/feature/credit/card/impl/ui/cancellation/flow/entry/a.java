package com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry;

import ang.f;
import com.revolut.feature.credit.card.api.navigation.CreditCardCancellationDestination;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.CreditCardCancellationEntryFlowContract$Step;
import cq6.k;
import d8l.d;
import dq4.b;
import dq4.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.z;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {

    @NotNull
    private static final c Companion = new c();
    public final CreditCardCancellationEntryFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f69144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zp4.b f69145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f69146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f69147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vt4.a f69148t;
    public final i u;

    public a(CreditCardCancellationEntryFlowContract$InputData inputData, z creditCardCancellationInteractor, zp4.b creditCardCancellationFlowPromptFactory, f userInteractor, gte.a featureToggleInteractor, vt4.a creditCardBottomSheetMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardCancellationInteractor, "creditCardCancellationInteractor");
        Intrinsics.checkNotNullParameter(creditCardCancellationFlowPromptFactory, "creditCardCancellationFlowPromptFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardBottomSheetMapper, "creditCardBottomSheetMapper");
        this.o = inputData;
        this.f69144p = creditCardCancellationInteractor;
        this.f69145q = creditCardCancellationFlowPromptFactory;
        this.f69146r = userInteractor;
        this.f69147s = featureToggleInteractor;
        this.f69148t = creditCardBottomSheetMapper;
        this.u = d.a(this, new dgj.h(this, 26));
    }

    public final void I2(hl4.b bVar, wi0.b bVar2) {
        CreditCardCancellationEntryFlowContract$InputData creditCardCancellationEntryFlowContract$InputData = this.o;
        h.t2(this, this.u, new CreditCardCancellationEntryFlowContract$Step.CancellationFlow(creditCardCancellationEntryFlowContract$InputData.f69134a, creditCardCancellationEntryFlowContract$InputData.f69135b, bVar != null ? bVar.f152977c : null, bVar != null ? bVar.f152976b : null, bVar != null ? bVar.d : null, bVar != null ? bVar.e : null, bVar2), false, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        CreditCardCancellationDestination.CancellationType cancellationType = this.o.f69135b;
        Continuation continuation = null;
        if (!Intrinsics.f(cancellationType, CreditCardCancellationDestination.CancellationType.FacilityOwnerCancelOwnCard.f68903a)) {
            if (!(cancellationType instanceof CreditCardCancellationDestination.CancellationType.FacilityOwnerCancelAdditionalCard) && !(cancellationType instanceof CreditCardCancellationDestination.CancellationType.AdditionalCardOwnerCancelOwnCard)) {
                throw new NoWhenBranchMatchedException();
            }
            I2(null, null);
            return;
        }
        l2(new k(this, continuation, 27), new dkm.a(1, this, a.class, "handleErrorEndQuit", "handleErrorEndQuit(Ljava/lang/Throwable;)Z", 0, 4));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
