package mh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f205391b;

    public j(String id10, i action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f205390a = id10;
        this.f205391b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f205390a, jVar.f205390a) && this.f205391b == jVar.f205391b;
    }

    public final int hashCode() {
        return this.f205391b.hashCode() + (this.f205390a.hashCode() * 31);
    }
}
