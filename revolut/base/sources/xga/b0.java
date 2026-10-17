package xga;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final w Companion = new w();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new xda.z(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f305643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f305644c;

    public /* synthetic */ b0(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            j1.f(v.f305665a.getDescriptor(), i, 1);
            throw null;
        }
        this.f305642a = str;
        if ((i & 2) == 0) {
            this.f305643b = null;
        } else {
            this.f305643b = list;
        }
        if ((i & 4) == 0) {
            this.f305644c = null;
        } else {
            this.f305644c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f305642a, b0Var.f305642a) && Intrinsics.f(this.f305643b, b0Var.f305643b) && Intrinsics.f(this.f305644c, b0Var.f305644c);
    }

    public final int hashCode() {
        int iHashCode = this.f305642a.hashCode() * 31;
        List list = this.f305643b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f305644c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
