package com.revolut.feature.wealth.ui.impl.documents.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth/ui/impl/documents/details/InvestDocumentsDetailsScreenContract$InputData", "Landroid/os/Parcelable;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestDocumentsDetailsScreenContract$InputData implements Parcelable, IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvestDocumentsDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestDocumentsType f95993a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestDocumentsDetailsScreenContract$InputData((InvestDocumentsType) parcel.readParcelable(InvestDocumentsDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestDocumentsDetailsScreenContract$InputData[i];
        }
    }

    public InvestDocumentsDetailsScreenContract$InputData(InvestDocumentsType documentsType) {
        Intrinsics.checkNotNullParameter(documentsType, "documentsType");
        this.f95993a = documentsType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InvestDocumentsDetailsScreenContract$InputData) && Intrinsics.f(this.f95993a, ((InvestDocumentsDetailsScreenContract$InputData) obj2).f95993a);
    }

    public final int hashCode() {
        return this.f95993a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95993a, i);
    }
}
