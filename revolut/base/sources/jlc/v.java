package jlc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f175707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f175708c;

    public v(String str, List activePortfolioInfoList, List recurringDepositInfoList) {
        Intrinsics.checkNotNullParameter(activePortfolioInfoList, "activePortfolioInfoList");
        Intrinsics.checkNotNullParameter(recurringDepositInfoList, "recurringDepositInfoList");
        this.f175706a = activePortfolioInfoList;
        this.f175707b = recurringDepositInfoList;
        this.f175708c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f175706a, vVar.f175706a) && Intrinsics.f(this.f175707b, vVar.f175707b) && Intrinsics.f(this.f175708c, vVar.f175708c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f175706a.hashCode() * 31, 31, this.f175707b);
        String str = this.f175708c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
