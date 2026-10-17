package xo9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307751c;

    public k(String value, String fieldType, String optionType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.f307749a = value;
        this.f307750b = fieldType;
        this.f307751c = optionType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f307749a, kVar.f307749a) && Intrinsics.f(this.f307750b, kVar.f307750b) && Intrinsics.f(this.f307751c, kVar.f307751c);
    }

    public final int hashCode() {
        return this.f307751c.hashCode() + p.a.c(this.f307749a.hashCode() * 31, 31, this.f307750b);
    }
}
