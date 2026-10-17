package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\u000f\u0010!R\u001a\u0010&\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u001d\u0010%¨\u0006'"}, d2 = {"Lkfj/u1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "type", "b", "formId", "c", "h", "title", "Lkfj/e0;", "d", "Lkfj/e0;", "f", "()Lkfj/e0;", "subtitle", "", "Lkfj/z1;", "e", "Ljava/util/List;", "()Ljava/util/List;", "serviceProviders", "Lkfj/s1;", "ownerAccountTypes", "Lkfj/l1;", "g", "contractType", "Lkfj/w1;", "Lkfj/w1;", "()Lkfj/w1;", "preferredSchedule", "Lkfj/v1;", "Lkfj/v1;", "()Lkfj/v1;", "terms", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u1 {

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
    @lg.b("serviceProviders")
    @NotNull
    private final List<z1> serviceProviders;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ownerAccountTypes")
    @NotNull
    private final List<s1> ownerAccountTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("contractType")
    @NotNull
    private final List<l1> contractType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferredSchedule")
    @NotNull
    private final w1 preferredSchedule;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("terms")
    @NotNull
    private final v1 terms;

    public u1(String str, String str2, String title, e0 subtitle, ArrayList serviceProviders, ArrayList ownerAccountTypes, ArrayList contractType, w1 preferredSchedule, v1 terms) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(serviceProviders, "serviceProviders");
        Intrinsics.checkNotNullParameter(ownerAccountTypes, "ownerAccountTypes");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.type = str;
        this.formId = str2;
        this.title = title;
        this.subtitle = subtitle;
        this.serviceProviders = serviceProviders;
        this.ownerAccountTypes = ownerAccountTypes;
        this.contractType = contractType;
        this.preferredSchedule = preferredSchedule;
        this.terms = terms;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getContractType() {
        return this.contractType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getOwnerAccountTypes() {
        return this.ownerAccountTypes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w1 getPreferredSchedule() {
        return this.preferredSchedule;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getServiceProviders() {
        return this.serviceProviders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.type, u1Var.type) && Intrinsics.f(this.formId, u1Var.formId) && Intrinsics.f(this.title, u1Var.title) && Intrinsics.f(this.subtitle, u1Var.subtitle) && Intrinsics.f(this.serviceProviders, u1Var.serviceProviders) && Intrinsics.f(this.ownerAccountTypes, u1Var.ownerAccountTypes) && Intrinsics.f(this.contractType, u1Var.contractType) && Intrinsics.f(this.preferredSchedule, u1Var.preferredSchedule) && Intrinsics.f(this.terms, u1Var.terms);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final v1 getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.formId;
        return this.terms.hashCode() + ((this.preferredSchedule.hashCode() + p.a.d(p.a.d(p.a.d((this.subtitle.hashCode() + p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.title)) * 31, 31, this.serviceProviders), 31, this.ownerAccountTypes), 31, this.contractType)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
