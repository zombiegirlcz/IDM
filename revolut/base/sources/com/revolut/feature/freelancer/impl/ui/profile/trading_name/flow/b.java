package com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow;

import et6.h1;
import jr6.r;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import wr1.s;
import wtj.c;
import x07.d;
import yki.i;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements x07.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f74067s = r0.k(new Pair(ib.b.Flow, "MERCHANT_CHANGE_REQUEST"), new Pair("product", "TRADING_NAME"));
    public final h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f74068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f74069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f74070r;

    public b(h1 freelancerInteractor, r freelancerPendingPromptFactory, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = freelancerInteractor;
        this.f74068p = freelancerPendingPromptFactory;
        this.f74069q = workflowInteractor;
        this.f74070r = d8l.d.a(this, new c(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        l2(new s(this, null, 16), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74070r;
    }
}
