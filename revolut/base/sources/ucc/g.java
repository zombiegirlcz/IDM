package ucc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends lk0.f {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f279026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f279028c;
    public final Integer d;

    public g(Integer num, String str, String str2, boolean z) {
        this.f279026a = z;
        this.f279027b = str;
        this.f279028c = str2;
        this.d = num;
    }

    @Override // lk0.f
    public final int a() {
        return 20;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f279026a == gVar.f279026a && Intrinsics.f(this.f279027b, gVar.f279027b) && Intrinsics.f(this.f279028c, gVar.f279028c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f279026a) * 31;
        String str = this.f279027b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279028c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
