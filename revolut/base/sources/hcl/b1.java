package hcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f150935c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new h43.b(21)), yhm.j.c(kVar, new h43.b(22))};
    }

    public /* synthetic */ b1(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            qlm.j1.f(z0.f151240a.getDescriptor(), i, 7);
            throw null;
        }
        this.f150933a = str;
        this.f150934b = list;
        this.f150935c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f150933a, b1Var.f150933a) && Intrinsics.f(this.f150934b, b1Var.f150934b) && Intrinsics.f(this.f150935c, b1Var.f150935c);
    }

    public final int hashCode() {
        return this.f150935c.hashCode() + p.a.d(this.f150933a.hashCode() * 31, 31, this.f150934b);
    }

    public b1(ArrayList tags, ArrayList keyPersons, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(keyPersons, "keyPersons");
        this.f150933a = description;
        this.f150934b = tags;
        this.f150935c = keyPersons;
    }
}
