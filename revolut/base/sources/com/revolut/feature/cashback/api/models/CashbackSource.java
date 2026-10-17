package com.revolut.feature.cashback.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/api/models/CashbackSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cashback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashbackSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashbackSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f65688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc3.d f65689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65690c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashbackSource((d) parcel.readSerializable(), uc3.d.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashbackSource[i];
        }
    }

    public CashbackSource(d earned, uc3.d sourceType, boolean z) {
        Intrinsics.checkNotNullParameter(earned, "earned");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        this.f65688a = earned;
        this.f65689b = sourceType;
        this.f65690c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashbackSource)) {
            return false;
        }
        CashbackSource cashbackSource = (CashbackSource) obj2;
        return Intrinsics.f(this.f65688a, cashbackSource.f65688a) && this.f65689b == cashbackSource.f65689b && this.f65690c == cashbackSource.f65690c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65690c) + ((this.f65689b.hashCode() + (this.f65688a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65688a);
        dest.writeString(this.f65689b.name());
        dest.writeInt(this.f65690c ? 1 : 0);
    }
}
