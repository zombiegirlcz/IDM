package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i extends j {

    @NotNull
    public static final gu7.k Companion = new gu7.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gu7.m0 f75995b;

    public /* synthetic */ i(int i, gu7.m0 m0Var) {
        if (1 == (i & 1)) {
            this.f75995b = m0Var;
        } else {
            j1.f(gu7.j.f146767a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f75995b, ((i) obj2).f75995b);
    }

    public final int hashCode() {
        return this.f75995b.hashCode();
    }

    public i(gu7.m0 embeddedClaims) {
        Intrinsics.checkNotNullParameter(embeddedClaims, "embeddedClaims");
        this.f75995b = embeddedClaims;
    }
}
