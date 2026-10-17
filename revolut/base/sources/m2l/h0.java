package m2l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f202204c;

    public /* synthetic */ h0(double d, int i, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(f0.f202197a.getDescriptor(), i, 7);
            throw null;
        }
        this.f202202a = str;
        this.f202203b = str2;
        this.f202204c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f202202a, h0Var.f202202a) && Intrinsics.f(this.f202203b, h0Var.f202203b) && Double.compare(this.f202204c, h0Var.f202204c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f202204c) + p.a.c(this.f202202a.hashCode() * 31, 31, this.f202203b);
    }

    public h0(double d, String name, String sentiment) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        this.f202202a = name;
        this.f202203b = sentiment;
        this.f202204c = d;
    }
}
