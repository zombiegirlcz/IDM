package com.revolut.feature.transfer.models.quotes;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qrf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/quotes/TransferQuoteRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferQuoteRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferQuoteRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferQuoteSender f92282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferQuoteUserIdentifier f92283c;
    public final String d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferQuoteRequest((d) parcel.readSerializable(), TransferQuoteSender.CREATOR.createFromParcel(parcel), (TransferQuoteUserIdentifier) parcel.readParcelable(TransferQuoteRequest.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferQuoteRequest[i];
        }
    }

    public TransferQuoteRequest(d amount, TransferQuoteSender sender, TransferQuoteUserIdentifier recipient, String str, b bVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f92281a = amount;
        this.f92282b = sender;
        this.f92283c = recipient;
        this.d = str;
        this.e = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferQuoteRequest)) {
            return false;
        }
        TransferQuoteRequest transferQuoteRequest = (TransferQuoteRequest) obj2;
        return Intrinsics.f(this.f92281a, transferQuoteRequest.f92281a) && Intrinsics.f(this.f92282b, transferQuoteRequest.f92282b) && Intrinsics.f(this.f92283c, transferQuoteRequest.f92283c) && Intrinsics.f(this.d, transferQuoteRequest.d) && this.e == transferQuoteRequest.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f92283c.hashCode() + ((this.f92282b.hashCode() + (this.f92281a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.e;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92281a);
        this.f92282b.writeToParcel(dest, i);
        dest.writeParcelable(this.f92283c, i);
        dest.writeString(this.d);
        b bVar = this.e;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }

    public /* synthetic */ TransferQuoteRequest(d dVar, TransferQuoteSender transferQuoteSender, TransferQuoteUserIdentifier transferQuoteUserIdentifier, String str, int i) {
        this(dVar, transferQuoteSender, transferQuoteUserIdentifier, (i & 8) != 0 ? null : str, (b) null);
    }
}
