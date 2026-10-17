package no1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f217897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217898b;

    public b(a inputType, String value) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f217897a = inputType;
        this.f217898b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f217897a == bVar.f217897a && Intrinsics.f(this.f217898b, bVar.f217898b);
    }

    public final int hashCode() {
        return this.f217898b.hashCode() + (this.f217897a.hashCode() * 31);
    }
}
