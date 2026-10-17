package rwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257944c;

    public /* synthetic */ u(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(s.f257941a.getDescriptor(), i, 7);
            throw null;
        }
        this.f257942a = str;
        this.f257943b = str2;
        this.f257944c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f257942a, uVar.f257942a) && Intrinsics.f(this.f257943b, uVar.f257943b) && Intrinsics.f(this.f257944c, uVar.f257944c);
    }

    public final int hashCode() {
        return this.f257944c.hashCode() + p.a.c(this.f257942a.hashCode() * 31, 31, this.f257943b);
    }
}
