package ft0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137758a;

    public h(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f137758a = listId;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53517a() {
        return this.f137758a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f137758a, ((h) obj2).f137758a);
    }

    public final int hashCode() {
        return this.f137758a.hashCode();
    }
}
