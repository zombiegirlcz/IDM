package x3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f302744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f302745b;

    public e(f provider, d logos) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(logos, "logos");
        this.f302744a = provider;
        this.f302745b = logos;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f302744a == eVar.f302744a && Intrinsics.f(this.f302745b, eVar.f302745b);
    }

    public final int hashCode() {
        return this.f302745b.hashCode() + (this.f302744a.hashCode() * 31);
    }
}
