package com.revolut.feature.acquiring.lite_pos.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/ReceiptInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReceiptInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReceiptInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f60690c;
    public final LitePosReceiptState d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReceiptInfo(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), LitePosReceiptState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReceiptInfo[i];
        }
    }

    public ReceiptInfo(String url2, String merchantName, d amount, LitePosReceiptState receiptState) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiptState, "receiptState");
        this.f60688a = url2;
        this.f60689b = merchantName;
        this.f60690c = amount;
        this.d = receiptState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReceiptInfo)) {
            return false;
        }
        ReceiptInfo receiptInfo = (ReceiptInfo) obj2;
        return Intrinsics.f(this.f60688a, receiptInfo.f60688a) && Intrinsics.f(this.f60689b, receiptInfo.f60689b) && Intrinsics.f(this.f60690c, receiptInfo.f60690c) && this.d == receiptInfo.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.c(this.f60688a.hashCode() * 31, 31, this.f60689b), 31, this.f60690c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60688a);
        dest.writeString(this.f60689b);
        dest.writeSerializable(this.f60690c);
        this.d.writeToParcel(dest, i);
    }
}
