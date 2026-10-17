package rua;

import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257506b;

    public a(String firstName, String str) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f257505a = firstName;
        this.f257506b = str;
    }

    @Override // rua.c
    public final String displayName() {
        String[] elements = {this.f257505a, this.f257506b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f257505a, aVar.f257505a) && Intrinsics.f(this.f257506b, aVar.f257506b);
    }

    public final int hashCode() {
        int iHashCode = this.f257505a.hashCode() * 31;
        String str = this.f257506b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
