package com.revolut.feature.junior_graduation.api.navigation;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"com/revolut/feature/junior_graduation/api/navigation/IdentificationFlowPublicContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "Success", "Lcom/revolut/feature/junior_graduation/api/navigation/IdentificationFlowPublicContract$OutputData$Success;", "feature_junior_graduation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IdentificationFlowPublicContract$OutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_graduation/api/navigation/IdentificationFlowPublicContract$OutputData$Success;", "Lcom/revolut/feature/junior_graduation/api/navigation/IdentificationFlowPublicContract$OutputData;", "<init>", "()V", "feature_junior_graduation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Success implements IdentificationFlowPublicContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f76912a = new Success();

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Success.f76912a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        private Success() {
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
