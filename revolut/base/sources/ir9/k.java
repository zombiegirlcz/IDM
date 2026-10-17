package ir9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168037a;

    public k(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f168037a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f168037a, ((k) obj2).f168037a);
    }

    public final int hashCode() {
        return this.f168037a.hashCode();
    }
}
