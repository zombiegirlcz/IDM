package com.revolut.feature.profile.impl.ui.profile;

import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import mna.b;
import oki.h;
import pre.c;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f81432p;

    public a(ProfileFlowContract$InputData inputData, c termsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.o = termsInteractor;
        this.f81432p = d.a(this, inputData.f81421a, f0.f322471a, new e(this, 28));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f81432p;
    }
}
