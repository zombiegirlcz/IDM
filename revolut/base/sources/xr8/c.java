package xr8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f308304b;

    public c(String code, jo3.b bVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f308303a = code;
        this.f308304b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f308303a, cVar.f308303a) && Intrinsics.f(this.f308304b, cVar.f308304b);
    }

    public final int hashCode() {
        int iHashCode = this.f308303a.hashCode() * 31;
        jo3.b bVar = this.f308304b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
