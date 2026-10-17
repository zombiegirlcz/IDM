package ymk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f315034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f315035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f315036c;
    public final int d;

    public l(Data plan, Data layout, boolean z, int i) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f315034a = plan;
        this.f315035b = layout;
        this.f315036c = z;
        this.d = i;
    }

    public static l a(l lVar, Data plan, Data layout, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            plan = lVar.f315034a;
        }
        if ((i2 & 2) != 0) {
            layout = lVar.f315035b;
        }
        if ((i2 & 4) != 0) {
            z = lVar.f315036c;
        }
        if ((i2 & 8) != 0) {
            i = lVar.d;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new l(plan, layout, z, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f315034a, lVar.f315034a) && Intrinsics.f(this.f315035b, lVar.f315035b) && this.f315036c == lVar.f315036c && this.d == lVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.c(kii.e.c(this.f315035b, this.f315034a.hashCode() * 31, 31), 31, this.f315036c);
    }
}
