package com.revolut.feature.kyc.impl.fourthline;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/fourthline/FourthlineFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FourthlineFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<FourthlineFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f77756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f77757h;
    public final DocType i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f77758j;
    public final int k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FourthlineFeatureConfig(parcel.readString(), parcel.readString(), (DocType) parcel.readParcelable(FourthlineFeatureConfig.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FourthlineFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FourthlineFeatureConfig(String checkId, String verificationToken, DocType docType, b issuingCountry, int i) {
        super((ActivityAnimation) null, (ParcelableDestination) new FourthlineDestination(docType, checkId, verificationToken, issuingCountry), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        this.f77756g = checkId;
        this.f77757h = verificationToken;
        this.i = docType;
        this.f77758j = issuingCountry;
        this.k = i;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF96645j() {
        return Integer.valueOf(this.k);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FourthlineFeatureConfig)) {
            return false;
        }
        FourthlineFeatureConfig fourthlineFeatureConfig = (FourthlineFeatureConfig) obj2;
        return Intrinsics.f(this.f77756g, fourthlineFeatureConfig.f77756g) && Intrinsics.f(this.f77757h, fourthlineFeatureConfig.f77757h) && Intrinsics.f(this.i, fourthlineFeatureConfig.i) && Intrinsics.f(this.f77758j, fourthlineFeatureConfig.f77758j) && this.k == fourthlineFeatureConfig.k;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return Integer.hashCode(this.k) + p.a.c(p.a.c(p.a.c(this.f77756g.hashCode() * 31, 31, this.f77757h), 31, this.i.f77926a), 31, this.f77758j.f297794a);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77756g);
        dest.writeString(this.f77757h);
        dest.writeParcelable(this.i, i);
        dest.writeSerializable(this.f77758j);
        dest.writeInt(this.k);
    }
}
