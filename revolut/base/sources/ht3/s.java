package ht3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155306b;

    public s(String title, String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f155305a = title;
        this.f155306b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f155305a, sVar.f155305a) && Intrinsics.f(this.f155306b, sVar.f155306b);
    }

    public final int hashCode() {
        return this.f155306b.hashCode() + (this.f155305a.hashCode() * 31);
    }
}
