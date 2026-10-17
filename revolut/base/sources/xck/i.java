package xck;

import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f304157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304159c;
    public final String d;
    public final MonthlyDrawHub$BottomSheet e;

    public i(d dVar, String backgroundImageUrl, String title, String str, MonthlyDrawHub$BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f304157a = dVar;
        this.f304158b = backgroundImageUrl;
        this.f304159c = title;
        this.d = str;
        this.e = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f304157a, iVar.f304157a) && Intrinsics.f(this.f304158b, iVar.f304158b) && Intrinsics.f(this.f304159c, iVar.f304159c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        d dVar = this.f304157a;
        int iC = p.a.c(p.a.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f304158b), 31, this.f304159c);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }
}
