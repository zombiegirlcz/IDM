package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\f\u0010\u0004R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006&"}, d2 = {"Lkfj/h5;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "j", "type", "c", "i", "subtype", "d", "f", "duration", "", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "allowanceBytes", "", "Z", "()Z", "allowanceBytesUnlimited", "coverageType", "h", "coverageCode", "", "Ljava/util/List;", "()Ljava/util/List;", "coverageCountries", "Lkfj/p;", "Lkfj/p;", "()Lkfj/p;", "offer", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("duration")
    @NotNull
    private final String duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("allowanceBytes")
    private final Long allowanceBytes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("allowanceBytesUnlimited")
    private final boolean allowanceBytesUnlimited;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageType")
    @NotNull
    private final String coverageType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageCode")
    @NotNull
    private final String coverageCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("coverageCountries")
    @NotNull
    private final List<String> coverageCountries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("offer")
    private final p offer;

    public h5(String id10, String type, String str, String duration, Long l2, boolean z, String coverageType, String coverageCode, ArrayList coverageCountries, p pVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(coverageType, "coverageType");
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
        this.id = id10;
        this.type = type;
        this.subtype = str;
        this.duration = duration;
        this.allowanceBytes = l2;
        this.allowanceBytesUnlimited = z;
        this.coverageType = coverageType;
        this.coverageCode = coverageCode;
        this.coverageCountries = coverageCountries;
        this.offer = pVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAllowanceBytes() {
        return this.allowanceBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowanceBytesUnlimited() {
        return this.allowanceBytesUnlimited;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCoverageCode() {
        return this.coverageCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getCoverageCountries() {
        return this.coverageCountries;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCoverageType() {
        return this.coverageType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj2;
        return Intrinsics.f(this.id, h5Var.id) && Intrinsics.f(this.type, h5Var.type) && Intrinsics.f(this.subtype, h5Var.subtype) && Intrinsics.f(this.duration, h5Var.duration) && Intrinsics.f(this.allowanceBytes, h5Var.allowanceBytes) && this.allowanceBytesUnlimited == h5Var.allowanceBytesUnlimited && Intrinsics.f(this.coverageType, h5Var.coverageType) && Intrinsics.f(this.coverageCode, h5Var.coverageCode) && Intrinsics.f(this.coverageCountries, h5Var.coverageCountries) && Intrinsics.f(this.offer, h5Var.offer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final p getOffer() {
        return this.offer;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
        String str = this.subtype;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.duration);
        Long l2 = this.allowanceBytes;
        int iD = p.a.d(p.a.c(p.a.c(j6.a.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.allowanceBytesUnlimited), 31, this.coverageType), 31, this.coverageCode), 31, this.coverageCountries);
        p pVar = this.offer;
        return iD + (pVar != null ? pVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
