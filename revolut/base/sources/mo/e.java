package mo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f207533a;

    public /* synthetic */ e(int i) {
        this.f207533a = i;
    }

    public static final /* synthetic */ e a() {
        return new e(521);
    }

    public static int b(int i) {
        return Integer.hashCode(i);
    }

    public final /* synthetic */ int c() {
        return this.f207533a;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return this.f207533a == ((e) obj2).f207533a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207533a);
    }

    public final String toString() {
        return j6.a.l(this.f207533a, "TeamId(value=", ")");
    }
}
