package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f295028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f295029c;
    public final ld7.f d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new w56.a(5)), yhm.j.c(kVar, new w56.a(6)), null};
    }

    public /* synthetic */ u(int i, String str, List list, List list2, ld7.f fVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(s.f295003a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295027a = str;
        this.f295028b = list;
        this.f295029c = list2;
        this.d = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f295027a, uVar.f295027a) && Intrinsics.f(this.f295028b, uVar.f295028b) && Intrinsics.f(this.f295029c, uVar.f295029c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        return this.d.f194043a.hashCode() + p.a.d(p.a.d(this.f295027a.hashCode() * 31, 31, this.f295028b), 31, this.f295029c);
    }

    public u(String title, ArrayList items, ArrayList actions, ld7.f termsAndConditions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f295027a = title;
        this.f295028b = items;
        this.f295029c = actions;
        this.d = termsAndConditions;
    }
}
