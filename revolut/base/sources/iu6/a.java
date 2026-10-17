package iu6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f168519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168521c;

    public a(Set availableSaleTypes, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        this.f168519a = availableSaleTypes;
        this.f168520b = z;
        this.f168521c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f168519a, aVar.f168519a) && this.f168520b == aVar.f168520b && this.f168521c == aVar.f168521c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168521c) + j6.a.c(this.f168519a.hashCode() * 31, 31, this.f168520b);
    }
}
