package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f181553b;

    public u(dj0.d dailyAmount, String str) {
        Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
        this.f181552a = str;
        this.f181553b = dailyAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f181552a, uVar.f181552a) && Intrinsics.f(this.f181553b, uVar.f181553b);
    }

    public final int hashCode() {
        String str = this.f181552a;
        return this.f181553b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
