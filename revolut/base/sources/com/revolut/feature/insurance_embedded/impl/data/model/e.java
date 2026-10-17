package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e extends c {

    @NotNull
    public static final gu7.f Companion = new gu7.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CfacPolicy f75984b;

    public /* synthetic */ e(int i, CfacPolicy cfacPolicy) {
        if (1 == (i & 1)) {
            this.f75984b = cfacPolicy;
        } else {
            j1.f(d.f75980a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f75984b, ((e) obj2).f75984b);
    }

    public final int hashCode() {
        return this.f75984b.hashCode();
    }

    public e(CfacPolicy cfacPolicy) {
        Intrinsics.checkNotNullParameter(cfacPolicy, "cfacPolicy");
        this.f75984b = cfacPolicy;
    }
}
