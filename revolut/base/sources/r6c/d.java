package r6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f251655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251656b;

    public d(c type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f251655a = type;
        this.f251656b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f251655a == dVar.f251655a && Intrinsics.f(this.f251656b, dVar.f251656b);
    }

    public final int hashCode() {
        int iHashCode = this.f251655a.hashCode() * 31;
        String str = this.f251656b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
