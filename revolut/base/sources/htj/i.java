package htj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155415b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(g.f155412a.getDescriptor(), i, 3);
            throw null;
        }
        this.f155414a = str;
        this.f155415b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f155414a, iVar.f155414a) && Intrinsics.f(this.f155415b, iVar.f155415b);
    }

    public final int hashCode() {
        return this.f155415b.hashCode() + (this.f155414a.hashCode() * 31);
    }
}
