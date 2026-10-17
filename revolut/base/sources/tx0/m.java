package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f275193b;

    public m() {
        this(7);
    }

    @Override // tx0.b
    public final int a() {
        return this.f275193b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f275192a, mVar.f275192a) && this.f275193b == mVar.f275193b;
    }

    @Override // tx0.r
    public final String getId() {
        return this.f275192a;
    }

    public final int hashCode() {
        return j6.a.b(this.f275193b, this.f275192a.hashCode() * 31, 31);
    }

    public m(int i) {
        String id10 = (i & 1) != 0 ? "" : "ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID";
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f275192a = id10;
        this.f275193b = 4;
    }
}
