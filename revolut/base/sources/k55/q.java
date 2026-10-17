package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\u001e\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b\u0012\u0010-R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b1\u00102R\u001c\u00108\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b6\u00107R\u001c\u0010<\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b\f\u0010;R\u001c\u0010A\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u001c\u0010E\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\b\u0006\u0010D¨\u0006F"}, d2 = {"Lk55/q;", "", "", "toString", "()Ljava/lang/String;", "Lk55/g;", "a", "Lk55/g;", "f", "()Lk55/g;", "cooldownInfo", "Lk55/i;", "b", "Lk55/i;", "g", "()Lk55/i;", "dcaContactInfo", "Lk55/n;", "c", "Lk55/n;", "k", "()Lk55/n;", "getHelpScreen", "Lk55/j;", "d", "Lk55/j;", "h", "()Lk55/j;", "directDebitInfo", "Lk55/e;", "e", "Lk55/e;", "()Lk55/e;", "cancellationInfo", "Lk55/f;", "Lk55/f;", "()Lk55/f;", "changeRepaymentDayInfo", "Lk55/k;", "Lk55/k;", "i", "()Lk55/k;", "financialDifficultiesInfo", "Lk55/d;", "Lk55/d;", "()Lk55/d;", "calculationsInfo", "Lk55/l;", "Lk55/l;", "j", "()Lk55/l;", "forbearanceInfo", "Lk55/w;", "Lk55/w;", "m", "()Lk55/w;", "statementInfo", "Lk55/b;", "Lk55/b;", "()Lk55/b;", "backupCardInfo", "Lk55/v;", "l", "Lk55/v;", "()Lk55/v;", "partialCalculations", "Lk55/a;", "Lk55/a;", "()Lk55/a;", "aprInfo", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cooldownInfo")
    private final g cooldownInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dcaContactInfo")
    private final i dcaContactInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("getHelpScreen")
    private final n getHelpScreen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("directDebit")
    private final j directDebitInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cancellation")
    private final e cancellationInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("changeRepaymentDay")
    private final f changeRepaymentDayInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("financialDifficulties")
    private final k financialDifficultiesInfo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("calculations")
    private final d calculationsInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("forbearance")
    private final l forbearanceInfo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("statement")
    private final w statementInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("backupCard")
    private final b backupCardInfo;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("partialCalculations")
    private final v partialCalculations;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("aprInfo")
    private final a aprInfo;

    public q(g gVar, i iVar, n nVar, j jVar, e eVar, f fVar, k kVar, d dVar, l lVar, w wVar, b bVar, v vVar, a aVar) {
        this.cooldownInfo = gVar;
        this.dcaContactInfo = iVar;
        this.getHelpScreen = nVar;
        this.directDebitInfo = jVar;
        this.cancellationInfo = eVar;
        this.changeRepaymentDayInfo = fVar;
        this.financialDifficultiesInfo = kVar;
        this.calculationsInfo = dVar;
        this.forbearanceInfo = lVar;
        this.statementInfo = wVar;
        this.backupCardInfo = bVar;
        this.partialCalculations = vVar;
        this.aprInfo = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAprInfo() {
        return this.aprInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getBackupCardInfo() {
        return this.backupCardInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getCalculationsInfo() {
        return this.calculationsInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getCancellationInfo() {
        return this.cancellationInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getChangeRepaymentDayInfo() {
        return this.changeRepaymentDayInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.cooldownInfo, qVar.cooldownInfo) && Intrinsics.f(this.dcaContactInfo, qVar.dcaContactInfo) && Intrinsics.f(this.getHelpScreen, qVar.getHelpScreen) && Intrinsics.f(this.directDebitInfo, qVar.directDebitInfo) && Intrinsics.f(this.cancellationInfo, qVar.cancellationInfo) && Intrinsics.f(this.changeRepaymentDayInfo, qVar.changeRepaymentDayInfo) && Intrinsics.f(this.financialDifficultiesInfo, qVar.financialDifficultiesInfo) && Intrinsics.f(this.calculationsInfo, qVar.calculationsInfo) && Intrinsics.f(this.forbearanceInfo, qVar.forbearanceInfo) && Intrinsics.f(this.statementInfo, qVar.statementInfo) && Intrinsics.f(this.backupCardInfo, qVar.backupCardInfo) && Intrinsics.f(this.partialCalculations, qVar.partialCalculations) && Intrinsics.f(this.aprInfo, qVar.aprInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g getCooldownInfo() {
        return this.cooldownInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getDcaContactInfo() {
        return this.dcaContactInfo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final j getDirectDebitInfo() {
        return this.directDebitInfo;
    }

    public final int hashCode() {
        g gVar = this.cooldownInfo;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        i iVar = this.dcaContactInfo;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        n nVar = this.getHelpScreen;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        j jVar = this.directDebitInfo;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        e eVar = this.cancellationInfo;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.changeRepaymentDayInfo;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        k kVar = this.financialDifficultiesInfo;
        int iHashCode7 = (iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        d dVar = this.calculationsInfo;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        l lVar = this.forbearanceInfo;
        int iHashCode9 = (iHashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        w wVar = this.statementInfo;
        int iHashCode10 = (iHashCode9 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        b bVar = this.backupCardInfo;
        int iHashCode11 = (iHashCode10 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        v vVar = this.partialCalculations;
        int iHashCode12 = (iHashCode11 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        a aVar = this.aprInfo;
        return iHashCode12 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k getFinancialDifficultiesInfo() {
        return this.financialDifficultiesInfo;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final l getForbearanceInfo() {
        return this.forbearanceInfo;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getGetHelpScreen() {
        return this.getHelpScreen;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final v getPartialCalculations() {
        return this.partialCalculations;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final w getStatementInfo() {
        return this.statementInfo;
    }
}
