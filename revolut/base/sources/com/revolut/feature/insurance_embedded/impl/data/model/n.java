package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n extends k {

    @NotNull
    public static final gu7.q Companion = new gu7.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomSheet f76016b;

    public /* synthetic */ n(int i, BottomSheet bottomSheet) {
        if (1 == (i & 1)) {
            this.f76016b = bottomSheet;
        } else {
            j1.f(m.f76015a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f76016b, ((n) obj2).f76016b);
    }

    public final int hashCode() {
        return this.f76016b.hashCode();
    }

    public n(BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f76016b = bottomSheet;
    }
}
