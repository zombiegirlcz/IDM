package hvb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155804c;

    public /* synthetic */ f(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(d.f155801a.getDescriptor(), i, 7);
            throw null;
        }
        this.f155802a = str;
        this.f155803b = str2;
        this.f155804c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f155802a, fVar.f155802a) && Intrinsics.f(this.f155803b, fVar.f155803b) && Intrinsics.f(this.f155804c, fVar.f155804c);
    }

    public final int hashCode() {
        return this.f155804c.hashCode() + p.a.c(this.f155802a.hashCode() * 31, 31, this.f155803b);
    }

    public f(String id10, String points, String status) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f155802a = id10;
        this.f155803b = points;
        this.f155804c = status;
    }
}
