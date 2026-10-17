package w6e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295425a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f295425a = str;
        } else {
            j1.f(d.f295424a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f295425a, ((f) obj2).f295425a);
    }

    public final int hashCode() {
        return this.f295425a.hashCode();
    }

    public f(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        this.f295425a = linkCode;
    }
}
