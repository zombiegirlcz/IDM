package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\"\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\u001f¨\u0006#"}, d2 = {"Lkfj/w0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "key", "b", "i", "value", "Lkfj/m0;", "c", "Lkfj/m0;", "d", "()Lkfj/m0;", "details", "f", "iconUrl", "e", "icon", "coverageType", "coverageCode", "", "h", "Ljava/util/List;", "()Ljava/util/List;", "coverageCountries", "Lkfj/e0;", "Lkfj/e0;", "()Lkfj/e0;", "getTerms$annotations", "()V", "terms", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final m0 details;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("iconUrl")
    private final String iconUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("coverageType")
    private final String coverageType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageCode")
    private final String coverageCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageCountries")
    private final List<String> coverageCountries;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("terms")
    private final e0 terms;

    public w0(String key, String value, m0 m0Var, String str, String str2, String str3, String str4, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = key;
        this.value = value;
        this.details = m0Var;
        this.iconUrl = str;
        this.icon = str2;
        this.coverageType = str3;
        this.coverageCode = str4;
        this.coverageCountries = arrayList;
        this.terms = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCoverageCode() {
        return this.coverageCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCoverageCountries() {
        return this.coverageCountries;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCoverageType() {
        return this.coverageType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m0 getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.key, w0Var.key) && Intrinsics.f(this.value, w0Var.value) && Intrinsics.f(this.details, w0Var.details) && Intrinsics.f(this.iconUrl, w0Var.iconUrl) && Intrinsics.f(this.icon, w0Var.icon) && Intrinsics.f(this.coverageType, w0Var.coverageType) && Intrinsics.f(this.coverageCode, w0Var.coverageCode) && Intrinsics.f(this.coverageCountries, w0Var.coverageCountries) && Intrinsics.f(this.terms, w0Var.terms);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e0 getTerms() {
        return this.terms;
    }

    public final int hashCode() {
        int iC = p.a.c(this.key.hashCode() * 31, 31, this.value);
        m0 m0Var = this.details;
        int iHashCode = (iC + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        String str = this.iconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coverageType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverageCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.coverageCountries;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        e0 e0Var = this.terms;
        return iHashCode6 + (e0Var != null ? e0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
