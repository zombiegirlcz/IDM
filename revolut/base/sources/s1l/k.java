package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259186c;

    public k(String str, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f259184a = str;
        this.f259185b = null;
        this.f259186c = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f259184a, kVar.f259184a) && Intrinsics.f(this.f259185b, kVar.f259185b) && Intrinsics.f(this.f259186c, kVar.f259186c);
    }

    public final int hashCode() {
        String str = this.f259184a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f259185b;
        return this.f259186c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ k(int i, String str, String str2, String str3) {
        if (4 != (i & 4)) {
            j1.f(i.f259181a.getDescriptor(), i, 4);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f259184a = null;
        } else {
            this.f259184a = str;
        }
        if ((i & 2) == 0) {
            this.f259185b = null;
        } else {
            this.f259185b = str2;
        }
        this.f259186c = str3;
    }
}
