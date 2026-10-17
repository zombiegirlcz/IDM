package xck;

import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304156c;
    public final String d;
    public final String e;
    public final MonthlyDrawHub$BottomSheet f;

    public h(String title, String str, String str2, String buttonText, String deeplink, MonthlyDrawHub$BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f304154a = title;
        this.f304155b = str;
        this.f304156c = str2;
        this.d = buttonText;
        this.e = deeplink;
        this.f = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f304154a, hVar.f304154a) && Intrinsics.f(this.f304155b, hVar.f304155b) && Intrinsics.f(this.f304156c, hVar.f304156c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f304154a.hashCode() * 31;
        String str = this.f304155b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f304156c;
        return this.f.hashCode() + p.a.c(p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
