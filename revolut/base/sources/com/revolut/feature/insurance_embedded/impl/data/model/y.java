package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.r0;
import gu7.s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y extends v {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76039b;

    public /* synthetic */ y(int i, String str) {
        if (1 == (i & 1)) {
            this.f76039b = str;
        } else {
            j1.f(r0.f146820a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f76039b, ((y) obj2).f76039b);
    }

    public final int hashCode() {
        return this.f76039b.hashCode();
    }

    public y(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f76039b = url2;
    }
}
