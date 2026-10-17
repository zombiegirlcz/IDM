package com.revolut.feature.transaction.recogniser.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/api/domain/models/RecogniserTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transaction_recogniser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecogniserTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecogniserTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f91802c;
    public final LocalDateTime d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecogniserTransaction(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecogniserTransaction[i];
        }
    }

    public RecogniserTransaction(String id10, String description, d amount, LocalDateTime createdDate, String str, String icon) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f91800a = id10;
        this.f91801b = description;
        this.f91802c = amount;
        this.d = createdDate;
        this.e = str;
        this.f = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecogniserTransaction)) {
            return false;
        }
        RecogniserTransaction recogniserTransaction = (RecogniserTransaction) obj2;
        return Intrinsics.f(this.f91800a, recogniserTransaction.f91800a) && Intrinsics.f(this.f91801b, recogniserTransaction.f91801b) && Intrinsics.f(this.f91802c, recogniserTransaction.f91802c) && Intrinsics.f(this.d, recogniserTransaction.d) && Intrinsics.f(this.e, recogniserTransaction.e) && Intrinsics.f(this.f, recogniserTransaction.f);
    }

    public final int hashCode() {
        int i = v7.i(this.d, v7.c(p.a.c(this.f91800a.hashCode() * 31, 31, this.f91801b), 31, this.f91802c), 31);
        String str = this.e;
        return this.f.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91800a);
        dest.writeString(this.f91801b);
        dest.writeSerializable(this.f91802c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
