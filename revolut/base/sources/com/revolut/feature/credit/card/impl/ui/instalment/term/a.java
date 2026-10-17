package com.revolut.feature.credit.card.impl.ui.instalment.term;

import al4.e;
import al4.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalmentTermScreenContract$InputData f69520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f69521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f69522c;

    public a(InstalmentTermScreenContract$InputData inputData, m creditInteractor, e debitInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        Intrinsics.checkNotNullParameter(debitInteractor, "debitInteractor");
        this.f69520a = inputData;
        this.f69521b = creditInteractor;
        this.f69522c = debitInteractor;
    }
}
