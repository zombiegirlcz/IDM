package hqi;

import hqi.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f154714c;
    public static final i d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f154715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f154716b;

    static {
        l.Companion.getClass();
        f154714c = new i(Integer.valueOf(j.f154718b), k.c.f154721a);
        d = new i(null, k.d.f154722a);
    }

    public i(Integer num, k mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f154715a = num;
        this.f154716b = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154715a, iVar.f154715a) && Intrinsics.f(this.f154716b, iVar.f154716b);
    }

    public final int hashCode() {
        Integer num = this.f154715a;
        return this.f154716b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
