package com.revolut.feature.junior.isa.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import dii.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t98.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Ldii/g;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor implements ParcelableControllerDescriptor<g> {

    @NotNull
    public static final Parcelable.Creator<JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorIsaAccountOwnership f76733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f76734b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor((JuniorIsaAccountOwnership) parcel.readParcelable(JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor.class.getClassLoader()), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor[i];
        }
    }

    public JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor(JuniorIsaAccountOwnership ownership, e transferType) {
        Intrinsics.checkNotNullParameter(ownership, "ownership");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.f76733a = ownership;
        this.f76734b = transferType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor)) {
            return false;
        }
        JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor jisaCashHoldingAvailableToWithdrawInfoDialogDescriptor = (JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor) obj2;
        return Intrinsics.f(this.f76733a, jisaCashHoldingAvailableToWithdrawInfoDialogDescriptor.f76733a) && this.f76734b == jisaCashHoldingAvailableToWithdrawInfoDialogDescriptor.f76734b;
    }

    public final int hashCode() {
        return this.f76734b.hashCode() + (this.f76733a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76733a, i);
        dest.writeString(this.f76734b.name());
    }
}
