package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321148a;

    public w3(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f321148a = itemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w3) && Intrinsics.f(this.f321148a, ((w3) obj2).f321148a);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321148a;
    }

    public final int hashCode() {
        return this.f321148a.hashCode();
    }
}
