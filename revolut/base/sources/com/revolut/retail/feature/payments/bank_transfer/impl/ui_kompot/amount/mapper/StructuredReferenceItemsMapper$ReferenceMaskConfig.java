package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/amount/mapper/StructuredReferenceItemsMapper$ReferenceMaskConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StructuredReferenceItemsMapper$ReferenceMaskConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StructuredReferenceItemsMapper$ReferenceMaskConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102091b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StructuredReferenceItemsMapper$ReferenceMaskConfig(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StructuredReferenceItemsMapper$ReferenceMaskConfig[i];
        }
    }

    public StructuredReferenceItemsMapper$ReferenceMaskConfig(String type, String mask) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f102090a = type;
        this.f102091b = mask;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StructuredReferenceItemsMapper$ReferenceMaskConfig)) {
            return false;
        }
        StructuredReferenceItemsMapper$ReferenceMaskConfig structuredReferenceItemsMapper$ReferenceMaskConfig = (StructuredReferenceItemsMapper$ReferenceMaskConfig) obj2;
        return Intrinsics.f(this.f102090a, structuredReferenceItemsMapper$ReferenceMaskConfig.f102090a) && Intrinsics.f(this.f102091b, structuredReferenceItemsMapper$ReferenceMaskConfig.f102091b);
    }

    public final int hashCode() {
        return this.f102091b.hashCode() + (this.f102090a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102090a);
        dest.writeString(this.f102091b);
    }
}
