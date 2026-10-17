package toh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f273211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273212b;

    public a(b type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f273211a = type;
        this.f273212b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f273211a == aVar.f273211a && Intrinsics.f(this.f273212b, aVar.f273212b);
    }

    public final int hashCode() {
        return this.f273212b.hashCode() + (this.f273211a.hashCode() * 31);
    }
}
