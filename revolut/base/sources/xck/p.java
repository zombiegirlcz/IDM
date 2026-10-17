package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304179b;

    public p(String deeplink, String text) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f304178a = deeplink;
        this.f304179b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f304178a, pVar.f304178a) && Intrinsics.f(this.f304179b, pVar.f304179b);
    }

    public final int hashCode() {
        return this.f304179b.hashCode() + (this.f304178a.hashCode() * 31);
    }
}
