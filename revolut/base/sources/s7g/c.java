package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260691b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(a.f260681a.getDescriptor(), i, 1);
            throw null;
        }
        this.f260690a = str;
        if ((i & 2) == 0) {
            this.f260691b = null;
        } else {
            this.f260691b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f260690a, cVar.f260690a) && Intrinsics.f(this.f260691b, cVar.f260691b);
    }

    public final int hashCode() {
        int iHashCode = this.f260690a.hashCode() * 31;
        String str = this.f260691b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public c(String bookingToken, String str) {
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        this.f260690a = bookingToken;
        this.f260691b = str;
    }
}
