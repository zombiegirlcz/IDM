package nhl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215538c;

    public /* synthetic */ n(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(l.f215534a.getDescriptor(), i, 3);
            throw null;
        }
        this.f215536a = str;
        this.f215537b = str2;
        if ((i & 4) == 0) {
            this.f215538c = null;
        } else {
            this.f215538c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f215536a, nVar.f215536a) && Intrinsics.f(this.f215537b, nVar.f215537b) && Intrinsics.f(this.f215538c, nVar.f215538c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f215536a.hashCode() * 31, 31, this.f215537b);
        String str = this.f215538c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public n(String brand, String name, String str) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f215536a = brand;
        this.f215537b = name;
        this.f215538c = str;
    }
}
