package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ea0 extends kh0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(Throwable original) {
        super(original.getMessage(), original.getCause(), "network_error");
        Intrinsics.checkNotNullParameter(original, "original");
    }
}
