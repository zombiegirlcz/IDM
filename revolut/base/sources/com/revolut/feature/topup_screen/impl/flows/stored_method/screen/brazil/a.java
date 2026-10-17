package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil;

import com.revolut.feature.topup_screen.api.descriptor.BrazilStoredMethodDetailsDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import umd.n;
import uxe.c;
import uxe.e;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements c {

    @NotNull
    public static final e Companion = new e();
    public final BrazilStoredMethodDetailsDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sve.a f90812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uxe.a f90813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u51.a f90814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f90815s;

    public a(BrazilStoredMethodDetailsDescriptor$InputData descriptorInputData, sve.a storedMethodDetailsInteractor, uxe.a revokeConfirmationProvider, u51.a topupMethodsInteractor) {
        Intrinsics.checkNotNullParameter(descriptorInputData, "descriptorInputData");
        Intrinsics.checkNotNullParameter(storedMethodDetailsInteractor, "storedMethodDetailsInteractor");
        Intrinsics.checkNotNullParameter(revokeConfirmationProvider, "revokeConfirmationProvider");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        this.o = descriptorInputData;
        this.f90812p = storedMethodDetailsInteractor;
        this.f90813q = revokeConfirmationProvider;
        this.f90814r = topupMethodsInteractor;
        this.f90815s = d.a(this, new BrazilStoredMethodDetailsFlowContract$Step.StoredMethodDetails(descriptorInputData.f90481a), f0.f322471a, new n(this, 17));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90815s;
    }
}
