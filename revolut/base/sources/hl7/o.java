package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153237c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new hf7.d(24)), yhm.j.c(kVar, new hf7.d(25)), yhm.j.c(kVar, new hf7.d(26)), yhm.j.c(kVar, new hf7.d(27))};
    }

    public /* synthetic */ o(int i, List list, List list2, List list3, List list4) {
        if (15 != (i & 15)) {
            qlm.j1.f(m.f153199a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153235a = list;
        this.f153236b = list2;
        this.f153237c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f153235a, oVar.f153235a) && Intrinsics.f(this.f153236b, oVar.f153236b) && Intrinsics.f(this.f153237c, oVar.f153237c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f153235a.hashCode() * 31, 31, this.f153236b), 31, this.f153237c);
        List list = this.d;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
