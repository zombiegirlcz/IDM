package mx0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class dc {

    @NotNull
    public static final cc Companion = new cc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f209660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final koi.j f209662c;
    public final koi.j d;
    public final int e;

    public dc(int i, int i2, koi.j jVar, koi.j currentItem, int i3) {
        Intrinsics.checkNotNullParameter(currentItem, "currentItem");
        this.f209660a = i;
        this.f209661b = i2;
        this.f209662c = jVar;
        this.d = currentItem;
        this.e = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj2;
        return this.f209660a == dcVar.f209660a && this.f209661b == dcVar.f209661b && Intrinsics.f(this.f209662c, dcVar.f209662c) && Intrinsics.f(this.d, dcVar.d) && this.e == dcVar.e;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f209661b, Integer.hashCode(this.f209660a) * 31, 31);
        koi.j jVar = this.f209662c;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((iB + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31);
    }
}
