package vm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f290523c;
    public final boolean d;

    public a(String name, String value, b mode, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f290521a = name;
        this.f290522b = value;
        this.f290523c = mode;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f290521a, aVar.f290521a) && Intrinsics.f(this.f290522b, aVar.f290522b) && this.f290523c == aVar.f290523c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f290523c.hashCode() + p.a.c(this.f290521a.hashCode() * 31, 31, this.f290522b)) * 31);
    }
}
