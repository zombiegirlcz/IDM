package vqc;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291377b;

    public i(String employerName, String cnpj) {
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(cnpj, "cnpj");
        this.f291376a = employerName;
        this.f291377b = cnpj;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f291376a, iVar.f291376a) && Intrinsics.f(this.f291377b, iVar.f291377b);
    }

    public final int hashCode() {
        return this.f291377b.hashCode() + (this.f291376a.hashCode() * 31);
    }
}
