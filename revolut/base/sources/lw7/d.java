package lw7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f200418c = {null, yhm.j.c(k.PUBLICATION, new lv4.b(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f200420b;

    public /* synthetic */ d(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(b.f200417a.getDescriptor(), i, 3);
            throw null;
        }
        this.f200419a = str;
        this.f200420b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f200419a, dVar.f200419a) && Intrinsics.f(this.f200420b, dVar.f200420b);
    }

    public final int hashCode() {
        String str = this.f200419a;
        return this.f200420b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
