package pd5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235092b;

    public a(String name, String logoId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoId, "logoId");
        this.f235091a = name;
        this.f235092b = logoId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f235091a, aVar.f235091a) && Intrinsics.f(this.f235092b, aVar.f235092b);
    }

    public final int hashCode() {
        return this.f235092b.hashCode() + (this.f235091a.hashCode() * 31);
    }
}
