package bcb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String id10) {
        super(dj0.d.d, id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        dj0.d.Companion.getClass();
        this.f14422c = id10;
    }

    @Override // bcb.e
    public final String a() {
        return this.f14422c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f14422c, ((c) obj2).f14422c);
    }

    public final int hashCode() {
        return this.f14422c.hashCode();
    }
}
