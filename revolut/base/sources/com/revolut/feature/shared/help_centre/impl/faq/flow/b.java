package com.revolut.feature.shared.help_centre.impl.faq.flow;

import d8l.d;
import k18.c;
import kotlin.jvm.internal.Intrinsics;
import mde.e;
import oki.h;
import vvc.s;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements w7d.b {
    public final SharedFaqLazyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f86212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f86213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f86214r;

    public b(SharedFaqLazyFlowContract$InputData inputData, c faqProvider, e sharedHelpDestinationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        this.o = inputData;
        this.f86212p = faqProvider;
        this.f86213q = sharedHelpDestinationProvider;
        this.f86214r = d.a(this, new s(this, 18));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f86214r;
    }
}
