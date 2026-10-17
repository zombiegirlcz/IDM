package f2e;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class t4 {

    @NotNull
    public static final s4 Companion = new s4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f131718c = {null, yhm.j.c(yhm.k.PUBLICATION, new i(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f131720b;

    public t4(LinkedHashMap linkedHashMap, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f131719a = text;
        this.f131720b = linkedHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return Intrinsics.f(this.f131719a, t4Var.f131719a) && Intrinsics.f(this.f131720b, t4Var.f131720b);
    }

    public final int hashCode() {
        int iHashCode = this.f131719a.hashCode() * 31;
        Map map = this.f131720b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public /* synthetic */ t4(Map map, String str, int i) {
        if (1 != (i & 1)) {
            qlm.j1.f(r4.f131706a.getDescriptor(), i, 1);
            throw null;
        }
        this.f131719a = str;
        if ((i & 2) == 0) {
            this.f131720b = null;
        } else {
            this.f131720b = map;
        }
    }
}
