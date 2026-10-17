package jzc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u0006!"}, d2 = {"Ljzc/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getIncomeSource", "incomeSource", "b", "getIncomeDestination", "incomeDestination", "", "c", "J", "getMinorAmount", "()J", "minorAmount", "d", "getCurrency", "currency", "e", "getIncomeFrequency", "incomeFrequency", "f", "getUserDescription", "userDescription", "g", "getUserNote", "userNote", "h", "getActionToDoId", "actionToDoId", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("incomeSource")
    @NotNull
    private final String incomeSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("incomeDestination")
    @NotNull
    private final String incomeDestination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minorAmount")
    private final long minorAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("incomeFrequency")
    @NotNull
    private final String incomeFrequency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("userDescription")
    private final String userDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("userNote")
    private final String userNote;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("actionToDoId")
    private final String actionToDoId;

    public c(long j2, String incomeSource, String incomeDestination, String currency, String incomeFrequency, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        Intrinsics.checkNotNullParameter(incomeDestination, "incomeDestination");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(incomeFrequency, "incomeFrequency");
        this.incomeSource = incomeSource;
        this.incomeDestination = incomeDestination;
        this.minorAmount = j2;
        this.currency = currency;
        this.incomeFrequency = incomeFrequency;
        this.userDescription = str;
        this.userNote = str2;
        this.actionToDoId = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.incomeSource, cVar.incomeSource) && Intrinsics.f(this.incomeDestination, cVar.incomeDestination) && this.minorAmount == cVar.minorAmount && Intrinsics.f(this.currency, cVar.currency) && Intrinsics.f(this.incomeFrequency, cVar.incomeFrequency) && Intrinsics.f(this.userDescription, cVar.userDescription) && Intrinsics.f(this.userNote, cVar.userNote) && Intrinsics.f(this.actionToDoId, cVar.actionToDoId);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(a0.d.c(p.a.c(this.incomeSource.hashCode() * 31, 31, this.incomeDestination), 31, this.minorAmount), 31, this.currency), 31, this.incomeFrequency);
        String str = this.userDescription;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userNote;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionToDoId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
