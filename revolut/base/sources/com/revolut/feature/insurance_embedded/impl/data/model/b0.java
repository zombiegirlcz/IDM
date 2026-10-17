package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.e1;
import gu7.x0;
import gu7.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 extends v {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f75977b;

    public /* synthetic */ b0(int i, e1 e1Var) {
        if (1 == (i & 1)) {
            this.f75977b = e1Var;
        } else {
            j1.f(x0.f146861a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f75977b, ((b0) obj2).f75977b);
    }

    public final int hashCode() {
        return this.f75977b.hashCode();
    }

    public b0(e1 hiddenPhone) {
        Intrinsics.checkNotNullParameter(hiddenPhone, "hiddenPhone");
        this.f75977b = hiddenPhone;
    }
}
