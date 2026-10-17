package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295064c;

    public /* synthetic */ x(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(v.f295041a.getDescriptor(), i, 7);
            throw null;
        }
        this.f295062a = str;
        this.f295063b = str2;
        this.f295064c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f295062a, xVar.f295062a) && Intrinsics.f(this.f295063b, xVar.f295063b) && Intrinsics.f(this.f295064c, xVar.f295064c);
    }

    public final int hashCode() {
        int iHashCode = this.f295062a.hashCode() * 31;
        String str = this.f295063b;
        return this.f295064c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public x(String title, String str, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f295062a = title;
        this.f295063b = str;
        this.f295064c = icon;
    }
}
