package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.v0;
import gu7.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 extends v {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75975b;

    public /* synthetic */ a0(int i, String str) {
        if (1 == (i & 1)) {
            this.f75975b = str;
        } else {
            j1.f(v0.f146845a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f75975b, ((a0) obj2).f75975b);
    }

    public final int hashCode() {
        return this.f75975b.hashCode();
    }

    public a0(String faqKey) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f75975b = faqKey;
    }
}
