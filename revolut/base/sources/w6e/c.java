package w6e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295423b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f295421a.getDescriptor(), i, 3);
            throw null;
        }
        this.f295422a = str;
        this.f295423b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f295422a, cVar.f295422a) && Intrinsics.f(this.f295423b, cVar.f295423b);
    }

    public final int hashCode() {
        return this.f295423b.hashCode() + (this.f295422a.hashCode() * 31);
    }

    public c(String paymentId, String type) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f295422a = paymentId;
        this.f295423b = type;
    }
}
