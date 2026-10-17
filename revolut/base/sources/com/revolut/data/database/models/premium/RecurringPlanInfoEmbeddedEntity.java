package com.revolut.data.database.models.premium;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;", "", "isTrial", "", "billingCyclesIds", "", "", "planName", "planTier", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getBillingCyclesIds", "()Ljava/util/List;", "getPlanName", "()Ljava/lang/String;", "getPlanTier", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPlanInfoEmbeddedEntity {

    @b("billingCyclesIds")
    private final List<String> billingCyclesIds;

    @b("isTrial")
    private final boolean isTrial;

    @b("plan_name")
    private final String planName;

    @b("planTier")
    private final String planTier;

    public RecurringPlanInfoEmbeddedEntity(boolean z, List<String> list, String str, String str2) {
        this.isTrial = z;
        this.billingCyclesIds = list;
        this.planName = str;
        this.planTier = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringPlanInfoEmbeddedEntity copy$default(RecurringPlanInfoEmbeddedEntity recurringPlanInfoEmbeddedEntity, boolean z, List list, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = recurringPlanInfoEmbeddedEntity.isTrial;
        }
        if ((i & 2) != 0) {
            list = recurringPlanInfoEmbeddedEntity.billingCyclesIds;
        }
        if ((i & 4) != 0) {
            str = recurringPlanInfoEmbeddedEntity.planName;
        }
        if ((i & 8) != 0) {
            str2 = recurringPlanInfoEmbeddedEntity.planTier;
        }
        return recurringPlanInfoEmbeddedEntity.copy(z, list, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    public final List<String> component2() {
        return this.billingCyclesIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlanTier() {
        return this.planTier;
    }

    @NotNull
    public final RecurringPlanInfoEmbeddedEntity copy(boolean isTrial, List<String> billingCyclesIds, String planName, String planTier) {
        return new RecurringPlanInfoEmbeddedEntity(isTrial, billingCyclesIds, planName, planTier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPlanInfoEmbeddedEntity)) {
            return false;
        }
        RecurringPlanInfoEmbeddedEntity recurringPlanInfoEmbeddedEntity = (RecurringPlanInfoEmbeddedEntity) other;
        return this.isTrial == recurringPlanInfoEmbeddedEntity.isTrial && Intrinsics.f(this.billingCyclesIds, recurringPlanInfoEmbeddedEntity.billingCyclesIds) && Intrinsics.f(this.planName, recurringPlanInfoEmbeddedEntity.planName) && Intrinsics.f(this.planTier, recurringPlanInfoEmbeddedEntity.planTier);
    }

    public final List<String> getBillingCyclesIds() {
        return this.billingCyclesIds;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final String getPlanTier() {
        return this.planTier;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isTrial) * 31;
        List<String> list = this.billingCyclesIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.planName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.planTier;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isTrial() {
        return this.isTrial;
    }
}
