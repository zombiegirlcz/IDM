package cnb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25383c;
    public final String d;

    public /* synthetic */ i(String str, int i, int i2, String str2, String str3) {
        if (15 != (i & 15)) {
            j1.f(g.f25380a.getDescriptor(), i, 15);
            throw null;
        }
        this.f25381a = str;
        this.f25382b = str2;
        this.f25383c = i2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f25381a, iVar.f25381a) && Intrinsics.f(this.f25382b, iVar.f25382b) && this.f25383c == iVar.f25383c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f25383c, p.a.c(this.f25381a.hashCode() * 31, 31, this.f25382b), 31);
    }

    public i(String name, String country, int i, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f25381a = name;
        this.f25382b = country;
        this.f25383c = i;
        this.d = code;
    }
}
