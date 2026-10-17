package com.revolut.feature.donations.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ba6.u;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import dj0.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "CharityDonationConfig", "Lcom/revolut/feature/donations/api/navigation/DonationsFeatureConfig$CharityDonationConfig;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DonationsFeatureConfig implements FeatureConfig {
    private DonationsFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsFeatureConfig$CharityDonationConfig;", "Lcom/revolut/feature/donations/api/navigation/DonationsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharityDonationConfig extends DonationsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CharityDonationConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f71971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f71972c;
        public final Object d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                u uVarValueOf = u.valueOf(parcel.readString());
                d dVar = (d) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new CharityDonationConfig(uVarValueOf, dVar, string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityDonationConfig[i];
            }
        }

        public CharityDonationConfig(u donationMode, d dVar, String charityId, Map parameters) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            Intrinsics.checkNotNullParameter(donationMode, "donationMode");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f71970a = charityId;
            this.f71971b = donationMode;
            this.f71972c = dVar;
            this.d = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CharityDonationConfig)) {
                return false;
            }
            CharityDonationConfig charityDonationConfig = (CharityDonationConfig) obj2;
            return Intrinsics.f(this.f71970a, charityDonationConfig.f71970a) && this.f71971b == charityDonationConfig.f71971b && Intrinsics.f(this.f71972c, charityDonationConfig.f71972c) && Intrinsics.f(this.d, charityDonationConfig.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f71971b.hashCode() + (this.f71970a.hashCode() * 31)) * 31;
            d dVar = this.f71972c;
            return this.d.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71970a);
            dest.writeString(this.f71971b.name());
            dest.writeSerializable(this.f71972c);
            Iterator itT = o.t(this.d, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        public /* synthetic */ CharityDonationConfig(String str, u uVar, d dVar, int i) {
            this(uVar, (i & 4) != 0 ? null : dVar, str, r0.g());
        }
    }
}
