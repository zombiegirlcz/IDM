package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\u0017\u0010\"R\u001a\u0010'\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b\u0005\u0010&¨\u0006("}, d2 = {"Lkfj/t1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "type", "b", "c", "formId", "h", "title", "Lkfj/e0;", "d", "Lkfj/e0;", "g", "()Lkfj/e0;", "subtitle", "e", "instruction", "Lkfj/m1;", "f", "Lkfj/m1;", "()Lkfj/m1;", "credentialIssuer", "Lkfj/w1;", "Lkfj/w1;", "()Lkfj/w1;", "preferredSchedule", "", "Lkfj/y1;", "Ljava/util/List;", "()Ljava/util/List;", "preferredScheduleOptions", "Lkfj/j1;", "Lkfj/j1;", "()Lkfj/j1;", "code", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t1 {

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
    @lg.b("instruction")
    private final e0 instruction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("credentialIssuer")
    private final m1 credentialIssuer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferredSchedule")
    @NotNull
    private final w1 preferredSchedule;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferredScheduleOptions")
    @NotNull
    private final List<y1> preferredScheduleOptions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final j1 code;

    public t1(String str, String str2, String title, e0 subtitle, e0 e0Var, m1 m1Var, w1 preferredSchedule, ArrayList preferredScheduleOptions, j1 code) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        Intrinsics.checkNotNullParameter(preferredScheduleOptions, "preferredScheduleOptions");
        Intrinsics.checkNotNullParameter(code, "code");
        this.type = str;
        this.formId = str2;
        this.title = title;
        this.subtitle = subtitle;
        this.instruction = e0Var;
        this.credentialIssuer = m1Var;
        this.preferredSchedule = preferredSchedule;
        this.preferredScheduleOptions = preferredScheduleOptions;
        this.code = code;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j1 getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m1 getCredentialIssuer() {
        return this.credentialIssuer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e0 getInstruction() {
        return this.instruction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final w1 getPreferredSchedule() {
        return this.preferredSchedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.type, t1Var.type) && Intrinsics.f(this.formId, t1Var.formId) && Intrinsics.f(this.title, t1Var.title) && Intrinsics.f(this.subtitle, t1Var.subtitle) && Intrinsics.f(this.instruction, t1Var.instruction) && Intrinsics.f(this.credentialIssuer, t1Var.credentialIssuer) && Intrinsics.f(this.preferredSchedule, t1Var.preferredSchedule) && Intrinsics.f(this.preferredScheduleOptions, t1Var.preferredScheduleOptions) && Intrinsics.f(this.code, t1Var.code);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getPreferredScheduleOptions() {
        return this.preferredScheduleOptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.formId;
        int iHashCode2 = (this.subtitle.hashCode() + p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title)) * 31;
        e0 e0Var = this.instruction;
        int iHashCode3 = (iHashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        m1 m1Var = this.credentialIssuer;
        return this.code.hashCode() + p.a.d((this.preferredSchedule.hashCode() + ((iHashCode3 + (m1Var != null ? m1Var.hashCode() : 0)) * 31)) * 31, 31, this.preferredScheduleOptions);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
