package com.revolut.domain.models.moneyrequest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestAttributes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestAttributes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestAttributes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60327b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestAttributes(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestAttributes[i];
        }
    }

    public MoneyRequestAttributes(String str, String str2) {
        this.f60326a = str;
        this.f60327b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestAttributes)) {
            return false;
        }
        MoneyRequestAttributes moneyRequestAttributes = (MoneyRequestAttributes) obj2;
        return Intrinsics.f(this.f60326a, moneyRequestAttributes.f60326a) && Intrinsics.f(this.f60327b, moneyRequestAttributes.f60327b);
    }

    public final int hashCode() {
        String str = this.f60326a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60327b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60326a);
        dest.writeString(this.f60327b);
    }
}
