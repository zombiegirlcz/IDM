package com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_carousel/reissued_physical_card_dialog/ReissuedPhysicalCardDialogContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReissuedPhysicalCardDialogContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReissuedPhysicalCardDialogContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f65387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65389c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReissuedPhysicalCardDialogContract$InputData(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReissuedPhysicalCardDialogContract$InputData[i];
        }
    }

    public ReissuedPhysicalCardDialogContract$InputData(boolean z, boolean z3, boolean z4) {
        this.f65387a = z;
        this.f65388b = z3;
        this.f65389c = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReissuedPhysicalCardDialogContract$InputData)) {
            return false;
        }
        ReissuedPhysicalCardDialogContract$InputData reissuedPhysicalCardDialogContract$InputData = (ReissuedPhysicalCardDialogContract$InputData) obj2;
        return this.f65387a == reissuedPhysicalCardDialogContract$InputData.f65387a && this.f65388b == reissuedPhysicalCardDialogContract$InputData.f65388b && this.f65389c == reissuedPhysicalCardDialogContract$InputData.f65389c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65389c) + j6.a.c(Boolean.hashCode(this.f65387a) * 31, 31, this.f65388b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f65387a ? 1 : 0);
        dest.writeInt(this.f65388b ? 1 : 0);
        dest.writeInt(this.f65389c ? 1 : 0);
    }
}
