package v7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f286636c;

    public /* synthetic */ c(int i, String str, String str2, jo3.a aVar) {
        if (7 != (i & 7)) {
            j1.f(a.f286633a.getDescriptor(), i, 7);
            throw null;
        }
        this.f286634a = str;
        this.f286635b = str2;
        this.f286636c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f286634a, cVar.f286634a) && Intrinsics.f(this.f286635b, cVar.f286635b) && Intrinsics.f(this.f286636c, cVar.f286636c);
    }

    public final int hashCode() {
        String str = this.f286634a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f286635b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.f286636c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
