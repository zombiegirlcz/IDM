package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274352b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(g.f274342a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274351a = str;
        this.f274352b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f274351a, iVar.f274351a) && Intrinsics.f(this.f274352b, iVar.f274352b);
    }

    public final int hashCode() {
        return this.f274352b.hashCode() + (this.f274351a.hashCode() * 31);
    }
}
