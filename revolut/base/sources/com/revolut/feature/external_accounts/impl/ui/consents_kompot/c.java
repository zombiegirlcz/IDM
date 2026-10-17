package com.revolut.feature.external_accounts.impl.ui.consents_kompot;

import ang.f;
import d8l.d;
import gl6.e;
import kotlin.jvm.internal.Intrinsics;
import oe6.m;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements gl6.c {

    @NotNull
    public static final e Companion = new e();
    public final ad2.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f72756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l61.a f72757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f72758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f72759s;

    public c(ad2.a iDealRepository, f userInteractor, l61.a userCompanyInteractor, m openBankingInteractor) {
        Intrinsics.checkNotNullParameter(iDealRepository, "iDealRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        this.o = iDealRepository;
        this.f72756p = userInteractor;
        this.f72757q = userCompanyInteractor;
        this.f72758r = openBankingInteractor;
        this.f72759s = d.a(this, new ghl.c(this, 8));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72759s;
    }
}
