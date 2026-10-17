package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r extends s {

    @NotNull
    public static final gu7.h0 Companion = new gu7.h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomSheet f76030b;

    public /* synthetic */ r(int i, BottomSheet bottomSheet) {
        if (1 == (i & 1)) {
            this.f76030b = bottomSheet;
        } else {
            j1.f(q.f76029a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f76030b, ((r) obj2).f76030b);
    }

    public final int hashCode() {
        return this.f76030b.hashCode();
    }

    public r(BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f76030b = bottomSheet;
    }
}
