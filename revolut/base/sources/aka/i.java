package aka;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
@yhm.d
public final class i implements a {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5756c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new aj0.o(14)), yhm.j.c(kVar, new aj0.o(15)), yhm.j.c(kVar, new aj0.o(16))};
    }

    public /* synthetic */ i(int i, String str, List list, List list2, List list3) {
        if (15 != (i & 15)) {
            j1.f(d.f5749a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5754a = str;
        this.f5755b = list;
        this.f5756c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f5754a, iVar.f5754a) && Intrinsics.f(this.f5755b, iVar.f5755b) && Intrinsics.f(this.f5756c, iVar.f5756c) && Intrinsics.f(this.d, iVar.d);
    }

    @Override // aka.a
    public final String getId() {
        return this.f5754a;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f5754a.hashCode() * 31, 31, this.f5755b), 31, this.f5756c);
    }

    @Override // aka.a
    public final List o() {
        return this.f5756c;
    }

    @Override // aka.a
    public final List p() {
        return this.d;
    }

    @Override // aka.a
    public final List q() {
        return this.f5755b;
    }

    public i(String id10, List blocks, ArrayList actions, List complianceFeatures) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(complianceFeatures, "complianceFeatures");
        this.f5754a = id10;
        this.f5755b = blocks;
        this.f5756c = actions;
        this.d = complianceFeatures;
    }
}
