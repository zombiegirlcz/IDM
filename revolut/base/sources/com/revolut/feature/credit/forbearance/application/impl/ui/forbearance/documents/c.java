package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import v44.r;
import y44.q;
import yea.l;
import yki.i;
import zz4.d;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements yz4.a {
    public final CreditForbearanceAgreementsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mz4.a f69939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f69940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l35.b f69941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rz4.b f69942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f69943t;
    public final q u;
    public final i v;

    public c(CreditForbearanceAgreementsContract$InputData inputData, mz4.a forbearanceApplicationCommandRouter, d interactor, l35.b loanInteractor, rz4.b forbearanceInteractor, r documentViewerControllerProvider, q documentsControllerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(forbearanceApplicationCommandRouter, "forbearanceApplicationCommandRouter");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(forbearanceInteractor, "forbearanceInteractor");
        Intrinsics.checkNotNullParameter(documentViewerControllerProvider, "documentViewerControllerProvider");
        Intrinsics.checkNotNullParameter(documentsControllerProvider, "documentsControllerProvider");
        this.o = inputData;
        this.f69939p = forbearanceApplicationCommandRouter;
        this.f69940q = interactor;
        this.f69941r = loanInteractor;
        this.f69942s = forbearanceInteractor;
        this.f69943t = documentViewerControllerProvider;
        this.u = documentsControllerProvider;
        this.v = d8l.d.a(this, new yz4.b(this, 0));
    }

    public final String I2() {
        String str = this.o.f69931a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yki.j
    public final void M0() {
        l2(new y7i.h(this, null, 29), new l(1, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 18));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
