package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f222140b;

    public /* synthetic */ y(int i, long j2, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(w.f222119a.getDescriptor(), i, 3);
            throw null;
        }
        this.f222139a = str;
        this.f222140b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f222139a, yVar.f222139a) && this.f222140b == yVar.f222140b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f222140b) + (this.f222139a.hashCode() * 31);
    }

    public y(String title, long j2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f222139a = title;
        this.f222140b = j2;
    }
}
