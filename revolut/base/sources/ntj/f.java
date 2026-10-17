package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f219059c = {null, yhm.j.c(yhm.k.PUBLICATION, new ns1.a(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f219061b;

    public /* synthetic */ f(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(d.f219051a.getDescriptor(), i, 3);
            throw null;
        }
        this.f219060a = str;
        this.f219061b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f219060a, fVar.f219060a) && Intrinsics.f(this.f219061b, fVar.f219061b);
    }

    public final int hashCode() {
        return this.f219061b.hashCode() + (this.f219060a.hashCode() * 31);
    }

    public f(String title, ArrayList criteria) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        this.f219060a = title;
        this.f219061b = criteria;
    }
}
