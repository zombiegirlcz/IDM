package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.n1;
import gu7.o1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g0 extends f0 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75992b;

    public /* synthetic */ g0(int i, String str) {
        if (1 == (i & 1)) {
            this.f75992b = str;
        } else {
            j1.f(n1.f146800a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f75992b, ((g0) obj2).f75992b);
    }

    public final int hashCode() {
        return this.f75992b.hashCode();
    }

    public g0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f75992b = url2;
    }
}
