package com.revolut.feature.standingordertopup.impl.ui.screen.edit_order;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.kompot.common.IOData$Input;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/standingordertopup/impl/ui/screen/edit_order/EditTopUpOrderScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditTopUpOrderScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EditTopUpOrderScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f88203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoTopUpState f88204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f88205c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditTopUpOrderScreenContract$InputData((b) parcel.readSerializable(), (AutoTopUpState) parcel.readParcelable(EditTopUpOrderScreenContract$InputData.class.getClassLoader()), l.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditTopUpOrderScreenContract$InputData[i];
        }
    }

    public EditTopUpOrderScreenContract$InputData(b currency, AutoTopUpState autoTopUpState, l pocketType, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoTopUpState, "autoTopUpState");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f88203a = currency;
        this.f88204b = autoTopUpState;
        this.f88205c = pocketType;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EditTopUpOrderScreenContract$InputData)) {
            return false;
        }
        EditTopUpOrderScreenContract$InputData editTopUpOrderScreenContract$InputData = (EditTopUpOrderScreenContract$InputData) obj2;
        return Intrinsics.f(this.f88203a, editTopUpOrderScreenContract$InputData.f88203a) && Intrinsics.f(this.f88204b, editTopUpOrderScreenContract$InputData.f88204b) && this.f88205c == editTopUpOrderScreenContract$InputData.f88205c && Intrinsics.f(this.d, editTopUpOrderScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = t61.a.c(this.f88205c, (this.f88204b.hashCode() + (this.f88203a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88203a);
        dest.writeParcelable(this.f88204b, i);
        dest.writeString(this.f88205c.name());
        dest.writeString(this.d);
    }
}
