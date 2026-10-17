package com.revolut.data.network.models.threedstransactions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/network/models/threedstransactions/ThreeDSMerchantDto;", "", "logo", "", "mcc", "category", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLogo", "()Ljava/lang/String;", "getMcc", "getCategory", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreeDSMerchantDto {

    @b("category")
    private final String category;

    @b("logo")
    private final String logo;

    @b("mcc")
    private final String mcc;

    @b("name")
    @NotNull
    private final String name;

    public ThreeDSMerchantDto(String str, String str2, String str3, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.logo = str;
        this.mcc = str2;
        this.category = str3;
        this.name = name;
    }

    public static /* synthetic */ ThreeDSMerchantDto copy$default(ThreeDSMerchantDto threeDSMerchantDto, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = threeDSMerchantDto.logo;
        }
        if ((i & 2) != 0) {
            str2 = threeDSMerchantDto.mcc;
        }
        if ((i & 4) != 0) {
            str3 = threeDSMerchantDto.category;
        }
        if ((i & 8) != 0) {
            str4 = threeDSMerchantDto.name;
        }
        return threeDSMerchantDto.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMcc() {
        return this.mcc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ThreeDSMerchantDto copy(String logo, String mcc2, String category, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreeDSMerchantDto(logo, mcc2, category, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreeDSMerchantDto)) {
            return false;
        }
        ThreeDSMerchantDto threeDSMerchantDto = (ThreeDSMerchantDto) other;
        return Intrinsics.f(this.logo, threeDSMerchantDto.logo) && Intrinsics.f(this.mcc, threeDSMerchantDto.mcc) && Intrinsics.f(this.category, threeDSMerchantDto.category) && Intrinsics.f(this.name, threeDSMerchantDto.name);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getMcc() {
        return this.mcc;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.logo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mcc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        return this.name.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
