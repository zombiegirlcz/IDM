package il7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162111c;

    public /* synthetic */ i(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(g.f162104a.getDescriptor(), i, 7);
            throw null;
        }
        this.f162109a = str;
        this.f162110b = str2;
        this.f162111c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f162109a, iVar.f162109a) && Intrinsics.f(this.f162110b, iVar.f162110b) && Intrinsics.f(this.f162111c, iVar.f162111c);
    }

    public final int hashCode() {
        return this.f162111c.hashCode() + p.a.c(this.f162109a.hashCode() * 31, 31, this.f162110b);
    }

    public i(String iconKey, String name, String value) {
        Intrinsics.checkNotNullParameter(iconKey, "iconKey");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f162109a = iconKey;
        this.f162110b = name;
        this.f162111c = value;
    }
}
