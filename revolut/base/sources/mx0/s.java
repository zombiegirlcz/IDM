package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209980a;

    public s(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f209980a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f209980a, ((s) obj2).f209980a);
    }

    public final int hashCode() {
        return this.f209980a.hashCode();
    }
}
