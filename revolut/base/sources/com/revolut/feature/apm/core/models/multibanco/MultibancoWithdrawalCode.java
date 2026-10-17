package com.revolut.feature.apm.core.models.multibanco;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h02.f;
import ip0.v7;
import java.time.Duration;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/multibanco/MultibancoWithdrawalCode;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "h02/f", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoWithdrawalCode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultibancoWithdrawalCode> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f61953c;
    public final String d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDateTime f61954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDateTime f61955h;
    public final LocalDateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f61956j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoWithdrawalCode(parcel.readString(), parcel.readString(), f.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoWithdrawalCode[i];
        }
    }

    public MultibancoWithdrawalCode(String id10, String code, f state, String ownerId, String revolutCardId, d amount, LocalDateTime createdDate, LocalDateTime updatedDate, LocalDateTime expirationDate, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(revolutCardId, "revolutCardId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f61951a = id10;
        this.f61952b = code;
        this.f61953c = state;
        this.d = ownerId;
        this.e = revolutCardId;
        this.f = amount;
        this.f61954g = createdDate;
        this.f61955h = updatedDate;
        this.i = expirationDate;
        this.f61956j = str;
    }

    public final long a() {
        return Duration.between(this.f61954g, this.i).toMillis();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibancoWithdrawalCode)) {
            return false;
        }
        MultibancoWithdrawalCode multibancoWithdrawalCode = (MultibancoWithdrawalCode) obj2;
        return Intrinsics.f(this.f61951a, multibancoWithdrawalCode.f61951a) && Intrinsics.f(this.f61952b, multibancoWithdrawalCode.f61952b) && this.f61953c == multibancoWithdrawalCode.f61953c && Intrinsics.f(this.d, multibancoWithdrawalCode.d) && Intrinsics.f(this.e, multibancoWithdrawalCode.e) && Intrinsics.f(this.f, multibancoWithdrawalCode.f) && Intrinsics.f(this.f61954g, multibancoWithdrawalCode.f61954g) && Intrinsics.f(this.f61955h, multibancoWithdrawalCode.f61955h) && Intrinsics.f(this.i, multibancoWithdrawalCode.i) && Intrinsics.f(this.f61956j, multibancoWithdrawalCode.f61956j);
    }

    public final int hashCode() {
        int i = v7.i(this.i, v7.i(this.f61955h, v7.i(this.f61954g, v7.c(p.a.c(p.a.c((this.f61953c.hashCode() + p.a.c(this.f61951a.hashCode() * 31, 31, this.f61952b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31), 31);
        String str = this.f61956j;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61951a);
        dest.writeString(this.f61952b);
        dest.writeString(this.f61953c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f61954g);
        dest.writeSerializable(this.f61955h);
        dest.writeSerializable(this.i);
        dest.writeString(this.f61956j);
    }
}
