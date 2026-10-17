package com.fourthline.core.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements d {
    @Override // com.fourthline.core.internal.d
    public String a(String mrz) {
        Intrinsics.checkNotNullParameter(mrz, "mrz");
        return kotlin.text.a0.D(mrz, " ", "", false);
    }

    @Override // com.fourthline.core.internal.d
    public String b(String mrz) {
        Intrinsics.checkNotNullParameter(mrz, "mrz");
        return kotlin.text.a0.D(mrz, "\n", "", false);
    }
}
