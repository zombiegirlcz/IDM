package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s2 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124666b;

    public /* synthetic */ s2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(q2.f124652a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124665a = str;
        this.f124666b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f124665a, s2Var.f124665a) && Intrinsics.f(this.f124666b, s2Var.f124666b);
    }

    public final int hashCode() {
        return this.f124666b.hashCode() + (this.f124665a.hashCode() * 31);
    }

    public s2(String icon, String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f124665a = icon;
        this.f124666b = text;
    }
}
