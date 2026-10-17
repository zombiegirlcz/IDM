package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u extends s {

    @NotNull
    public static final gu7.l0 Companion = new gu7.l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76033b;

    public /* synthetic */ u(int i, String str) {
        if (1 == (i & 1)) {
            this.f76033b = str;
        } else {
            j1.f(gu7.k0.f146775a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f76033b, ((u) obj2).f76033b);
    }

    public final int hashCode() {
        return this.f76033b.hashCode();
    }

    public u(String policyId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f76033b = policyId;
    }
}
