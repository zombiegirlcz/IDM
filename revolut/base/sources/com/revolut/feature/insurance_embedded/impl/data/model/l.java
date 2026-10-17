package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l extends k {

    @NotNull
    public static final gu7.p Companion = new gu7.p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76004c;

    public /* synthetic */ l(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(gu7.o.f146805a.getDescriptor(), i, 3);
            throw null;
        }
        this.f76003b = str;
        this.f76004c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f76003b, lVar.f76003b) && Intrinsics.f(this.f76004c, lVar.f76004c);
    }

    public final int hashCode() {
        return this.f76004c.hashCode() + (this.f76003b.hashCode() * 31);
    }

    public l(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f76003b = name;
        this.f76004c = value;
    }
}
