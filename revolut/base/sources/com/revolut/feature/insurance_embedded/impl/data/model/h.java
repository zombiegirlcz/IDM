package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h extends j {

    @NotNull
    public static final gu7.i Companion = new gu7.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f75993b;

    public /* synthetic */ h(int i, g gVar) {
        if (1 == (i & 1)) {
            this.f75993b = gVar;
        } else {
            j1.f(gu7.h.f146754a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f75993b, ((h) obj2).f75993b);
    }

    public final int hashCode() {
        return this.f75993b.hashCode();
    }

    public h(g coverageSelectionLayout) {
        Intrinsics.checkNotNullParameter(coverageSelectionLayout, "coverageSelectionLayout");
        this.f75993b = coverageSelectionLayout;
    }
}
