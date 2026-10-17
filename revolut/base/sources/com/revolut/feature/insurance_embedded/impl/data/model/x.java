package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.q0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x extends v {

    @NotNull
    public static final q0 Companion = new q0();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new gu7.d(16)), null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Website f76038c;

    public /* synthetic */ x(int i, List list, Website website) {
        if (3 != (i & 3)) {
            j1.f(w.f76036a.getDescriptor(), i, 3);
            throw null;
        }
        this.f76037b = list;
        this.f76038c = website;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f76037b, xVar.f76037b) && Intrinsics.f(this.f76038c, xVar.f76038c);
    }

    public final int hashCode() {
        return this.f76038c.hashCode() + (this.f76037b.hashCode() * 31);
    }

    public x(List eligibleCardsIds, Website website) {
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f76037b = eligibleCardsIds;
        this.f76038c = website;
    }
}
