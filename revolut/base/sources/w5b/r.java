package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294993b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p.f294970a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294992a = str;
        this.f294993b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f294992a, rVar.f294992a) && Intrinsics.f(this.f294993b, rVar.f294993b);
    }

    public final int hashCode() {
        return this.f294993b.hashCode() + (this.f294992a.hashCode() * 31);
    }

    public r(String title, String action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f294992a = title;
        this.f294993b = action;
    }
}
