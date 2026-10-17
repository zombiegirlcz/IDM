package com.revolut.feature.credit.application.plugins.impl.ui.amount_input;

import e54.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditAmountInputScreenContract$Configuration f67050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67052c;
    public final z d;
    public final e54.a e;

    public c(CreditAmountInputScreenContract$Configuration configuration, long j2, long j3, z inputValueMapper, e54.a amountCalculator) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(inputValueMapper, "inputValueMapper");
        Intrinsics.checkNotNullParameter(amountCalculator, "amountCalculator");
        this.f67050a = configuration;
        this.f67051b = j2;
        this.f67052c = j3;
        this.d = inputValueMapper;
        this.e = amountCalculator;
    }
}
