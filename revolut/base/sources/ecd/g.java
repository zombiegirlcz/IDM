package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124549b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(e.f124533a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124548a = str;
        this.f124549b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f124548a, gVar.f124548a) && Intrinsics.f(this.f124549b, gVar.f124549b);
    }

    public final int hashCode() {
        return this.f124549b.hashCode() + (this.f124548a.hashCode() * 31);
    }

    public g(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f124548a = title;
        this.f124549b = description;
    }
}
