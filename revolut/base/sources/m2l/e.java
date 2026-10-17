package m2l;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f202193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f202194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f202195c;
    public final int d;

    public e(int i, jo3.a high, jo3.a low, jo3.a mean) {
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(mean, "mean");
        this.f202193a = high;
        this.f202194b = low;
        this.f202195c = mean;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f202193a, eVar.f202193a) && Intrinsics.f(this.f202194b, eVar.f202194b) && Intrinsics.f(this.f202195c, eVar.f202195c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.j(this.f202195c, v7.j(this.f202194b, this.f202193a.hashCode() * 31, 31), 31);
    }

    public /* synthetic */ e(int i, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, int i2) {
        if (15 != (i & 15)) {
            j1.f(c.f202189a.getDescriptor(), i, 15);
            throw null;
        }
        this.f202193a = aVar;
        this.f202194b = aVar2;
        this.f202195c = aVar3;
        this.d = i2;
    }
}
