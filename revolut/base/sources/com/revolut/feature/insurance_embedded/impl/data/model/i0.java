package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.p1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i0 extends f0 {

    @NotNull
    public static final p1 Companion = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoverageDetailsLayout f75996b;

    public /* synthetic */ i0(int i, CoverageDetailsLayout coverageDetailsLayout) {
        if (1 == (i & 1)) {
            this.f75996b = coverageDetailsLayout;
        } else {
            j1.f(h0.f75994a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f75996b, ((i0) obj2).f75996b);
    }

    public final int hashCode() {
        return this.f75996b.hashCode();
    }

    public i0(CoverageDetailsLayout details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f75996b = details;
    }
}
