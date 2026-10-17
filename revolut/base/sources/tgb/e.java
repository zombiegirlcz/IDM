package tgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271134b;

    public e(String text, String deeplink) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f271133a = text;
        this.f271134b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f271133a, eVar.f271133a) && Intrinsics.f(this.f271134b, eVar.f271134b);
    }

    public final int hashCode() {
        return this.f271134b.hashCode() + (this.f271133a.hashCode() * 31);
    }
}
