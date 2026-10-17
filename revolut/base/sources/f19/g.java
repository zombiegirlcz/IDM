package f19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f131190c = {null, j.c(k.PUBLICATION, new euf.a(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f131192b;

    public /* synthetic */ g(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(e.f131189a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131191a = str;
        this.f131192b = list;
    }

    public static g a(g gVar, List slots) {
        String id10 = gVar.f131191a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(slots, "slots");
        return new g(id10, slots);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f131191a, gVar.f131191a) && Intrinsics.f(this.f131192b, gVar.f131192b);
    }

    public final int hashCode() {
        return this.f131192b.hashCode() + (this.f131191a.hashCode() * 31);
    }

    public g(String id10, List slots) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(slots, "slots");
        this.f131191a = id10;
        this.f131192b = slots;
    }
}
