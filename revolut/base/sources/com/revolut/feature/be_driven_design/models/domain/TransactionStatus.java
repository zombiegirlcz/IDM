package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/TransactionStatus;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionStatus implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransactionStatus> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f64200b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionStatus(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionStatus[i];
        }
    }

    public TransactionStatus(String text, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f64199a = text;
        this.f64200b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionStatus)) {
            return false;
        }
        TransactionStatus transactionStatus = (TransactionStatus) obj2;
        return Intrinsics.f(this.f64199a, transactionStatus.f64199a) && Intrinsics.f(this.f64200b, transactionStatus.f64200b);
    }

    public final int hashCode() {
        int iHashCode = this.f64199a.hashCode() * 31;
        Integer num = this.f64200b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64199a);
        Integer num = this.f64200b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
