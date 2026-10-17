package h2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f148856a;

    public a(dj0.d savings) {
        Intrinsics.checkNotNullParameter(savings, "savings");
        this.f148856a = savings;
    }

    @Override // h2k.c
    public final dj0.d a() {
        return this.f148856a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f148856a, ((a) obj2).f148856a);
    }

    public final int hashCode() {
        return this.f148856a.hashCode();
    }
}
