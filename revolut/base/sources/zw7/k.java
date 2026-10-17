package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325806b;

    public k(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f325805a = name;
        this.f325806b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f325805a, kVar.f325805a) && Intrinsics.f(this.f325806b, kVar.f325806b);
    }

    public final int hashCode() {
        return this.f325806b.hashCode() + (this.f325805a.hashCode() * 31);
    }
}
