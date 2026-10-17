package ird;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168040b;

    public a(String name, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f168039a = name;
        this.f168040b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f168039a, aVar.f168039a) && Intrinsics.f(this.f168040b, aVar.f168040b);
    }

    public final int hashCode() {
        return this.f168040b.hashCode() + (this.f168039a.hashCode() * 31);
    }
}
