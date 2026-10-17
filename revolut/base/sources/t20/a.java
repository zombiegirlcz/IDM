package t20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f267385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267386b;

    public /* synthetic */ a(b bVar) {
        this(bVar, null);
    }

    public final String a() {
        return this.f267386b;
    }

    public final b b() {
        return this.f267385a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f267385a == aVar.f267385a && Intrinsics.f(this.f267386b, aVar.f267386b);
    }

    public final int hashCode() {
        int iHashCode = this.f267385a.hashCode() * 31;
        String str = this.f267386b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public a(b source, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f267385a = source;
        this.f267386b = str;
    }
}
