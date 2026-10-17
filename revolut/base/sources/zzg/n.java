package zzg;

import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f326746b;

    public n(String ref2, z instrumentType) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f326745a = ref2;
        this.f326746b = instrumentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f326745a, nVar.f326745a) && this.f326746b == nVar.f326746b;
    }

    public final int hashCode() {
        return this.f326746b.hashCode() + (this.f326745a.hashCode() * 31);
    }
}
