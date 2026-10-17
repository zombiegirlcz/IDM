package nhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new s(10)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215576c;

    public /* synthetic */ w0(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(u0.f215569a.getDescriptor(), i, 7);
            throw null;
        }
        this.f215574a = list;
        this.f215575b = str;
        this.f215576c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f215574a, w0Var.f215574a) && Intrinsics.f(this.f215575b, w0Var.f215575b) && Intrinsics.f(this.f215576c, w0Var.f215576c);
    }

    public final int hashCode() {
        return this.f215576c.hashCode() + p.a.c(this.f215574a.hashCode() * 31, 31, this.f215575b);
    }

    public w0(String selectedMetric, String sortOrder, ArrayList metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(selectedMetric, "selectedMetric");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        this.f215574a = metrics;
        this.f215575b = selectedMetric;
        this.f215576c = sortOrder;
    }
}
