package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o2 {

    @NotNull
    public static final n2 Companion = new n2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131680c;

    public /* synthetic */ o2(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qlm.j1.f(m2.f131658a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131678a = str;
        this.f131679b = str2;
        if ((i & 4) == 0) {
            this.f131680c = null;
        } else {
            this.f131680c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.f131678a, o2Var.f131678a) && Intrinsics.f(this.f131679b, o2Var.f131679b) && Intrinsics.f(this.f131680c, o2Var.f131680c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131678a.hashCode() * 31, 31, this.f131679b);
        String str = this.f131680c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public o2(String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f131678a = id10;
        this.f131679b = name;
        this.f131680c = str;
    }
}
