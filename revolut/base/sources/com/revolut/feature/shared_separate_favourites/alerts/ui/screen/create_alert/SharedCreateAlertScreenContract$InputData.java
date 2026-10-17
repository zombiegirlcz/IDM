package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Create", "Edit", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData$Create;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData$Edit;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SharedCreateAlertScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData$Create;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create implements SharedCreateAlertScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavouritesAssetDetails f86739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86741c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create((FavouritesAssetDetails) parcel.readParcelable(Create.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(FavouritesAssetDetails fromAsset, boolean z, String str) {
            Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
            this.f86739a = fromAsset;
            this.f86740b = z;
            this.f86741c = str;
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData
        /* JADX INFO: renamed from: U2, reason: from getter */
        public final FavouritesAssetDetails getF86739a() {
            return this.f86739a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Create)) {
                return false;
            }
            Create create = (Create) obj2;
            return Intrinsics.f(this.f86739a, create.f86739a) && this.f86740b == create.f86740b && Intrinsics.f(this.f86741c, create.f86741c);
        }

        public final int hashCode() {
            int iC = j6.a.c(this.f86739a.hashCode() * 31, 31, this.f86740b);
            String str = this.f86741c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData
        /* JADX INFO: renamed from: i5, reason: from getter */
        public final boolean getF86740b() {
            return this.f86740b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86739a, i);
            dest.writeInt(this.f86740b ? 1 : 0);
            dest.writeString(this.f86741c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData$Edit;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements SharedCreateAlertScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertItem f86742a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit((AlertItem) parcel.readParcelable(Edit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(AlertItem alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.f86742a = alert;
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData
        /* JADX INFO: renamed from: U2 */
        public final FavouritesAssetDetails getF86739a() {
            return this.f86742a.getF86877b();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Edit) && Intrinsics.f(this.f86742a, ((Edit) obj2).f86742a);
        }

        public final int hashCode() {
            return this.f86742a.hashCode();
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData
        /* JADX INFO: renamed from: i5 */
        public final boolean getF86740b() {
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86742a, i);
        }
    }

    /* JADX INFO: renamed from: U2 */
    FavouritesAssetDetails getF86739a();

    /* JADX INFO: renamed from: i5 */
    boolean getF86740b();
}
