package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw4.p f226542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw4.b f226543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final el4.a f226544c;

    public c2(yw4.p facility, yw4.b balanceDisplaySetting, el4.a additionalCardholderAccountInfo) {
        Intrinsics.checkNotNullParameter(facility, "facility");
        Intrinsics.checkNotNullParameter(balanceDisplaySetting, "balanceDisplaySetting");
        Intrinsics.checkNotNullParameter(additionalCardholderAccountInfo, "additionalCardholderAccountInfo");
        this.f226542a = facility;
        this.f226543b = balanceDisplaySetting;
        this.f226544c = additionalCardholderAccountInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f226542a, c2Var.f226542a) && Intrinsics.f(this.f226543b, c2Var.f226543b) && Intrinsics.f(this.f226544c, c2Var.f226544c);
    }

    public final int hashCode() {
        return this.f226544c.hashCode() + ((this.f226543b.hashCode() + (this.f226542a.hashCode() * 31)) * 31);
    }
}
