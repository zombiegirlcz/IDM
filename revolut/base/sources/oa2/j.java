package oa2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223508a;

    public j(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f223508a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f223508a, ((j) obj2).f223508a);
    }

    public final int hashCode() {
        return this.f223508a.hashCode();
    }
}
