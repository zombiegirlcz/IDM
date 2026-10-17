package tt8;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0011\u0010\u0018R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0005\u0010\u0018R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006#"}, d2 = {"Ltt8/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "docRef", "b", "k", "type", "c", "i", "subType", "g", "issuingCountry", "e", "displayName", "", "Ltt8/f;", "f", "Ljava/util/List;", "h", "()Ljava/util/List;", "pages", "description", "j", "supportedFormats", "Ltt8/c;", "fields", "Ltt8/b;", "consents", "Ltt8/d;", "hints", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("docRef")
    @NotNull
    private final String docRef;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subType")
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("issuingCountry")
    @NotNull
    private final String issuingCountry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pages")
    @NotNull
    private final List<f> pages;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportedFormats")
    private final List<String> supportedFormats;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("fields")
    private final List<c> fields;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    private final List<b> consents;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("hints")
    private final List<d> hints;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocRef() {
        return this.docRef;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.docRef, eVar.docRef) && Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.subType, eVar.subType) && Intrinsics.f(this.issuingCountry, eVar.issuingCountry) && Intrinsics.f(this.displayName, eVar.displayName) && Intrinsics.f(this.pages, eVar.pages) && Intrinsics.f(this.description, eVar.description) && Intrinsics.f(this.supportedFormats, eVar.supportedFormats) && Intrinsics.f(this.fields, eVar.fields) && Intrinsics.f(this.consents, eVar.consents) && Intrinsics.f(this.hints, eVar.hints);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getPages() {
        return this.pages;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(p.a.c(this.docRef.hashCode() * 31, 31, this.type), 31, this.subType), 31, this.issuingCountry), 31, this.displayName), 31, this.pages);
        String str = this.description;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.supportedFormats;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<c> list2 = this.fields;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<b> list3 = this.consents;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<d> list4 = this.hints;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getSupportedFormats() {
        return this.supportedFormats;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
