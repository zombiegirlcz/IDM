package ch3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24117a;

    public c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f24117a = id10;
    }

    public final String a() {
        return j6.a.q("checklist_collection_", this.f24117a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f24117a, ((c) obj2).f24117a);
    }

    public final int hashCode() {
        return this.f24117a.hashCode();
    }
}
