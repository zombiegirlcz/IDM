package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b\f\u00100R\u001c\u00105\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b\"\u00104¨\u00066"}, d2 = {"Lkfj/n1;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "g", "()Z", "newPortingInInitiationAvailable", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "eligiblePhoneCountries", "l", "strategyOrder", "Lkfj/p1;", "d", "e", "instructions", "Lkfj/p1;", "()Lkfj/p1;", "connectivityDisclaimer", "Lkfj/f;", "f", "Lkfj/f;", "k", "()Lkfj/f;", "progressPreview", "Ljava/lang/String;", "instructionsTitle", "h", "formId", "Lkfj/t1;", "i", "Lkfj/t1;", "()Lkfj/t1;", "pac", "Lkfj/u1;", "j", "Lkfj/u1;", "()Lkfj/u1;", "powerOfAttorney", "Lkfj/o1;", "Lkfj/o1;", "()Lkfj/o1;", "dynamicForm", "Lkfj/q1;", "Lkfj/q1;", "()Lkfj/q1;", "otp", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("newPortingInInitiationAvailable")
    private final boolean newPortingInInitiationAvailable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("eligiblePhoneCountries")
    @NotNull
    private final List<String> eligiblePhoneCountries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("strategyOrder")
    private final List<String> strategyOrder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("instructions")
    @NotNull
    private final List<p1> instructions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("connectivityDisclaimer")
    private final p1 connectivityDisclaimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("progressPreview")
    private final f progressPreview;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("instructionsTitle")
    private final String instructionsTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("formId")
    private final String formId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("pac")
    private final t1 pac;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("powerOfAttorney")
    private final u1 powerOfAttorney;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("dynamicForm")
    private final o1 dynamicForm;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("otp")
    private final q1 otp;

    public n1(boolean z, ArrayList eligiblePhoneCountries, ArrayList arrayList, ArrayList instructions, p1 p1Var, f fVar, String str, String str2, t1 t1Var, u1 u1Var, o1 o1Var, q1 q1Var) {
        Intrinsics.checkNotNullParameter(eligiblePhoneCountries, "eligiblePhoneCountries");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.newPortingInInitiationAvailable = z;
        this.eligiblePhoneCountries = eligiblePhoneCountries;
        this.strategyOrder = arrayList;
        this.instructions = instructions;
        this.connectivityDisclaimer = p1Var;
        this.progressPreview = fVar;
        this.instructionsTitle = str;
        this.formId = str2;
        this.pac = t1Var;
        this.powerOfAttorney = u1Var;
        this.dynamicForm = o1Var;
        this.otp = q1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p1 getConnectivityDisclaimer() {
        return this.connectivityDisclaimer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o1 getDynamicForm() {
        return this.dynamicForm;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getEligiblePhoneCountries() {
        return this.eligiblePhoneCountries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getInstructions() {
        return this.instructions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return this.newPortingInInitiationAvailable == n1Var.newPortingInInitiationAvailable && Intrinsics.f(this.eligiblePhoneCountries, n1Var.eligiblePhoneCountries) && Intrinsics.f(this.strategyOrder, n1Var.strategyOrder) && Intrinsics.f(this.instructions, n1Var.instructions) && Intrinsics.f(this.connectivityDisclaimer, n1Var.connectivityDisclaimer) && Intrinsics.f(this.progressPreview, n1Var.progressPreview) && Intrinsics.f(this.instructionsTitle, n1Var.instructionsTitle) && Intrinsics.f(this.formId, n1Var.formId) && Intrinsics.f(this.pac, n1Var.pac) && Intrinsics.f(this.powerOfAttorney, n1Var.powerOfAttorney) && Intrinsics.f(this.dynamicForm, n1Var.dynamicForm) && Intrinsics.f(this.otp, n1Var.otp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInstructionsTitle() {
        return this.instructionsTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getNewPortingInInitiationAvailable() {
        return this.newPortingInInitiationAvailable;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q1 getOtp() {
        return this.otp;
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.newPortingInInitiationAvailable) * 31, 31, this.eligiblePhoneCountries);
        List<String> list = this.strategyOrder;
        int iD2 = p.a.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.instructions);
        p1 p1Var = this.connectivityDisclaimer;
        int iHashCode = (iD2 + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        f fVar = this.progressPreview;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.instructionsTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.formId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t1 t1Var = this.pac;
        int iHashCode5 = (iHashCode4 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        u1 u1Var = this.powerOfAttorney;
        int iHashCode6 = (iHashCode5 + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
        o1 o1Var = this.dynamicForm;
        int iHashCode7 = (iHashCode6 + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        q1 q1Var = this.otp;
        return iHashCode7 + (q1Var != null ? q1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final t1 getPac() {
        return this.pac;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final u1 getPowerOfAttorney() {
        return this.powerOfAttorney;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f getProgressPreview() {
        return this.progressPreview;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getStrategyOrder() {
        return this.strategyOrder;
    }
}
