package il7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f162102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f162103c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new igb.j(19)), yhm.j.c(kVar, new igb.j(20)), yhm.j.c(kVar, new igb.j(21)), yhm.j.c(kVar, new igb.j(22))};
    }

    public /* synthetic */ f(int i, List list, List list2, List list3, List list4) {
        if (15 != (i & 15)) {
            j1.f(d.f162096a.getDescriptor(), i, 15);
            throw null;
        }
        this.f162101a = list;
        this.f162102b = list2;
        this.f162103c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f162101a, fVar.f162101a) && Intrinsics.f(this.f162102b, fVar.f162102b) && Intrinsics.f(this.f162103c, fVar.f162103c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f162101a.hashCode() * 31, 31, this.f162102b), 31, this.f162103c);
    }

    public f(ArrayList keyParams, List covered, List notCovered, ArrayList documents) {
        Intrinsics.checkNotNullParameter(keyParams, "keyParams");
        Intrinsics.checkNotNullParameter(covered, "covered");
        Intrinsics.checkNotNullParameter(notCovered, "notCovered");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f162101a = keyParams;
        this.f162102b = covered;
        this.f162103c = notCovered;
        this.d = documents;
    }
}
