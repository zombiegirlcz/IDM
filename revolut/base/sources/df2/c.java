package df2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f113763b;

    public /* synthetic */ c(int i, String str, jo3.a aVar) {
        if (1 != (i & 1)) {
            j1.f(a.f113761a.getDescriptor(), i, 1);
            throw null;
        }
        this.f113762a = str;
        if ((i & 2) == 0) {
            this.f113763b = null;
        } else {
            this.f113763b = aVar;
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
        return Intrinsics.f(this.f113762a, cVar.f113762a) && Intrinsics.f(this.f113763b, cVar.f113763b);
    }

    public final int hashCode() {
        int iHashCode = this.f113762a.hashCode() * 31;
        jo3.a aVar = this.f113763b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public c(jo3.a aVar) {
        Intrinsics.checkNotNullParameter("UPI", "paymentMethod");
        this.f113762a = "UPI";
        this.f113763b = aVar;
    }
}
