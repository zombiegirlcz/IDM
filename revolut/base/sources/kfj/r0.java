package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0015\u0010\u001d¨\u0006 "}, d2 = {"Lkfj/r0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "g", "value", "d", "perkId", "iconUrl", "Lkfj/m0;", "e", "Lkfj/m0;", "()Lkfj/m0;", "details", "Lkfj/s0;", "f", "Lkfj/s0;", "()Lkfj/s0;", "getPerkPreview$annotations", "()V", "perkPreview", "Lkfj/e0;", "Lkfj/e0;", "()Lkfj/e0;", "getTerms$annotations", "terms", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("perkId")
    private final String perkId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("iconUrl")
    private final String iconUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("details")
    private final m0 details;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("perkPreview")
    private final s0 perkPreview;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final e0 terms;

    public r0(String name, String value, String str, String str2, m0 m0Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.perkId = str;
        this.iconUrl = str2;
        this.details = m0Var;
        this.perkPreview = null;
        this.terms = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m0 getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPerkId() {
        return this.perkId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s0 getPerkPreview() {
        return this.perkPreview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.name, r0Var.name) && Intrinsics.f(this.value, r0Var.value) && Intrinsics.f(this.perkId, r0Var.perkId) && Intrinsics.f(this.iconUrl, r0Var.iconUrl) && Intrinsics.f(this.details, r0Var.details) && Intrinsics.f(this.perkPreview, r0Var.perkPreview) && Intrinsics.f(this.terms, r0Var.terms);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e0 getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = p.a.c(this.name.hashCode() * 31, 31, this.value);
        String str = this.perkId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        m0 m0Var = this.details;
        int iHashCode3 = (iHashCode2 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        s0 s0Var = this.perkPreview;
        int iHashCode4 = (iHashCode3 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        e0 e0Var = this.terms;
        return iHashCode4 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
