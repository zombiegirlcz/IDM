package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.a1;
import gu7.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c0 extends v {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75979b;

    public /* synthetic */ c0(int i, String str) {
        if (1 == (i & 1)) {
            this.f75979b = str;
        } else {
            j1.f(z0.f146872a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f75979b, ((c0) obj2).f75979b);
    }

    public final int hashCode() {
        return this.f75979b.hashCode();
    }

    public c0(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f75979b = phone;
    }
}
