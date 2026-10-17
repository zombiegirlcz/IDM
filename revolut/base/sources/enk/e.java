package enk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f127837c;

    public e(String str, int i, int i2) {
        this.f127835a = str;
        this.f127836b = i;
        this.f127837c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f127835a, eVar.f127835a) && this.f127836b == eVar.f127836b && this.f127837c == eVar.f127837c;
    }

    public final int hashCode() {
        String str = this.f127835a;
        return Integer.hashCode(this.f127837c) + j6.a.b(this.f127836b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
