package com.revolut.domain.models.moneyrequest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f60351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60352b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestSettings(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestSettings[i];
        }
    }

    public MoneyRequestSettings(boolean z, boolean z3) {
        this.f60351a = z;
        this.f60352b = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestSettings)) {
            return false;
        }
        MoneyRequestSettings moneyRequestSettings = (MoneyRequestSettings) obj2;
        return this.f60351a == moneyRequestSettings.f60351a && this.f60352b == moneyRequestSettings.f60352b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60352b) + (Boolean.hashCode(this.f60351a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f60351a ? 1 : 0);
        dest.writeInt(this.f60352b ? 1 : 0);
    }
}
