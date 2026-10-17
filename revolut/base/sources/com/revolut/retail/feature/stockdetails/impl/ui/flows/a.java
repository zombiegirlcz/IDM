package com.revolut.retail.feature.stockdetails.impl.ui.flows;

import com.revolut.retail.feature.stockdetails.impl.ui.flows.AddKeyStatsItemFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mtk.b;
import mtk.c;
import mtk.e;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements c {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qy5.a f103822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f103823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f103824r;

    public a(b input, qy5.a assetStatsIdSetReducer, e dialogMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(assetStatsIdSetReducer, "assetStatsIdSetReducer");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.o = input;
        this.f103822p = assetStatsIdSetReducer;
        this.f103823q = dialogMapper;
        this.f103824r = d.a(this, new AddKeyStatsItemFlowContract$Step.ViewGroupList(input.f208905b), f0.f322471a, new g(this, 17));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103824r;
    }
}
