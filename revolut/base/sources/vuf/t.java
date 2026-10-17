package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292395b;

    public t(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f292394a = type;
        this.f292395b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f292394a, tVar.f292394a) && Intrinsics.f(this.f292395b, tVar.f292395b);
    }

    public final int hashCode() {
        return this.f292395b.hashCode() + (this.f292394a.hashCode() * 31);
    }
}
