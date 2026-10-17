package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9797b;

    public /* synthetic */ x(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(v.f9793a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9796a = str;
        this.f9797b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f9796a, xVar.f9796a) && Intrinsics.f(this.f9797b, xVar.f9797b);
    }

    public final int hashCode() {
        return this.f9797b.hashCode() + (this.f9796a.hashCode() * 31);
    }

    public x(String title, String text) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f9796a = title;
        this.f9797b = text;
    }
}
