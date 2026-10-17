package com.meshconnect.link.entity;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/meshconnect/link/entity/BrandInfo;", "Landroid/os/Parcelable;", "brokerLogo", "", "brokerPrimaryColor", "logoLightUrl", "logoDarkUrl", "iconLightUrl", "iconDarkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrokerLogo", "()Ljava/lang/String;", "getBrokerPrimaryColor", "getLogoLightUrl", "getLogoDarkUrl", "getIconLightUrl", "getIconDarkUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BrandInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BrandInfo> CREATOR = new Creator();
    private final String brokerLogo;
    private final String brokerPrimaryColor;
    private final String iconDarkUrl;
    private final String iconLightUrl;
    private final String logoDarkUrl;
    private final String logoLightUrl;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BrandInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrandInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrandInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrandInfo[] newArray(int i) {
            return new BrandInfo[i];
        }
    }

    public BrandInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.brokerLogo = str;
        this.brokerPrimaryColor = str2;
        this.logoLightUrl = str3;
        this.logoDarkUrl = str4;
        this.iconLightUrl = str5;
        this.iconDarkUrl = str6;
    }

    public static /* synthetic */ BrandInfo copy$default(BrandInfo brandInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = brandInfo.brokerLogo;
        }
        if ((i & 2) != 0) {
            str2 = brandInfo.brokerPrimaryColor;
        }
        if ((i & 4) != 0) {
            str3 = brandInfo.logoLightUrl;
        }
        if ((i & 8) != 0) {
            str4 = brandInfo.logoDarkUrl;
        }
        if ((i & 16) != 0) {
            str5 = brandInfo.iconLightUrl;
        }
        if ((i & 32) != 0) {
            str6 = brandInfo.iconDarkUrl;
        }
        String str7 = str5;
        String str8 = str6;
        return brandInfo.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrokerLogo() {
        return this.brokerLogo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBrokerPrimaryColor() {
        return this.brokerPrimaryColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogoLightUrl() {
        return this.logoLightUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconLightUrl() {
        return this.iconLightUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconDarkUrl() {
        return this.iconDarkUrl;
    }

    @NotNull
    public final BrandInfo copy(String brokerLogo, String brokerPrimaryColor, String logoLightUrl, String logoDarkUrl, String iconLightUrl, String iconDarkUrl) {
        return new BrandInfo(brokerLogo, brokerPrimaryColor, logoLightUrl, logoDarkUrl, iconLightUrl, iconDarkUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandInfo)) {
            return false;
        }
        BrandInfo brandInfo = (BrandInfo) other;
        return Intrinsics.f(this.brokerLogo, brandInfo.brokerLogo) && Intrinsics.f(this.brokerPrimaryColor, brandInfo.brokerPrimaryColor) && Intrinsics.f(this.logoLightUrl, brandInfo.logoLightUrl) && Intrinsics.f(this.logoDarkUrl, brandInfo.logoDarkUrl) && Intrinsics.f(this.iconLightUrl, brandInfo.iconLightUrl) && Intrinsics.f(this.iconDarkUrl, brandInfo.iconDarkUrl);
    }

    public final String getBrokerLogo() {
        return this.brokerLogo;
    }

    public final String getBrokerPrimaryColor() {
        return this.brokerPrimaryColor;
    }

    public final String getIconDarkUrl() {
        return this.iconDarkUrl;
    }

    public final String getIconLightUrl() {
        return this.iconLightUrl;
    }

    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    public final String getLogoLightUrl() {
        return this.logoLightUrl;
    }

    public int hashCode() {
        String str = this.brokerLogo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brokerPrimaryColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logoLightUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logoDarkUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconLightUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconDarkUrl;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("BrandInfo(brokerLogo=");
        sb6.append(this.brokerLogo);
        sb6.append(", brokerPrimaryColor=");
        sb6.append(this.brokerPrimaryColor);
        sb6.append(", logoLightUrl=");
        sb6.append(this.logoLightUrl);
        sb6.append(", logoDarkUrl=");
        sb6.append(this.logoDarkUrl);
        sb6.append(", iconLightUrl=");
        sb6.append(this.iconLightUrl);
        sb6.append(", iconDarkUrl=");
        return a.u(sb6, this.iconDarkUrl, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.brokerLogo);
        dest.writeString(this.brokerPrimaryColor);
        dest.writeString(this.logoLightUrl);
        dest.writeString(this.logoDarkUrl);
        dest.writeString(this.iconLightUrl);
        dest.writeString(this.iconDarkUrl);
    }
}
