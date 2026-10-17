package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p {

    @NotNull
    public static final gu7.g0 Companion = new gu7.g0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f76026c = {null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f76028b;

    public /* synthetic */ p(int i, String str, s sVar) {
        if (3 != (i & 3)) {
            j1.f(gu7.f0.f146742a.getDescriptor(), i, 3);
            throw null;
        }
        this.f76027a = str;
        this.f76028b = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f76027a, pVar.f76027a) && Intrinsics.f(this.f76028b, pVar.f76028b);
    }

    public final int hashCode() {
        int iHashCode = this.f76027a.hashCode() * 31;
        s sVar = this.f76028b;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public p(String text, s sVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f76027a = text;
        this.f76028b = sVar;
    }
}
