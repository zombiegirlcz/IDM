package com.revolut.data.database.models.charity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\rR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012¨\u0006$"}, d2 = {"Lcom/revolut/data/database/models/charity/CampaignEntity;", "", "", "code", "type", "cardCode", "status", "", "Ljo3/b;", "minDonationsToUnlock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/revolut/data/database/models/charity/CampaignEntity;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getCode", "getType", "getCardCode", "getStatus", "Ljava/util/List;", "getMinDonationsToUnlock", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CampaignEntity {

    @b("cardCode")
    @NotNull
    private final String cardCode;

    @b("code")
    @NotNull
    private final String code;

    @b("mainDonationsToUnlock")
    @NotNull
    private final List<jo3.b> minDonationsToUnlock;

    @b("status")
    @NotNull
    private final String status;

    @b("type")
    @NotNull
    private final String type;

    public CampaignEntity(@NotNull String code, @NotNull String type, @NotNull String cardCode, @NotNull String status, @NotNull List<jo3.b> minDonationsToUnlock) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(minDonationsToUnlock, "minDonationsToUnlock");
        this.code = code;
        this.type = type;
        this.cardCode = cardCode;
        this.status = status;
        this.minDonationsToUnlock = minDonationsToUnlock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignEntity copy$default(CampaignEntity campaignEntity, String str, String str2, String str3, String str4, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = campaignEntity.code;
        }
        if ((i & 2) != 0) {
            str2 = campaignEntity.type;
        }
        if ((i & 4) != 0) {
            str3 = campaignEntity.cardCode;
        }
        if ((i & 8) != 0) {
            str4 = campaignEntity.status;
        }
        if ((i & 16) != 0) {
            list = campaignEntity.minDonationsToUnlock;
        }
        List list2 = list;
        String str5 = str3;
        return campaignEntity.copy(str, str2, str5, str4, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardCode() {
        return this.cardCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final List<jo3.b> component5() {
        return this.minDonationsToUnlock;
    }

    @NotNull
    public final CampaignEntity copy(@NotNull String code, @NotNull String type, @NotNull String cardCode, @NotNull String status, @NotNull List<jo3.b> minDonationsToUnlock) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(minDonationsToUnlock, "minDonationsToUnlock");
        return new CampaignEntity(code, type, cardCode, status, minDonationsToUnlock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignEntity)) {
            return false;
        }
        CampaignEntity campaignEntity = (CampaignEntity) other;
        return Intrinsics.f(this.code, campaignEntity.code) && Intrinsics.f(this.type, campaignEntity.type) && Intrinsics.f(this.cardCode, campaignEntity.cardCode) && Intrinsics.f(this.status, campaignEntity.status) && Intrinsics.f(this.minDonationsToUnlock, campaignEntity.minDonationsToUnlock);
    }

    @NotNull
    public final String getCardCode() {
        return this.cardCode;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final List<jo3.b> getMinDonationsToUnlock() {
        return this.minDonationsToUnlock;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.minDonationsToUnlock.hashCode() + a.c(a.c(a.c(this.code.hashCode() * 31, 31, this.type), 31, this.cardCode), 31, this.status);
    }
}
