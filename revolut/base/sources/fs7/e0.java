package fs7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final w Companion = new w();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new fnk.a(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f137624c;

    public e0(int i, String str, String str2, List list) {
        if (3 != (i & 3)) {
            j1.f(v.f137651a.getDescriptor(), i, 3);
            throw null;
        }
        this.f137622a = str;
        this.f137623b = str2;
        if ((i & 4) == 0) {
            this.f137624c = f0.f322471a;
        } else {
            this.f137624c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f137622a, e0Var.f137622a) && Intrinsics.f(this.f137623b, e0Var.f137623b) && Intrinsics.f(this.f137624c, e0Var.f137624c);
    }

    public final int hashCode() {
        String str = this.f137622a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f137623b;
        return this.f137624c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public e0(String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137622a = str;
        this.f137623b = str2;
        this.f137624c = items;
    }
}
