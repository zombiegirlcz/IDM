package com.revolut.feature_retail_user_declarations.purpose.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/purpose/screen/PurposeOfAccountTilesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PurposeOfAccountTilesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PurposeOfAccountTilesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbl.a f97724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97725b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PurposeOfAccountTilesScreenContract$InputData(rbl.a.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PurposeOfAccountTilesScreenContract$InputData[i];
        }
    }

    public PurposeOfAccountTilesScreenContract$InputData(rbl.a backNavigationType, ArrayList selectedPurposes) {
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        this.f97724a = backNavigationType;
        this.f97725b = selectedPurposes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PurposeOfAccountTilesScreenContract$InputData)) {
            return false;
        }
        PurposeOfAccountTilesScreenContract$InputData purposeOfAccountTilesScreenContract$InputData = (PurposeOfAccountTilesScreenContract$InputData) obj2;
        return this.f97724a == purposeOfAccountTilesScreenContract$InputData.f97724a && Intrinsics.f(this.f97725b, purposeOfAccountTilesScreenContract$InputData.f97725b);
    }

    public final int hashCode() {
        return this.f97725b.hashCode() + (this.f97724a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97724a.name());
        dest.writeStringList(this.f97725b);
    }
}
