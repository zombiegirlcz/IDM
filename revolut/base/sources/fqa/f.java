package fqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f137230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137231b;

    public f(c data, String str) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f137230a = data;
        this.f137231b = str;
    }

    @Override // fqa.g
    public final c a() {
        return this.f137230a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137230a, fVar.f137230a) && Intrinsics.f(this.f137231b, fVar.f137231b);
    }

    public final int hashCode() {
        int iHashCode = this.f137230a.hashCode() * 31;
        String str = this.f137231b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
