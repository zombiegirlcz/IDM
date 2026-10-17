package fdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class z1 {

    @NotNull
    public static final y1 Companion = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134421c;

    public /* synthetic */ z1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(x1.f134401a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134419a = str;
        this.f134420b = str2;
        this.f134421c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.f134419a, z1Var.f134419a) && Intrinsics.f(this.f134420b, z1Var.f134420b) && Intrinsics.f(this.f134421c, z1Var.f134421c);
    }

    public final int hashCode() {
        return this.f134421c.hashCode() + p.a.c(this.f134419a.hashCode() * 31, 31, this.f134420b);
    }
}
