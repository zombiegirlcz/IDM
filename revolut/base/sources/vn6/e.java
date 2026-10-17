package vn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290761a;

    public e(String iban) {
        Intrinsics.checkNotNullParameter(iban, "iban");
        this.f290761a = iban;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f290761a, ((e) obj2).f290761a);
    }

    public final int hashCode() {
        return this.f290761a.hashCode();
    }
}
