package com.revolut.feature.trusted_merchants.impl.ui.kompot.details;

import cli.g;
import cli.y;
import hx7.e;
import jch.p;
import jjg.b;
import jjg.j;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements jjg.a {
    public final yig.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f94425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94426q;

    public a(j stateMapper, yig.a repository, TrustedMerchantDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = repository;
        this.f94425p = d.b(this, new b(inputData.f94423a), stateMapper, null, false, 12);
        this.f94426q = e.a(this, new p(this, 22));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94426q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f94425p;
    }
}
