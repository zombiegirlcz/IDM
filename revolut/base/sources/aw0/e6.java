package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10294b;

    public e6(String listId, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f10293a = listId;
        this.f10294b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj2;
        return Intrinsics.f(this.f10293a, e6Var.f10293a) && this.f10294b == e6Var.f10294b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10294b) + (this.f10293a.hashCode() * 31);
    }
}
