package j29;

import ip0.v7;
import j1f.q0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f170762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170763c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new q0(4)), yhm.j.c(kVar, new q0(5))};
    }

    public /* synthetic */ o(int i, String str, jo3.a aVar, List list, List list2) {
        if (15 != (i & 15)) {
            j1.f(m.f170760a.getDescriptor(), i, 15);
            throw null;
        }
        this.f170761a = str;
        this.f170762b = aVar;
        this.f170763c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f170761a, oVar.f170761a) && Intrinsics.f(this.f170762b, oVar.f170762b) && Intrinsics.f(this.f170763c, oVar.f170763c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(v7.j(this.f170762b, this.f170761a.hashCode() * 31, 31), 31, this.f170763c);
    }
}
