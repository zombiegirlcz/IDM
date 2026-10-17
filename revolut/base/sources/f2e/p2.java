package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p2 {

    @NotNull
    public static final l2 Companion = new l2();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new i(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131692c;

    public /* synthetic */ p2(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(k2.f131641a.getDescriptor(), i, 7);
            throw null;
        }
        this.f131690a = str;
        this.f131691b = str2;
        this.f131692c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f131690a, p2Var.f131690a) && Intrinsics.f(this.f131691b, p2Var.f131691b) && Intrinsics.f(this.f131692c, p2Var.f131692c);
    }

    public final int hashCode() {
        return this.f131692c.hashCode() + p.a.c(this.f131690a.hashCode() * 31, 31, this.f131691b);
    }

    public p2(String id10, String name, ArrayList values) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f131690a = id10;
        this.f131691b = name;
        this.f131692c = values;
    }
}
