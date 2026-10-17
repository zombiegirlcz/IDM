package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lot3/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getNotificationCode", "notificationCode", "b", "reason", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "unblockedInMinutes", "", "d", "Ljava/lang/Boolean;", "getSimpleIncomeValidation", "()Ljava/lang/Boolean;", "simpleIncomeValidation", "e", "getIncomeCheckSelection", "incomeCheckSelection", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("notificationCode")
    private final String notificationCode = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String reason = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("unblockedInMinutes")
    private final Integer unblockedInMinutes = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("simpleIncomeValidation")
    private final Boolean simpleIncomeValidation = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("incomeCheckSelection")
    private final Boolean incomeCheckSelection = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getUnblockedInMinutes() {
        return this.unblockedInMinutes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.notificationCode, zVar.notificationCode) && Intrinsics.f(this.reason, zVar.reason) && Intrinsics.f(this.unblockedInMinutes, zVar.unblockedInMinutes) && Intrinsics.f(this.simpleIncomeValidation, zVar.simpleIncomeValidation) && Intrinsics.f(this.incomeCheckSelection, zVar.incomeCheckSelection);
    }

    public final int hashCode() {
        String str = this.notificationCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.unblockedInMinutes;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.simpleIncomeValidation;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.incomeCheckSelection;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
