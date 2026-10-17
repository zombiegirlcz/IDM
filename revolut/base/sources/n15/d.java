package n15;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0015"}, d2 = {"Ln15/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "infoTitle", "c", "infoDescription", "", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "isTerminated", "buttonText", "buttonAction", "feature_credit_help_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("infoTitle")
    private final String infoTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("infoDescription")
    private final String infoDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("terminated")
    private final Boolean isTerminated;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("buttonText")
    private final String buttonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("buttonAction")
    private final String buttonAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonAction() {
        return this.buttonAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInfoDescription() {
        return this.infoDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInfoTitle() {
        return this.infoTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.infoTitle, dVar.infoTitle) && Intrinsics.f(this.infoDescription, dVar.infoDescription) && Intrinsics.f(this.isTerminated, dVar.isTerminated) && Intrinsics.f(this.buttonText, dVar.buttonText) && Intrinsics.f(this.buttonAction, dVar.buttonAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIsTerminated() {
        return this.isTerminated;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.infoTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.infoDescription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isTerminated;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.buttonText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonAction;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
