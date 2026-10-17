package mdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001d"}, d2 = {"Lmdl/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "countryCode", "b", "e", "documentName", "f", "documentSubtitle", "d", "documentKey", "i", "validation", "g", "hint", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "canSkip", "h", "check", "j", "value", "infoLink", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentName")
    @NotNull
    private final String documentName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentSubtitle")
    private final String documentSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("documentKey")
    @NotNull
    private final String documentKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("validation")
    private final String validation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("canSkip")
    private final Boolean canSkip;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("check")
    private final String check;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("value")
    private final String value;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("infoLink")
    private final String infoLink;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCanSkip() {
        return this.canSkip;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheck() {
        return this.check;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentKey() {
        return this.documentKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.countryCode, bVar.countryCode) && Intrinsics.f(this.documentName, bVar.documentName) && Intrinsics.f(this.documentSubtitle, bVar.documentSubtitle) && Intrinsics.f(this.documentKey, bVar.documentKey) && Intrinsics.f(this.validation, bVar.validation) && Intrinsics.f(this.hint, bVar.hint) && Intrinsics.f(this.canSkip, bVar.canSkip) && Intrinsics.f(this.check, bVar.check) && Intrinsics.f(this.value, bVar.value) && Intrinsics.f(this.infoLink, bVar.infoLink);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDocumentSubtitle() {
        return this.documentSubtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getInfoLink() {
        return this.infoLink;
    }

    public final int hashCode() {
        int iC = p.a.c(this.countryCode.hashCode() * 31, 31, this.documentName);
        String str = this.documentSubtitle;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.documentKey);
        String str2 = this.validation;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canSkip;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.check;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.value;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.infoLink;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
