package g93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141454a;

    public a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f141454a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f141454a, ((a) obj2).f141454a);
    }

    public final int hashCode() {
        return this.f141454a.hashCode();
    }
}
