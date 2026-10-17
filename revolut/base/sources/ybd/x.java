package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312280c;

    public /* synthetic */ x(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(v.f312277a.getDescriptor(), i, 7);
            throw null;
        }
        this.f312278a = str;
        this.f312279b = str2;
        this.f312280c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f312278a, xVar.f312278a) && Intrinsics.f(this.f312279b, xVar.f312279b) && Intrinsics.f(this.f312280c, xVar.f312280c);
    }

    public final int hashCode() {
        int iHashCode = this.f312278a.hashCode() * 31;
        String str = this.f312279b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f312280c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public x(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f312278a = title;
        this.f312279b = str;
        this.f312280c = str2;
    }
}
