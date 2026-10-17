package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006$"}, d2 = {"Lkfj/q1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "type", "b", "formId", "c", "h", "title", "Lkfj/e0;", "d", "Lkfj/e0;", "e", "()Lkfj/e0;", "subtitle", "", "Z", "()Z", "phoneNumberHidden", "Lkfj/j1;", "f", "Lkfj/j1;", "()Lkfj/j1;", "code", "g", "refreshLabel", "terms", "Lkfj/a2;", "Lkfj/a2;", "()Lkfj/a2;", "switchStrategy", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q1 {

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
    @lg.b("phoneNumberHidden")
    private final boolean phoneNumberHidden;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final j1 code;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("refreshLabel")
    @NotNull
    private final String refreshLabel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final e0 terms;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("switchStrategy")
    private final a2 switchStrategy;

    public q1(String str, String str2, String title, e0 subtitle, boolean z, j1 code, String refreshLabel, e0 e0Var, a2 a2Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(refreshLabel, "refreshLabel");
        this.type = str;
        this.formId = str2;
        this.title = title;
        this.subtitle = subtitle;
        this.phoneNumberHidden = z;
        this.code = code;
        this.refreshLabel = refreshLabel;
        this.terms = e0Var;
        this.switchStrategy = a2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j1 getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPhoneNumberHidden() {
        return this.phoneNumberHidden;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefreshLabel() {
        return this.refreshLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.type, q1Var.type) && Intrinsics.f(this.formId, q1Var.formId) && Intrinsics.f(this.title, q1Var.title) && Intrinsics.f(this.subtitle, q1Var.subtitle) && this.phoneNumberHidden == q1Var.phoneNumberHidden && Intrinsics.f(this.code, q1Var.code) && Intrinsics.f(this.refreshLabel, q1Var.refreshLabel) && Intrinsics.f(this.terms, q1Var.terms) && Intrinsics.f(this.switchStrategy, q1Var.switchStrategy);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a2 getSwitchStrategy() {
        return this.switchStrategy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e0 getTerms() {
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
        int iC = p.a.c((this.code.hashCode() + j6.a.c((this.subtitle.hashCode() + p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title)) * 31, 31, this.phoneNumberHidden)) * 31, 31, this.refreshLabel);
        e0 e0Var = this.terms;
        int iHashCode2 = (iC + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        a2 a2Var = this.switchStrategy;
        return iHashCode2 + (a2Var != null ? a2Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
