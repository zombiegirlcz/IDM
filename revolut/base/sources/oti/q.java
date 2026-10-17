package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229678b;

    public /* synthetic */ q(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(o.f229672a.getDescriptor(), i, 3);
            throw null;
        }
        this.f229677a = str;
        this.f229678b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f229677a, qVar.f229677a) && Intrinsics.f(this.f229678b, qVar.f229678b);
    }

    public final int hashCode() {
        return this.f229678b.hashCode() + (this.f229677a.hashCode() * 31);
    }

    public q(String openTime, String closeTime) {
        Intrinsics.checkNotNullParameter(openTime, "openTime");
        Intrinsics.checkNotNullParameter(closeTime, "closeTime");
        this.f229677a = openTime;
        this.f229678b = closeTime;
    }
}
