package tgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271132b;

    public d(String text, String deeplink) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f271131a = text;
        this.f271132b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f271131a, dVar.f271131a) && Intrinsics.f(this.f271132b, dVar.f271132b);
    }

    public final int hashCode() {
        return this.f271132b.hashCode() + (this.f271131a.hashCode() * 31);
    }
}
