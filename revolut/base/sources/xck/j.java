package xck;

import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304162c;
    public final MonthlyDrawHub$BottomSheet d;

    public j(String title, String str, String str2, MonthlyDrawHub$BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f304160a = title;
        this.f304161b = str;
        this.f304162c = str2;
        this.d = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f304160a, jVar.f304160a) && Intrinsics.f(this.f304161b, jVar.f304161b) && Intrinsics.f(this.f304162c, jVar.f304162c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f304160a.hashCode() * 31;
        String str = this.f304161b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f304162c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
