package com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/screens/review_account_linking_details/expiration_selection/ExpirationSelectionBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpirationSelectionBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExpirationSelectionBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f73065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73066b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ExpirationSelectionBottomSheetContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ExpirationSelectionBottomSheetContract$InputData(parcel.readInt(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpirationSelectionBottomSheetContract$InputData[i];
        }
    }

    public ExpirationSelectionBottomSheetContract$InputData(int i, ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f73065a = options;
        this.f73066b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpirationSelectionBottomSheetContract$InputData)) {
            return false;
        }
        ExpirationSelectionBottomSheetContract$InputData expirationSelectionBottomSheetContract$InputData = (ExpirationSelectionBottomSheetContract$InputData) obj2;
        return this.f73065a.equals(expirationSelectionBottomSheetContract$InputData.f73065a) && this.f73066b == expirationSelectionBottomSheetContract$InputData.f73066b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73066b) + (this.f73065a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f73065a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeInt(this.f73066b);
    }
}
