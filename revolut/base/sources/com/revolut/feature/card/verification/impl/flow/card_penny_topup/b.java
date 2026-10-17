package com.revolut.feature.card.verification.impl.flow.card_penny_topup;

import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlowContract$Step;
import cp5.d;
import fv2.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import til.m;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements fv2.b {

    @NotNull
    public static final e Companion = new e();
    public final CardPennyTopUpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f64405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f64406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f64407r;

    public b(CardPennyTopUpFlowContract$InputData inputData, jvh.a workflowInteractor, m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.o = inputData;
        this.f64405p = workflowInteractor;
        this.f64406q = workflowFlowProvider;
        this.f64407r = d.a(this, new CardPennyTopUpFlowContract$Step.Info(inputData.f64398a), f0.f322471a, new fv1.a(this, 1));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64407r;
    }
}
