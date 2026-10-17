package tb2;

import io3.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f269435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo3.d f269436b;

    public a(d pocket, fo3.d identityType) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        this.f269435a = pocket;
        this.f269436b = identityType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f269435a, aVar.f269435a) && this.f269436b == aVar.f269436b;
    }

    public final int hashCode() {
        return this.f269436b.hashCode() + (this.f269435a.hashCode() * 31);
    }
}
