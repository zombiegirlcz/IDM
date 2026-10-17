package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f253631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f253633c;

    public q(u name, String email, String phone) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f253631a = name;
        this.f253632b = email;
        this.f253633c = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f253631a, qVar.f253631a) && Intrinsics.f(this.f253632b, qVar.f253632b) && Intrinsics.f(this.f253633c, qVar.f253633c);
    }

    public final int hashCode() {
        return this.f253633c.hashCode() + p.a.c(this.f253631a.hashCode() * 31, 31, this.f253632b);
    }
}
