package v7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v4a.a(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f286643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286644c;
    public final jo3.a d;
    public final List e;

    public /* synthetic */ i(int i, String str, boolean z, String str2, jo3.a aVar, List list) {
        if (31 != (i & 31)) {
            j1.f(g.f286641a.getDescriptor(), i, 31);
            throw null;
        }
        this.f286642a = str;
        this.f286643b = z;
        this.f286644c = str2;
        this.d = aVar;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f286642a, iVar.f286642a) && this.f286643b == iVar.f286643b && Intrinsics.f(this.f286644c, iVar.f286644c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f286642a.hashCode() * 31, 31, this.f286643b);
        String str = this.f286644c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar = this.d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.e;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
