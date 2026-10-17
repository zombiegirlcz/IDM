package fj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135520b;

    public c(int i, String nationalNumber) {
        Intrinsics.checkNotNullParameter(nationalNumber, "nationalNumber");
        this.f135519a = i;
        this.f135520b = nationalNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f135519a == cVar.f135519a && Intrinsics.f(this.f135520b, cVar.f135520b);
    }

    public final int hashCode() {
        return this.f135520b.hashCode() + (Integer.hashCode(this.f135519a) * 31);
    }
}
