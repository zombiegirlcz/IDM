package lr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199408a;

    public j(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f199408a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f199408a, ((j) obj2).f199408a);
    }

    public final int hashCode() {
        return this.f199408a.hashCode();
    }
}
