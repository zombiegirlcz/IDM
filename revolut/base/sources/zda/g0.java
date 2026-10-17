package zda;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f321379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321380c;

    public /* synthetic */ g0(int i, String str, String str2, Map map) {
        if (7 != (i & 7)) {
            j1.f(e0.f321370a.getDescriptor(), i, 7);
            throw null;
        }
        this.f321378a = str;
        this.f321379b = map;
        this.f321380c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f321378a, g0Var.f321378a) && Intrinsics.f(this.f321379b, g0Var.f321379b) && Intrinsics.f(this.f321380c, g0Var.f321380c);
    }

    public final int hashCode() {
        int iHashCode = this.f321378a.hashCode() * 31;
        Map map = this.f321379b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f321380c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public g0(String title, String str, Map map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f321378a = title;
        this.f321379b = map;
        this.f321380c = str;
    }
}
