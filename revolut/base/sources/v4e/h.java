package v4e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();
    public static final h e = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw0.k f286051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hw0.d f286052c;
    public final List d;

    public static final class a {
        private a() {
        }
    }

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f286050a, hVar.f286050a) && Intrinsics.f(this.f286051b, hVar.f286051b);
    }

    public final int hashCode() {
        int iHashCode = this.f286050a.hashCode() * 31;
        hw0.k kVar = this.f286051b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public h(List allCharts, hw0.k kVar) {
        Intrinsics.checkNotNullParameter(allCharts, "allCharts");
        this.f286050a = allCharts;
        this.f286051b = kVar;
        this.f286052c = (hw0.d) zhm.d0.d0(allCharts);
        this.d = zhm.d0.V(allCharts, 1);
    }

    public h(int i) {
        this(zhm.f0.f322471a, null);
    }
}
