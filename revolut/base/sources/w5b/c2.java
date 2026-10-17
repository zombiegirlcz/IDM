package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c2 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294795b;

    public /* synthetic */ c2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a2.f294773a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294794a = str;
        this.f294795b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f294794a, c2Var.f294794a) && Intrinsics.f(this.f294795b, c2Var.f294795b);
    }

    public final int hashCode() {
        return this.f294795b.hashCode() + (this.f294794a.hashCode() * 31);
    }

    public c2(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f294794a = title;
        this.f294795b = subtitle;
    }
}
