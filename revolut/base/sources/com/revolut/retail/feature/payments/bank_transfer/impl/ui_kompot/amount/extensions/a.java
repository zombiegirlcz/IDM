package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions;

import g4k.b;
import g4k.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import v60.e;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends n implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f102088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f102089m;

    public a(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f102088l = serverErrorParser;
        this.f102089m = serverErrorsProvider;
    }
}
