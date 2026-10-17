package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113200b;

    public u(String value, String deeplink) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f113199a = value;
        this.f113200b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f113199a, uVar.f113199a) && Intrinsics.f(this.f113200b, uVar.f113200b);
    }

    public final int hashCode() {
        return this.f113200b.hashCode() + (this.f113199a.hashCode() * 31);
    }
}
