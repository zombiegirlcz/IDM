package u6l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f277653b;

    public /* synthetic */ g(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(e.f277651a.getDescriptor(), i, 3);
            throw null;
        }
        this.f277652a = str;
        this.f277653b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f277652a, gVar.f277652a) && this.f277653b == gVar.f277653b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f277653b) + (this.f277652a.hashCode() * 31);
    }

    public g(String pin, long j2) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f277652a = pin;
        this.f277653b = j2;
    }
}
