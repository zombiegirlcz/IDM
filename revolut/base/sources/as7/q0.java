package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f8865b;

    public /* synthetic */ q0(int i, String str, o0 o0Var) {
        if (3 != (i & 3)) {
            j1.f(l0.f8852a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8864a = str;
        this.f8865b = o0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f8864a, q0Var.f8864a) && Intrinsics.f(this.f8865b, q0Var.f8865b);
    }

    public final int hashCode() {
        String str = this.f8864a;
        return this.f8865b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public q0(String str, o0 bottomSheetContent) {
        Intrinsics.checkNotNullParameter(bottomSheetContent, "bottomSheetContent");
        this.f8864a = str;
        this.f8865b = bottomSheetContent;
    }
}
