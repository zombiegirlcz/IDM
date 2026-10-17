package qa4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f243950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f243951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f243952c;

    public e(int i, long j2, String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f243950a = i;
        this.f243951b = j2;
        this.f243952c = email;
    }

    public static e a(e eVar, int i, long j2, int i2) {
        if ((i2 & 1) != 0) {
            i = eVar.f243950a;
        }
        if ((i2 & 2) != 0) {
            j2 = eVar.f243951b;
        }
        String email = eVar.f243952c;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        return new e(i, j2, email);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f243950a == eVar.f243950a && this.f243951b == eVar.f243951b && Intrinsics.f(this.f243952c, eVar.f243952c);
    }

    public final int hashCode() {
        return this.f243952c.hashCode() + a0.d.c(Integer.hashCode(this.f243950a) * 31, 31, this.f243951b);
    }
}
