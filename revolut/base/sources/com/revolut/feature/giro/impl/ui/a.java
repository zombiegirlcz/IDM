package com.revolut.feature.giro.impl.ui;

import com.revolut.feature.giro.api.navigation.GiroCreationFlowInputData;
import com.revolut.feature.giro.impl.ui.GiroFlowContract$Step;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rea.m;
import yki.i;
import yzb.c;
import z67.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final GiroCreationFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final im1.a f74537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f74538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xi0.b f74539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f74540s;

    public a(GiroCreationFlowInputData inputData, im1.a billersInteractor, m pocketDetailsInteractor, xi0.b featureCurrency) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billersInteractor, "billersInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(featureCurrency, "featureCurrency");
        this.o = inputData;
        this.f74537p = billersInteractor;
        this.f74538q = pocketDetailsInteractor;
        this.f74539r = featureCurrency;
        this.f74540s = d.a(this, new yz4.b(this, 14));
    }

    @Override // yki.j
    public final void M0() {
        GiroCreationFlowInputData giroCreationFlowInputData = this.o;
        if (giroCreationFlowInputData instanceof GiroCreationFlowInputData.CreditorSearch) {
            h.t2(this, this.f74540s, GiroFlowContract$Step.CreditorSearch.f74533a, true, null, false, 12);
        } else {
            if (!(giroCreationFlowInputData instanceof GiroCreationFlowInputData.WithCreditor)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new c(this, null, 3), new yi5.b(26));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74540s;
    }
}
