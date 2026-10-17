package com.revolut.feature.acquiring.card_reader.order.api.model;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VatSelection f60588b;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f60587a, aVar.f60587a) && Intrinsics.f(this.f60588b, aVar.f60588b);
    }

    public final int hashCode() {
        String str = this.f60587a;
        return this.f60588b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public a(String str, VatSelection vatSelection) {
        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
        this.f60587a = str;
        this.f60588b = vatSelection;
    }

    public /* synthetic */ a(int i) {
        this(null, VatSelection.Optional.f60585a);
    }
}
