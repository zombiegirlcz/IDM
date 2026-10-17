package com.revolut.data.database.models.charity;

import jo3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J\u009e\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010 R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010#R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010%R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\bB\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\bC\u0010\u0018R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010)¨\u0006F"}, d2 = {"Lcom/revolut/data/database/models/charity/CharityEntity;", "", "", "id", "name", "pocketId", "brief", "description", "iconUrl", "bannerUrl", "Ljo3/b;", "totalDonation", "myDonation", "Lcom/revolut/data/database/models/charity/CampaignEntity;", "campaign", "", "shareable", "code", "availabilityArea", "", "donorsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljo3/b;Lcom/revolut/data/database/models/charity/CampaignEntity;ZLjava/lang/String;Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljo3/b;", "component9", "component10", "()Lcom/revolut/data/database/models/charity/CampaignEntity;", "component11", "()Z", "component12", "component13", "component14", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljo3/b;Lcom/revolut/data/database/models/charity/CampaignEntity;ZLjava/lang/String;Ljava/lang/String;J)Lcom/revolut/data/database/models/charity/CharityEntity;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getId", "getName", "getPocketId", "getBrief", "getDescription", "getIconUrl", "getBannerUrl", "Ljo3/b;", "getTotalDonation", "getMyDonation", "Lcom/revolut/data/database/models/charity/CampaignEntity;", "getCampaign", "Z", "getShareable", "getCode", "getAvailabilityArea", "J", "getDonorsCount", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CharityEntity {

    @NotNull
    private final String availabilityArea;

    @NotNull
    private final String bannerUrl;

    @NotNull
    private final String brief;
    private final CampaignEntity campaign;

    @NotNull
    private final String code;

    @NotNull
    private final String description;
    private final long donorsCount;

    @NotNull
    private final String iconUrl;

    @NotNull
    private final String id;

    @NotNull
    private final b myDonation;

    @NotNull
    private final String name;

    @NotNull
    private final String pocketId;
    private final boolean shareable;

    @NotNull
    private final b totalDonation;

    public CharityEntity(@NotNull String id10, @NotNull String name, @NotNull String pocketId, @NotNull String brief, @NotNull String description, @NotNull String iconUrl, @NotNull String bannerUrl, @NotNull b totalDonation, @NotNull b myDonation, CampaignEntity campaignEntity, boolean z, @NotNull String code, @NotNull String availabilityArea, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(brief, "brief");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(bannerUrl, "bannerUrl");
        Intrinsics.checkNotNullParameter(totalDonation, "totalDonation");
        Intrinsics.checkNotNullParameter(myDonation, "myDonation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(availabilityArea, "availabilityArea");
        this.id = id10;
        this.name = name;
        this.pocketId = pocketId;
        this.brief = brief;
        this.description = description;
        this.iconUrl = iconUrl;
        this.bannerUrl = bannerUrl;
        this.totalDonation = totalDonation;
        this.myDonation = myDonation;
        this.campaign = campaignEntity;
        this.shareable = z;
        this.code = code;
        this.availabilityArea = availabilityArea;
        this.donorsCount = j2;
    }

    public static /* synthetic */ CharityEntity copy$default(CharityEntity charityEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, b bVar, b bVar2, CampaignEntity campaignEntity, boolean z, String str8, String str9, long j2, int i, Object obj2) {
        long j3;
        String str10;
        CharityEntity charityEntity2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        b bVar3;
        b bVar4;
        CampaignEntity campaignEntity2;
        boolean z3;
        String str17;
        String str18;
        String str19 = (i & 1) != 0 ? charityEntity.id : str;
        String str20 = (i & 2) != 0 ? charityEntity.name : str2;
        String str21 = (i & 4) != 0 ? charityEntity.pocketId : str3;
        String str22 = (i & 8) != 0 ? charityEntity.brief : str4;
        String str23 = (i & 16) != 0 ? charityEntity.description : str5;
        String str24 = (i & 32) != 0 ? charityEntity.iconUrl : str6;
        String str25 = (i & 64) != 0 ? charityEntity.bannerUrl : str7;
        b bVar5 = (i & 128) != 0 ? charityEntity.totalDonation : bVar;
        b bVar6 = (i & 256) != 0 ? charityEntity.myDonation : bVar2;
        CampaignEntity campaignEntity3 = (i & 512) != 0 ? charityEntity.campaign : campaignEntity;
        boolean z4 = (i & 1024) != 0 ? charityEntity.shareable : z;
        String str26 = (i & 2048) != 0 ? charityEntity.code : str8;
        String str27 = (i & 4096) != 0 ? charityEntity.availabilityArea : str9;
        if ((i & 8192) != 0) {
            str10 = str19;
            j3 = charityEntity.donorsCount;
            str11 = str20;
            str12 = str21;
            str13 = str22;
            str14 = str23;
            str15 = str24;
            str16 = str25;
            bVar3 = bVar5;
            bVar4 = bVar6;
            campaignEntity2 = campaignEntity3;
            z3 = z4;
            str17 = str26;
            str18 = str27;
            charityEntity2 = charityEntity;
        } else {
            j3 = j2;
            str10 = str19;
            charityEntity2 = charityEntity;
            str11 = str20;
            str12 = str21;
            str13 = str22;
            str14 = str23;
            str15 = str24;
            str16 = str25;
            bVar3 = bVar5;
            bVar4 = bVar6;
            campaignEntity2 = campaignEntity3;
            z3 = z4;
            str17 = str26;
            str18 = str27;
        }
        return charityEntity2.copy(str10, str11, str12, str13, str14, str15, str16, bVar3, bVar4, campaignEntity2, z3, str17, str18, j3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CampaignEntity getCampaign() {
        return this.campaign;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getShareable() {
        return this.shareable;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAvailabilityArea() {
        return this.availabilityArea;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getDonorsCount() {
        return this.donorsCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrief() {
        return this.brief;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final b getTotalDonation() {
        return this.totalDonation;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final b getMyDonation() {
        return this.myDonation;
    }

    @NotNull
    public final CharityEntity copy(@NotNull String id10, @NotNull String name, @NotNull String pocketId, @NotNull String brief, @NotNull String description, @NotNull String iconUrl, @NotNull String bannerUrl, @NotNull b totalDonation, @NotNull b myDonation, CampaignEntity campaign, boolean shareable, @NotNull String code, @NotNull String availabilityArea, long donorsCount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(brief, "brief");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(bannerUrl, "bannerUrl");
        Intrinsics.checkNotNullParameter(totalDonation, "totalDonation");
        Intrinsics.checkNotNullParameter(myDonation, "myDonation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(availabilityArea, "availabilityArea");
        return new CharityEntity(id10, name, pocketId, brief, description, iconUrl, bannerUrl, totalDonation, myDonation, campaign, shareable, code, availabilityArea, donorsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharityEntity)) {
            return false;
        }
        CharityEntity charityEntity = (CharityEntity) other;
        return Intrinsics.f(this.id, charityEntity.id) && Intrinsics.f(this.name, charityEntity.name) && Intrinsics.f(this.pocketId, charityEntity.pocketId) && Intrinsics.f(this.brief, charityEntity.brief) && Intrinsics.f(this.description, charityEntity.description) && Intrinsics.f(this.iconUrl, charityEntity.iconUrl) && Intrinsics.f(this.bannerUrl, charityEntity.bannerUrl) && Intrinsics.f(this.totalDonation, charityEntity.totalDonation) && Intrinsics.f(this.myDonation, charityEntity.myDonation) && Intrinsics.f(this.campaign, charityEntity.campaign) && this.shareable == charityEntity.shareable && Intrinsics.f(this.code, charityEntity.code) && Intrinsics.f(this.availabilityArea, charityEntity.availabilityArea) && this.donorsCount == charityEntity.donorsCount;
    }

    @NotNull
    public final String getAvailabilityArea() {
        return this.availabilityArea;
    }

    @NotNull
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    @NotNull
    public final String getBrief() {
        return this.brief;
    }

    public final CampaignEntity getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final long getDonorsCount() {
        return this.donorsCount;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final b getMyDonation() {
        return this.myDonation;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPocketId() {
        return this.pocketId;
    }

    public final boolean getShareable() {
        return this.shareable;
    }

    @NotNull
    public final b getTotalDonation() {
        return this.totalDonation;
    }

    public int hashCode() {
        int iE = y.e(this.myDonation, y.e(this.totalDonation, a.c(a.c(a.c(a.c(a.c(a.c(this.id.hashCode() * 31, 31, this.name), 31, this.pocketId), 31, this.brief), 31, this.description), 31, this.iconUrl), 31, this.bannerUrl), 31), 31);
        CampaignEntity campaignEntity = this.campaign;
        return Long.hashCode(this.donorsCount) + a.c(a.c(j6.a.c((iE + (campaignEntity == null ? 0 : campaignEntity.hashCode())) * 31, 31, this.shareable), 31, this.code), 31, this.availabilityArea);
    }
}
