package auc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\u0004R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b\u000f\u0010)R\u001c\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b+\u0010\rR\u001c\u00100\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b\n\u0010/R\u001c\u00101\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b\u0005\u0010/R\u001c\u00107\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010:\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b\u001f\u0010)R\u001c\u0010;\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b#\u00106R\u001c\u0010?\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b\u001a\u0010>R\u001c\u0010C\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\b9\u0010BR\"\u0010F\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u00104\u0012\u0004\bD\u0010E\u001a\u0004\b3\u00106R\"\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\bG\u0010E\u001a\u0004\b\u001d\u0010\u0004¨\u0006I"}, d2 = {"Lauc/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "s", "status", "", "b", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "max", "c", "v", "used", "d", "e", "currency", "t", "timeOfDay", "f", "o", "name", "g", "l", "label", "h", "description", "i", "j", "icon", "category", "k", "u", "type", "", "Lauc/a;", "Ljava/util/List;", "()Ljava/util/List;", "applyingTo", "n", "maxPossibleValue", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "activationMinDelayHours", "activationMaxDelayHours", "", "p", "Ljava/lang/Boolean;", "r", "()Ljava/lang/Boolean;", "removeAllowed", "Lauc/o;", "q", "groupConfig", "jointAccount", "Lauc/f;", "Lauc/f;", "()Lauc/f;", "deviceCooldown", "Lauc/p;", "Lauc/p;", "()Lauc/p;", "readOnlyDialog", "getReadOnly$annotations", "()V", "readOnly", "getEditDeeplink$annotations", "editDeeplink", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"maxAmount"}, value = "max")
    private final Long max;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"usedAmount"}, value = "used")
    private final Long used;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("timeOfDay")
    private final String timeOfDay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("icon")
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("applyingTo")
    private final List<a> applyingTo;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"maxPossibleAmount"}, value = "maxPossibleValue")
    private final Long maxPossibleValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationStartHour")
    private final Integer activationMinDelayHours;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("activationEndHour")
    private final Integer activationMaxDelayHours;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("removeAllowed")
    private final Boolean removeAllowed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupConfig")
    private final List<o> groupConfig;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("jointAccount")
    private final Boolean jointAccount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("deviceCooldown")
    private final f deviceCooldown;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("readOnlyDialog")
    private final p readOnlyDialog;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("readOnly")
    private final Boolean readOnly;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("editDeeplink")
    private final String editDeeplink;

    public n(String status, Long l2, Long l3, String str, String str2, String name, String label, String str3, String icon, String category, String type, ArrayList arrayList, Long l4, Integer num, Integer num2, Boolean bool, ArrayList arrayList2, Boolean bool2, f fVar, p pVar, Boolean bool3, String str4) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(type, "type");
        this.status = status;
        this.max = l2;
        this.used = l3;
        this.currency = str;
        this.timeOfDay = str2;
        this.name = name;
        this.label = label;
        this.description = str3;
        this.icon = icon;
        this.category = category;
        this.type = type;
        this.applyingTo = arrayList;
        this.maxPossibleValue = l4;
        this.activationMinDelayHours = num;
        this.activationMaxDelayHours = num2;
        this.removeAllowed = bool;
        this.groupConfig = arrayList2;
        this.jointAccount = bool2;
        this.deviceCooldown = fVar;
        this.readOnlyDialog = pVar;
        this.readOnly = bool3;
        this.editDeeplink = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getActivationMaxDelayHours() {
        return this.activationMaxDelayHours;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getActivationMinDelayHours() {
        return this.activationMinDelayHours;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getApplyingTo() {
        return this.applyingTo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.status, nVar.status) && Intrinsics.f(this.max, nVar.max) && Intrinsics.f(this.used, nVar.used) && Intrinsics.f(this.currency, nVar.currency) && Intrinsics.f(this.timeOfDay, nVar.timeOfDay) && Intrinsics.f(this.name, nVar.name) && Intrinsics.f(this.label, nVar.label) && Intrinsics.f(this.description, nVar.description) && Intrinsics.f(this.icon, nVar.icon) && Intrinsics.f(this.category, nVar.category) && Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.applyingTo, nVar.applyingTo) && Intrinsics.f(this.maxPossibleValue, nVar.maxPossibleValue) && Intrinsics.f(this.activationMinDelayHours, nVar.activationMinDelayHours) && Intrinsics.f(this.activationMaxDelayHours, nVar.activationMaxDelayHours) && Intrinsics.f(this.removeAllowed, nVar.removeAllowed) && Intrinsics.f(this.groupConfig, nVar.groupConfig) && Intrinsics.f(this.jointAccount, nVar.jointAccount) && Intrinsics.f(this.deviceCooldown, nVar.deviceCooldown) && Intrinsics.f(this.readOnlyDialog, nVar.readOnlyDialog) && Intrinsics.f(this.readOnly, nVar.readOnly) && Intrinsics.f(this.editDeeplink, nVar.editDeeplink);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getDeviceCooldown() {
        return this.deviceCooldown;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEditDeeplink() {
        return this.editDeeplink;
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Long l2 = this.max;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.used;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.currency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeOfDay;
        int iC = p.a.c(p.a.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.name), 31, this.label);
        String str3 = this.description;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.icon), 31, this.category), 31, this.type);
        List<a> list = this.applyingTo;
        int iHashCode5 = (iC2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l4 = this.maxPossibleValue;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.activationMinDelayHours;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.activationMaxDelayHours;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.removeAllowed;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<o> list2 = this.groupConfig;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.jointAccount;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        f fVar = this.deviceCooldown;
        int iHashCode12 = (iHashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        p pVar = this.readOnlyDialog;
        int iHashCode13 = (iHashCode12 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Boolean bool3 = this.readOnly;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.editDeeplink;
        return iHashCode14 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getGroupConfig() {
        return this.groupConfig;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getJointAccount() {
        return this.jointAccount;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Long getMaxPossibleValue() {
        return this.maxPossibleValue;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getReadOnly() {
        return this.readOnly;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final p getReadOnlyDialog() {
        return this.readOnlyDialog;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getRemoveAllowed() {
        return this.removeAllowed;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Long getUsed() {
        return this.used;
    }
}
