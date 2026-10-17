package hcl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0006\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\f\u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\u001a\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b\u001f\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b\u0011\u0010-¨\u0006/"}, d2 = {"Lhcl/u2;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "risk", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "maxReturnPercent", "c", "h", "termMonths", "", "Ljava/util/List;", "i", "()Ljava/util/List;", "underlyingAssetsRefs", "Ljo3/b;", "e", "Ljo3/b;", "()Ljo3/b;", "faceValue", "Lko3/b;", "f", "Lko3/b;", "()Lko3/b;", "issuePrice", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "noteTradeDate", "Lnel/d0;", "Lnel/d0;", "()Lnel/d0;", "noteType", "Lnel/c0;", "Lnel/c0;", "()Lnel/c0;", "lifecycleState", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("risk")
    private final Integer risk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxReturnPercent")
    private final BigDecimal maxReturnPercent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("termMonths")
    private final Integer termMonths;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("underlyingAssetsRefs")
    @NotNull
    private final List<String> underlyingAssetsRefs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("faceValue")
    private final jo3.b faceValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("issuePrice")
    private final ko3.b issuePrice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("noteTradeDate")
    private final LocalDate noteTradeDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("noteType")
    private final nel.d0 noteType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lifecycleState")
    private final nel.c0 lifecycleState;

    public u2(Integer num, BigDecimal bigDecimal, Integer num2, List underlyingAssetsRefs, jo3.b bVar, ko3.b bVar2, LocalDate localDate, nel.d0 d0Var, nel.c0 c0Var) {
        Intrinsics.checkNotNullParameter(underlyingAssetsRefs, "underlyingAssetsRefs");
        this.risk = num;
        this.maxReturnPercent = bigDecimal;
        this.termMonths = num2;
        this.underlyingAssetsRefs = underlyingAssetsRefs;
        this.faceValue = bVar;
        this.issuePrice = bVar2;
        this.noteTradeDate = localDate;
        this.noteType = d0Var;
        this.lifecycleState = c0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getFaceValue() {
        return this.faceValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ko3.b getIssuePrice() {
        return this.issuePrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final nel.c0 getLifecycleState() {
        return this.lifecycleState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getMaxReturnPercent() {
        return this.maxReturnPercent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getNoteTradeDate() {
        return this.noteTradeDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return Intrinsics.f(this.risk, u2Var.risk) && Intrinsics.f(this.maxReturnPercent, u2Var.maxReturnPercent) && Intrinsics.f(this.termMonths, u2Var.termMonths) && Intrinsics.f(this.underlyingAssetsRefs, u2Var.underlyingAssetsRefs) && Intrinsics.f(this.faceValue, u2Var.faceValue) && Intrinsics.f(this.issuePrice, u2Var.issuePrice) && Intrinsics.f(this.noteTradeDate, u2Var.noteTradeDate) && this.noteType == u2Var.noteType && this.lifecycleState == u2Var.lifecycleState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final nel.d0 getNoteType() {
        return this.noteType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getRisk() {
        return this.risk;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getTermMonths() {
        return this.termMonths;
    }

    public final int hashCode() {
        Integer num = this.risk;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BigDecimal bigDecimal = this.maxReturnPercent;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num2 = this.termMonths;
        int iD = p.a.d((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.underlyingAssetsRefs);
        jo3.b bVar = this.faceValue;
        int iHashCode3 = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ko3.b bVar2 = this.issuePrice;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        LocalDate localDate = this.noteTradeDate;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        nel.d0 d0Var = this.noteType;
        int iHashCode6 = (iHashCode5 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        nel.c0 c0Var = this.lifecycleState;
        return iHashCode6 + (c0Var != null ? c0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getUnderlyingAssetsRefs() {
        return this.underlyingAssetsRefs;
    }
}
