package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292391b;

    public r(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f292390a = type;
        this.f292391b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f292390a, rVar.f292390a) && Intrinsics.f(this.f292391b, rVar.f292391b);
    }

    public final int hashCode() {
        return this.f292391b.hashCode() + (this.f292390a.hashCode() * 31);
    }
}
