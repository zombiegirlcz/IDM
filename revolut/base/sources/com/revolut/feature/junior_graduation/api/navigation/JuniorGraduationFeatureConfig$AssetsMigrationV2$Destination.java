package com.revolut.feature.junior_graduation.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/junior_graduation/api/navigation/JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_junior_graduation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination f76913a = new JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination();

    @NotNull
    public static final Parcelable.Creator<JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination.f76913a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination[i];
        }
    }

    private JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination() {
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
