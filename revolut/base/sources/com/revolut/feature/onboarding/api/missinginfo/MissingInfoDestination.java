package com.revolut.feature.onboarding.api.missinginfo;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "PurposeOfAccount", "OccupationChooser", "Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoDestination$OccupationChooser;", "Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoDestination$PurposeOfAccount;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MissingInfoDestination extends KompotDestination {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoDestination$OccupationChooser;", "Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OccupationChooser implements MissingInfoDestination {

        @NotNull
        public static final Parcelable.Creator<OccupationChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f78174a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OccupationChooser((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OccupationChooser[i];
            }
        }

        public OccupationChooser(b bVar) {
            this.f78174a = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF78174a() {
            return this.f78174a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OccupationChooser) && Intrinsics.f(this.f78174a, ((OccupationChooser) obj2).f78174a);
        }

        public final int hashCode() {
            b bVar = this.f78174a;
            if (bVar == null) {
                return 0;
            }
            return bVar.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78174a);
        }

        public OccupationChooser() {
            this(null);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoDestination$PurposeOfAccount;", "Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposeOfAccount implements MissingInfoDestination {

        @NotNull
        public static final Parcelable.Creator<PurposeOfAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f78175a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurposeOfAccount((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposeOfAccount[i];
            }
        }

        public PurposeOfAccount(b bVar) {
            this.f78175a = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF78175a() {
            return this.f78175a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PurposeOfAccount) && Intrinsics.f(this.f78175a, ((PurposeOfAccount) obj2).f78175a);
        }

        public final int hashCode() {
            b bVar = this.f78175a;
            if (bVar == null) {
                return 0;
            }
            return bVar.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78175a);
        }

        public PurposeOfAccount() {
            this(null);
        }
    }
}
