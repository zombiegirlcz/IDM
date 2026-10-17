package com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms;

import aa6.c;
import com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.DonationsAcceptTermsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import mb6.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f72014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f72015q;

    public a(c donationsInteractor, mre.c termsNavigationFactory, DonationsAcceptTermsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = donationsInteractor;
        this.f72014p = termsNavigationFactory;
        this.f72015q = d.a(this, new DonationsAcceptTermsFlowContract$Step.AcceptTerms(inputData.f72012a), f0.f322471a, new e(this, 6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72015q;
    }
}
