package v60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f286247b;

    public c(String resKey, int i) {
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        this.f286246a = resKey;
        this.f286247b = i;
    }

    @Override // v60.d
    public final String a() {
        return this.f286246a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f286246a, cVar.f286246a) && this.f286247b == cVar.f286247b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f286247b) + (this.f286246a.hashCode() * 31);
    }
}
