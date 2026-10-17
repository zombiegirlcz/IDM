package ot3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001e"}, d2 = {"Lot3/v0;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "title", "b", "description", "c", "e", "primaryButtonTitle", "d", "primaryButtonAction", "primaryButtonDeeplink", "f", "h", "secondaryButtonTitle", "g", "secondaryButtonAction", "secondaryButtonDeeplink", "", "Lot3/r;", "i", "Ljava/util/List;", "()Ljava/util/List;", "bureaus", "subtype", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryButtonTitle")
    private final String primaryButtonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("primaryButtonAction")
    private final String primaryButtonAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("primaryButtonDeeplink")
    private final String primaryButtonDeeplink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("secondaryButtonTitle")
    private final String secondaryButtonTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButtonAction")
    private final String secondaryButtonAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButtonDeeplink")
    private final String secondaryButtonDeeplink;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("bureaus")
    private final List<r> bureaus;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBureaus() {
        return this.bureaus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrimaryButtonAction() {
        return this.primaryButtonAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrimaryButtonDeeplink() {
        return this.primaryButtonDeeplink;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.title, v0Var.title) && Intrinsics.f(this.description, v0Var.description) && Intrinsics.f(this.primaryButtonTitle, v0Var.primaryButtonTitle) && Intrinsics.f(this.primaryButtonAction, v0Var.primaryButtonAction) && Intrinsics.f(this.primaryButtonDeeplink, v0Var.primaryButtonDeeplink) && Intrinsics.f(this.secondaryButtonTitle, v0Var.secondaryButtonTitle) && Intrinsics.f(this.secondaryButtonAction, v0Var.secondaryButtonAction) && Intrinsics.f(this.secondaryButtonDeeplink, v0Var.secondaryButtonDeeplink) && Intrinsics.f(this.bureaus, v0Var.bureaus) && Intrinsics.f(this.subtype, v0Var.subtype);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSecondaryButtonAction() {
        return this.secondaryButtonAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSecondaryButtonDeeplink() {
        return this.secondaryButtonDeeplink;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryButtonTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.primaryButtonAction;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.primaryButtonDeeplink;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondaryButtonTitle;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.secondaryButtonAction;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.secondaryButtonDeeplink;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<r> list = this.bureaus;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.subtype;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
