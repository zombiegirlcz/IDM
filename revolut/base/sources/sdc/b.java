package sdc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261848a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f261848a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f261848a, ((b) obj2).f261848a);
    }

    @Override // sdc.c
    public final String getValue() {
        return this.f261848a;
    }

    public final int hashCode() {
        return this.f261848a.hashCode();
    }
}
