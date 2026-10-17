package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u000f\u0010!R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\t\u0010!R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u001a\u0010,\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\u0018\u0010+R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0005\u0010!¨\u0006/"}, d2 = {"Lkfj/o1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "type", "b", "c", "formId", "k", "title", "Lkfj/e0;", "d", "Lkfj/e0;", "i", "()Lkfj/e0;", "subtitle", "e", "j", "terms", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "phoneNumberHidden", "", "Lkfj/z1;", "g", "Ljava/util/List;", "h", "()Ljava/util/List;", "serviceProviders", "Lkfj/s1;", "ownerAccountTypes", "Lkfj/l1;", "contractType", "Lkfj/y1;", "preferredScheduleOptions", "Lkfj/w1;", "Lkfj/w1;", "()Lkfj/w1;", "preferredSchedule", "Lkfj/j1;", "additionalRequiredInformation", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("formId")
    private final String formId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final e0 subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("terms")
    private final e0 terms;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("phoneNumberHidden")
    private final Boolean phoneNumberHidden;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceProviders")
    private final List<z1> serviceProviders;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerAccountTypes")
    private final List<s1> ownerAccountTypes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("contractType")
    private final List<l1> contractType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferredScheduleOptions")
    private final List<y1> preferredScheduleOptions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("preferredSchedule")
    @NotNull
    private final w1 preferredSchedule;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalRequiredInformation")
    private final List<j1> additionalRequiredInformation;

    public o1(String str, String str2, String title, e0 subtitle, e0 e0Var, Boolean bool, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, w1 preferredSchedule, ArrayList arrayList5) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        this.type = str;
        this.formId = str2;
        this.title = title;
        this.subtitle = subtitle;
        this.terms = e0Var;
        this.phoneNumberHidden = bool;
        this.serviceProviders = arrayList;
        this.ownerAccountTypes = arrayList2;
        this.contractType = arrayList3;
        this.preferredScheduleOptions = arrayList4;
        this.preferredSchedule = preferredSchedule;
        this.additionalRequiredInformation = arrayList5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalRequiredInformation() {
        return this.additionalRequiredInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getContractType() {
        return this.contractType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getOwnerAccountTypes() {
        return this.ownerAccountTypes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getPhoneNumberHidden() {
        return this.phoneNumberHidden;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.type, o1Var.type) && Intrinsics.f(this.formId, o1Var.formId) && Intrinsics.f(this.title, o1Var.title) && Intrinsics.f(this.subtitle, o1Var.subtitle) && Intrinsics.f(this.terms, o1Var.terms) && Intrinsics.f(this.phoneNumberHidden, o1Var.phoneNumberHidden) && Intrinsics.f(this.serviceProviders, o1Var.serviceProviders) && Intrinsics.f(this.ownerAccountTypes, o1Var.ownerAccountTypes) && Intrinsics.f(this.contractType, o1Var.contractType) && Intrinsics.f(this.preferredScheduleOptions, o1Var.preferredScheduleOptions) && Intrinsics.f(this.preferredSchedule, o1Var.preferredSchedule) && Intrinsics.f(this.additionalRequiredInformation, o1Var.additionalRequiredInformation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final w1 getPreferredSchedule() {
        return this.preferredSchedule;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getPreferredScheduleOptions() {
        return this.preferredScheduleOptions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getServiceProviders() {
        return this.serviceProviders;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.formId;
        int iHashCode2 = (this.subtitle.hashCode() + p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title)) * 31;
        e0 e0Var = this.terms;
        int iHashCode3 = (iHashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Boolean bool = this.phoneNumberHidden;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<z1> list = this.serviceProviders;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<s1> list2 = this.ownerAccountTypes;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<l1> list3 = this.contractType;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<y1> list4 = this.preferredScheduleOptions;
        int iHashCode8 = (this.preferredSchedule.hashCode() + ((iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31)) * 31;
        List<j1> list5 = this.additionalRequiredInformation;
        return iHashCode8 + (list5 != null ? list5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e0 getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
