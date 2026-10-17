package kfj;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b\r\u0010!¨\u0006#"}, d2 = {"Lkfj/h2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "h", "name", "Ljo3/a;", "c", "Ljo3/a;", "i", "()Ljo3/a;", "price", "d", "j", "subtype", "e", "f", "duration", "", "J", "()J", "allowanceBytes", "coverageName", "coverageType", "coverageCode", "", "Ljava/util/List;", "()Ljava/util/List;", "coverageCountries", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("duration")
    @NotNull
    private final String duration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("allowanceBytes")
    private final long allowanceBytes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageName")
    private final String coverageName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageType")
    @NotNull
    private final String coverageType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("coverageCode")
    @NotNull
    private final String coverageCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageCountries")
    @NotNull
    private final List<String> coverageCountries;

    public h2(String id10, String name, jo3.a price, String str, String duration, long j2, String str2, String coverageType, String coverageCode, ArrayList coverageCountries) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(coverageType, "coverageType");
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
        this.id = id10;
        this.name = name;
        this.price = price;
        this.subtype = str;
        this.duration = duration;
        this.allowanceBytes = j2;
        this.coverageName = str2;
        this.coverageType = coverageType;
        this.coverageCode = coverageCode;
        this.coverageCountries = coverageCountries;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAllowanceBytes() {
        return this.allowanceBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCoverageCode() {
        return this.coverageCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCoverageCountries() {
        return this.coverageCountries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCoverageName() {
        return this.coverageName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCoverageType() {
        return this.coverageType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.id, h2Var.id) && Intrinsics.f(this.name, h2Var.name) && Intrinsics.f(this.price, h2Var.price) && Intrinsics.f(this.subtype, h2Var.subtype) && Intrinsics.f(this.duration, h2Var.duration) && this.allowanceBytes == h2Var.allowanceBytes && Intrinsics.f(this.coverageName, h2Var.coverageName) && Intrinsics.f(this.coverageType, h2Var.coverageType) && Intrinsics.f(this.coverageCode, h2Var.coverageCode) && Intrinsics.f(this.coverageCountries, h2Var.coverageCountries);
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
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iJ = v7.j(this.price, p.a.c(this.id.hashCode() * 31, 31, this.name), 31);
        String str = this.subtype;
        int iC = a0.d.c(p.a.c((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.duration), 31, this.allowanceBytes);
        String str2 = this.coverageName;
        return this.coverageCountries.hashCode() + p.a.c(p.a.c((iC + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.coverageType), 31, this.coverageCode);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }
}
