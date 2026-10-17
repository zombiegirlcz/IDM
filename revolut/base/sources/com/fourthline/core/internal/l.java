package com.fourthline.core.internal;

import com.fourthline.core.mrz.IdlDutchInfoExtensionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class l implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26363a;

    public l(String mrzText) {
        Intrinsics.checkNotNullParameter(mrzText, "mrzText");
        this.f26363a = mrzText;
    }

    @Override // com.fourthline.core.internal.z
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w a() {
        String strC = b0.c(kotlin.text.d0.t0(this.f26363a, new IntRange(6, 15, 1)));
        return new w(strC, a(strC), b0.c(kotlin.text.d0.t0(this.f26363a, new IntRange(29, 29, 1))));
    }

    private final String a(String str) {
        return IdlDutchInfoExtensionsKt.getCleanNLIDLPrefix(this.f26363a) + str + b0.a(kotlin.text.d0.t0(this.f26363a, new IntRange(16, 28, 1)));
    }
}
