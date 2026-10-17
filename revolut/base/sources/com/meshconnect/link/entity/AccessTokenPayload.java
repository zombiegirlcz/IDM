package com.meshconnect.link.entity;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JT\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u000bJ\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017¨\u0006."}, d2 = {"Lcom/meshconnect/link/entity/AccessTokenPayload;", "Lcom/meshconnect/link/entity/LinkPayload;", "accountTokens", "", "Lcom/meshconnect/link/entity/AccountToken;", "brokerType", "", "brokerName", "brokerBrandInfo", "Lcom/meshconnect/link/entity/BrandInfo;", "expiresInSeconds", "", "refreshTokenExpiresInSeconds", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/meshconnect/link/entity/BrandInfo;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAccountTokens", "()Ljava/util/List;", "getBrokerType", "()Ljava/lang/String;", "getBrokerName", "getBrokerBrandInfo", "()Lcom/meshconnect/link/entity/BrandInfo;", "getExpiresInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRefreshTokenExpiresInSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/meshconnect/link/entity/BrandInfo;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/meshconnect/link/entity/AccessTokenPayload;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AccessTokenPayload implements LinkPayload {

    @NotNull
    public static final Parcelable.Creator<AccessTokenPayload> CREATOR = new Creator();

    @NotNull
    private final List<AccountToken> accountTokens;

    @NotNull
    private final BrandInfo brokerBrandInfo;

    @NotNull
    private final String brokerName;

    @NotNull
    private final String brokerType;
    private final Integer expiresInSeconds;
    private final Integer refreshTokenExpiresInSeconds;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccessTokenPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(AccountToken.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AccessTokenPayload(arrayList, parcel.readString(), parcel.readString(), BrandInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenPayload[] newArray(int i) {
            return new AccessTokenPayload[i];
        }
    }

    public AccessTokenPayload(@NotNull List<AccountToken> accountTokens, @NotNull String brokerType, @NotNull String brokerName, @NotNull BrandInfo brokerBrandInfo, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(accountTokens, "accountTokens");
        Intrinsics.checkNotNullParameter(brokerType, "brokerType");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(brokerBrandInfo, "brokerBrandInfo");
        this.accountTokens = accountTokens;
        this.brokerType = brokerType;
        this.brokerName = brokerName;
        this.brokerBrandInfo = brokerBrandInfo;
        this.expiresInSeconds = num;
        this.refreshTokenExpiresInSeconds = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessTokenPayload copy$default(AccessTokenPayload accessTokenPayload, List list, String str, String str2, BrandInfo brandInfo, Integer num, Integer num2, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = accessTokenPayload.accountTokens;
        }
        if ((i & 2) != 0) {
            str = accessTokenPayload.brokerType;
        }
        if ((i & 4) != 0) {
            str2 = accessTokenPayload.brokerName;
        }
        if ((i & 8) != 0) {
            brandInfo = accessTokenPayload.brokerBrandInfo;
        }
        if ((i & 16) != 0) {
            num = accessTokenPayload.expiresInSeconds;
        }
        if ((i & 32) != 0) {
            num2 = accessTokenPayload.refreshTokenExpiresInSeconds;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return accessTokenPayload.copy(list, str, str2, brandInfo, num3, num4);
    }

    @NotNull
    public final List<AccountToken> component1() {
        return this.accountTokens;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBrokerType() {
        return this.brokerType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrokerName() {
        return this.brokerName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BrandInfo getBrokerBrandInfo() {
        return this.brokerBrandInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getRefreshTokenExpiresInSeconds() {
        return this.refreshTokenExpiresInSeconds;
    }

    @NotNull
    public final AccessTokenPayload copy(@NotNull List<AccountToken> accountTokens, @NotNull String brokerType, @NotNull String brokerName, @NotNull BrandInfo brokerBrandInfo, Integer expiresInSeconds, Integer refreshTokenExpiresInSeconds) {
        Intrinsics.checkNotNullParameter(accountTokens, "accountTokens");
        Intrinsics.checkNotNullParameter(brokerType, "brokerType");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(brokerBrandInfo, "brokerBrandInfo");
        return new AccessTokenPayload(accountTokens, brokerType, brokerName, brokerBrandInfo, expiresInSeconds, refreshTokenExpiresInSeconds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessTokenPayload)) {
            return false;
        }
        AccessTokenPayload accessTokenPayload = (AccessTokenPayload) other;
        return Intrinsics.f(this.accountTokens, accessTokenPayload.accountTokens) && Intrinsics.f(this.brokerType, accessTokenPayload.brokerType) && Intrinsics.f(this.brokerName, accessTokenPayload.brokerName) && Intrinsics.f(this.brokerBrandInfo, accessTokenPayload.brokerBrandInfo) && Intrinsics.f(this.expiresInSeconds, accessTokenPayload.expiresInSeconds) && Intrinsics.f(this.refreshTokenExpiresInSeconds, accessTokenPayload.refreshTokenExpiresInSeconds);
    }

    @NotNull
    public final List<AccountToken> getAccountTokens() {
        return this.accountTokens;
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

    public final Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public final Integer getRefreshTokenExpiresInSeconds() {
        return this.refreshTokenExpiresInSeconds;
    }

    public int hashCode() {
        int iHashCode = (this.brokerBrandInfo.hashCode() + p.a.c(p.a.c(this.accountTokens.hashCode() * 31, 31, this.brokerType), 31, this.brokerName)) * 31;
        Integer num = this.expiresInSeconds;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.refreshTokenExpiresInSeconds;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessTokenPayload(accountTokens=" + this.accountTokens + ", brokerType=" + this.brokerType + ", brokerName=" + this.brokerName + ", brokerBrandInfo=" + this.brokerBrandInfo + ", expiresInSeconds=" + this.expiresInSeconds + ", refreshTokenExpiresInSeconds=" + this.refreshTokenExpiresInSeconds + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.accountTokens, dest);
        while (itV.hasNext()) {
            ((AccountToken) itV.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.brokerType);
        dest.writeString(this.brokerName);
        this.brokerBrandInfo.writeToParcel(dest, flags);
        Integer num = this.expiresInSeconds;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.refreshTokenExpiresInSeconds;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
    }
}
