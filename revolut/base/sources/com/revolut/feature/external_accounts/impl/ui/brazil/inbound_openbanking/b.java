package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking;

import com.revolut.feature.external_accounts.api.navigation.BrazilInboundOpenbankingDescriptor$InputData;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q5g.f0;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements qj6.b {
    public final BrazilInboundOpenbankingDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f72596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rj6.b f72597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rj6.a f72598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f72599s;

    public b(BrazilInboundOpenbankingDescriptor$InputData inputData, zja.a productArticleInteractor, rj6.b brazilInstitutionNotListedDialogProvider, rj6.a brazilBranchNotListedDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(brazilInstitutionNotListedDialogProvider, "brazilInstitutionNotListedDialogProvider");
        Intrinsics.checkNotNullParameter(brazilBranchNotListedDialogProvider, "brazilBranchNotListedDialogProvider");
        this.o = inputData;
        this.f72596p = productArticleInteractor;
        this.f72597q = brazilInstitutionNotListedDialogProvider;
        this.f72598r = brazilBranchNotListedDialogProvider;
        this.f72599s = d.a(this, new f0(this, 26));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72599s;
    }
}
