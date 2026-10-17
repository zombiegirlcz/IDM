package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ic implements jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f164670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc f164671c;

    public ic(String listId, dj0.d amount, hc state) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f164669a = listId;
        this.f164670b = amount;
        this.f164671c = state;
    }

    @Override // ip0.jc
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj2;
        return Intrinsics.f(this.f164669a, icVar.f164669a) && Intrinsics.f(this.f164670b, icVar.f164670b) && this.f164671c == icVar.f164671c;
    }

    public final int hashCode() {
        return this.f164671c.hashCode() + v7.c(this.f164669a.hashCode() * 31, 31, this.f164670b);
    }
}
