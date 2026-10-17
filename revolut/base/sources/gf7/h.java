package gf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gaa.b(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143361c;
    public final List d;

    public /* synthetic */ h(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(f.f143358a.getDescriptor(), i, 15);
            throw null;
        }
        this.f143359a = str;
        this.f143360b = str2;
        this.f143361c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f143359a, hVar.f143359a) && Intrinsics.f(this.f143360b, hVar.f143360b) && Intrinsics.f(this.f143361c, hVar.f143361c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f143359a.hashCode() * 31, 31, this.f143360b), 31, this.f143361c);
    }
}
