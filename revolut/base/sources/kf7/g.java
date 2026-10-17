package kf7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ka9.b(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f183296c;

    public /* synthetic */ g(int i, String str, String str2, e eVar) {
        if (5 != (i & 5)) {
            j1.f(c.f183293a.getDescriptor(), i, 5);
            throw null;
        }
        this.f183294a = str;
        if ((i & 2) == 0) {
            this.f183295b = null;
        } else {
            this.f183295b = str2;
        }
        this.f183296c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f183294a, gVar.f183294a) && Intrinsics.f(this.f183295b, gVar.f183295b) && this.f183296c == gVar.f183296c;
    }

    public final int hashCode() {
        int iHashCode = this.f183294a.hashCode() * 31;
        String str = this.f183295b;
        return this.f183296c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
