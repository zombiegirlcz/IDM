package gr2;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gla.k(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f145865c;

    public /* synthetic */ s(int i, String str, String str2, List list) {
        if (5 != (i & 5)) {
            j1.f(q.f145861a.getDescriptor(), i, 5);
            throw null;
        }
        this.f145863a = str;
        if ((i & 2) == 0) {
            this.f145864b = null;
        } else {
            this.f145864b = str2;
        }
        this.f145865c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f145863a, sVar.f145863a) && Intrinsics.f(this.f145864b, sVar.f145864b) && Intrinsics.f(this.f145865c, sVar.f145865c);
    }

    public final int hashCode() {
        int iHashCode = this.f145863a.hashCode() * 31;
        String str = this.f145864b;
        return this.f145865c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
