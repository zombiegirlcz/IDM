package bgi;

import kotlin.jvm.internal.Intrinsics;
import lk0.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15203b;

    public a(String propertyId, int i) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f15202a = propertyId;
        this.f15203b = i;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF71990a() {
        return 25;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15202a, aVar.f15202a) && this.f15203b == aVar.f15203b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15203b) + j6.a.b(25, this.f15202a.hashCode() * 31, 31);
    }
}
