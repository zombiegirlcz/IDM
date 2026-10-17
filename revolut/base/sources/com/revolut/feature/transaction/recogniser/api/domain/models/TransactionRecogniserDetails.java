package com.revolut.feature.transaction.recogniser.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/api/domain/models/TransactionRecogniserDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transaction_recogniser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionRecogniserDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransactionRecogniserDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecogniserTransaction f91803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91805c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionRecogniserDetails(RecogniserTransaction.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionRecogniserDetails[i];
        }
    }

    public TransactionRecogniserDetails(RecogniserTransaction transaction, String transactionMethod, String str, String card, String str2, String str3) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionMethod, "transactionMethod");
        Intrinsics.checkNotNullParameter(card, "card");
        this.f91803a = transaction;
        this.f91804b = transactionMethod;
        this.f91805c = str;
        this.d = card;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionRecogniserDetails)) {
            return false;
        }
        TransactionRecogniserDetails transactionRecogniserDetails = (TransactionRecogniserDetails) obj2;
        return Intrinsics.f(this.f91803a, transactionRecogniserDetails.f91803a) && Intrinsics.f(this.f91804b, transactionRecogniserDetails.f91804b) && Intrinsics.f(this.f91805c, transactionRecogniserDetails.f91805c) && Intrinsics.f(this.d, transactionRecogniserDetails.d) && Intrinsics.f(this.e, transactionRecogniserDetails.e) && Intrinsics.f(this.f, transactionRecogniserDetails.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f91803a.hashCode() * 31, 31, this.f91804b);
        String str = this.f91805c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91803a.writeToParcel(dest, i);
        dest.writeString(this.f91804b);
        dest.writeString(this.f91805c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
