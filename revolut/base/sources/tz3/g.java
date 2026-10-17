package tz3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Ltz3/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "referralId", "b", "d", "referralFlagName", "c", "h", "title", "g", "subtitle", "buttonText", "f", "buttonHint", "Ltz3/f;", "Ltz3/f;", "()Ltz3/f;", "documentGroups", "", "Ltz3/l;", "Ljava/util/List;", "()Ljava/util/List;", "requiredChecks", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("referralId")
    @NotNull
    private final String referralId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("referralFlagName")
    private final String referralFlagName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("buttonText")
    @NotNull
    private final String buttonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("buttonHint")
    @NotNull
    private final String buttonHint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentGroups")
    private final f documentGroups;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiredChecks")
    private final List<l> requiredChecks;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonHint() {
        return this.buttonHint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getDocumentGroups() {
        return this.documentGroups;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReferralFlagName() {
        return this.referralFlagName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReferralId() {
        return this.referralId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.referralId, gVar.referralId) && Intrinsics.f(this.referralFlagName, gVar.referralFlagName) && Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.subtitle, gVar.subtitle) && Intrinsics.f(this.buttonText, gVar.buttonText) && Intrinsics.f(this.buttonHint, gVar.buttonHint) && Intrinsics.f(this.documentGroups, gVar.documentGroups) && Intrinsics.f(this.requiredChecks, gVar.requiredChecks);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getRequiredChecks() {
        return this.requiredChecks;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.referralId.hashCode() * 31;
        String str = this.referralFlagName;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.subtitle), 31, this.buttonText), 31, this.buttonHint);
        f fVar = this.documentGroups;
        int iHashCode2 = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List<l> list = this.requiredChecks;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
