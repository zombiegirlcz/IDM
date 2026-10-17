package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312274b;

    public /* synthetic */ t(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(r.f312271a.getDescriptor(), i, 3);
            throw null;
        }
        this.f312273a = str;
        this.f312274b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f312273a, tVar.f312273a) && Intrinsics.f(this.f312274b, tVar.f312274b);
    }

    public final int hashCode() {
        int iHashCode = this.f312273a.hashCode() * 31;
        String str = this.f312274b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public t(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f312273a = text;
        this.f312274b = str;
    }
}
