package om4;

import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw4.p f226527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ll4.u f226528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f226529c;
    public final yw4.b d;
    public final AdditionalCardholdersState e;

    public b2(yw4.p facility, ll4.u managementInfo, List featuresAvailability, yw4.b balanceDisplaySetting, AdditionalCardholdersState additionalCardholdersState) {
        Intrinsics.checkNotNullParameter(facility, "facility");
        Intrinsics.checkNotNullParameter(managementInfo, "managementInfo");
        Intrinsics.checkNotNullParameter(featuresAvailability, "featuresAvailability");
        Intrinsics.checkNotNullParameter(balanceDisplaySetting, "balanceDisplaySetting");
        Intrinsics.checkNotNullParameter(additionalCardholdersState, "additionalCardholdersState");
        this.f226527a = facility;
        this.f226528b = managementInfo;
        this.f226529c = featuresAvailability;
        this.d = balanceDisplaySetting;
        this.e = additionalCardholdersState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f226527a, b2Var.f226527a) && Intrinsics.f(this.f226528b, b2Var.f226528b) && Intrinsics.f(this.f226529c, b2Var.f226529c) && Intrinsics.f(this.d, b2Var.d) && Intrinsics.f(this.e, b2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.d((this.f226528b.hashCode() + (this.f226527a.hashCode() * 31)) * 31, 31, this.f226529c)) * 31);
    }
}
