package com.revolut.feature.transfer.models.quotes;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/quotes/TransferQuoteSender;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferQuoteSender implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferQuoteSender> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92286c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferQuoteSender(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferQuoteSender[i];
        }
    }

    public TransferQuoteSender(String str, String str2, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f92284a = currency;
        this.f92285b = str;
        this.f92286c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferQuoteSender)) {
            return false;
        }
        TransferQuoteSender transferQuoteSender = (TransferQuoteSender) obj2;
        return Intrinsics.f(this.f92284a, transferQuoteSender.f92284a) && Intrinsics.f(this.f92285b, transferQuoteSender.f92285b) && Intrinsics.f(this.f92286c, transferQuoteSender.f92286c);
    }

    public final int hashCode() {
        int iHashCode = this.f92284a.hashCode() * 31;
        String str = this.f92285b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92286c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92284a);
        dest.writeString(this.f92285b);
        dest.writeString(this.f92286c);
    }
}
