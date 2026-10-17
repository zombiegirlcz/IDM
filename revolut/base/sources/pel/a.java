package pel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235396a;

    public a(String str) {
        Intrinsics.checkNotNullParameter("SELL_ALL_SUGGESTION", "id");
        this.f235396a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f235396a, ((a) obj2).f235396a);
    }

    @Override // pel.f
    public final String getId() {
        return "SELL_ALL_SUGGESTION";
    }

    public final int hashCode() {
        String str = this.f235396a;
        return 957113809 + (str == null ? 0 : str.hashCode());
    }
}
