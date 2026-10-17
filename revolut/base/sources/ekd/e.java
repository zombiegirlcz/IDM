package ekd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126992c;
    public final String d;

    public /* synthetic */ e(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            j1.f(c.f126988a.getDescriptor(), i, 7);
            throw null;
        }
        this.f126990a = str;
        this.f126991b = str2;
        this.f126992c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f126990a, eVar.f126990a) && Intrinsics.f(this.f126991b, eVar.f126991b) && Intrinsics.f(this.f126992c, eVar.f126992c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f126990a.hashCode() * 31, 31, this.f126991b), 31, this.f126992c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
