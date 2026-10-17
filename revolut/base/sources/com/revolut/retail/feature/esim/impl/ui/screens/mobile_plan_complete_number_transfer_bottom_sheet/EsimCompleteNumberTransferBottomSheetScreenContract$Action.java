package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_complete_number_transfer_bottom_sheet/EsimCompleteNumberTransferBottomSheetScreenContract$Action", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimCompleteNumberTransferBottomSheetScreenContract$Action implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimCompleteNumberTransferBottomSheetScreenContract$Action> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f101185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f101186b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimCompleteNumberTransferBottomSheetScreenContract$Action((Clause) parcel.readParcelable(EsimCompleteNumberTransferBottomSheetScreenContract$Action.class.getClassLoader()), parcel.readParcelable(EsimCompleteNumberTransferBottomSheetScreenContract$Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimCompleteNumberTransferBottomSheetScreenContract$Action[i];
        }
    }

    public EsimCompleteNumberTransferBottomSheetScreenContract$Action(Clause title, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f101185a = title;
        this.f101186b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimCompleteNumberTransferBottomSheetScreenContract$Action)) {
            return false;
        }
        EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action = (EsimCompleteNumberTransferBottomSheetScreenContract$Action) obj2;
        return Intrinsics.f(this.f101185a, esimCompleteNumberTransferBottomSheetScreenContract$Action.f101185a) && Intrinsics.f(this.f101186b, esimCompleteNumberTransferBottomSheetScreenContract$Action.f101186b);
    }

    public final int hashCode() {
        int iHashCode = this.f101185a.hashCode() * 31;
        Parcelable parcelable = this.f101186b;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101185a, i);
        dest.writeParcelable(this.f101186b, i);
    }
}
