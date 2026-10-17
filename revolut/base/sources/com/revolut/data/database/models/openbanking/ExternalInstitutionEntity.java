package com.revolut.data.database.models.openbanking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00063"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ExternalInstitutionEntity;", "", "id", "", "name", "logo", "logoType", "paymentInitiation", "", "infoProvider", "topupSettings", "Lcom/revolut/data/database/models/openbanking/TopupSettingsEntity;", "requirements", "", "mandateInitiation", "tags", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/revolut/data/database/models/openbanking/TopupSettingsEntity;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getLogo", "getLogoType", "getPaymentInitiation", "()Z", "getInfoProvider", "getTopupSettings", "()Lcom/revolut/data/database/models/openbanking/TopupSettingsEntity;", "getRequirements", "()Ljava/util/List;", "getMandateInitiation", "getTags", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalInstitutionEntity {
    private final String description;

    @NotNull
    private final String id;
    private final boolean infoProvider;

    @NotNull
    private final String logo;

    @NotNull
    private final String logoType;
    private final boolean mandateInitiation;

    @NotNull
    private final String name;
    private final boolean paymentInitiation;

    @NotNull
    private final List<String> requirements;

    @NotNull
    private final List<String> tags;

    @NotNull
    private final TopupSettingsEntity topupSettings;

    public ExternalInstitutionEntity(@NotNull String id10, @NotNull String name, @NotNull String logo, @NotNull String logoType, boolean z, boolean z3, @NotNull TopupSettingsEntity topupSettings, @NotNull List<String> requirements, boolean z4, @NotNull List<String> tags, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(logoType, "logoType");
        Intrinsics.checkNotNullParameter(topupSettings, "topupSettings");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = id10;
        this.name = name;
        this.logo = logo;
        this.logoType = logoType;
        this.paymentInitiation = z;
        this.infoProvider = z3;
        this.topupSettings = topupSettings;
        this.requirements = requirements;
        this.mandateInitiation = z4;
        this.tags = tags;
        this.description = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExternalInstitutionEntity copy$default(ExternalInstitutionEntity externalInstitutionEntity, String str, String str2, String str3, String str4, boolean z, boolean z3, TopupSettingsEntity topupSettingsEntity, List list, boolean z4, List list2, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = externalInstitutionEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = externalInstitutionEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = externalInstitutionEntity.logo;
        }
        if ((i & 8) != 0) {
            str4 = externalInstitutionEntity.logoType;
        }
        if ((i & 16) != 0) {
            z = externalInstitutionEntity.paymentInitiation;
        }
        if ((i & 32) != 0) {
            z3 = externalInstitutionEntity.infoProvider;
        }
        if ((i & 64) != 0) {
            topupSettingsEntity = externalInstitutionEntity.topupSettings;
        }
        if ((i & 128) != 0) {
            list = externalInstitutionEntity.requirements;
        }
        if ((i & 256) != 0) {
            z4 = externalInstitutionEntity.mandateInitiation;
        }
        if ((i & 512) != 0) {
            list2 = externalInstitutionEntity.tags;
        }
        if ((i & 1024) != 0) {
            str5 = externalInstitutionEntity.description;
        }
        List list3 = list2;
        String str6 = str5;
        List list4 = list;
        boolean z6 = z4;
        boolean z11 = z3;
        TopupSettingsEntity topupSettingsEntity2 = topupSettingsEntity;
        boolean z12 = z;
        String str7 = str3;
        return externalInstitutionEntity.copy(str, str2, str7, str4, z12, z11, topupSettingsEntity2, list4, z6, list3, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> component10() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogoType() {
        return this.logoType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TopupSettingsEntity getTopupSettings() {
        return this.topupSettings;
    }

    @NotNull
    public final List<String> component8() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getMandateInitiation() {
        return this.mandateInitiation;
    }

    @NotNull
    public final ExternalInstitutionEntity copy(@NotNull String id10, @NotNull String name, @NotNull String logo, @NotNull String logoType, boolean paymentInitiation, boolean infoProvider, @NotNull TopupSettingsEntity topupSettings, @NotNull List<String> requirements, boolean mandateInitiation, @NotNull List<String> tags, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(logoType, "logoType");
        Intrinsics.checkNotNullParameter(topupSettings, "topupSettings");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new ExternalInstitutionEntity(id10, name, logo, logoType, paymentInitiation, infoProvider, topupSettings, requirements, mandateInitiation, tags, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalInstitutionEntity)) {
            return false;
        }
        ExternalInstitutionEntity externalInstitutionEntity = (ExternalInstitutionEntity) other;
        return Intrinsics.f(this.id, externalInstitutionEntity.id) && Intrinsics.f(this.name, externalInstitutionEntity.name) && Intrinsics.f(this.logo, externalInstitutionEntity.logo) && Intrinsics.f(this.logoType, externalInstitutionEntity.logoType) && this.paymentInitiation == externalInstitutionEntity.paymentInitiation && this.infoProvider == externalInstitutionEntity.infoProvider && Intrinsics.f(this.topupSettings, externalInstitutionEntity.topupSettings) && Intrinsics.f(this.requirements, externalInstitutionEntity.requirements) && this.mandateInitiation == externalInstitutionEntity.mandateInitiation && Intrinsics.f(this.tags, externalInstitutionEntity.tags) && Intrinsics.f(this.description, externalInstitutionEntity.description);
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getLogoType() {
        return this.logoType;
    }

    public final boolean getMandateInitiation() {
        return this.mandateInitiation;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    @NotNull
    public final List<String> getRequirements() {
        return this.requirements;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    @NotNull
    public final TopupSettingsEntity getTopupSettings() {
        return this.topupSettings;
    }

    public int hashCode() {
        int iD = p.a.d(j6.a.c(p.a.d((this.topupSettings.hashCode() + j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.logo), 31, this.logoType), 31, this.paymentInitiation), 31, this.infoProvider)) * 31, 31, this.requirements), 31, this.mandateInitiation), 31, this.tags);
        String str = this.description;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ ExternalInstitutionEntity(String str, String str2, String str3, String str4, boolean z, boolean z3, TopupSettingsEntity topupSettingsEntity, List list, boolean z4, List list2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, z3, topupSettingsEntity, list, z4, list2, (i & 1024) != 0 ? null : str5);
    }
}
