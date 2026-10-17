package ij3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161678b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f161676a.getDescriptor(), i, 3);
            throw null;
        }
        this.f161677a = str;
        this.f161678b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f161677a, fVar.f161677a) && Intrinsics.f(this.f161678b, fVar.f161678b);
    }

    public final int hashCode() {
        return this.f161678b.hashCode() + (this.f161677a.hashCode() * 31);
    }

    public f(String icon, String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f161677a = icon;
        this.f161678b = text;
    }
}
