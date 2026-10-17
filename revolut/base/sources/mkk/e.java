package mkk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f206479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f206480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f206481c;
    public final Data d;

    public e(Data subscription, Data familyPlanInfo, Data familyLimits, Data moreForFamilyOptions) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(familyPlanInfo, "familyPlanInfo");
        Intrinsics.checkNotNullParameter(familyLimits, "familyLimits");
        Intrinsics.checkNotNullParameter(moreForFamilyOptions, "moreForFamilyOptions");
        this.f206479a = subscription;
        this.f206480b = familyPlanInfo;
        this.f206481c = familyLimits;
        this.d = moreForFamilyOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f206479a, eVar.f206479a) && Intrinsics.f(this.f206480b, eVar.f206480b) && Intrinsics.f(this.f206481c, eVar.f206481c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f206481c, kii.e.c(this.f206480b, this.f206479a.hashCode() * 31, 31), 31);
    }
}
