package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124544b;

    public /* synthetic */ f0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(d0.f124510a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124543a = str;
        this.f124544b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f124543a, f0Var.f124543a) && Intrinsics.f(this.f124544b, f0Var.f124544b);
    }

    public final int hashCode() {
        return this.f124544b.hashCode() + (this.f124543a.hashCode() * 31);
    }

    public f0(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f124543a = title;
        this.f124544b = description;
    }
}
