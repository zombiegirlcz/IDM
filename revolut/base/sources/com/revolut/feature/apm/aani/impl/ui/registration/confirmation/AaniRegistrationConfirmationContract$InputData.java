package com.revolut.feature.apm.aani.impl.ui.registration.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.aani.impl.model.DataForRegistration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/apm/aani/impl/ui/registration/confirmation/AaniRegistrationConfirmationContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AaniRegistrationConfirmationContract$InputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<AaniRegistrationConfirmationContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataForRegistration f61138a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AaniRegistrationConfirmationContract$InputData(DataForRegistration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AaniRegistrationConfirmationContract$InputData[i];
        }
    }

    public AaniRegistrationConfirmationContract$InputData(DataForRegistration dataForRegistration) {
        Intrinsics.checkNotNullParameter(dataForRegistration, "dataForRegistration");
        this.f61138a = dataForRegistration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AaniRegistrationConfirmationContract$InputData) && Intrinsics.f(this.f61138a, ((AaniRegistrationConfirmationContract$InputData) obj2).f61138a);
    }

    public final int hashCode() {
        return this.f61138a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f61138a.writeToParcel(dest, i);
    }
}
