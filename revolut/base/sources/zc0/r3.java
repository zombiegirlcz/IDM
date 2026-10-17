package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321117a;

    public r3(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f321117a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r3) && Intrinsics.f(this.f321117a, ((r3) obj2).f321117a);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321117a;
    }

    public final int hashCode() {
        return this.f321117a.hashCode();
    }
}
