package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new hul.c(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f156788c;

    public /* synthetic */ a0(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            j1.f(y.f156841a.getDescriptor(), i, 1);
            throw null;
        }
        this.f156786a = str;
        if ((i & 2) == 0) {
            this.f156787b = null;
        } else {
            this.f156787b = str2;
        }
        if ((i & 4) == 0) {
            this.f156788c = null;
        } else {
            this.f156788c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f156786a, a0Var.f156786a) && Intrinsics.f(this.f156787b, a0Var.f156787b) && Intrinsics.f(this.f156788c, a0Var.f156788c);
    }

    public final int hashCode() {
        int iHashCode = this.f156786a.hashCode() * 31;
        String str = this.f156787b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f156788c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
