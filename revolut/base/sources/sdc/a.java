package sdc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261847a;

    public a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f261847a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f261847a, ((a) obj2).f261847a);
    }

    @Override // sdc.c
    public final String getValue() {
        return this.f261847a;
    }

    public final int hashCode() {
        return this.f261847a.hashCode();
    }
}
