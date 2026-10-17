package nif;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class v3 {

    @NotNull
    public static final u3 Companion = new u3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f216052c = {null, yhm.j.c(yhm.k.PUBLICATION, new nhl.s(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3 f216053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f216054b;

    public /* synthetic */ v3(int i, r3 r3Var, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(t3.f216041a.getDescriptor(), i, 3);
            throw null;
        }
        this.f216053a = r3Var;
        this.f216054b = list;
    }

    public final r3 a() {
        return this.f216053a;
    }

    public final List b() {
        return this.f216054b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f216053a, v3Var.f216053a) && Intrinsics.f(this.f216054b, v3Var.f216054b);
    }

    public final int hashCode() {
        return this.f216054b.hashCode() + (this.f216053a.hashCode() * 31);
    }

    public v3(r3 grossAmount, ArrayList taxes) {
        Intrinsics.checkNotNullParameter(grossAmount, "grossAmount");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f216053a = grossAmount;
        this.f216054b = taxes;
    }
}
