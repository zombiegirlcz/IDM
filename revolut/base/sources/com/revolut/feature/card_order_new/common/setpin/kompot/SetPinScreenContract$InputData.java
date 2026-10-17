package com.revolut.feature.card_order_new.common.setpin.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.IOData$Input;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/card_order_new/common/setpin/kompot/SetPinScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "CreatePin", "ConfirmPin", "Lcom/revolut/feature/card_order_new/common/setpin/kompot/SetPinScreenContract$InputData$ConfirmPin;", "Lcom/revolut/feature/card_order_new/common/setpin/kompot/SetPinScreenContract$InputData$CreatePin;", "feature_card_order_new_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SetPinScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/common/setpin/kompot/SetPinScreenContract$InputData$ConfirmPin;", "Lcom/revolut/feature/card_order_new/common/setpin/kompot/SetPinScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmPin extends SetPinScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ConfirmPin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnalyticsProduct f65010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65012c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmPin((AnalyticsProduct) parcel.readParcelable(ConfirmPin.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmPin[i];
            }
        }

        public ConfirmPin(AnalyticsProduct automaticEventProduct, String pin, String str) {
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            Intrinsics.checkNotNullParameter(pin, "pin");
            this.f65010a = automaticEventProduct;
            this.f65011b = pin;
            this.f65012c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmPin)) {
                return false;
            }
            ConfirmPin confirmPin = (ConfirmPin) obj2;
            return Intrinsics.f(this.f65010a, confirmPin.f65010a) && Intrinsics.f(this.f65011b, confirmPin.f65011b) && Intrinsics.f(this.f65012c, confirmPin.f65012c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f65010a.hashCode() * 31, 31, this.f65011b);
            String str = this.f65012c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getF65013a() {
            return this.f65010a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65010a, i);
            dest.writeString(this.f65011b);
            dest.writeString(this.f65012c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/common/setpin/kompot/SetPinScreenContract$InputData$CreatePin;", "Lcom/revolut/feature/card_order_new/common/setpin/kompot/SetPinScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreatePin extends SetPinScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreatePin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnalyticsProduct f65013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65015c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreatePin(parcel.readInt(), (AnalyticsProduct) parcel.readParcelable(CreatePin.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePin[i];
            }
        }

        public CreatePin() {
            this(null, 0, null, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreatePin)) {
                return false;
            }
            CreatePin createPin = (CreatePin) obj2;
            return Intrinsics.f(this.f65013a, createPin.f65013a) && this.f65014b == createPin.f65014b && Intrinsics.f(this.f65015c, createPin.f65015c);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f65014b, this.f65013a.hashCode() * 31, 31);
            String str = this.f65015c;
            return iB + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getF65013a() {
            return this.f65013a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65013a, i);
            dest.writeInt(this.f65014b);
            dest.writeString(this.f65015c);
        }

        public CreatePin(int i, AnalyticsProduct automaticEventProduct, String str) {
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f65013a = automaticEventProduct;
            this.f65014b = i;
            this.f65015c = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CreatePin(AnalyticsProduct analyticsProduct, int i, String str, int i2) {
            if ((i2 & 1) != 0) {
                k9 k9Var = k9.Cards;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            }
            this((i2 & 2) != 0 ? R$string.card_pin_set_title_new : i, analyticsProduct, (i2 & 4) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public abstract AnalyticsProduct getF65013a();
}
