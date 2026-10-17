package com.meshconnect.link.entity;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0003J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/meshconnect/link/entity/DelayedAuthPayload;", "Lcom/meshconnect/link/entity/LinkPayload;", "refreshTokenExpiresInSeconds", "", "brokerType", "", "refreshToken", "brokerName", "brokerBrandInfo", "Lcom/meshconnect/link/entity/BrandInfo;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meshconnect/link/entity/BrandInfo;)V", "getRefreshTokenExpiresInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBrokerType", "()Ljava/lang/String;", "getRefreshToken", "getBrokerName", "getBrokerBrandInfo", "()Lcom/meshconnect/link/entity/BrandInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meshconnect/link/entity/BrandInfo;)Lcom/meshconnect/link/entity/DelayedAuthPayload;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DelayedAuthPayload implements LinkPayload {

    @NotNull
    public static final Parcelable.Creator<DelayedAuthPayload> CREATOR = new Creator();

    @NotNull
    private final BrandInfo brokerBrandInfo;

    @NotNull
    private final String brokerName;

    @NotNull
    private final String brokerType;

    @NotNull
    private final String refreshToken;
    private final Integer refreshTokenExpiresInSeconds;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DelayedAuthPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DelayedAuthPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DelayedAuthPayload(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), BrandInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DelayedAuthPayload[] newArray(int i) {
            return new DelayedAuthPayload[i];
        }
    }

    public DelayedAuthPayload(Integer num, @NotNull String brokerType, @NotNull String refreshToken, @NotNull String brokerName, @NotNull BrandInfo brokerBrandInfo) {
        Intrinsics.checkNotNullParameter(brokerType, "brokerType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(brokerBrandInfo, "brokerBrandInfo");
        this.refreshTokenExpiresInSeconds = num;
        this.brokerType = brokerType;
        this.refreshToken = refreshToken;
        this.brokerName = brokerName;
        this.brokerBrandInfo = brokerBrandInfo;
    }

    public static /* synthetic */ DelayedAuthPayload copy$default(DelayedAuthPayload delayedAuthPayload, Integer num, String str, String str2, String str3, BrandInfo brandInfo, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = delayedAuthPayload.refreshTokenExpiresInSeconds;
        }
        if ((i & 2) != 0) {
            str = delayedAuthPayload.brokerType;
        }
        if ((i & 4) != 0) {
            str2 = delayedAuthPayload.refreshToken;
        }
        if ((i & 8) != 0) {
            str3 = delayedAuthPayload.brokerName;
        }
        if ((i & 16) != 0) {
            brandInfo = delayedAuthPayload.brokerBrandInfo;
        }
        BrandInfo brandInfo2 = brandInfo;
        String str4 = str2;
        return delayedAuthPayload.copy(num, str, str4, str3, brandInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRefreshTokenExpiresInSeconds() {
        return this.refreshTokenExpiresInSeconds;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBrokerType() {
        return this.brokerType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrokerName() {
        return this.brokerName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BrandInfo getBrokerBrandInfo() {
        return this.brokerBrandInfo;
    }

    @NotNull
    public final DelayedAuthPayload copy(Integer refreshTokenExpiresInSeconds, @NotNull String brokerType, @NotNull String refreshToken, @NotNull String brokerName, @NotNull BrandInfo brokerBrandInfo) {
        Intrinsics.checkNotNullParameter(brokerType, "brokerType");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(brokerBrandInfo, "brokerBrandInfo");
        return new DelayedAuthPayload(refreshTokenExpiresInSeconds, brokerType, refreshToken, brokerName, brokerBrandInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelayedAuthPayload)) {
            return false;
        }
        DelayedAuthPayload delayedAuthPayload = (DelayedAuthPayload) other;
        return Intrinsics.f(this.refreshTokenExpiresInSeconds, delayedAuthPayload.refreshTokenExpiresInSeconds) && Intrinsics.f(this.brokerType, delayedAuthPayload.brokerType) && Intrinsics.f(this.refreshToken, delayedAuthPayload.refreshToken) && Intrinsics.f(this.brokerName, delayedAuthPayload.brokerName) && Intrinsics.f(this.brokerBrandInfo, delayedAuthPayload.brokerBrandInfo);
    }

    @NotNull
    public final BrandInfo getBrokerBrandInfo() {
        return this.brokerBrandInfo;
    }

    @NotNull
    public final String getBrokerName() {
        return this.brokerName;
    }

    @NotNull
    public final String getBrokerType() {
        return this.brokerType;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Integer getRefreshTokenExpiresInSeconds() {
        return this.refreshTokenExpiresInSeconds;
    }

    public int hashCode() {
        Integer num = this.refreshTokenExpiresInSeconds;
        return this.brokerBrandInfo.hashCode() + a.c(a.c(a.c((num == null ? 0 : num.hashCode()) * 31, 31, this.brokerType), 31, this.refreshToken), 31, this.brokerName);
    }

    @NotNull
    public String toString() {
        return "DelayedAuthPayload(refreshTokenExpiresInSeconds=" + this.refreshTokenExpiresInSeconds + ", brokerType=" + this.brokerType + ", refreshToken=" + this.refreshToken + ", brokerName=" + this.brokerName + ", brokerBrandInfo=" + this.brokerBrandInfo + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.refreshTokenExpiresInSeconds;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.B(dest, 1, num);
        }
        dest.writeString(this.brokerType);
        dest.writeString(this.refreshToken);
        dest.writeString(this.brokerName);
        this.brokerBrandInfo.writeToParcel(dest, flags);
    }
}
