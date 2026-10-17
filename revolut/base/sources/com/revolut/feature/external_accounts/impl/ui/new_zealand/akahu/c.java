package com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu;

import d8l.d;
import eh3.s;
import eo6.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import xg6.l;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements eo6.b {

    @NotNull
    public static final e Companion = new e();
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f73071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final le6.c f73072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f73073r;

    public c(l linkExternalInstitutionsInteractor, zja.a productArticleInteractor, le6.c dialogModelBuilder) {
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(dialogModelBuilder, "dialogModelBuilder");
        this.o = linkExternalInstitutionsInteractor;
        this.f73071p = productArticleInteractor;
        this.f73072q = dialogModelBuilder;
        this.f73073r = d.a(this, new s(this, 15));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73073r;
    }
}
