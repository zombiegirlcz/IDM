package h07;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f148197b;

    public e(String email, long j2) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f148196a = email;
        this.f148197b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f148196a, eVar.f148196a) && this.f148197b == eVar.f148197b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f148197b) + (this.f148196a.hashCode() * 31);
    }
}
