package com.revolut.feature.credit.health.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/api/models/CreditScore;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditScore implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditScore> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f69953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f69954c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditScore(parcel.readInt(), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditScore[i];
        }
    }

    public CreditScore(int i, LocalDate localDate, Integer num) {
        this.f69952a = i;
        this.f69953b = localDate;
        this.f69954c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditScore)) {
            return false;
        }
        CreditScore creditScore = (CreditScore) obj2;
        return this.f69952a == creditScore.f69952a && Intrinsics.f(this.f69953b, creditScore.f69953b) && Intrinsics.f(this.f69954c, creditScore.f69954c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f69952a) * 31;
        LocalDate localDate = this.f69953b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.f69954c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f69952a);
        dest.writeSerializable(this.f69953b);
        Integer num = this.f69954c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
