package bta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18489b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f18487a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18488a = str;
        this.f18489b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f18488a, gVar.f18488a) && Intrinsics.f(this.f18489b, gVar.f18489b);
    }

    public final int hashCode() {
        return this.f18489b.hashCode() + (this.f18488a.hashCode() * 31);
    }

    public g(String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f18488a = title;
        this.f18489b = icon;
    }
}
