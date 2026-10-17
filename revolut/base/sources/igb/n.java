package igb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161143b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(l.f161141a.getDescriptor(), i, 3);
            throw null;
        }
        this.f161142a = str;
        this.f161143b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f161142a, nVar.f161142a) && Intrinsics.f(this.f161143b, nVar.f161143b);
    }

    public final int hashCode() {
        return this.f161143b.hashCode() + (this.f161142a.hashCode() * 31);
    }

    public n(String text, String link) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f161142a = text;
        this.f161143b = link;
    }
}
