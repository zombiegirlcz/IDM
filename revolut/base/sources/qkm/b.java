package qkm;

import hx7.i;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import yhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Comparable, Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f247030c = new b(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f247031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f247032b;

    public b(long j2, long j3) {
        this.f247031a = j2;
        this.f247032b = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        b other = (b) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        long j2 = other.f247031a;
        long j3 = this.f247031a;
        if (j3 != j2) {
            w.Companion companion = w.INSTANCE;
            return Long.compareUnsigned(j3, j2);
        }
        w.Companion companion2 = w.INSTANCE;
        return Long.compareUnsigned(this.f247032b, other.f247032b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f247031a == bVar.f247031a && this.f247032b == bVar.f247032b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f247031a ^ this.f247032b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        i.j(this.f247031a, bArr, 0, 0, 4);
        bArr[8] = 45;
        i.j(this.f247031a, bArr, 9, 4, 6);
        bArr[13] = 45;
        i.j(this.f247031a, bArr, 14, 6, 8);
        bArr[18] = 45;
        i.j(this.f247032b, bArr, 19, 0, 2);
        bArr[23] = 45;
        i.j(this.f247032b, bArr, 24, 2, 8);
        return a0.u(bArr);
    }
}
