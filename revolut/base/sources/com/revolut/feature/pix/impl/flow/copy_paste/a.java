package com.revolut.feature.pix.impl.flow.copy_paste;

import c9f.c;
import com.revolut.feature.pix.impl.flow.copy_paste.PixCopyPasteContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements caa.a {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f80634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f80635q;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = featureToggleInteractor;
        this.f80634p = e.b(this, PixCopyPasteContract$EmptyState.f80631a);
        c cVar = new c(this, 2);
        this.f80635q = cp5.d.a(this, PixCopyPasteContract$Step.CodeInput.f80632a, f0.f322471a, cVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f80634p;
    }

    @Override // yki.g
    public final b s() {
        return this.f80635q;
    }
}
