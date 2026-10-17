package xda;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new z(1)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f304332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304333c;

    public /* synthetic */ i0(int i, String str, String str2, Map map) {
        if (7 != (i & 7)) {
            j1.f(g0.f304324a.getDescriptor(), i, 7);
            throw null;
        }
        this.f304331a = str;
        this.f304332b = map;
        this.f304333c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f304331a, i0Var.f304331a) && Intrinsics.f(this.f304332b, i0Var.f304332b) && Intrinsics.f(this.f304333c, i0Var.f304333c);
    }

    public final int hashCode() {
        int iHashCode = this.f304331a.hashCode() * 31;
        Map map = this.f304332b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f304333c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
