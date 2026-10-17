package as7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new ar0.b(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8860c;

    public /* synthetic */ o0(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(m0.f8856a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8858a = str;
        this.f8859b = list;
        this.f8860c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f8858a, o0Var.f8858a) && Intrinsics.f(this.f8859b, o0Var.f8859b) && Intrinsics.f(this.f8860c, o0Var.f8860c);
    }

    public final int hashCode() {
        int iHashCode = this.f8858a.hashCode() * 31;
        List list = this.f8859b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f8860c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public o0(String title, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f8858a = title;
        this.f8859b = arrayList;
        this.f8860c = str;
    }
}
