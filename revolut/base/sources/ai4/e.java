package ai4;

import dx4.h3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f5182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5184c;

    public e(h3 selector, boolean z, String str) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f5182a = selector;
        this.f5183b = z;
        this.f5184c = str;
    }

    public static e a(e eVar, boolean z, String str, int i) {
        h3 selector = eVar.f5182a;
        if ((i & 2) != 0) {
            z = eVar.f5183b;
        }
        if ((i & 4) != 0) {
            str = eVar.f5184c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new e(selector, z, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f5182a, eVar.f5182a) && this.f5183b == eVar.f5183b && Intrinsics.f(this.f5184c, eVar.f5184c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f5182a.hashCode() * 31, 31, this.f5183b);
        String str = this.f5184c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
