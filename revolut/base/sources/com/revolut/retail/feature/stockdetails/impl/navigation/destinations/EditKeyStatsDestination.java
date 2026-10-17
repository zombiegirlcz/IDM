package com.revolut.retail.feature.stockdetails.impl.navigation.destinations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/navigation/destinations/EditKeyStatsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/stockdetails/impl/navigation/destinations/EditKeyStatsDestination$Input;", "", "toString", "()Ljava/lang/String;", "Input", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditKeyStatsDestination extends InternalDestination<Input> {

    @NotNull
    public static final Parcelable.Creator<EditKeyStatsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Input f103782b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/navigation/destinations/EditKeyStatsDestination$Input;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final trk.a f103783a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Input(trk.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Input[i];
            }
        }

        public Input(trk.a assetType) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.f103783a = assetType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Input) && this.f103783a == ((Input) obj2).f103783a;
        }

        public final int hashCode() {
            return this.f103783a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103783a.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditKeyStatsDestination(Input.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditKeyStatsDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditKeyStatsDestination(Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.f103782b = input;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EditKeyStatsDestination) && Intrinsics.f(this.f103782b, ((EditKeyStatsDestination) obj2).f103782b);
    }

    public final int hashCode() {
        return this.f103782b.f103783a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f103782b.writeToParcel(dest, i);
    }
}
