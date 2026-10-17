package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class t3 {

    @NotNull
    public static final s3 Companion = new s3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131717b;

    public /* synthetic */ t3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(r3.f131705a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131716a = str;
        this.f131717b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj2;
        return Intrinsics.f(this.f131716a, t3Var.f131716a) && Intrinsics.f(this.f131717b, t3Var.f131717b);
    }

    public final int hashCode() {
        return this.f131717b.hashCode() + (this.f131716a.hashCode() * 31);
    }

    public t3(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f131716a = id10;
        this.f131717b = name;
    }
}
