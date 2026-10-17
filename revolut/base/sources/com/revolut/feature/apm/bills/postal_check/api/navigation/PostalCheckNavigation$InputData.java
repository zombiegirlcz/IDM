package com.revolut.feature.apm.bills.postal_check.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/bills/postal_check/api/navigation/PostalCheckNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Scanner", "ScannedData", "Lcom/revolut/feature/apm/bills/postal_check/api/navigation/PostalCheckNavigation$InputData$ScannedData;", "Lcom/revolut/feature/apm/bills/postal_check/api/navigation/PostalCheckNavigation$InputData$Scanner;", "feature_apm_bills_postal_check_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PostalCheckNavigation$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/api/navigation/PostalCheckNavigation$InputData$ScannedData;", "Lcom/revolut/feature/apm/bills/postal_check/api/navigation/PostalCheckNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_postal_check_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScannedData implements PostalCheckNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<ScannedData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PostalCheckQrScanResult f61509a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScannedData((PostalCheckQrScanResult) parcel.readParcelable(ScannedData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScannedData[i];
            }
        }

        public ScannedData(PostalCheckQrScanResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f61509a = result;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ScannedData) && Intrinsics.f(this.f61509a, ((ScannedData) obj2).f61509a);
        }

        public final int hashCode() {
            return this.f61509a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61509a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/api/navigation/PostalCheckNavigation$InputData$Scanner;", "Lcom/revolut/feature/apm/bills/postal_check/api/navigation/PostalCheckNavigation$InputData;", "<init>", "()V", "feature_apm_bills_postal_check_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanner implements PostalCheckNavigation$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanner f61510a = new Scanner();

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanner.f61510a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanner[i];
            }
        }

        private Scanner() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
