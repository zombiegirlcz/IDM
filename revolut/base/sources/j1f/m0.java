package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f170402c;

    public /* synthetic */ m0(int i, String str, String str2, jo3.a aVar) {
        if (7 != (i & 7)) {
            j1.f(k0.f170398a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170400a = str;
        this.f170401b = str2;
        this.f170402c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f170400a, m0Var.f170400a) && Intrinsics.f(this.f170401b, m0Var.f170401b) && Intrinsics.f(this.f170402c, m0Var.f170402c);
    }

    public final int hashCode() {
        return this.f170402c.hashCode() + p.a.c(this.f170400a.hashCode() * 31, 31, this.f170401b);
    }

    public m0(String title, String icon, jo3.a startingPrice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        this.f170400a = title;
        this.f170401b = icon;
        this.f170402c = startingPrice;
    }
}
