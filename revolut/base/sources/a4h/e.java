package a4h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1275b;

    public e(f type, String url2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f1274a = type;
        this.f1275b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f1274a == eVar.f1274a && Intrinsics.f(this.f1275b, eVar.f1275b);
    }

    public final int hashCode() {
        return this.f1275b.hashCode() + (this.f1274a.hashCode() * 31);
    }
}
