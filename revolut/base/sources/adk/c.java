package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3368b;

    public /* synthetic */ c(int i, String str, int i2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f3362a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3367a = str;
        this.f3368b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f3367a, cVar.f3367a) && this.f3368b == cVar.f3368b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3368b) + (this.f3367a.hashCode() * 31);
    }

    public c(String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f3367a = title;
        this.f3368b = i;
    }
}
