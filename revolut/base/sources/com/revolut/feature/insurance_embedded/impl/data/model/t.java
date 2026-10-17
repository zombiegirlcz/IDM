package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t extends s {

    @NotNull
    public static final gu7.j0 Companion = new gu7.j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76032b;

    public /* synthetic */ t(int i, String str) {
        if (1 == (i & 1)) {
            this.f76032b = str;
        } else {
            j1.f(gu7.i0.f146764a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f76032b, ((t) obj2).f76032b);
    }

    public final int hashCode() {
        return this.f76032b.hashCode();
    }

    public t(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f76032b = url2;
    }
}
