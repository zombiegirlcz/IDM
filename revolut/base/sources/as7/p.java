package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8862b;

    public /* synthetic */ p(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n.f8857a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8861a = str;
        this.f8862b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f8861a, pVar.f8861a) && Intrinsics.f(this.f8862b, pVar.f8862b);
    }

    public final int hashCode() {
        return this.f8862b.hashCode() + (this.f8861a.hashCode() * 31);
    }

    public p(String text, String action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f8861a = text;
        this.f8862b = action;
    }
}
