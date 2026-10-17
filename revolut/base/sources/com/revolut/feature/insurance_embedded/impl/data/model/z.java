package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.t0;
import gu7.u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z extends v {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76040b;

    public /* synthetic */ z(int i, String str) {
        if (1 == (i & 1)) {
            this.f76040b = str;
        } else {
            j1.f(t0.f146834a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f76040b, ((z) obj2).f76040b);
    }

    public final int hashCode() {
        return this.f76040b.hashCode();
    }

    public z(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f76040b = email;
    }
}
