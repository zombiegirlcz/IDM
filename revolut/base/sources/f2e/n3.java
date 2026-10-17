package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class n3 {

    @NotNull
    public static final m3 Companion = new m3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f131664b = {yhm.j.c(yhm.k.PUBLICATION, new i(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131665a;

    public /* synthetic */ n3(int i, List list) {
        if (1 == (i & 1)) {
            this.f131665a = list;
        } else {
            qlm.j1.f(l3.f131651a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n3) && Intrinsics.f(this.f131665a, ((n3) obj2).f131665a);
    }

    public final int hashCode() {
        return this.f131665a.hashCode();
    }

    public n3(ArrayList results) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.f131665a = results;
    }
}
