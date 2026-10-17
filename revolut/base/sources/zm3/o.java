package zm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f323377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f323378c;

    public o(String phone, long j2, int i) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f323376a = phone;
        this.f323377b = j2;
        this.f323378c = i;
    }

    @Override // zm3.a
    public final long a() {
        return this.f323377b;
    }

    @Override // zm3.a
    public final int b() {
        return this.f323378c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f323376a, oVar.f323376a) && this.f323377b == oVar.f323377b && this.f323378c == oVar.f323378c;
    }

    public final String getPhone() {
        return this.f323376a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f323378c) + a0.d.c(this.f323376a.hashCode() * 31, 31, this.f323377b);
    }

    public /* synthetic */ o(String str) {
        this(str, 0L, 0);
    }
}
