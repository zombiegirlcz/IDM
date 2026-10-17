package com.revolut.feature.referrals.impl.personalized_tracking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "InviteId", "Code", "Lcom/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingControllerContract$InputData$Code;", "Lcom/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingControllerContract$InputData$InviteId;", "feature_retail_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PersonalizedTrackingControllerContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingControllerContract$InputData$Code;", "Lcom/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Code implements PersonalizedTrackingControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Code> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f81789b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Code(parcel.readString(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Code[i];
            }
        }

        public Code(String code, n referralCampaignV4Type) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            this.f81788a = code;
            this.f81789b = referralCampaignV4Type;
        }

        @Override // com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$InputData
        /* JADX INFO: renamed from: Y, reason: from getter */
        public final n getF81791b() {
            return this.f81789b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Code)) {
                return false;
            }
            Code code = (Code) obj2;
            return Intrinsics.f(this.f81788a, code.f81788a) && this.f81789b == code.f81789b;
        }

        public final int hashCode() {
            return this.f81789b.hashCode() + (this.f81788a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81788a);
            dest.writeString(this.f81789b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingControllerContract$InputData$InviteId;", "Lcom/revolut/feature/referrals/impl/personalized_tracking/PersonalizedTrackingControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteId implements PersonalizedTrackingControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<InviteId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f81791b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteId(parcel.readString(), parcel.readInt() == 0 ? null : n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteId[i];
            }
        }

        public InviteId(String inviteId, n nVar) {
            Intrinsics.checkNotNullParameter(inviteId, "inviteId");
            this.f81790a = inviteId;
            this.f81791b = nVar;
        }

        @Override // com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$InputData
        /* JADX INFO: renamed from: Y, reason: from getter */
        public final n getF81791b() {
            return this.f81791b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteId)) {
                return false;
            }
            InviteId inviteId = (InviteId) obj2;
            return Intrinsics.f(this.f81790a, inviteId.f81790a) && this.f81791b == inviteId.f81791b;
        }

        public final int hashCode() {
            int iHashCode = this.f81790a.hashCode() * 31;
            n nVar = this.f81791b;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81790a);
            n nVar = this.f81791b;
            if (nVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(nVar.name());
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    n getF81791b();
}
