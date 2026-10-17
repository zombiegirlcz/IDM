package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f166780b;

    public v70(String listId, float f) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f166779a = listId;
        this.f166780b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj2;
        return Intrinsics.f(this.f166779a, v70Var.f166779a) && Float.compare(this.f166780b, v70Var.f166780b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f166780b) + (this.f166779a.hashCode() * 31);
    }
}
