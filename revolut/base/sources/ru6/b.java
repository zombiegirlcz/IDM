package ru6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr6.q f257446a;

    public b(nr6.q invoice) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        this.f257446a = invoice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f257446a, ((b) obj2).f257446a);
    }

    public final int hashCode() {
        return this.f257446a.hashCode();
    }
}
