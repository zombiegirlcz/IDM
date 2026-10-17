package com.revolut.feature.apm.qvik.impl.ui.new_recipient;

import com.revolut.feature.apm.qvik.impl.ui.new_recipient.QvikNewRecipientFlowContract$Step;
import cp5.d;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import mc2.g;
import oki.h;
import s42.f;
import sc2.b;
import sc2.c;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cc2.a f62812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f62813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f62814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.c f62815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f62816t;

    public a(c inputData, cc2.a apmNavigationProvider, g newContactNavigationProvider, c0 beneficiaryMapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(beneficiaryMapper, "beneficiaryMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.o = inputData;
        this.f62812p = apmNavigationProvider;
        this.f62813q = newContactNavigationProvider;
        this.f62814r = beneficiaryMapper;
        this.f62815s = uiKitResources;
        f fVar = new f(this, 24);
        this.f62816t = d.a(this, QvikNewRecipientFlowContract$Step.Dialog.f62811a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62816t;
    }
}
