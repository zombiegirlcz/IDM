package q0h;

import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f241272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f241273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f241274c;
    public final boolean d;
    public final int e;
    public final int f;

    public g(e assetType) {
        m timeSpan = m.ONE_WEEK;
        l section = l.MOST_TRADED;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(section, "section");
        this.f241272a = assetType;
        this.f241273b = timeSpan;
        this.f241274c = section;
        this.d = true;
        this.e = 3;
        this.f = R.string.common_action_see_all;
    }

    @Override // q0h.i
    public final e a() {
        return this.f241272a;
    }

    @Override // q0h.i
    public final l b() {
        return this.f241274c;
    }

    @Override // q0h.i
    public final m c() {
        return this.f241273b;
    }

    @Override // q0h.i
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f241272a == gVar.f241272a && this.f241273b == gVar.f241273b && this.f241274c == gVar.f241274c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.c(j6.a.c((this.f241274c.hashCode() + ((this.f241273b.hashCode() + (this.f241272a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.d), 31);
    }
}
