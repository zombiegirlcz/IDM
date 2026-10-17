package com.revolut.feature.licenses.impl.ui.licenses.offline.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseControllerContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/licenses/impl/ui/licenses/offline/declaration/OfflineLicenseDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/licenses/impl/ui/licenses/offline/OfflineLicenseControllerContract$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_licenses_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfflineLicenseDestination extends InternalDestination<OfflineLicenseControllerContract$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<OfflineLicenseDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfflineLicenseControllerContract$InputData f78047b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfflineLicenseDestination(OfflineLicenseControllerContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfflineLicenseDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineLicenseDestination(OfflineLicenseControllerContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f78047b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f78047b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OfflineLicenseDestination) && Intrinsics.f(this.f78047b, ((OfflineLicenseDestination) obj2).f78047b);
    }

    public final int hashCode() {
        return this.f78047b.f78046a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f78047b.writeToParcel(dest, i);
    }
}
