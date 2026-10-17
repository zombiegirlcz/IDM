package tp7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273303a;

    public e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273303a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f273303a, ((e) obj2).f273303a);
    }

    public final int hashCode() {
        return this.f273303a.hashCode();
    }
}
